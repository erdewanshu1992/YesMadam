package softwareTestingMaterial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickAndHoldandmoveToElement {
	@Test(description="Demo of Drag and Drop", priority = 5, enabled = true)
    public void test_drag_drop() throws InterruptedException{
		System.out.println("Launching Firefox browser.....");
		WebDriver driver = new FirefoxDriver();
		
        driver.navigate().to("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
 
        try
        {
           Actions action = new Actions(driver);
           driver.switchTo().frame(0);
            WebElement elem_source = driver.findElement(By.id("draggable"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",elem_source);
            Thread.sleep(2000);
 
            WebElement elem_destination = driver.findElement(By.id("droppable"));
            Thread.sleep(2000);
 
            action.clickAndHold(elem_source).moveToElement(elem_destination,100, 100).release().perform();
            System.out.println("Drag & Drop test case successful\n");
            Thread.sleep(3000);
            Assert.assertEquals("Drop here", elem_destination.getText());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
