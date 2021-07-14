package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class TestUtils extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT=10;
	public static long IMPLICIT_WAIT= 10;
	public static String TIMER_TIME = "25";
	
	public static void getPageScreeshot()
	{
		Date d=new Date();
		String FileName=d.toString().replaceAll(" ", "_").replaceAll(":", "_")+".jpg";
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".//screenshot//"+FileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getPageElementScreeshot(WebElement element)
	{
		Date d=new Date();
		String FileName=d.toString().replaceAll(" ", "_").replaceAll(":", "_")+".jpg";
		
		File src=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".//screenshot//"+FileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
