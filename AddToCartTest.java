package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.AddToCartPage;

public class AddToCartTest {
	WebDriver driver;
	AddToCartPage page;
	@BeforeTest
	public void setup() {
	driver = new ChromeDriver();
	driver.get("https://www.yesmadam.com/");
	driver.manage().window().maximize();
	page = new AddToCartPage(driver);
	}
	@Test
	public void validateAddToCart() {
		Assert.assertTrue(page.validateAddToCart(driver));
	}
	

}
