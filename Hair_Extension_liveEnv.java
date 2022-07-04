package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hair_Extension_liveEnv {
	
	@Test
	public void Hair_Extension() throws InterruptedException {
		System.out.println("......Hi Dewanshu Nameste Your Chrome browser is Launching Now All the Best :-) ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.yesmadam.com/");
		Thread.sleep(4000);
		//driver.navigate().to("http://api-stage-aws.yesmadam.co.in/hair-extension");

		//driver.findElement(By.xpath("(//img[@class=\"banner_img_hair\"])[1]")).click();//live banner
		driver.findElement(By.xpath("(//img[@class=\"banner_img_hair\"])[2]")).click();//live banner

		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/a[1]")).click();
		Thread.sleep(5000);

	
		By locator32 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[1]/span[2]/span[7]");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
					}
		By locator12532 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[4]\n");
					if (driver.findElements(locator12532).size() > 0) {
						if (driver.findElement(locator12532).isDisplayed()) {
							driver.findElement(locator12532).click();
							Thread.sleep(3000);
							
							System.out.println(driver.findElement(By.xpath("(//span[@class=\"hair_length_size\"])[1]")).getText());
					         Thread.sleep(2000);
					         System.out.println(driver.findElement(By.xpath("(//span[@class=\"actual_price\"])[1]")).getText());
					         Thread.sleep(2000);
							
						}
		By locatorAddToCart = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button");
						if (driver.findElements(locatorAddToCart).size() > 0) {
							if (driver.findElement(locatorAddToCart).isDisplayed()) {
								driver.findElement(locatorAddToCart).click();
								Thread.sleep(3000);
								
								driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/input")).sendKeys("9855566677");
								Thread.sleep(3000);
								driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button")).click();//Login/SignUp
								Thread.sleep(3000);
								driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/input")).sendKeys("2222");//otp
								Thread.sleep(2000);
								driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button")).click();//submit
								Thread.sleep(2000);
								driver.findElement(By.xpath("//button[@class='addtocart_btn movetonext']")).click();//add to cart after login
								Thread.sleep(2000);
								//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
								//Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div[3]/div[2]/div[1]/input")).sendKeys("Testing");//Name
								Thread.sleep(5000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div[3]/div[2]/div[2]/input")).sendKeys("9586523550");//Phone number
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div[3]/div[2]/div[3]/input")).sendKeys("Test");//address
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div[3]/div[2]/div[4]/input")).sendKeys("Test");//House no
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div[3]/div[2]/div[6]/button[1]")).click();//Home
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div[3]/div[2]/div[7]/button")).click();//Continue
								Thread.sleep(3000);
								
								
								
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
								Thread.sleep(3000);
								//driver.navigate().back();
							
							
						}
		By locator10032 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[3]");
						if (driver.findElements(locator10032).size() > 0) {
							if (driver.findElement(locator10032).isDisplayed()) {
								driver.findElement(locator10032).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
								Thread.sleep(2000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
								Thread.sleep(5000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
								Thread.sleep(3000);
							}
		By locator7532 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[2]");
							if (driver.findElements(locator7532).size() > 0) {
								if (driver.findElement(locator7532).isDisplayed()) {
									driver.findElement(locator7532).click();
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
									Thread.sleep(2000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
									Thread.sleep(5000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
									Thread.sleep(3000);
									
									System.out.println(driver.findElement(By.xpath("(//span[@class=\"hair_length_size\"])[1]")).getText());
							         Thread.sleep(2000);
							         System.out.println(driver.findElement(By.xpath("(//span[@class=\"actual_price\"])[1]")).getText());
							         Thread.sleep(2000);
									
								}	
		By locator5032 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[1]");
								if (driver.findElements(locator5032).size() > 0) {
									if (driver.findElement(locator5032).isDisplayed()) {
										driver.findElement(locator5032).click();
										Thread.sleep(3000);
									}
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
									Thread.sleep(2000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
									Thread.sleep(5000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
									Thread.sleep(3000);
			
		By locator30 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[1]/span[2]/span[6]\n");
					if (driver.findElements(locator30).size() > 0) {
						if (driver.findElement(locator30).isDisplayed()) {
							driver.findElement(locator30).click();
							Thread.sleep(3000);
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
							Thread.sleep(2000);
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
							Thread.sleep(3000);
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
							Thread.sleep(5000);
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
							Thread.sleep(3000);
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
							Thread.sleep(3000);

							}
		By locator12530 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[4]\n");
						if (driver.findElements(locator12530).size() > 0) {
							if (driver.findElement(locator12530).isDisplayed()) {
								driver.findElement(locator12530).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
								Thread.sleep(2000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
								Thread.sleep(5000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
								Thread.sleep(3000);
							}
		By locator10030 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[3]");
						if (driver.findElements(locator10030).size() > 0) {
							if (driver.findElement(locator10030).isDisplayed()) {
								driver.findElement(locator10030).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
								Thread.sleep(2000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
								Thread.sleep(5000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
								Thread.sleep(3000);
							}
		By locator7530 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[2]");
							if (driver.findElements(locator7530).size() > 0) {
								if (driver.findElement(locator7530).isDisplayed()) {
									driver.findElement(locator7530).click();
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
									Thread.sleep(2000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
									Thread.sleep(5000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
									Thread.sleep(3000);
								}
								
		By locator5030 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[1]");
								if (driver.findElements(locator5030).size() > 0) {
									if (driver.findElement(locator5030).isDisplayed()) {
										driver.findElement(locator5030).click();
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
										Thread.sleep(2000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
										Thread.sleep(5000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
										Thread.sleep(3000);
									}
		By locator28 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[1]/span[2]/span[5]");
						if (driver.findElements(locator28).size() > 0) {
							if (driver.findElement(locator28).isDisplayed()) {
								driver.findElement(locator28).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
								Thread.sleep(2000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
								Thread.sleep(5000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
								Thread.sleep(3000);

							}
		By locator12528 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[4]\n");
							if (driver.findElements(locator12528).size() > 0) {
								if (driver.findElement(locator12528).isDisplayed()) {
									driver.findElement(locator12528).click();
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
									Thread.sleep(2000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
									Thread.sleep(5000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
									Thread.sleep(3000);
								}

		By locator10028 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[3]");
							if (driver.findElements(locator10028).size() > 0) {
								if (driver.findElement(locator10028).isDisplayed()) {
									driver.findElement(locator10028).click();
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
									Thread.sleep(2000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
									Thread.sleep(5000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
									Thread.sleep(3000);
								}
		By locator7528 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[2]");
								if (driver.findElements(locator7528).size() > 0) {
									if (driver.findElement(locator7528).isDisplayed()) {
										driver.findElement(locator7528).click();
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
										Thread.sleep(2000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
										Thread.sleep(5000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
										Thread.sleep(3000);
									}	
		By locator5028 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[1]");
									if (driver.findElements(locator5028).size() > 0) {
										if (driver.findElement(locator5028).isDisplayed()) {
											driver.findElement(locator5028).click();
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
											Thread.sleep(2000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
											Thread.sleep(5000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
											Thread.sleep(3000);
										}
		By locator26 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[1]/span[2]/span[4]");
							if (driver.findElements(locator26).size() > 0) {
								if (driver.findElement(locator26).isDisplayed()) {
									driver.findElement(locator26).click();
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
									Thread.sleep(2000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
									Thread.sleep(5000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
									Thread.sleep(3000);
									driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
									Thread.sleep(3000);
								}
		By locator12526 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[4]\n");
								if (driver.findElements(locator12526).size() > 0) {
									if (driver.findElement(locator12526).isDisplayed()) {
										driver.findElement(locator12526).click();
										Thread.sleep(3000);
									}
		By locator10026 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[3]");
								if (driver.findElements(locator10026).size() > 0) {
									if (driver.findElement(locator10026).isDisplayed()) {
										driver.findElement(locator10026).click();
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
										Thread.sleep(2000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
										Thread.sleep(5000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
										Thread.sleep(3000);
									}
	    By locator7526 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[2]");
									if (driver.findElements(locator7526).size() > 0) {
										if (driver.findElement(locator7526).isDisplayed()) {
											driver.findElement(locator7526).click();
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
											Thread.sleep(2000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
											Thread.sleep(5000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
											Thread.sleep(3000);
										}
										
		By locator5026 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[1]");
										if (driver.findElements(locator5026).size() > 0) {
											if (driver.findElement(locator5026).isDisplayed()) {
												driver.findElement(locator5026).click();
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
												Thread.sleep(2000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
												Thread.sleep(5000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
												Thread.sleep(3000);
											}
		By locator24 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[1]/span[2]/span[3]");
								if (driver.findElements(locator24).size() > 0) {
									if (driver.findElement(locator24).isDisplayed()) {
										driver.findElement(locator24).click();
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
										Thread.sleep(2000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
										Thread.sleep(5000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
										Thread.sleep(3000);
										driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
										Thread.sleep(3000);
									}
		By locator12524 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[4]\n");
									if (driver.findElements(locator12524).size() > 0) {
										if (driver.findElement(locator12524).isDisplayed()) {
											driver.findElement(locator12524).click();
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
											Thread.sleep(2000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
											Thread.sleep(5000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
											Thread.sleep(3000);
									}
		By locator10024 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[3]");
									if (driver.findElements(locator10024).size() > 0) {
										if (driver.findElement(locator10024).isDisplayed()) {
											driver.findElement(locator10024).click();
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
											Thread.sleep(2000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
											Thread.sleep(5000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
											Thread.sleep(3000);
										}
		By locator7524 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[2]");
										if (driver.findElements(locator7524).size() > 0) {
											if (driver.findElement(locator7524).isDisplayed()) {
												driver.findElement(locator7524).click();
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
												Thread.sleep(2000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
												Thread.sleep(5000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
												Thread.sleep(3000);
											}
											
		By locator5024 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[1]");
											if (driver.findElements(locator5024).size() > 0) {
												if (driver.findElement(locator5024).isDisplayed()) {
													driver.findElement(locator5024).click();
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
													Thread.sleep(2000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
													Thread.sleep(5000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
													Thread.sleep(3000);
												}
		By locator22 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[1]/span[2]/span[2]");//
									if (driver.findElements(locator22).size() > 0) {
										if (driver.findElement(locator22).isDisplayed()) {
											driver.findElement(locator22).click();
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
											Thread.sleep(2000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
											Thread.sleep(5000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
											Thread.sleep(3000);
											driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
											Thread.sleep(3000);
										}
		By locator12522 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[4]\n");
										if (driver.findElements(locator12522).size() > 0) {
											if (driver.findElement(locator12522).isDisplayed()) {
												driver.findElement(locator12522).click();
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
												Thread.sleep(2000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
												Thread.sleep(5000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
												Thread.sleep(3000);
											}

		By locator10022 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[3]");
										if (driver.findElements(locator10022).size() > 0) {
											if (driver.findElement(locator10022).isDisplayed()) {
												driver.findElement(locator10022).click();
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
												Thread.sleep(2000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
												Thread.sleep(5000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
												Thread.sleep(3000);
											}
		By locator7522 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[2]");
											if (driver.findElements(locator7522).size() > 0) {
												if (driver.findElement(locator7522).isDisplayed()) {
													driver.findElement(locator7522).click();
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
													Thread.sleep(2000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
													Thread.sleep(5000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
													Thread.sleep(3000);
												}
		By locator5022 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[1]");
												if (driver.findElements(locator5022).size() > 0) {
													if (driver.findElement(locator5022).isDisplayed()) {
														driver.findElement(locator5022).click();
														Thread.sleep(3000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
														Thread.sleep(2000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
														Thread.sleep(3000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
														Thread.sleep(5000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
														Thread.sleep(3000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
														Thread.sleep(3000);
													}
		By locator20 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[1]/span[2]/span[1]");//
										if (driver.findElements(locator20).size() > 0) {
											if (driver.findElement(locator20).isDisplayed()) {
												driver.findElement(locator20).click();
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
												Thread.sleep(2000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
												Thread.sleep(5000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
												Thread.sleep(3000);
												driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
												Thread.sleep(3000);
											}
		 By locator12520 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[4]\n");
											if (driver.findElements(locator12520).size() > 0) {
												if (driver.findElement(locator12520).isDisplayed()) {
													driver.findElement(locator12520).click();
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
													Thread.sleep(2000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
													Thread.sleep(5000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
													Thread.sleep(3000);
											}
		By locator10020 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[3]");
											if (driver.findElements(locator10020).size() > 0) {
												if (driver.findElement(locator10020).isDisplayed()) {
													driver.findElement(locator10020).click();
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
													Thread.sleep(2000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
													Thread.sleep(5000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
													Thread.sleep(3000);
													driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
													Thread.sleep(3000);
												}
		By locator7520 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[2]");
												if (driver.findElements(locator10020).size() > 0) {
													if (driver.findElement(locator7520).isDisplayed()) {
														driver.findElement(locator7520).click();
														Thread.sleep(3000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
														Thread.sleep(2000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
														Thread.sleep(3000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
														Thread.sleep(5000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
														Thread.sleep(3000);
														driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
														Thread.sleep(3000);
													}
													
		By locator5020 = By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/div[4]/span[2]/span[1]");
													if (driver.findElements(locator5020).size() > 0) {
														if (driver.findElement(locator5020).isDisplayed()) {
															driver.findElement(locator5020).click();
															Thread.sleep(3000);
															driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[2]/button")).click();//add to cart after login
															Thread.sleep(2000);
															driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/button")).click();//add adress and slot
															Thread.sleep(3000);
															driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div[1]/div[1]/div/div[1]/div/button")).click();//select
															Thread.sleep(5000);
															driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/span/img")).click();//back
															Thread.sleep(3000);
															driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/img")).click();//again back
															Thread.sleep(3000);
														}
														
													}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
	


