package appiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyFristAppinEmulator {

	static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException {


		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4XL");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\erdew\\Downloads\\Customer_RELEASE_2021_04_23.apk");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.findElement(By.id("test"));

}


}
