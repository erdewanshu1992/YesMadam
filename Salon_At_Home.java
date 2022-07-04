package com.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.setup;

public class Salon_At_Home extends setup {
	@Test
	public void Beauty_Service () throws InterruptedException {
	By locatorSalonATHome = By.xpath("/html/body/div/div/div[2]/div/section[3]/div/div/a[1]/div/img");
	if (driver.findElements(locatorSalonATHome).size() > 0) {
		if (driver.findElement(locatorSalonATHome).isDisplayed()) {
			driver.findElement(locatorSalonATHome).click();
			Thread.sleep(2000);
            System.out.println("Salon at Home Clicked------");
		   }
	    }
	By locatorMakeUP = By.xpath("/html/body/div/div/div[2]/div/section[2]/div/div/div[1]/div[1]/div/div[2]/img");
	if (driver.findElements(locatorMakeUP).size() > 0) {
		if (driver.findElement(locatorMakeUP).isDisplayed()) {
			driver.findElement(locatorMakeUP).click();
			Thread.sleep(2000);
            System.out.println("MakeUP Clicked------");
		   }
	    }
	By locatorPreBridal = By.xpath("/html/body/div/div/div[2]/div/section[2]/div/div/div[1]/div[1]/div/div[3]/img");
	if (driver.findElements(locatorPreBridal).size() > 0) {
		if (driver.findElement(locatorPreBridal).isDisplayed()) {
			driver.findElement(locatorPreBridal).click();
			Thread.sleep(2000);
            System.out.println("Pre Bridal Clicked------");
		   }
	    }
	By locatorLedFaceTreatment = By.xpath("/html/body/div/div/div[2]/div/section[2]/div/div/div[1]/div[1]/div/div[4]/img");
	if (driver.findElements(locatorLedFaceTreatment).size() > 0) {
		if (driver.findElement(locatorLedFaceTreatment).isDisplayed()) {
			driver.findElement(locatorLedFaceTreatment).click();
			Thread.sleep(2000);
            System.out.println("Led Face Treatment Clicked------");
		   }
	    }
	By locatorBeautyCare = By.xpath("/html/body/div/div/div[2]/div/section[2]/div/div/div[1]/div[1]/div/div[1]/img");
	if (driver.findElements(locatorBeautyCare).size() > 0) {
		if (driver.findElement(locatorBeautyCare).isDisplayed()) {
			driver.findElement(locatorBeautyCare).click();
			Thread.sleep(2000);
            System.out.println("Beauty care Clicked------");
		   }
	    }
	By locatorBestSeller = By.xpath("/html/body/div/div/div[2]/div/section[2]/div/div/div[1]/div[2]/div/a[1]/div/img");
	if (driver.findElements(locatorBestSeller).size() > 0) {
		if (driver.findElement(locatorBestSeller).isDisplayed()) {
			driver.findElement(locatorBestSeller).click();
			Thread.sleep(2000);
            System.out.println("BestSellaer Clicked------");
		   }
	    }
	By locatorAddTOCart = By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div[2]/button");
	if (driver.findElements(locatorAddTOCart).size() > 0) {
		if (driver.findElement(locatorAddTOCart).isDisplayed()) {
			driver.findElement(locatorAddTOCart).click();
			Thread.sleep(2000);
            System.out.println("SAdd to cart Clicked------");
		   }
	    }
	
	By locatorCheckout = By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div[32]/div[2]/span");
	if (driver.findElements(locatorCheckout).size() > 0) {
		if (driver.findElement(locatorCheckout).isDisplayed()) {
			driver.findElement(locatorCheckout).click();
			Thread.sleep(2000);
            System.out.println("Checkout Clicked------");
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/section[1]/div[2]/div/div[2]/div/input")).sendKeys("9855566677");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/section[1]/div[2]/div/div[2]/button")).click();//Login/SignUp
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/section[1]/div[2]/div/div[2]/input")).sendKeys("2222");//otp
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/section[1]/div[2]/div/div[2]/button")).click();//submit
			Thread.sleep(2000);
		   }
	    }
	By locatorCheckoutAfterLogin = By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div[32]/div[2]/span");
	if (driver.findElements(locatorCheckoutAfterLogin).size() > 0) {
		if (driver.findElement(locatorCheckoutAfterLogin).isDisplayed()) {
			driver.findElement(locatorCheckoutAfterLogin).click();
			Thread.sleep(2000);
            System.out.println("Checkout after login Clicked------");
		   }
	    }
	
	By locatorCartPageCheckout = By.xpath("/html/body/div/div/div/section[2]/div/div/div[2]/div[2]/div[2]");
	if (driver.findElements(locatorCartPageCheckout).size() > 0) {
		if (driver.findElement(locatorCartPageCheckout).isDisplayed()) {
			driver.findElement(locatorCartPageCheckout).click();
			Thread.sleep(2000);
            System.out.println("locatorCartPageCheckout Clicked------");
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/span[1]/input")).sendKeys("Test");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/span[2]/input")).sendKeys("Test");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/span[4]")).click();
			Thread.sleep(5000);
		   }
	    }
	By locatorTime = By.xpath("//div[@class=\"slots_card active\"]");
	if (driver.findElements(locatorTime).size() > 0) {
		if (driver.findElement(locatorTime).isDisplayed()) {
			driver.findElement(locatorTime).click();
			Thread.sleep(3000);
            System.out.println("locatorProceed Clicked------");
		   }
	    }	
	
	By locatorProceed = By.xpath("/html/body/div/div/div/section[2]/div/div/div[2]/span[3]/button");
	if (driver.findElements(locatorProceed).size() > 0) {
		if (driver.findElement(locatorProceed).isDisplayed()) {
			driver.findElement(locatorProceed).click();
			Thread.sleep(2000);
            System.out.println("locatorProceed Clicked------");
		   }
	    }
	By locatorYes = By.xpath("/html/body/div/div/div/div/div/span[2]/button[1]");
	if (driver.findElements(locatorYes).size() > 0) {
		if (driver.findElement(locatorYes).isDisplayed()) {
			driver.findElement(locatorYes).click();
			Thread.sleep(2000);
            System.out.println("locatorYes Clicked------");
		   }
	    }
	/*
	List <WebElement> listofDate = driver.findElements(By.xpath("//div[@class='date-card active']"));

	for (int i=0; i<=listofDate.size(); i++)
	{
		listofDate.get(i).click();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   System.out.println(i);
	   System.out.println("pass");
	   //driver.navigate().back();
	}
	
	List <WebElement> listofTime = driver.findElements(By.xpath("(//div[@class='slots'])[2]"));

	for (int i=0; i<=listofTime.size(); i++)
	{
		listofTime.get(i).click();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   System.out.println(i);
	   System.out.println("pass");
	   //driver.navigate().back();
	}
	
	*/
	
	
	/*
	  Select selectDate10 = new Select(driver.findElement(By.xpath("//span[@class='date'])[3]")));
	  Select selectTime = new Select(driver.findElement(By.xpath("(//div[@class='slots_card'])[18]")));
	
	 List<WebElement> lstDate = selectDate10.getOptions();
	 List<WebElement> lstTime = selectTime.getOptions();

  System.out.println("The dropdown options are:");
	for(WebElement options: lstDate)
  System.out.println(options.getText());
	
	for(WebElement options: lstTime)
      System.out.println(options.getText());
			        
   System.out.println("Select the Option by value Beautician ");
   selectDate10.selectByValue("date");
   selectTime.selectByValue("04:30 PM - 04:45 PM");

	
	/*By locatorDate10 = By.xpath("/html/body/div/div/div/section[2]/div/div/div[2]/div[1]/div[3]/span[2]");
	if (driver.findElements(locatorDate10).size() > 0) {
		if (driver.findElement(locatorDate10).isDisplayed()) {
			driver.findElement(locatorDate10).click();
			Thread.sleep(2000);
            System.out.println("locatorDate Clicked------");
		   }
	    }
	By locatorTime = By.xpath("/html/body/div/div/div/section[2]/div/div/div[2]/div[2]/div[2]/div/div[15]");
	if (driver.findElements(locatorTime).size() > 0) {
		if (driver.findElement(locatorTime).isDisplayed()) {
			driver.findElement(locatorTime).click();
			Thread.sleep(2000);
            System.out.println("locatorTime Clicked------");
		   }
	    }*/
	
	/*
	By locatorBeautyCare = By.xpath("");
	if (driver.findElements(locatorBeautyCare).size() > 0) {
		if (driver.findElement(locatorBeautyCare).isDisplayed()) {
			driver.findElement(locatorBeautyCare).click();
			Thread.sleep(2000);
            System.out.println("Salon at Home Clicked------");
		   }
	    }
	By locatorBeautyCare = By.xpath("");
	if (driver.findElements(locatorBeautyCare).size() > 0) {
		if (driver.findElement(locatorBeautyCare).isDisplayed()) {
			driver.findElement(locatorBeautyCare).click();
			Thread.sleep(2000);
            System.out.println("Salon at Home Clicked------");
		   }
	    }
	By locatorBeautyCare = By.xpath("");
	if (driver.findElements(locatorBeautyCare).size() > 0) {
		if (driver.findElement(locatorBeautyCare).isDisplayed()) {
			driver.findElement(locatorBeautyCare).click();
			Thread.sleep(2000);
            System.out.println("Salon at Home Clicked------");
		   }
	    }
	By locatorBeautyCare = By.xpath("");
	if (driver.findElements(locatorBeautyCare).size() > 0) {
		if (driver.findElement(locatorBeautyCare).isDisplayed()) {
			driver.findElement(locatorBeautyCare).click();
			Thread.sleep(2000);
            System.out.println("Salon at Home Clicked------");
		   }
	    }
	By locatorBeautyCare = By.xpath("");
	if (driver.findElements(locatorBeautyCare).size() > 0) {
		if (driver.findElement(locatorBeautyCare).isDisplayed()) {
			driver.findElement(locatorBeautyCare).click();
			Thread.sleep(2000);
            System.out.println("Salon at Home Clicked------");
		   }
	    }
	By locatorBeautyCare = By.xpath("");
	if (driver.findElements(locatorBeautyCare).size() > 0) {
		if (driver.findElement(locatorBeautyCare).isDisplayed()) {
			driver.findElement(locatorBeautyCare).click();
			Thread.sleep(2000);
            System.out.println("Salon at Home Clicked------");
		   }
	    }
	*/

}}
