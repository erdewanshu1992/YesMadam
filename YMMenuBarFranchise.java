package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMMenuBarFranchise extends Setup{
	@Test(priority=13)
	public void Franchise() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[2]/img")).click();//menu bar
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/div[2]/ul/li[7]")).click();//franchise
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl18 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl18);
	System.out.println("----");
	}

}
