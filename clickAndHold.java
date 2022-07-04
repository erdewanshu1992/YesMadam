package softwareTestingMaterial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*Click & Hold (clickAndHold) the slider element
Move the slider element by the specified offset using the moveByOffset method
Release the mouse at the resultant X and Y position
Perform the set of actions
Test Scenario

Go to https://jqueryui.com/slider/
Locate the Slider element
Move the slider by an offset of (40,0)
 * 
 */

public class clickAndHold {
	@Test(description="Demo of MoveByOffset (ClickAndHold)", priority = 4, enabled = true)
    public void test_clickhold_move_by_offset() throws InterruptedException{
		
		System.out.println("Launching Firefox browser.....");
		WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://jqueryui.com/slider/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
 
        try
        {
            /* create an object for the Actions class and pass the driver argument */
            Actions action = new Actions(driver);
            driver.switchTo().frame(0);
            WebElement elem_slider = driver.findElement(By.cssSelector(".ui-slider-handle"));
            Thread.sleep(2000);
            action.clickAndHold(elem_slider).moveByOffset(40,0).release().perform();
 
            System.out.println("Drag & Drop test case successful\n");
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
