package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.base.setup;

public class Hair_Extension extends setup {
	
	@Test
	public void Combinations() throws InterruptedException {
		
	System.out.println("......Hi Dewanshu Nameste Your Chrome browser is Launching Now All the Best :-) ");
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/a")).click();//Love is in the hair
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/img")).click();
	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);

	Actions action = new Actions(driver);
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div/div[2]/h4")).click();//Hair Extension
	System.out.println("Page title is : " + driver.getTitle());
    System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("/html/body/div/div/section/div/div/div[2]/div/div[2]/button")).click();//Add to cart --5,17,NB
	Thread.sleep(3000);
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
	driver.findElement(By.xpath("//button[@class='addtocart_btn']")).click();//add to cart
	Thread.sleep(4000);//
	driver.findElement(By.xpath("//button[@class='addtocart_btn movetonext']")).click();//add and slot button
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='mt-3 add_new']")).click();//select address
	Thread.sleep(3000);
	driver.navigate().back();
	driver.navigate().back();
	
	//Length, Shades and Number of strands
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div/div[2]/h4")).click();//Hair Extension
	System.out.println("Page title is : " + driver.getTitle());
    System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.xpath("/*[@id=\"__next\"]/div/section/div/div/div[3]/div/div[2]/div[1]/span[2]/span[1]")).click();//20
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[3]/div/div[2]/div[2]/span/span[2]/span[1]")).click();// //Brown Shade #3
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[3]/div/div[2]/div[4]/span[2]/span[1]")).click();//50
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='addtocart_btn']")).click();//add to cart
	Thread.sleep(4000);//
	driver.findElement(By.xpath("/html/body/div/div/div[2]/button")).click();//add and slot button
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select address
	Thread.sleep(3000);
	driver.navigate().back();
	driver.navigate().back();
	
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div/div[2]/h4")).click();//Hair Extension
	System.out.println("Page title is : " + driver.getTitle());
    System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.xpath("/*[@id=\"__next\"]/div/section/div/div/div[3]/div/div[2]/div[1]/span[2]/span[1]")).click();//20
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[3]/div/div[2]/div[2]/span/span[2]/span[2]")).click();// //Brown Shade #5
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[3]/div/div[2]/div[4]/span[2]/span[1]")).click();//50
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='addtocart_btn']")).click();//add to cart
	Thread.sleep(4000);//
	driver.findElement(By.xpath("/html/body/div/div/div[2]/button")).click();//add and slot button
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select address
	Thread.sleep(3000);
	driver.navigate().back();
	driver.navigate().back();
	

	
	
	
	

	
	
	
	
	}
	
	
	
}
