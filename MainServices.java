package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.base.setup;

public class MainServices extends setup {
	@Test
	public void Main_Servics() throws InterruptedException {
		
		By locatorSalonATHome = By.xpath("(//img[@alt=\"Salon At Home\"])[2]");
		  if(driver.findElements(locatorSalonATHome).size() > 0) {
			if(driver.findElement(locatorSalonATHome).isDisplayed()) {
				driver.findElement(locatorSalonATHome).click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1550)", "");
				
				Thread.sleep(4000);
	            System.out.println("Salon at Home Clicked------");
	            driver.navigate().back();
			   }
		    }
		 By locatorFemaleSpa = By.xpath("(//img[@alt='Female Spa'])[2]");
		  if(driver.findElements(locatorFemaleSpa).size() > 0) {
			if(driver.findElement(locatorFemaleSpa).isDisplayed()) {
				driver.findElement(locatorFemaleSpa).click();
				Thread.sleep(4000);
	            System.out.println("FemaleSpa Clicked------");
	            driver.navigate().back();
			   }
		    }
		  By locatorFemaleHairService = By.xpath("(//img[@alt='Female Hair Services'])[2]");
		    if(driver.findElements(locatorFemaleHairService).size() > 0) {
			  if(driver.findElement(locatorFemaleHairService).isDisplayed()) {
				driver.findElement(locatorFemaleHairService).click();
				Thread.sleep(4000);
	            System.out.println("FemaleHairService Clicked------");
	            driver.navigate().back();
			   }
		    }
	 By locatorMaleGrooming = By.xpath("(//img[@alt='Male Grooming'])[2]");
		       if(driver.findElements(locatorMaleGrooming).size() > 0) {
			     if(driver.findElement(locatorMaleGrooming).isDisplayed()) {
				   driver.findElement(locatorMaleGrooming).click();
				   Thread.sleep(4000);
	               System.out.println("MaleGrooming Clicked------");
	               driver.navigate().back();
			   }
		    }
	 By locatorMaleMassage = By.xpath("(//img[@alt='Male Massage'])[2]");
		       if(driver.findElements(locatorMaleMassage).size() > 0) {
			     if(driver.findElement(locatorMaleMassage).isDisplayed()) {
				   driver.findElement(locatorMaleMassage).click();
				   Thread.sleep(4000);
	               System.out.println("MaleMassage Clicked------");
	               driver.navigate().back();
			   }
		    }
	}
	

}
