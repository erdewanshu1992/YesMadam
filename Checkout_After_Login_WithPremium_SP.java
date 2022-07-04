package com.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Checkout_After_Login_WithPremium_SP extends login {
	@Test(priority=4)
	public void Service_Flow () throws InterruptedException {
		
		  driver.findElement(By.xpath("(//div[@class=\"service_type\"]/div)[2]")).click();//premium SP
		  Thread.sleep(2000);
	      System.out.println(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div")).getText());
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/span/button")).click();//pop up ok
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[2]/div/div/div[2]/div[2]/div[2]")).click();//checkout button after login
		  Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"emloginclosebutton\"]")).click();// cross 
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*/div/div/section[1]/div/div/div[2]/span[6]/img")).click();//menu bar
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*/div/div/section[1]/div/div/div[2]/div[2]/ul/li[3]")).click();//by profile
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[2]/div/div/div[2]/div[2]/span[2]/span")).click();//set default
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//img[@alt=\"yesmadam logo\"]")).click();
	      Thread.sleep(2000);
	   
	}

}
