package appiumproject;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Example1InstallAppRealDevice {

	public static void main(String[] args) throws Exception {
//	    AndroidDriver examples= new AndroidDriver();
	       
        /*2 parameter:
         * 1st: url on which appium started
         * 2nd: desired capabilities object
         * what we are going to pass using DC??
         * Architecture of appium: client: using DC we are going to specify deviceinfo, app info and other odetails
         * what are the various details i need to pass in a desired capabilities??
         */

        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");//Version is string here
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
       // dc.setCapability(MobileCapabilityType.APP, "/home/yesmadam/eclipse-workspace/appiumproject/apk/Customer_Staging_2022_01_17_2.apk");
        dc.setCapability(MobileCapabilityType.APP, "yesmadamservices.app.com.yesmadamservices");
        
        //it will install the app and it wil launch the application also
       
       
        //now we need to pass url for the appium server
       
        URL url =new URL("http://127.0.0.1:4723/wd/hub");
        //io.appium.java_client.android.AndroidDriver driver= new io.appium.java_client.android.AndroidDriver(url,dc);
       
        AndroidDriver driver= new AndroidDriver(url,dc);
        System.out.println("app installed...");
       
    }

	}


