package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetLocation {

	WebDriver driver;
	By SetUrLocationButton = By.xpath("//button[@class=\"select_location_btn\"]");
	By LocationSearch = By.xpath("(//input[@type=\"text\"])[3]");

	// Constructor to initialize object
	public SetLocation(WebDriver driver) {
		this.driver = driver;
	}

	public void ServiceArea(String Location) throws InterruptedException {
		this.LocationSearch(Location);

	}

	public void SetUrLocationButtonVerify() {
		System.out.println(driver.findElement(SetUrLocationButton).getText());
		driver.findElement(SetUrLocationButton).click();

	}

	public void LocationSearch(String LocationName) {
		driver.findElement(LocationSearch).sendKeys(LocationName);

	}

}
