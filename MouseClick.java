package softwareTestingMaterial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
 * Test Scenario(Mouse click (single click))

Go to https://www.amazon.in/
Locate the search box
Search for iPhone
Perform a click of the Search Button on the page for executing the search operation
Assert if the page title does not match
 */

public class MouseClick {
	@Test(description="Demo of Action Chain Click", enabled = true)
    public void test_click() throws InterruptedException {
		
		System.out.println("Launching Firefox browser.....");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
 
        try
        {
            /* create an object for the Actions class and pass the driver argument */
            Actions action = new Actions(driver);
 
            /* specify the locator of the search box in which the product has to be typed */
            WebElement elementToType = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
 
            /* pass the value of the product */
            action.sendKeys(elementToType, "iphone").build().perform();
 
            /* specify the locator of the search button */
            WebElement elementToClick = driver.findElement(By.xpath("//input[@value='Go']"));
 
            Thread.sleep(5000);
 
            /* perform a mouse click on the search button */
            action.click(elementToClick).build().perform();
 
            Thread.sleep(5000);
 
            /* verify the title of the website after searching the product */
            Assert.assertEquals(driver.getTitle(), "Amazon.in : iphone");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
