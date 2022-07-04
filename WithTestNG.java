package appiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WithTestNG {
	static AndroidDriver<MobileElement> driver;
	//AndroidDriver driver;
	@BeforeTest
	public void SplashScreen() throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VIVO");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
	cap.setCapability(MobileCapabilityType.APP,"C:\\\\Users\\\\erdew\\\\Downloads\\\\Flipkart-7.18.apk");
	driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	Thread.sleep(10000);
	}
	
	@Test
	public void Login(){
		driver.findElement(By.id("test"));

	}
	@AfterTest
	public void end()
	{
	driver.quit();
	

}
	}



