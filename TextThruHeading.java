package com.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.setup;

public class TextThruHeading extends setup {
	@Test
  	public void headingText() throws InterruptedException{
        	//driver.get("https://www.yesmadam.com/");
        	driver.manage().window().maximize();
        	String expectedHeading = "Salon At Home";
        	
        	//Storing the text of the heading in a string
        	String heading = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/section[3]/div/div/a[1]/div/img")).getText();
        	Thread.sleep(2000);
        	if(expectedHeading.equalsIgnoreCase(heading))
              	System.out.println("The expected heading is same as actual heading --- "+heading);
        	else
              	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
	}
	

}
