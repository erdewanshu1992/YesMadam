package appiumDemo;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTest {
static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try {
			openCalculator();
			}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo");
		cap.setCapability("udid", "OVINKFHATGIR6PBE");
		//cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\erdew\\eclipse-workspace\\appiumtests\\apk\\app-debug.apk");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("Application Started....");
		
		MobileElement two = driver.findElement(By.id(""));
		MobileElement plus = driver.findElement(By.id(""));
		MobileElement three = driver.findElement(By.id(""));
		MobileElement equals = driver.findElement(By.id(""));
		MobileElement result = driver.findElement(By.id(""));

		two.click();
		plus.click();
		three.click();
		equals.click();
		
		String res = result.getText();
		System.out.println("\n Result is : "+res);
		System.out.println("Completed...");

}
	}
