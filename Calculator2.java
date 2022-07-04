package appiumproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Calculator2 {
	WebDriver driver;
	WebElement element;

	@BeforeClass
	public void setUp() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "8.1.0"); 
		capabilities.setCapability("deviceName","vivo");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("udid","192.168.1.41:5555");
	    capabilities.setCapability("appPackage", "com.android.bbkcalculator");
	    capabilities.setCapability("appActivity","com.android.bbkcalculator.Calculator");
	    driver = new RemoteWebDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);
	    
      // driver = new AppiumDriver<MobileElement>(results, capabilities);

	}

	@Test
	public void testCal() throws Exception {
		
		/*
	   WebElement two=driver.findElement(By.name("2"));
	   two.click();
	   WebElement plus=driver.findElement(By.name("+"));
	   plus.click();
	   WebElement four=driver.findElement(By.name("4"));
	   four.click();
	   WebElement equalTo=driver.findElement(By.name("="));
	   equalTo.click();
	   WebElement results=driver.findElement(By.tagName("EditText"));
	   */
		
		try {
			
			MobileElement two = (MobileElement) driver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
	        two.click();
	        MobileElement plus = (MobileElement) driver.findElement(By.id("com.android.bbkcalculator:id/plus"));
	        plus.click();
	        MobileElement three = (MobileElement) driver.findElement(By.id("com.android.bbkcalculator:id/digit3"));
	        three.click();
	        MobileElement equal = (MobileElement) driver.findElement(By.id("com.android.bbkcalculator:id/equal"));
	        equal.click();
	        
	        
		} catch(Exception e) {
	         System.out.println("toString(): " + e.toString());
	         System.out.println("getMessage(): " + e.getMessage());
	         System.out.println("StackTrace: ");
	         e.printStackTrace();
	      }
	   
	   
	//assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";

	}

	//@AfterClass
	//public void teardown(){
	//	driver.quit();
	//}
	
	}


