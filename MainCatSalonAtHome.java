package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainCatSalonAtHome {
	WebDriver driver;
	By SalonAtHome = By.xpath("(//div[@class='cat_card'])[1]");//
	By BestSellers = By.xpath("(//div[@class='subcat_img'])[1]");//
	By AddToCart = By.xpath("(//span[@class='addtocart'])[1]"); //
	By Checkout = By.xpath("//*[@id]/div/div[1]/div/div/div[5]/div[2]/span");//

	// Constructor to initialize object
	public MainCatSalonAtHome(WebDriver dr) {
		this.driver = dr;
	}

	public void SalonAtHome() {
		driver.findElement(SalonAtHome).click();
		// return driver.findElement(SalonAtHome).getText();

	}

	public void BestSellers() {
		driver.findElement(BestSellers).click();
		// return driver.findElement(BestSellers).getText();

	}

	public void AddToCart() {
		driver.findElement(AddToCart).click();
		// return driver.findElement(AddToCart).getText();

	}

	public void Checkout() {
		driver.findElement(Checkout).click();
		// return driver.findElement(Checkout).getText();

	}

}
