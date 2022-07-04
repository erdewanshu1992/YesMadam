package appiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class emulatorCal {
	 public static AppiumDriver<MobileElement> driver;
	 public static DesiredCapabilities cap;

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3XL");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.PAGE_LOAD_STRATEGY, "com.android.calculator2");
		cap.setCapability(MobileCapabilityType.ACCEPT_INSECURE_CERTS, ".Calculator");
		/*
		 * cap.setCapability(CapabilityName: "platformName", value: "Android");
		 * cap.setCapability(CapabilityName: "deviceName", value: "emulator-5554");
		 * cap.setCapability(CapabilityName "automationName", value: "UiAutomator2");
		 * cap.setCapability(CapabilityName"appPackage", value:
		 * "com.android.calculator2"); cap.setCapability(CapabilityName."appActivity",
		 * value: ".Calculator");
		 */
		
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        Thread.sleep(3000);
}


}
