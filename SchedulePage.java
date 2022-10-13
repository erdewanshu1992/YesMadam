package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SchedulePage {
	WebDriver driver;
	By ChangAddress = By.xpath("//span[@class='change_address']");//
	By Back = By.xpath("//i[@class='fa fa-angle-left']");
	By Noida18 = By.xpath("(//div[@class='address_card'])[4]"); //
	By Proceed = By.xpath("//*[@id]/div/div/div/span[2]/button");//
	By SlotNoteAtBottom = By.xpath("//span[@class='slot_note']");//
	By SavedAddress = By.xpath("//div[@class='address_sec']");//
	By AvailableDate = By.xpath("/div[@class='date_section'] ");
	By TimeSlotsList= By.xpath("(//div[@class='slots_flex'])[1]");
	By NormalSlots = By.xpath("(//div[@class='slots_flex'])[2]");
	By PrimeTimeSlotsEve = By.xpath("(//div[@class='slots_flex'])[3]");

	// Constructor to initialize object
	public SchedulePage(WebDriver dr) {
		this.driver = dr;
	}

	public void ChangeAddressVerify() {
		driver.findElement(ChangAddress).click();

	}

	public void BackArrowVerify() {
		driver.findElement(Back).click();

	}

	public void ChangeAddressToNoida18Verify() {
		driver.findElement(Noida18).click();

	}

	public void ProceedButtonVerify() {
		driver.findElement(Proceed).click();

	}

	public void SlotNoteAtButtonVerify() {
		System.out.println(driver.findElement(SlotNoteAtBottom).getText());

	}

	public void SavedAddressVerify() {
		System.out.println(driver.findElement(SavedAddress).getText());

	}

//	public void AvailableDateVerify() {
//		System.out.println(driver.findElement(AvailableDate).getText());
//
//	}
	
	public void lostOfAllSlotsDate() {
		List<WebElement> allDates = driver.findElements(AvailableDate);
		System.out.println(allDates.size());

		for (WebElement lostOfAllSlotsDate : allDates) {
			String date = lostOfAllSlotsDate.getText();
			System.out.println(date);
		}
	
	}
	
	
//	public void PrimeTimeSlotsMorVerify() {
//		System.out.println(driver.findElement(PrimeTimeSlotsMor).getText());
//
//	}
	

	public void lostOfAllPrimeTimeSlotsMorVerify() {
		List<WebElement> allSlotsTime = driver.findElements(TimeSlotsList);
		System.out.println(allSlotsTime.size());

		for (WebElement lostOfAllSlotsDate : allSlotsTime) {
			String time = lostOfAllSlotsDate.getText();
			System.out.println(time);
		}
	
	}

//	public void NormalSlotsVerify() {
//		System.out.println(driver.findElement(NormalSlots).getText());
//
//	}

	public void lostOfAllNormalSlotsVerify() {
		List<WebElement> allNormalSlotsTime = driver.findElements(NormalSlots);
		System.out.println(allNormalSlotsTime.size());

		for (WebElement lostOfAllSlotsDate : allNormalSlotsTime) {
			String time = lostOfAllSlotsDate.getText();
			System.out.println(time);
		}
	
	}
	
//	public void PrimeTimeSlotsEveVerify() {
//		System.out.println(driver.findElement(PrimeTimeSlotsEve).getText());
//
//	}
	
	public void lostOfAllPrimeTimeSlotsEveVerify() {
		List<WebElement> allPrimeEveSlotsTime = driver.findElements(PrimeTimeSlotsEve);
		System.out.println(allPrimeEveSlotsTime.size());

		for (WebElement lostOfAllSlotsDate : allPrimeEveSlotsTime) {
			String time = lostOfAllSlotsDate.getText();
			System.out.println(time);
		}
	
	}

}
