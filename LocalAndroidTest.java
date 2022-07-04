package appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileBrowserType;

	public class LocalAndroidTest {

	    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoxNTYyNTY4MiwieHAucCI6MTU2MjU2ODEsInhwLm0iOjE2NDYwMzMzMjY3NjMsImV4cCI6MTk2MTM5NDMxNSwiaXNzIjoiY29tLmV4cGVyaXRlc3QifQ.2SVvmZTs88AH4i1txJKRXwyh5gnbhrkm8AUHKfvfvoU";
	    protected AndroidDriver<AndroidElement> driver = null;
	    DesiredCapabilities dc = new DesiredCapabilities();

	    @BeforeTest
	    public void setUp() throws MalformedURLException {
	        dc.setCapability("testName", "Quick Start Android Browser Demo");
	        dc.setCapability("accessKey", accessKey);
	        dc.setCapability("deviceQuery", "@os='android' and @version='10' and @category='PHONE'");
	        dc.setBrowserName(MobileBrowserType.CHROME);
	        driver = new AndroidDriver<>(new URL("https://cloud.seetest.io/wd/hub"), dc);
	    }

	    @Test
	    public void quickStartAndroidBrowserDemo() {
	        driver.rotate(ScreenOrientation.PORTRAIT);
	        driver.get("https://www.google.com");
	        WebElement searchBar = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
	        searchBar.sendKeys("Experitest");
	        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	    }

	    @AfterTest
	    public void tearDown() {
	        System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
	        driver.quit();
	    }
	}



