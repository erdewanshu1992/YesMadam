package appiumproject;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class calculatorTest {

	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws Exception {
		
		try {
			openCalclutor();
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			
		}
	}
		public static void openCalclutor() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo");
        capabilities.setCapability("udid", "192.168.1.41:5555");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability("appPackage", "com.android.bbkcalculator");
        capabilities.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, capabilities);
        System.out.println("Application started...");
        
        
        try {
        	
        MobileElement two = driver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
        MobileElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/plus"));
        MobileElement three = driver.findElement(By.id("com.android.bbkcalculator:id/digit3"));
        MobileElement equal = driver.findElement(By.id("com.android.bbkcalculator:id/equal"));
        
        if(two.equals("com.android.bbkcalculator:id/digit2")){
        	two.click();
        }
        if(plus.equals("com.android.bbkcalculator:id/plus")){
        	plus.click();
        }
      
        if(three.equals("com.android.bbkcalculator:id/digit3")) {
        	three.click();
        }
       
       if(equal.equals("com.android.bbkcalculator:id/equal")) {
        	equal.click();
        }
      
		} catch(Exception e) {
	         System.out.println("toString(): " + e.toString());
	         System.out.println("getMessage(): " + e.getMessage());
	         System.out.println("StackTrace: ");
	         e.printStackTrace();
	      }
    
       // String res = result.getText();
       // System.out.println("\n Result is : "+res);
        
        System.out.println("Completed...");




        

	}

}
