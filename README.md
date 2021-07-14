# maerskProject
## Maersk BDD Project Details:
==============================
- This Project is developed using BDD Cucumber framework with Page Object Model(POM) pattern.
- JUnit used as a Tesing framework.
- Application : https://e.ggtimer.com/ 


## Technical Details:
======================
- Selenium WebDriver v-3.141.59
- Java
- Cucumber
- JUnit
- IDE - Eclipse IDE for Java Developers(Version: 2021-03 (4.19.0))

## Framework Structure Details:
===============================
- Used POM pattern with Cucumber(BDD) 
- Consist of Feature & Step Definition files.
- Created Packages for different levels like On Page Level,Utility Level,Resource Level & Test Level.
- On Page Level, categorized on three section:
  --> Object Repository(OR)
  --> Initilization of OR
  --> Actions Methods
- TestRunner class used to run the test cases
- Report section is maintained in TestRunner file.

## Issue at application level:
===============================
- Related to alert of application(seems static alert).
- 2 second lapse of time while restarting the timer from "Restart Timer" option.
