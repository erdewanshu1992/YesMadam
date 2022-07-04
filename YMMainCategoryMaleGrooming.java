package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMMainCategoryMaleGrooming extends Login{
	@Test(priority=6)
	public void MaleGrooming() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[3]/div/div/div[4]/img")).click();//Male grooming
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl8 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl8);
	System.out.println("----");
	driver.findElement(By.xpath("/html/body/div/div/div/section[2]/div/div/div[1]/div[2]/div/div[1]/img")).click();//monthly necesacity
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl9 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl9);
	System.out.println("----");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/button")).click();//add to cart
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[6]/div[2]/span")).click();//checkout
	Thread.sleep(4000);

}
	}

