package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YMMenuBarMyProfile extends Login{
	@Test(priority=9)
	public void MyProfile() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//Home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[2]/img")).click();//menu bar
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/div[2]/ul/li[3]")).click();//my profile
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl13 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl13);
	System.out.println("----");
	//driver.findElement(By.xpath("")).click();//
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[2]/div/div/div[2]/div[2]/span[2]/span")).click();//set default
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[2]/div/div/div[2]/span/button")).click();//add address
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/span[1]/input")).sendKeys("Building NAme");// address pop up
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/span[2]/input")).sendKeys("Address");//Address
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/span[3]/input")).sendKeys("noida");//Search location
	Thread.sleep(4000);
	
	}

}



/*
 WebElement ele = driver.findElement(By.xpath("<xpath>"));

//Creating object of an Actions class
Actions action = new Actions(driver);

//Performing the mouse hover action on the target element.
action.moveToElement(ele).perform();
 */

