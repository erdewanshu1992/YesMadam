package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterAsAprofessional {
	@Test
	public void Hair_Extension() throws InterruptedException {
		System.out.println("......Hi Dewanshu Nameste Your Chrome browser is Launching Now All the Best :-) ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.yesmadam.com/");
		//driver.navigate().to("http://api-stage-aws.yesmadam.co.in");

		driver.findElement(By.xpath("//span[@class='menu_link'][2]")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/a[1]")).click();
	
		By locatorWithoutEnterDate = By.xpath("//button[@class='login_btn']");
				if (driver.findElements(locatorWithoutEnterDate).size() > 0) {
					if (driver.findElement(locatorWithoutEnterDate).isDisplayed()) {
						driver.findElement(locatorWithoutEnterDate).click();
						Thread.sleep(5000);
						driver.navigate().refresh();

					}	
				}
		By locatorName = By.xpath("//input[@placeholder=\"Name...\"]");
						if (driver.findElements(locatorName).size() > 0) {
							if (driver.findElement(locatorName).isDisplayed()) {
								driver.findElement(locatorName).sendKeys("Testing");//Name
								Thread.sleep(3000);
							}		}
		By locatorMob = By.xpath("//input[@name='mobileNo']");
							if (driver.findElements(locatorMob).size() > 0) {
							if (driver.findElement(locatorMob).isDisplayed()) {
								driver.findElement(locatorMob).sendKeys("9856425256");//Mob Number
								Thread.sleep(3000);
											
							}		}
							
						 //Step#3- Selecting the dropdown element by locating its id
						  Select selectProfessional = new Select(driver.findElement(By.xpath("//select[@class=\"form-control\"]")));
						  Select selectExp = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[2]")));
						  
						  WebElement radio_no = driver.findElement(By.xpath("(//input[@name='comfortabled'])[2]"));
						  radio_no.click();
						  Thread.sleep(3000);
						  WebElement radio_yes = driver.findElement(By.xpath("(//input[@name='comfortabled'])[1]"));
						  radio_yes.click();
						  Thread.sleep(3000);
						  WebElement radio_female = driver.findElement(By.xpath("(//input[@value='female'])[1]"));
						  radio_female.click();
						  Thread.sleep(3000);
						  WebElement radio_male = driver.findElement(By.xpath("(//input[@value='male'])[1]"));
						  radio_male.click();
						  Thread.sleep(3000);
						 
						 //Step#4- Printing the options of the dropdown
						 //Get list of web elements
						 List<WebElement> lstPro = selectProfessional.getOptions();
						 List<WebElement> lstExp = selectExp.getOptions();

						//Looping through the options and printing dropdown options
					    System.out.println("The dropdown options are:");
						for(WebElement options: lstPro)
			            System.out.println(options.getText());
						
						for(WebElement options: lstExp)
				            System.out.println(options.getText());
								        
					//Step#7- Selecting an option by its value
					 System.out.println("Select the Option by value Beautician ");
					 selectProfessional.selectByValue("Beautician");
					 selectExp.selectByValue("3");
					 
					 By locatorComment = By.xpath("(//textarea[@placeholder='comment'])[1]");
						if (driver.findElements(locatorComment).size() > 0) {
							if (driver.findElement(locatorComment).isDisplayed()) {
								driver.findElement(locatorComment).sendKeys("A true story shared by Rati Agrawal about her journey from a low income parlour job to becoming a Yes Madam partner, and her dream of achieving a prosperous and happy life where she can fullfill all the needs of her growing son We wish him good luck for her journey");//Name
								Thread.sleep(3000);
							}		}
						driver.findElement(By.xpath("(//button[@class='login_btn'])[1]")).click();//Get in touch
						Thread.sleep(3000);
						
						
	}}			
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
























						
					 /*
							        //Step#5- Selecting the option as 'Purple'-- selectByIndex
								        System.out.println("Select the Option by Index 4");
								        select.selectByIndex(4);
								        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

								        //Step#6- Selecting the option as 'Magenta'-- selectByVisibleText
								        System.out.println("Select the Option by Text Magenta");
								        select.selectByVisibleText("Magenta");
								        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
*/
								       
						/*				
		By locatorProfession = By.xpath("//*[@id=\"__next\"]/div/div[2]/section[3]/div/div/div/div[1]/select");
										if (driver.findElements(locatorProfession).size() > 0) {
											if (driver.findElement(locatorProfession).isDisplayed()) {
												driver.findElement(locatorProfession).click();
												Thread.sleep(5000);
											}		}
										/*By locatorMob = By.xpath("//input[@name='mobileNo']");
										if (driver.findElements(locatorMob).size() > 0) {
											if (driver.findElement(locatorMob).isDisplayed()) {
												driver.findElement(locatorMob).sendKeys("9856425252");
												Thread.sleep(3000);
											}		}
										By locatorMob = By.xpath("//input[@name='mobileNo']");
										if (driver.findElements(locatorMob).size() > 0) {
											if (driver.findElement(locatorMob).isDisplayed()) {
												driver.findElement(locatorMob).sendKeys("9856425252");
												Thread.sleep(3000);
											}		}
										By locatorMob = By.xpath("//input[@name='mobileNo']");
										if (driver.findElements(locatorMob).size() > 0) {
											if (driver.findElement(locatorMob).isDisplayed()) {
												driver.findElement(locatorMob).sendKeys("9856425252");
												Thread.sleep(3000);
											}		}*/

