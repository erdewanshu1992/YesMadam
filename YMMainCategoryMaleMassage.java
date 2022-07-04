package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMMainCategoryMaleMassage extends Login{
	@Test(priority=5)
	public void MaleMassage() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[3]/div/div/div[3]/img")).click();//male massage
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl6 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl6);
	System.out.println("----");
	driver.findElement(By.xpath("/html/body/div/div/div/section[2]/div/div/div[1]/div[2]/div/div[1]/img")).click();//best seller
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl7 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl7);
	System.out.println("----");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/button")).click();//add to cart
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[10]/div[2]/span")).click();//checkout
	Thread.sleep(4000);
	}

}
