package com.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.setup;

public class ServiceLocation extends setup {
	@Test
	public void Location_Service() throws InterruptedException {
		
		driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorDelhi = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[3]");
		if (driver.findElements(locatorDelhi).size() > 0) {
			if (driver.findElement(locatorDelhi).isDisplayed()) {
				driver.findElement(locatorDelhi).click();
				Thread.sleep(2000);
                System.out.println("Delhi------");
			   }
		    }
		driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorGN = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[2]");
				if (driver.findElements(locatorGN).size() > 0) {
					if (driver.findElement(locatorGN).isDisplayed()) {
						driver.findElement(locatorGN).click();
						Thread.sleep(5000);
						System.out.println("Grater Noida-------");
					}
				}
		driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorGuruGram = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[4]");
			 if (driver.findElements(locatorGuruGram).size() > 0) {
				if (driver.findElement(locatorGuruGram).isDisplayed()) {
					driver.findElement(locatorGuruGram).click();
					Thread.sleep(3000);
					System.out.println("Gurugram------");
					}	
				}
	   driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
	   Thread.sleep(3000);
	   By locatorGaziabad = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[5]");
					 if (driver.findElements(locatorGaziabad).size() > 0) {
						if (driver.findElement(locatorGaziabad).isDisplayed()) {
							driver.findElement(locatorGaziabad).click();
							Thread.sleep(3000);
							System.out.println("Gaziwad----");
				}	
			}
		driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorFaridabad = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[6]");
			 if (driver.findElements(locatorFaridabad).size() > 0) {
				if (driver.findElement(locatorFaridabad).isDisplayed()) {
					driver.findElement(locatorFaridabad).click();
					Thread.sleep(3000);
					System.out.println("Fariwadabad-----");
				}	
			}
	    driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorLucknow = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[7]");
		    if (driver.findElements(locatorLucknow).size() > 0) {
			  if (driver.findElement(locatorLucknow).isDisplayed()) {
				  driver.findElement(locatorLucknow).click();
				  Thread.sleep(3000);
				  System.out.println("Lucknow------");
			}	
		        }
	    driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorJammu = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[8]");
					 if (driver.findElements(locatorJammu).size() > 0) {
						if (driver.findElement(locatorJammu).isDisplayed()) {
							driver.findElement(locatorJammu).click();
							Thread.sleep(3000);
							System.out.println("Jammu------");
					}	
			}
		driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
	    Thread.sleep(3000);
	    By locatorBareilly = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[9]");
					 if (driver.findElements(locatorBareilly).size() > 0) {
						if (driver.findElement(locatorBareilly).isDisplayed()) {
							driver.findElement(locatorBareilly).click();
							Thread.sleep(3000);
							System.out.println("Bareilly------");
				}	
			}
		driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorChandighar = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[10]");
				if (driver.findElements(locatorChandighar).size() > 0) {
				   if (driver.findElement(locatorChandighar).isDisplayed()) {
					   driver.findElement(locatorChandighar).click();
					   Thread.sleep(3000);
					   System.out.println("Chandighar-------");
				}	
	     	}
		driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorPanchukula = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[12]");
		if (driver.findElements(locatorPanchukula).size() > 0) {
		   if (driver.findElement(locatorPanchukula).isDisplayed()) {
			   driver.findElement(locatorPanchukula).click();
			   Thread.sleep(3000);
			   System.out.println("Panchukula-------");
						}	
			     	}
		driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorJalandhar = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[13]");
			if (driver.findElements(locatorJalandhar).size() > 0) {
			   if (driver.findElement(locatorJalandhar).isDisplayed()) {
			      driver.findElement(locatorJalandhar).click();
				   Thread.sleep(3000);
				   System.out.println("Jalandgar------");
								}	
					     	}
		driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
		Thread.sleep(3000);
		By locatorKanpur = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[14]");
			if (driver.findElements(locatorKanpur).size() > 0) {
			   if (driver.findElement(locatorKanpur).isDisplayed()) {
			      driver.findElement(locatorKanpur).click();
				   Thread.sleep(3000);
				   System.out.println("Kanpur------");
					}	
			   }	
    driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
	Thread.sleep(3000);
	By locatorJaipur = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[15]");
			if (driver.findElements(locatorJaipur).size() > 0) {
			   if (driver.findElement(locatorJaipur).isDisplayed()) {
			      driver.findElement(locatorJaipur).click();
				   Thread.sleep(3000);
				   System.out.println("Jaipur----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorMerrut = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[16]");
			if (driver.findElements(locatorMerrut).size() > 0) {
			   if (driver.findElement(locatorMerrut).isDisplayed()) {
			      driver.findElement(locatorMerrut).click();
				   Thread.sleep(3000);
				   System.out.println("Merrut------");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorBengalure = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[17]");
			   if (driver.findElements(locatorBengalure).size() > 0) {
			     if (driver.findElement(locatorBengalure).isDisplayed()) {
			      driver.findElement(locatorBengalure).click();
				   Thread.sleep(3000);
				   System.out.println("Bangalura-----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorAgra = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[18]");
			  if (driver.findElements(locatorAgra).size() > 0) {
			    if (driver.findElement(locatorAgra).isDisplayed()) {
			      driver.findElement(locatorAgra).click();
				   Thread.sleep(3000);
				   System.out.println("Agra-----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorBhubneshwar = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[19]");
			  if (driver.findElements(locatorBhubneshwar).size() > 0) {
			    if (driver.findElement(locatorBhubneshwar).isDisplayed()) {
			      driver.findElement(locatorBhubneshwar).click();
				   Thread.sleep(3000);
				   System.out.println("Bhubneshwar-----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorDeharadun = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[20]");
			if (driver.findElements(locatorDeharadun).size() > 0) {
			   if (driver.findElement(locatorDeharadun).isDisplayed()) {
			      driver.findElement(locatorDeharadun).click();
				   Thread.sleep(3000);
				   System.out.println("Deharadun----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorLudhiana = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[21]");
			if (driver.findElements(locatorLudhiana).size() > 0) {
			   if (driver.findElement(locatorLudhiana).isDisplayed()) {
			      driver.findElement(locatorLudhiana).click();
				   Thread.sleep(3000);
				   System.out.println("Ludhiana----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorHydrabad = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[22]");
			if (driver.findElements(locatorHydrabad).size() > 0) {
			   if (driver.findElement(locatorHydrabad).isDisplayed()) {
			      driver.findElement(locatorHydrabad).click();
				   Thread.sleep(3000);
				   System.out.println("Hydrabad----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorVaranashi = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[23]");
			if (driver.findElements(locatorVaranashi).size() > 0) {
			   if (driver.findElement(locatorVaranashi).isDisplayed()) {
			      driver.findElement(locatorVaranashi).click();
				   Thread.sleep(3000);
				   System.out.println("Varanashi----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorRaipur = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[24]");
			if (driver.findElements(locatorRaipur).size() > 0) {
			   if (driver.findElement(locatorRaipur).isDisplayed()) {
			      driver.findElement(locatorRaipur).click();
				   Thread.sleep(3000);
				   System.out.println("Raipur-----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorPatna = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[25]");
			if (driver.findElements(locatorPatna).size() > 0) {
			   if (driver.findElement(locatorPatna).isDisplayed()) {
			      driver.findElement(locatorPatna).click();
				   Thread.sleep(3000);
				   System.out.println("Patna-----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorMumbai = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[26]");
			if (driver.findElements(locatorMumbai).size() > 0) {
			   if (driver.findElement(locatorMumbai).isDisplayed()) {
			      driver.findElement(locatorMumbai).click();
				   Thread.sleep(3000);
				   System.out.println("Mumbai-----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorPrayagraj = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[27]");
			if (driver.findElements(locatorPrayagraj).size() > 0) {
			   if (driver.findElement(locatorPrayagraj).isDisplayed()) {
			      driver.findElement(locatorPrayagraj).click();
				   Thread.sleep(3000);
				   System.out.println("Prayagraj-----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorKatak = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[28]");
			if (driver.findElements(locatorKatak).size() > 0) {
			   if (driver.findElement(locatorKatak).isDisplayed()) {
			      driver.findElement(locatorKatak).click();
				   Thread.sleep(3000);
				   System.out.println("Katak-----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorAmaritsar = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[29]");
			if (driver.findElements(locatorAmaritsar).size() > 0) {
			   if (driver.findElement(locatorAmaritsar).isDisplayed()) {
			      driver.findElement(locatorAmaritsar).click();
				   Thread.sleep(3000);
				   System.out.println("Amritshar----");
								}	
					     	}
			driver.findElement(By.xpath("//img[@class=\"arrow_down_icon\"]")).click();
			Thread.sleep(3000);
			By locatorAhmedabad = By.xpath("/html/body/div/div/div[2]/div/section[2]/div[2]/div/div[3]/div[1]/ul/li[30]");
			if (driver.findElements(locatorAhmedabad).size() > 0) {
			   if (driver.findElement(locatorAhmedabad).isDisplayed()) {
			      driver.findElement(locatorAhmedabad).click();
				   Thread.sleep(3000);
				   System.out.println("Ahmedabad----");
								}	
					     	}

	}}
