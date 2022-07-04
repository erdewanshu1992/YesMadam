package com.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EkartPage1 {
	WebDriver driver;
	  WebDriverWait wait;
	  @FindBy(xpath = "//button[contains(text(),'ADDED')]")
	  WebElement addedBtn;

	  public EkartPage1(WebDriver driver)
	  {
	      wait = new WebDriverWait(driver, 30);
	      PageFactory.initElements(driver, this);
	      this.driver = driver;
	  }
	  //This is my method to click Add to cart button**
	  public void AddtoCart() throws InterruptedException {
	    String[] additems = {"Cucumber","Beans"};
	    List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name")); 

	    for(int i=0;i<list.size();i++)
	    {
	        String[] productname = list.get(i).getText().split("-");
	        String frmtdname = productname[0].trim();
	        List itemsneeded = Arrays.asList(additems);

	      if(itemsneeded.contains(frmtdname))
	      {  

	         List<WebElement> list2 =driver.findElements(By.xpath("//button[text() ='ADD TO CART']"));
	         list2.get(i).click();
	         System.out.println("One product added");

	      }


}}}
