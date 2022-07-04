package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMMainCategorySalonAtHome extends Login{
	@Test(priority=2)
	public void SalonAtHome() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[1]/div/div/div[1]/img")).click();//homepage
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[3]/div/div/div[1]/img")).click();//salon at home
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl2 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl2);
	System.out.println("----");
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[2]/div/div/div[1]/div[2]/div/div[1]/img")).click();//hot sell
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl3 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl3);
	System.out.println("----");
	driver.findElement(By.xpath("//*[@id=\"product_sec\"]/div[1]/div[2]/div/div[2]/button")).click();//add to cart
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"product_sec\"]/div[31]/div[2]/span")).click();//checkout
	Thread.sleep(4000);
	}

}
