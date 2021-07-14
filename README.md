# maerskProject:

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
- Created Packages for different levels like On Base Level,Page Level,Utility Level,Resource Level,  Test Level & Config Level.
- On Page Level:
  --> Created Base Page with global Utility.
- On Page Level, categorized on three section:
  --> Object Repository(OR)
  --> Initilization of OR
  --> Actions Methods
 - On Utility Level: 
  --> Added SeleniumHelper Utility(IsElementPresent),
  --> Added Screenshot Utility,
  --> Added Wait utility
- On Resource Level:
   --> Added Feature File
- On Test Level:
   --> Added Step Definition File
   --> Added TestRunner File with CucumberOptions annotation
- On Config Level:
   --> Added Config.properties File with global parameters.
- TestRunner class used to run the test cases
- Report section is maintained in TestRunner file with different format like- JSON,HTML,XML

## Issue at application level:
===============================
- Related to alert of application(seems static alert).
- 2 second lapse of time while restarting the timer from "Restart Timer" option.
