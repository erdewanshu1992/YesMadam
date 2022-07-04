package YM_Web_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageToAddToCart {
	WebDriver driver;
	JavascriptExecutor scroll;
	//@BeforeMethod
	@BeforeClass
	public void YMTesting() throws InterruptedException {
	System.out.println("......Hi Dewanshu Nameste Your Firefox browser is Launching Now All the Best :-) ");
	driver = new ChromeDriver();
	driver.get("http://api-stage-aws.yesmadam.co.in/");
	//AssertJUnit.assertEquals(driver.getCurrentUrl(), "http://api-stage-aws.yesmadam.co.in/");
	//For Scroll Down and UP
	scroll = (JavascriptExecutor) driver;
	driver.manage().window().maximize();
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl1 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl1);
	System.out.println("----");
	}
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
	@Test(priority=2)
	public void SalonAtHome() throws InterruptedException {
	Actions action = new Actions(driver);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[1]/div/div/div[1]/img")).click();//homepage
	Thread.sleep(4000);
    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[3]/div/div/div[1]/img")).click();//salon at home
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl2 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl2);
	System.out.println("----");
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[2]/div/div/div[1]/div[2]/div/div[1]/img")).click();//hot sell
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl3 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl3);
	System.out.println("----");
	driver.findElement(By.xpath("//*[@id=\"product_sec\"]/div[1]/div[2]/div/div[2]/button")).click();//add to cart
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"product_sec\"]/div[31]/div[2]/span")).click();//checkout
	Thread.sleep(4000);
	}
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
	@Test(priority=8)
	public void HomePageCart() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[3]/span[2]")).click();//Home Page cart
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl12 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl12);
	System.out.println("----");
	}
	@Test(priority=9)
	public void MenuBarMyProfile() throws InterruptedException {
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
	}
	@Test(priority=3)
	public void MyAppoinmentPage() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[1]/div/div/div[2]/span[2]/img")).click();//menu list
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section[1]/div/div/div[2]/div[2]/ul/li[2]")).click();//my appointment
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl14 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl14);
	System.out.println("----");
	}
	@Test(priority=10)
	public void MenuBarWallet() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[2]/img")).click();//menu bar
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/div[2]/ul/li[4]")).click();//wallet
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl15 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl15);
	System.out.println("----");
	}
	@Test(priority=11)
	public void MenuBarMyReferAFriend() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/span[2]/img")).click();//menu bar
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[2]/div[2]/ul/li[5]")).click();//refer a friend
	Thread.sleep(4000);
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl16 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl16);
	System.out.println("----");
	}
	@Test(priority=12)
	public void MenuBarTeamOfPiss() throws InterruptedException {
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
	@Test(priority=13)
	public void MenuBarFranchise() throws InterruptedException {
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
	@Test(priority=14)
	public void Home() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/div[1]/img")).click();//home page
	Thread.sleep(4000);
	
	}/*
	@Test(priority=3)
	public void Wallet() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/app-pages/div/app-header/div[1]/div/div/div/span/i")).click();
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/my-wallet");
	}
	@Test(priority=4)
	public void RAFriend() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[9]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/app-pages/div/app-header/div[1]/div/div/div/span/i")).click();
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/refer-a-friend");
	}
	@Test(priority=5)
	public void Sanitization() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div[1]/div[2]/div/ul/li[3]/a")).click();
	System.out.println("Sanitization");
	    System.out.println("Page title is : " + driver.getTitle());
	        String strUrl3 = driver.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrl3);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/sanitization");
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,5000)", "");
	        scroll.executeScript("window.scrollBy(0,-350)", "");
	        Thread.sleep(3000);
	}
	@Test(priority=6)
	public void Donate() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[2]")).click();
	System.out.println("Donate");
	   System.out.println("Page title is : " + driver.getTitle());
	   String strUrl1 = driver.getCurrentUrl();
	   System.out.println("Current Url is:"+ strUrl1);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/donate-now");
	   System.out.println("----");
	   scroll.executeScript("window.scrollBy(0,5000)", "");
	   scroll.executeScript("window.scrollBy(0,-350)", "");
	   Thread.sleep(3000);
	}
	@Test(priority=7)
	public void TeamOfPicassos() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[10]/a")).click();
	    System.out.println("Page title is : " + driver.getTitle());
	        String strUrl4 = driver.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrl4);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/our-team");
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,8000)", "");
	        scroll.executeScript("window.scrollBy(0,-350)", "");
	        Thread.sleep(3000);
	}
	@Test(priority=8)
	public void Franchise() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[11]/a")).click();
	        System.out.println("Page title is : " + driver.getTitle());
	        String strUrl5 = driver.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrl5);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/franchise");
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,4000)", "");
	        scroll.executeScript("window.scrollBy(0,-350)", "");
	        Thread.sleep(3000);
	}
	@Test(priority=9)
	public void PrivacyPolicy() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[12]/a")).click();
	     System.out.println("Page title is : " + driver.getTitle());
	     String strUrl6 = driver.getCurrentUrl();
	     System.out.println("Current Url is:"+ strUrl6);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/privacy-policy");
	     System.out.println("----");
	     scroll.executeScript("window.scrollBy(0,8000)", "");
	     scroll.executeScript("window.scrollBy(0,-350)", "");
	   Thread.sleep(3000);
	}
	@Test(priority=10)
	public void FAQs() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[13]/a")).click();
	     System.out.println("Page title is : " + driver.getTitle());
	     String strUrl7 = driver.getCurrentUrl();
	     System.out.println("Current Url is:"+ strUrl7);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/faqs");
	     System.out.println("----");
	     scroll.executeScript("window.scrollBy(0,9000)", "");
	     scroll.executeScript("window.scrollBy(0,-350)", "");
	   Thread.sleep(3000);
	}
	@Test(priority=11)
	public void ContactUS() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[14]/a")).click();
	   System.out.println("Page title is : " + driver.getTitle());
	String strUrl8 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl8);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/contact-us");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,9000)", "");
	scroll.executeScript("window.scrollBy(0,-3550)", "");
	Thread.sleep(3000);
	}
	@Test(priority=12)
	public void AboutUS() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[16]/a")).click();
	   System.out.println("Page title is : " + driver.getTitle());
	String strUrl9 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl9);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/about-us");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,8000)", "");
	scroll.executeScript("window.scrollBy(0,-3350)", "");
	   Thread.sleep(3000);
	}
	@Test(priority=13)
	public void HaderDonate() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[2]")).click();
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl10 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl10);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/donate-now");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,4000)", "");
	scroll.executeScript("window.scrollBy(0,-2350)", "");
	Thread.sleep(3000);
	}
	@Test(priority=14)
	public void HeaderBlog() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[3]/a")).click();
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl12 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl12);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://yesmadam.com/blog/");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,4000)", "");
	scroll.executeScript("window.scrollBy(0,-3350)", "");
	   driver.navigate().back();
	Thread.sleep(3000);
	}
	@Test(priority=15)
	public void HeaderFranchise() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[4]")).click();
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl13 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl13);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/franchise");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,4000)", "");
	scroll.executeScript("window.scrollBy(0,-2350)", "");
	Thread.sleep(3000);
	}

	@AfterMethod
	public void quit() {
	//Assert.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/welcome");
	//Assert.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/sanitization");
	//Assert.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/welcome");


	driver.quit();
	}*/


}
