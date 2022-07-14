package waitExample;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitTest {
	private WebDriver driver;
	private String baseUrl;
	private WebElement element;

	@BeforeMethod
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	baseUrl = "http://www.google.com";
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
	driver.get(baseUrl);
	element = driver.findElement(By.id("lst-ib"));
	element.sendKeys("Selenium WebDriver Interview questions");
	element.sendKeys(Keys.RETURN);
	List<WebElement> list = driver.findElements(By.className("_Rm"));
	System.out.println(list.size());
	
	
	// Waiting 30 seconds for an element to be present on the page, checking
	   // for its presence once every 5 seconds.
	   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(Duration.ofSeconds(30L))
	       .pollingEvery(Duration.ofSeconds(5L))
	       .ignoring(NoSuchElementException.class);

	   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	     public WebElement apply(WebDriver driver) {
	       return driver.findElement(By.id("foo"));
	     }
	   });
	

	}

	@AfterMethod
	public void tearDown() throws Exception {
	driver.quit();
	}

}
