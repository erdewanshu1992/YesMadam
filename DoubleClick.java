package softwareTestingMaterial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Test Scenario

Go to https://unixpapa.com/js/testmouse.html
Double click on “click here to test”
Search for “dblclick” in the text area
Assert if the Double click operation is not successful
 */

public class DoubleClick {
	@Test(description="Demo of Double Click", enabled = true)
    public void test_double_click() throws InterruptedException{
		System.out.println("Launching Firefox browser.....");
		WebDriver driver = new FirefoxDriver();
        String str_dblclick = "dblclick";
 
        driver.navigate().to("https://unixpapa.com/js/testmouse.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
 
        try
        {
            /* create an object for the Actions class and pass the driver argument */
            Actions action = new Actions(driver);
 
            WebElement elem_clear = driver.findElement(By.xpath("//a[.='click here to clear']"));
            Thread.sleep(2000);
            elem_clear.click();
 
            WebElement elem_test_btn = driver.findElement(By.xpath("//a[.='click here to test']"));
            Thread.sleep(2000);
            action.doubleClick(elem_test_btn).build().perform();
 
            /* Verify whether the double click operation was successful or not */
            WebElement text_area = driver.findElement(By.cssSelector("textarea"));
            String textattr = text_area.getAttribute("value");
            System.out.println(textattr);
 
            String bodyText = driver.findElement(By.tagName("textarea")).getText();
            Assert.assertFalse(bodyText.contains(str_dblclick), "Text found!");
           System.out.println("Double Click test case successful\n");
           Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
