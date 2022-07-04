package com.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.setup;

public class ServiceADDing extends setup {
	@Test(priority=1)
	public void serviceAdd() throws InterruptedException {
		
	driver.findElement(By.xpath("(//img[@alt=\"Salon At Home\"])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div[class='left_bottom'] a:nth-child(1)")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class=\"add_cart_btn\"])[1]")).click();
	System.out.println(driver.findElement(By.xpath("//span[@class=\"Value\"]")).getText());
	
	int i =1;
	//while(i<5)
	for (i = 0; i < 5; i++) {
	     driver.findElement(By.xpath("(//span[@class=\"minus\"])[2]")).click();
	        //i++;   //for while loop
	    }
	      System.out.println(driver.findElement(By.xpath("//span[@class=\"Value\"]")).getText());
	      Thread.sleep(2000);
	      
	      //driver.findElement(By.xpath("//*/div[32]/div[2]/span")).click();
	      //Thread.sleep(2000);
	      //driver.findElement(By.xpath("//*/div/div[2]/div/section[1]/div[2]/div/div[2]/div/input")).sendKeys("9855566677");
	      //Thread.sleep(3000);
	      //driver.findElement(By.xpath("//*/div/div[2]/div/section[1]/div[2]/div/div[2]/button")).click(); 
	      //Thread.sleep(3000);
	      //driver.findElement(By.xpath("//*/div/div[2]/div/section[1]/div[2]/div/div[2]/input")).sendKeys("2222");
	      //Thread.sleep(2000);
	      //driver.findElement(By.xpath("//*/div/div[2]/div/section[1]/div[2]/div/div[2]/button")).click();
	      //Thread.sleep(3000);
	      
	
	}

	}
