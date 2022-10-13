package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageMainCat {
	WebDriver driver;
	By MainCat = By.xpath("//div[@class='cat_card']");//
	By SalonAtHome = By.xpath("//div[@class='cat_card']"); //
	By Remove = By.xpath("");//
	By RemoveNo = By.xpath("");//
	By Checkout = By.xpath("");//

	// Constructor to initialize object
	public HomePageMainCat(WebDriver dr) {
		this.driver = dr;
	}

	public void listOfAllHomePageMainCat() {
		List<WebElement> allMainCats = driver.findElements(MainCat);
		System.out.println(allMainCats.size());

		for (WebElement mainCat : allMainCats) {
			String name = mainCat.getText();
			System.out.println(name);
		}
	}

	public void SalonAtHomeVerify() {
		driver.findElement(SalonAtHome).click();

	}

}
