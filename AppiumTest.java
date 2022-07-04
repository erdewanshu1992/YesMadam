package appiumproject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTest {
	private static AppiumDriver<AndroidElement> wd;

	@BeforeClass
	public static void setUpClass() throws MalformedURLException {

	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("appium-version", "1.15.1");
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("platformVersion", "8.1.0");
	    capabilities.setCapability("deviceName", "vivo");
        capabilities.setCapability("Package", "yesmadamservices.app.com.yesmadamservices");
	    //capabilities.setCapability("app", "/home/yesmadam/eclipse-workspace/appiumproject/apk/Customer_Staging_2022_02_11.apk");
        capabilities.setCapability("Activity", "yesmadamservices.app.com.yesmadamservices.module.service.categories.ServiceCategoriesActivity");
        capabilities.setCapability("Activity", "yesmadam.app.com.yesmadamservices.module.cart.CartsActivity");
	    wd = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@AfterClass
	public static void tearDownClass() {
	    if (wd != null) {
	        wd.quit();
	    }}
	@Test
	public void test() throws IOException {
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vSkip")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vTitle")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    //wd.findElement(By.xpath("//android.widget.LinearLayout[1]/.../android.widget.EditText[1]")).click();
	   // wd.findElement(By.xpath("//android.widget.LinearLayout[1]/.../android.widget.EditText[1]")).sendKeys("username");
	   // wd.findElement(By.xpath("//android.widget.LinearLayout[1]/.../android.widget.EditText[2]")).click();
	   // wd.findElement(By.name("//android.widget.LinearLayout[1]/.../android.widget.EditText[2]")).sendKeys("password");
	   // wd.findElement(By.xpath("//android.widget.LinearLayout[1]/.../android.widget.Button[1]")).click();
	    wd.close();
	} 

}
