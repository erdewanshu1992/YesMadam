package com.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.setup;

public class FemaleSPA extends setup {
	@Test
	public void FemaleSPA_Services () throws InterruptedException {
		System.out.println("......Hi Dewanshu Nameste Your Chrome browser is Launching Now All the Best :-) ");
		
	
		By FemaleSPAMainCat = By.xpath("(//img[@alt=\"Female Spa\"])[2]");
				if (driver.findElements(FemaleSPAMainCat).size() > 0) {
					if (driver.findElement(FemaleSPAMainCat).isDisplayed()) {
						driver.findElement(FemaleSPAMainCat).click();
						Thread.sleep(3000);
						System.out.println("FemaleSPAMainCat");
					}}
		By Bestsellers = By.xpath("(//div[@class=\"subcat_img\"])[10]");
				if (driver.findElements(Bestsellers).size() > 0) {
					if (driver.findElement(Bestsellers).isDisplayed()) {
						driver.findElement(Bestsellers).click();
						Thread.sleep(3000);
						System.out.println("Bestsellers....");
						driver.navigate().back();
				}}
		By YMpremiumTherapy = By.xpath("(//div[@class=\"subcat_img\"])[11]");
				if (driver.findElements(YMpremiumTherapy).size() > 0) {
					if (driver.findElement(YMpremiumTherapy).isDisplayed()) {
						driver.findElement(YMpremiumTherapy).click();
						Thread.sleep(3000);
						System.out.println("YMpremiumTherapy.....");
						driver.navigate().back();
				}}
		By SummerSpecial = By.xpath("(//div[@class=\"subcat_img\"])[12]");
				if (driver.findElements(SummerSpecial).size() > 0) {
					if (driver.findElement(SummerSpecial).isDisplayed()) {
						driver.findElement(SummerSpecial).click();
						Thread.sleep(3000);
						System.out.println("SummerSpecial......");
						driver.navigate().back();
				}}
		By YMSpecilaPotli = By.xpath("(//div[@class=\"subcat_img\"])[13]");
				if (driver.findElements(YMSpecilaPotli).size() > 0) {
					if (driver.findElement(YMSpecilaPotli).isDisplayed()) {
						driver.findElement(YMSpecilaPotli).click();
						Thread.sleep(3000);
						System.out.println("YMSpecilaPotli....");
						driver.navigate().back();
				}}
		By BodyPolicing = By.xpath("(//div[@class=\"subcat_img\"])[14]");
				if (driver.findElements(BodyPolicing).size() > 0) {
					if (driver.findElement(BodyPolicing).isDisplayed()) {
						driver.findElement(BodyPolicing).click();
						Thread.sleep(3000);
						System.out.println("BodyPolicing.....");
						driver.navigate().back();
				}}
		By BodyWraps = By.xpath("(//div[@class=\"subcat_img\"])[15]");
				if (driver.findElements(BodyWraps).size() > 0) {
					if (driver.findElement(BodyWraps).isDisplayed()) {
						driver.findElement(BodyWraps).click();
						Thread.sleep(3000);
						System.out.println("BodyWraps......");
						driver.navigate().back();
				}}
		By DealFive = By.xpath("(//div[@class=\"subcat_img\"])[16]");
				if (driver.findElements(DealFive).size() > 0) {
					if (driver.findElement(DealFive).isDisplayed()) {
						driver.findElement(DealFive).click();
						Thread.sleep(3000);
						System.out.println("DealFive......");
						driver.navigate().back();
				}}
		By DealSix = By.xpath("(//div[@class=\"subcat_img\"])[17]");
				if (driver.findElements(DealSix).size() > 0) {
					if (driver.findElement(DealSix).isDisplayed()) {
						driver.findElement(DealSix).click();
						Thread.sleep(3000);
						System.out.println("DealSix......");
						driver.navigate().back();
				}}
				
		By AddON = By.xpath("(//div[@class=\"subcat_img\"])[18]");
				if (driver.findElements(AddON).size() > 0) {
					if (driver.findElement(AddON).isDisplayed()) {
						driver.findElement(AddON).click();
						Thread.sleep(3000);
						System.out.println("AddON.....");
						driver.navigate().back();
				}}
        By BestsellersSideBar = By.xpath("(//div[@class=\"subcat_img\"])[10]");
				if (driver.findElements(BestsellersSideBar).size() > 0) {
					if (driver.findElement(BestsellersSideBar).isDisplayed()) {
						driver.findElement(BestsellersSideBar).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
        By SideBarAddON = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[2]");
				if (driver.findElements(SideBarAddON).size() > 0) {
					if (driver.findElement(SideBarAddON).isDisplayed()) {
						driver.findElement(SideBarAddON).click();
						Thread.sleep(3000);
						System.out.println("Add on....");
				}}
	    By FullBodyMassage = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[1]");
				if (driver.findElements(FullBodyMassage).size() > 0) {
					if (driver.findElement(FullBodyMassage).isDisplayed()) {
						driver.findElement(FullBodyMassage).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				/*
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}
				By locator32 = By.xpath("");
				if (driver.findElements(locator32).size() > 0) {
					if (driver.findElement(locator32).isDisplayed()) {
						driver.findElement(locator32).click();
						Thread.sleep(3000);
						System.out.println("BestsellersSubHeadings....");
				}}*/
				
}}
