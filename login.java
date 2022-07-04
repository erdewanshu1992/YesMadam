package com.credentials;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.setup;

public class login extends setup {
	@Test(description="This method validates the Login/SignUp functionality")
	public void login_credentials () throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/input")).sendKeys("9855566677");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/input")).sendKeys("7011565023");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button")).click();//Login/SignUp
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/input")).sendKeys("2222");//otp
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button")).click();//submit
		Thread.sleep(2000);
		
	}

}
