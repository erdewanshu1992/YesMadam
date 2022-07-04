package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NullText {
WebDriver driver;
  	
  	@BeforeTest
  	public void setUp(){
        	driver = new ChromeDriver();
  	}
  	
  	@Test
  	public void HeadingText() throws InterruptedException{
        	driver.get("http://api-stage-aws.yesmadam.co.in/");
        	driver.manage().window().maximize();
        	WebElement eleA = driver.findElement(By.xpath("(//div[@class=\"service_card\"])[1]"));// Salon at Home
        	//System.out.println("The header text is - " +eleA.getText());
        	if(eleA.isDisplayed())
        	{
        		//this.HeadingText();
        		eleA.click();
        	System.out.println("Salon at Home clicked......");
        	}
        	else
        	System.out.println("Element not found");
        	Thread.sleep(3000);
        	//eleA.click();
        
        	WebElement eleSubCat = driver.findElement(By.xpath("//div[@class=\"img_card active\"]"));// Beauty care
        	System.out.println("The header text is - " +eleSubCat.getText());
        	if(eleSubCat.isDisplayed())
        	{
        	System.out.println("Beauty Care clicked......");
        	}
        	 
        	else
        	System.out.println("Element not found");
        	Thread.sleep(3000);
        	eleSubCat.click();
        	/*
        	WebElement elea = driver.findElement(By.xpath("(//span[@class=\"subcat_name\"])[16]"));// Bestseller
        	System.out.println("The header text is - " +elea.getText());
        	 if(elea.isDisplayed())
    	     {
    	   System.out.println("Bestseller clicked......");
    	     }
    	else
    	System.out.println("Element not found");
        	//(//span[@class="subcat_name"])[22]
        	Thread.sleep(3000);
        	driver.navigate().back();
        	driver.navigate().back();
        	

        	WebElement eleB = driver.findElement(By.xpath("(//div[@class=\"service_card\"])[2]"));// 
        	Thread.sleep(3000);
        	System.out.println("The header text is - " +eleB.getText());
        	if(eleB.isDisplayed())
        	{
        	System.out.println("Female Spa clicked......");
        	}
        	 
        	else
        	System.out.println("Element not found");
        	WebElement eleC = driver.findElement(By.xpath("(//div[@class=\"service_card\"])[3]"));// 
        	Thread.sleep(3000);
        	System.out.println("The header text is - " +eleC.getText());
        	if(eleC.isDisplayed())
        	{
        	System.out.println("Female Hair Service clicked......");
        	}
        	 
        	else
        	System.out.println("Element not found");
        	WebElement eleD = driver.findElement(By.xpath("(//div[@class=\"service_card\"])[4]"));//
        	Thread.sleep(3000);
        	System.out.println("The header text is - " +eleD.getText());
        	if(eleD.isDisplayed())
        	{
        	System.out.println("Male Grooming clicked......");
        	}
        	else
        	System.out.println("Element not found");
        	WebElement eleE = driver.findElement(By.xpath("(//div[@class=\"service_card\"])[5]"));// 
        	Thread.sleep(3000);
        	System.out.println("The header text is - " +eleE.getText());
        	if(eleE.isDisplayed())
        	{
        	System.out.println("Male Massage......");
        	}
        	 
        	else
        	System.out.println("Element not found");
        	
        	*/
  	}
  	@AfterTest
  	public void tearDown(){
        	driver.quit();
  	}

}
