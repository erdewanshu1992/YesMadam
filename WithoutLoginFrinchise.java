package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class WithoutLoginFrinchise extends Setup{
	@Test
	public void Frinchise() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[4]/img")).click();//menubar
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/div[2]/ul/li[3]")).click();//Franchise
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//Home page
	Thread.sleep(3000);
  }
	@AfterClass
	public void afterClass(){
	driver.quit();
	}
    

  }
