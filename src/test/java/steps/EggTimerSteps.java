package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import com.qa.base.TestBase;
import com.qa.pages.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EggTimerSteps extends TestBase  {
	
	
	HomePage homePage = new HomePage();
	public EggTimerSteps()
	{
		super();
	}
	@Before
	public void setUp()
	{
		initilization();
	}
	
	//Scenario:
	/*
	 * Step 1: Please visit the site url and make sure the page load is complete;
	 * then enter 25 seconds and click on the Go button to start the counter.
	 * 
	 * Step 2: Wait for the counter to start counting down from the period specified
	 * in the home page and verify that the countdown is actually happening every
	 * second and that the remaining time decreases in one-second increments.
	 */

	@Given("user is on the Home Page {string} of eggtimer website")
	public void user_is_on_the_home_page_of_eggtimer_website(String website) {
        driver.get(website);
        
	}

	@And("the page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expectedTitle);
	}

	@And("user enter timer on timer box")
	public void user_enter_timer_on_timer_box() {
		homePage.enterTimeinTimerField();
	}

	@Then("click on {string} link")
	public void click_on_link(String string) {
		homePage.clickOnStartButton();
	}

	@Then("timer starts on decreasing order")
	public void timer_starts_on_decreasing_order() {
	   
	}

	@Then("after that {string} message should be displayed")
	public void after_that_message_should_be_displayed(String expected_message) {
		//String actual_message = driver.findElement(By.xpath("//span[normalize-space()='Time Expired!']")).getText();
		String actual_message = homePage.expiredMessage();
		Assert.assertEquals(actual_message, expected_message);
	}

}
