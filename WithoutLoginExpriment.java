package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WithoutLoginExpriment extends Setup{
	@Test
	//@Test(description="This method validates the sign up functionality")
	//@Test(dependsOnMethod=”Login”)
	//@Test(enabled=’true’)
	//@Test(groups=”Smoke Suite”)
	public void TeamOfPiss() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[4]/img")).click();//menubar
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/div[2]/ul/li[2]")).click();//team of piss
		Thread.sleep(3000);
		System.out.println("Page title is : " + driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//Home page
		Thread.sleep(3000);
	}
	@Test
	public void Frinchise() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[4]/img")).click();//menubar
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/div[2]/ul/li[3]")).click();//Franchise
		Thread.sleep(3000);
		System.out.println("Page title is : " + driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//Home page
		Thread.sleep(3000);
	}
	@AfterClass
	public void afterClass(){
	driver.quit();
	}


}
