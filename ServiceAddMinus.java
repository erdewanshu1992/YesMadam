package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ServiceAddMinus extends ServiceADDing {
	@Test(priority=2)
	public void minus () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 30); 
	
		System.out.println(driver.findElement(By.xpath("(//span[text()='5'])[6]")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[@class=\"total_Cost\"])[1]")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//span[@class=\"total_time\"])[33]")).getText());

		int i =5;
		for (i = 5; i >1; i--) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product_sec\"]/div[1]/div[2]/div/div[2]/div/span[1]"))).click();
	  	    }
	  	      System.out.println(driver.findElement(By.xpath("//span[@class=\"Value\"]")).getText());
	  	      //Thread.sleep(2000);
	  		System.out.println(driver.findElement(By.xpath("(//span[@class=\"total_Cost\"])[1]")).getText());
	  		Thread.sleep(2000);
			System.out.println(driver.findElement(By.xpath("(//span[@class=\"total_time\"])[33]")).getText());
	      
	}

}
