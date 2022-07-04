package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HairExtensionWhileLoop {
	@Test
	public void Hair_Extension() throws InterruptedException {
		System.out.println("......Hi Dewanshu Nameste Your Chrome browser is Launching Now All the Best :-) ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://api-stage-aws.yesmadam.co.in/hair-extension/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/a[1]")).click();
		Thread.sleep(5000);
		
		int i =20;
		for (i = 20; i < 32; i=+2) {
			driver.findElement(By.xpath("(//span[@class=\"active hair_size\"])[1]")).click();
			Thread.sleep(3000);
		    }
		System.out.println(driver.findElement(By.xpath("(//span[@class=\"hair_length_size\"])[1]")).getText());
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("(//span[@class=\"actual_price\"])[1]")).getText());
        Thread.sleep(2000);
		      
		
		
		//System.out.println(driver.findElement(By.xpath("(//span[@class=\"hair_length_size\"])[1]")).getText());
	    //Thread.sleep(2000);
	//int i = 20;
	//while(i>32) {
		//driver.findElement(By.xpath("(//span[@class=\"active hair_size\"])[1]")).click();
		////Thread.sleep(4000);
					//	i=+2;
		//}

         //System.out.println(driver.findElement(By.xpath("(//span[@class=\"hair_length_size\"])[1]")).getText());
         //Thread.sleep(2000);
         //System.out.println(driver.findElement(By.xpath("(//span[@class=\"actual_price\"])[1]")).getText());
         //Thread.sleep(2000);

         
	}
}
		

