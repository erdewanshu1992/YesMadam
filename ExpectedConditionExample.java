package waitExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExpectedConditionExample {
	// created reference variable for WebDriver
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {

	// initializing driver variable using FirefoxDriver
	driver=new ChromeDriver();
	// launching gmail.com on the browser
	driver.get("https://gmail.com");
	// maximized the browser window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
	// saving the GUI element reference into a "element" variable of WebElement type
	WebElement element = driver.findElement(By.id("Email"));
	// entering username
	element.sendKeys("dummy@gmail.com");
	element.sendKeys(Keys.RETURN);
	// entering password
	driver.findElement(By.id("Passwd")).sendKeys("password");
	// clicking signin button
	driver.findElement(By.id("signIn")).click();
	// explicit wait - to wait for the compose button to be click-able
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	// click on the compose button as soon as the "compose" button is visible
	driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	}

	@AfterMethod
	public void teardown() {
	// closes all the browser windows opened by web driver
	driver.quit();
	}

}

/*
 Wait wait = new FluentWait(WebDriver reference)
.withTimeout(timeout, SECONDS)
.pollingEvery(timeout, SECONDS)
.ignoring(Exception.class);

WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
public WebElement applyy(WebDriver driver) {
return driver.findElement(By.id("foo"));
}
});

//Declare and initialise a fluent wait
FluentWait wait = new FluentWait(driver);
//Specify the timout of the wait
wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//Sepcify polling time
wait.pollingEvery(250, TimeUnit.MILLISECONDS);
//Specify what exceptions to ignore
wait.ignoring(NoSuchElementException.class)

//This is how we specify the condition to wait on.
//This is what we will explore more in this chapter
wait.until(ExpectedConditions.alertIsPresent());
 
  
 */
