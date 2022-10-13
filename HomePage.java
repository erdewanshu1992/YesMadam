package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	By LoginPage = By.xpath("//*[@id]/div/div[2]/div[1]/div[2]/div/div[3]/span[1]");

	// Constructor to initialize object
	public HomePage(WebDriver dr) {
		this.driver = dr;
	}

	public void VerifyLoginPage() {
		 System.out.println(driver.findElement(LoginPage).getText());
	}
	// why we use return type
	public String VerifyLoginPages() {
		return driver.findElement(LoginPage).getText();
	}
//	              public void logout() {
//	                             driver.findElement(logout).click();
//	                }

}
