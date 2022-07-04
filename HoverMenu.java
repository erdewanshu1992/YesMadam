package softwareTestingMaterial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Test Scenario

Go to https://www.lambdatest.com/pricing
Find the element ‘What are parallel tests?’
Move to the element obtained in step(2)
Click on the link inside the Hover Menu
Switch to the window opened due to click on link inside the Hover Menu
Assert if the page title of the new window does not match with the expected page title (i.e. Concurrency Calculator For LambdaTest Selenium Automation Gird).
 */

public class HoverMenu {
	@Test(description="Demo of Mouse Hover", priority = 6, enabled = true)
    public void test_mouse_hover() throws InterruptedException {
		System.out.println("Launching Firefox browser.....");
		WebDriver driver = new FirefoxDriver();
		
        driver.navigate().to("https://www.lambdatest.com/pricing");
        driver.manage().window().maximize();
        Thread.sleep(3000);
 
        try {
            /* create an object for the Actions class and pass the driver argument */
            Actions action = new Actions(driver);
 
            //WebElement elem_accept_btn = driver.findElement(By.cssSelector("a.cbtn:nth-child(1)"));
            WebElement elem_accept_btn = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[2]/div/span[1]"));
            Thread.sleep(2000);
            elem_accept_btn.click();
            
            
 
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
            //WebElement elem_parallel = driver.findElement(By.xpath("//div[@class='col-sm-3 pricingcol ng-scope mostpopularpricecol']//p[.='What are parallel tests?']"));
            WebElement elem_parallel = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/select"));
            Thread.sleep(2000);
            action.moveToElement(elem_parallel).build().perform();
 
            WebElement elem_hover_body = driver.findElement(By.xpath("//div[@class='popover-body']"));
            Thread.sleep(2000);
            action.moveToElement(elem_hover_body).build().perform();
 
            /* Click on the Link */
            By locator = By.linkText("Calculate how many you need");
 
            /* Selenium Java 3.141.59 */
            /* WebDriverWait wait = new WebDriverWait(web_driver, 5); */
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            //wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
            Thread.sleep(5000);
 
            String parentWindowHandle = driver.getWindowHandle();
 
            /* Check if the link is clicked by comparing the window title */
            Set<String> allWindowHandles = driver.getWindowHandles();
            Iterator<String> iterator = allWindowHandles.iterator();
 
            while(iterator.hasNext())
            {
                String chld_window = iterator.next();
                if (!parentWindowHandle.equalsIgnoreCase(chld_window))
                {
                    driver.switchTo().window(chld_window);
                    System.out.println("Switched to the child window");
                }
            }
 
            System.out.println("Current Window title is: " + driver.getTitle());
            Assert.assertEquals(driver.getTitle(), "Concurrency Calculator For LambdaTest Selenium Automation Gird");
            System.out.println("Mouse Hover test case successful\n");
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
