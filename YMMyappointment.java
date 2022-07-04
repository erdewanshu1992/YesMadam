package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMMyappointment extends Login{
	@Test(priority=3)
	public void MyAppoinmentPage() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[1]/div/div/div[2]/span[2]/img")).click();//menu list
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[1]/div/div/div[2]/div[2]/ul/li[2]")).click();//my appointment
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl14 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl14);
	System.out.println("----");

  }
}
