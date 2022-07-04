package MavenProject.MavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YM_TestNGFreamWorkSetUP {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void testSetup()	{
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	}

	@BeforeMethod
	public void openBrowser(){
		driver.get("http://api-stage-aws.yesmadam.co.in/");
    	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	}
	@Test
	public void LoginFromHeader() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();//login header
	Thread.sleep(2000);
    //driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/div/input")).sendKeys("7011565023");//Number
    driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/div/input")).sendKeys("9855566677");//Number
	Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/button")).click();//SUBMIT
	Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/input")).sendKeys("2222");//OTP
	Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/button")).click();//SUBMIT
	Thread.sleep(3000);
	}
	@Test(description="This method validates the Login functionality")
	public void ReferAfriend() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[2]/img")).click();//menu bar
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/div[2]/ul/li[5]")).click();//refer a friend
		Thread.sleep(4000);
		System.out.println("Page title is : " + driver.getTitle());
		String strUrl16 = driver.getCurrentUrl();
		System.out.println("Current Url is:"+ strUrl16);
		System.out.println("----");
		}
	
	
	@AfterMethod
	public void postSignUp()
	{
	System.out.println(driver.getCurrentUrl());

	}

	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}

}
