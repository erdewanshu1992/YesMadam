package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMHomePageCart extends Login {
	@Test(priority=8)
	public void Cart() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[3]/span[2]")).click();//Home Page cart
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl12 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl12);
	System.out.println("----");
	}

}
