package appiumtestForCustomerApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class AppiumTestSetUP {
	protected static AppiumDriver<AndroidElement> wd;
	@BeforeClass
	public static void setUpClass() throws MalformedURLException {
	   DesiredCapabilities capabilities = new DesiredCapabilities();
	   capabilities.setCapability("appium-version", "1.15.1");
	   capabilities.setCapability("platformName", "Android");
	   capabilities.setCapability("platformVersion", "11");
	   capabilities.setCapability("deviceName", "OnePlus Nord");
	   capabilities.setCapability("Package", "yesmadamservices.app.com.yesmadamservices");
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
	
	/*
	@Test(priority=1)
	public void beautyCare() throws IOException, InterruptedException {
	    wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
       	wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	}
	@Test(priority=2)
	public void backButttonForBeautyCare() throws IOException, InterruptedException {
		wd.findElement(By.className("android.widget.ImageButton")).click();//payment
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//schedule
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//service cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/cart_item_count")).click();//header cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vRemove")).click();//remove cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/btn_positive")).click();//pop up
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//back to service page
		Thread.sleep(2000);
	}*/
}
	
