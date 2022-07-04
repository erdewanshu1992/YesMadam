package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMMainCategoryFemaleHeirService extends Login{
	@Test(priority=7)
	public void FemaleHairService() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[3]/div/div/div[5]/img")).click();//female hear service
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl10 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl10);
	System.out.println("----");
	driver.findElement(By.xpath("/html/body/div/div/div/section[2]/div/div/div[1]/div[2]/div/div[1]/img")).click();//hear cut service
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl11 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl11);
	System.out.println("----");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/button")).click();//add to cart
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div[2]/span")).click();//checkout
	Thread.sleep(4000);
	}

}
