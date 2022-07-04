package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver ;
	
	@Test(priority=1)
	public void WebPage() throws InterruptedException {
		
	        driver = new FirefoxDriver();
		    driver.get("http://api-stage-aws.yesmadam.co.in/");
		    driver.manage().window().maximize();
	        Thread.sleep(3000);
	}
	        @Test(priority=2)
	        public void webtest() throws InterruptedException {
	        driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();//login header
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/div/input")).sendKeys("7011565023");//Number
	        Thread.sleep(3000);
	        //driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/div/input")).sendKeys("9855566677");//Number
	        //Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/button")).click();//SUBMIT
	        Thread.sleep(4000);
	        //driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/input")).sendKeys("2222");//OTP
	        //Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/button")).click();//SUBMIT
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[3]/div/div/div[1]/img")).click();//Salon At HOME
			Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[2]/div/div/div[1]/div[2]/div/div[1]/img")).click();//HOT SELL
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"product_sec\"]/div[1]/div[2]/div/div[2]/button")).click();//ADD TO CART
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[31]/div[2]/span")).click();//CHECKOUT
	        Thread.sleep(3000);
	       
  }
	@AfterTest
	public void teardown(){
	    //driver.close();
	
	}
}



