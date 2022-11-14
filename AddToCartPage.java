package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumimplementation.SeleniumImplementation;

public class AddToCartPage {
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")WebElement itemImage;
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]/span")WebElement btnMore;
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")WebElement txtQuantity;
	@FindBy(xpath="//*[@id=\"group_1\"]")WebElement selectSize;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")WebElement btnAddToCart;
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")WebElement btnCheckout;
	//@FindBy(css="div#layer_cart a > span")WebElement btnCheckout;
	//@FindBy(xpath="//*[@id=\"product\"]")WebElement btnCheckout;
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[3]")WebElement cartText;
	
	SeleniumImplementation selenium;
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium = new SeleniumImplementation();
	}
	
	public boolean validateAddToCart(WebDriver driver) {
		selenium.performMouseHower(itemImage, driver);
		selenium.click(btnMore);
		selenium.clear(txtQuantity);
		selenium.setText("3", txtQuantity);
		selenium.selectByVisibleText(selectSize, "M");
		selenium.click(btnAddToCart);
		selenium.clickUsingJavaScriptExecutor(btnCheckout, driver);
		selenium.refresh(driver);
		return selenium.validateText(driver, cartText, "3");
		
		
		
		
		
		
		
	}

}
