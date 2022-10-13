package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectUrServicePage {
	WebDriver driver;
	By BeautyCareSubCat = By.xpath("//div[@class='subcat_img']");//
	By SalonAtHome = By.xpath("//div[@class='cat_card']"); //
	By Bestsellers = By.xpath("//div[@class='subcat_img']"); //
	By AddToCart = By.xpath("(//span[@class='addtocart'])[1]");//
	By Checkout = By.xpath("(//div[@class='cart_right'])[1]");//

	// Constructor to initialize object
	public SelectUrServicePage(WebDriver dr) {
		this.driver = dr;
	}

	public void listOfAllBeautyCareSubCat() {
		List<WebElement> allSubCats = driver.findElements(BeautyCareSubCat);
		System.out.println(allSubCats.size());

		for (WebElement beautyCareSubCat : allSubCats) {
			String name = beautyCareSubCat.getText();
			System.out.println(name);
		}
	}

	public void BeautyCareSubCatVerify() {
		driver.findElement(BeautyCareSubCat).click();

	}

	public void BestSellersVerify() {
		driver.findElement(Bestsellers).click();

	}

	public void AddToCartVerify() {
		driver.findElement(AddToCart).click();

	}

	public void CheckoutVerify() {
		driver.findElement(Checkout).click();

	}

}
