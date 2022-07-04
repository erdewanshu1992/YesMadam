package YM_Web_Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;

public class Setup {
	WebDriver driver;
	//WebElement ele;
	//Actions action = new Actions(driver);
	JavascriptExecutor scroll;
	//@BeforeMethod
	@BeforeClass
	public void YMTesting() throws InterruptedException {
		
	//System.setProperty("webdriver.geckodriver.driver","/usr/bin/geckodriver /usr/local/bin/geckodriver/geckodriver.exe");
	//driver = new FirefoxDriver();
	//System.setProperty("webdriver.chromedriver.driver","\\home\\yesmadam\\eclipse-workspace\\Dew_YM_Web_Automation\\drivers\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://api-stage-aws.yesmadam.co.in/");
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());

	//AssertJUnit.assertEquals(driver.getCurrentUrl(), "http://api-stage-aws.yesmadam.co.in/");
	//For Scroll Down and UP
	scroll = (JavascriptExecutor) driver;
	driver.manage().window().maximize();
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl1 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl1);
	System.out.println("--well done--");
	}

}
