package softwareTestingMaterial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Test Scenario

Go to http://medialize.github.io/jQuery-contextMenu/demo.html
Locate the element “right click me”
Right click on the element located in Step(2)
Select the item “paste” in the Context Menu
Assert if the required item in the Context Menu is not clicked

 */
public class MouseRightClick {
	@Test(description="Demo of Context Click", priority = 3, enabled = true)
    public void test_context_click() throws InterruptedException{
		
		System.out.println("Launching Firefox browser.....");
		WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://medialize.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
 
        try
        {
            /* create an object for the Actions class and pass the driver argument */
            Actions action = new Actions(driver);
 
            By locator = By.xpath("/html/body/div/section/div/div/div/p/span");
            Thread.sleep(5000);
 
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            //wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            WebElement element = driver.findElement(locator);
            action.contextClick(element).build().perform();
 
            WebElement element_edit = driver.findElement(By.xpath("/html/body/ul/li[4]/span"));
 
            Thread.sleep(5000);
            element_edit.click();
 
            Alert alert = driver.switchTo().alert();
            String textEdit = alert.getText();
            System.out.println(textEdit);
            Assert.assertEquals(textEdit, "clicked: paste", "Context Click successful");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }    

}
