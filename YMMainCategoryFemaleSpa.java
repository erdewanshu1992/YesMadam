package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMMainCategoryFemaleSpa extends Login{
	@Test(priority=4)
	public void FemaleSpa() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[3]/div/div/div[2]/img")).click();//female Spa
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl4 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl4);
	System.out.println("----");
	driver.findElement(By.xpath("/html/body/div/div/div/section[2]/div/div/div[1]/div[2]/div/div[1]/img")).click();//best seller
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl5 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl5);
	System.out.println("----");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/button")).click();//add to cart
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[12]/div[2]/span")).click();//checkout
	Thread.sleep(4000);
	}

}
