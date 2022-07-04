package appiumDemo;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class YesMadamAppold {
	static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VIVO");
		cap.setCapability("udid", "OVINKFHATGIR6PBE");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\erdew\\eclipse-workspace\\appiumtests\\apk\\app-debug.apk");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.findElement(By.id("test"));

	}

}
