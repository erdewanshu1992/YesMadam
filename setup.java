package com.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class setup {
	protected WebDriver driver;
	//WebElement ele;
	//Actions action = new Actions(driver);
	JavascriptExecutor scroll;
	//@BeforeMethod
	@BeforeClass
	public void YMTesting() throws InterruptedException {
		
	//driver = new FirefoxDriver();
	driver = new ChromeDriver();
	//driver.get("http://api-stage-aws.yesmadam.co.in/hair-extension/");
	driver.get("https://www.yesmadam.com/");
	

	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());

	scroll = (JavascriptExecutor) driver;
	driver.manage().window().maximize();
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	//driver.switchTo().alert().getText();
	//driver.switchTo().alert().sendKeys("Allow");
	/*Alert alert = driver.switchTo().alert(); // switch to alert
	String alertMessage= driver.switchTo().alert().getText(); // capture alert message
	System.out.println(alertMessage); // Print Alert Message
	Thread.sleep(5000);
	alert.accept();*/
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl1 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl1);
	System.out.println("--well done--");
	}


}
