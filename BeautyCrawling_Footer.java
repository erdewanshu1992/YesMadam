package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.base.setup;

public class BeautyCrawling_Footer extends setup {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Test
	public void Crawling_Footer() throws InterruptedException {
		By locatorSalonATHome = By.xpath("(//img[@alt=\"Salon At Home\"])[2]");
		  if(driver.findElements(locatorSalonATHome).size() > 0) {
			if(driver.findElement(locatorSalonATHome).isDisplayed()) {
				driver.findElement(locatorSalonATHome).click();
				js.executeScript("window.scrollBy(0,150)", "");
				Thread.sleep(4000);
				//scroll = (JavascriptExecutor) driver;


	            System.out.println("Salon at Home Clicked------");
	            //driver.navigate().back();
			   }
		    }
	}

}
