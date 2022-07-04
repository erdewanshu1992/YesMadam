package MavenProject.MavenDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Setup {
	@Test(priority=1)
	public void LoginFromHeader() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();//login header
	Thread.sleep(2000);
    //driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/div/input")).sendKeys("7011565023");//Number
    driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/div/input")).sendKeys("9855566677");//Number
	Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/button")).click();//SUBMIT
	Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/input")).sendKeys("2222");//OTP
	Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div[2]/div/div[2]/button")).click();//SUBMIT
	Thread.sleep(3000);
	}

}
