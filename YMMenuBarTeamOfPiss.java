package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMMenuBarTeamOfPiss extends Setup{
	@Test(priority=12)
	public void TeamOfPiss() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[2]/img")).click();//menu bar
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/div[2]/ul/li[6]")).click();//team of piss
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl17 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl17);
	System.out.println("----");
	}

}
