package appiumDemo;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class customerApp {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) throws Exception {

	try {
	openApp();
	}
	catch(Exception exp) {
	System.out.println(exp.getCause());
	System.out.println(exp.getMessage());
	exp.printStackTrace();
	}
	}
	public static void openApp() throws Exception {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceName","vivo");
	        capabilities.setCapability("udid", "OVINKFHATGIR6PBE");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("platformVersion", "8.1.0");
	        capabilities.setCapability("Package", "yesmadamservices.app.com.yesmadamservices");
	        capabilities.setCapability("appActivity","yesmadam.app.com.yesmadamservices.module.home.HomeActivity");
	        //capabilities.setCapability("appActivity", "yesmadamservices.app.com.yesmadamservices.module.loginActivity");
	        //capabilities.setCapability("appActivity", "yesmadamservices.app.com.yesmadamservices.module.service.categories.ServiceCategoriesActivity");
	        //capabilities.setCapability("appActivity", "yesmadam.app.com.yesmadamservices.module.service.categories.ServiceCategoriesActivity");

	        URL url = new URL("http://127.0.0.1:4723/wd/hub");
	        driver = new AppiumDriver<MobileElement>(url, capabilities);
	        System.out.println("Application started...");
	       
	        //MobileElement appLaunch = driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Yes Madam\"]/android.widget.ImageView"));
	        MobileElement skip = driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vSkip"));
	        MobileElement navigationBar = driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/navigation_bar_item_icon_view"));
	        //MobileElement menuBar = driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/home_menu_hamburger"));
	      //  MobileElement popup = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView"));
	      //  MobileElement service = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));

	      //   MobileElement service = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));

	        //appLaunch.click();
	      //  popup.click();
	        skip.click();
	        navigationBar.click();
	       // menuBar.click();
	       // service.click();
	       
	        System.out.println("Completed...");

}


}
