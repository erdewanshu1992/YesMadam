package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	WebDriver driver;
	By ChangProduct = By.xpath("//span[@class='change_prdt']");//
	By Done = By.xpath("//button[@class='done_btn']"); //
	By Remove = By.xpath("//span[@class='remove_prdt']");//
	By RemoveNo = By.xpath("//button[@class='no_btn']");//
	By Checkout = By.xpath("//span[@class='Checkout_btn']");//

	// Constructor to initialize object
	public CartPage(WebDriver dr) {
		this.driver = dr;
	}

	public void ChangeButtonVerify() {
		driver.findElement(ChangProduct).click();

	}

	public void DoneButtonVerify() {
		driver.findElement(Done).click();

	}

	public void RemoveButtonVerify() {
		driver.findElement(Remove).click();
	}

	public void RemoveButtonNoVerify() {
		driver.findElement(RemoveNo).click();

	}

	public void CheckoutButtonVerify() {
		driver.findElement(Checkout).click();

	}
}
