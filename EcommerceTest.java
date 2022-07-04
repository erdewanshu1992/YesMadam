package com.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcommerceTest {
	public static WebDriver driver;

    @Test

    public void addtoCartTest() throws InterruptedException
    {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        EkartPage1 oekart = new EkartPage1(driver);
        oekart.AddtoCart();

    }
    @BeforeTest
    public void beforeTest() {
        //System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @AfterTest
    public void afterTest() {
        //driver.close();
    }
}
  
