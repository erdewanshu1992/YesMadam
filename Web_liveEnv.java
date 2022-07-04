package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Web_liveEnv {
	@Test
	public void Hair_Extension() throws InterruptedException {
		System.out.println("......Hi Dewanshu Nameste Your Chrome browser is Launching Now All the Best :-) ");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.yesmadam.com/");
		
		Actions action = new Actions(driver);
	    action.sendKeys(Keys.chord(Keys.SHIFT),
	        Keys.chord(Keys.CONTROL)).build().perform();
		
		////Actions action = new Actions(driver);   

	//	WebElement input = getInputField();
	   // action.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		
		//Actions action = new Actions(driver);   
		//action.sendKeys(Keys.chord(Keys.SHIFT + Keys.CONTROL + "s")).perform();
		//action.sendKeys(Keys.chord(Keys.SHIFT + Keys.CONTROL + "s")).perform();
		// driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	     // JavascriptExecutor js = (JavascriptExecutor) driver;
	      // set size with window.resizeTo() method
	    //  js.executeScript("window.resizeTo(250,230);");
	      //driver.close();
	      
		//Dimension d = new Dimension(300,1080);
     	//Resize current window to the set dimension
       // driver.manage().window().setSize(d);
     	        
     	 //To Delay execution for 10 sec. as to view the resize browser
     	 Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/section[3]/div/div/div[1]/img")).click();

}

	public WebElement getInputField() {
		// TODO Auto-generated method stub
		return null;
	}
}