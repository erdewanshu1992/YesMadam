package appiumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	public static void main(String[] args) {
		//Firefox
		String key="webdriver.gecko.driver";
		String value ="/home/yesmadam/eclipse-workspace/MavenDemo/driver/geckodriver";
		//String value="./exefiles/chromedriver.exe";//
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://api-stage-aws.yesmadam.co.in/welcome");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		driver.quit();
		}

}
