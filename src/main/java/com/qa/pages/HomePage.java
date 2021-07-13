package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utility.TestUtils;

public class HomePage extends TestBase{
	
	//public static WebDriver driver;
	//public static String TIMER_TIME = "25";
	
	//PageFactory-OR
		@FindBy(xpath="//input[@id='EggTimer-start-time-input-text']")
		public WebElement enterTimebox;
		
		@FindBy(how=How.XPATH,using="//button[normalize-space()='Start']")
		public WebElement startButton;
		
		@FindBy(how=How.XPATH,using="//span[normalize-space()='Time Expired!']")
		public WebElement expired_Message;
		
		
		
	//PageFactory Initialization:
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
	//Action Methods:
		//Validate Home Page Title
		public String validateHomePageTitle()
		{
			return driver.getTitle();
		}
		
		//Enter time in Timer Field
		public void enterTimeinTimerField()
		{
			enterTimebox.sendKeys(TestUtils.TIMER_TIME);
		}
		
		//Click on Start button
		public void clickOnStartButton()
		{

			startButton.click();
			
		}
		
		//To get the expired message
		public String expiredMessage()
		{

			return expired_Message.getText();
			
		}
		
		//Validate Decreasing order of Timer
		public void validateTimer()
		{
	        String beforeXpath="//span[normalize-space()='";
			String afterXpath="seconds']\"";
			
			for(int i=25;i<=0;i--)
			{
				String actul_xpath=beforeXpath+i+afterXpath;
				WebElement element= driver.findElement(By.xpath(actul_xpath));
				System.out.println(element.getText());
				if(element.getText().equals("18"))
				{
					System.out.println("Timer "+element.getText());
					break;
				}
			}
		}

}
