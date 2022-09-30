package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsPage {
	
	By Camera=By.xpath("//img[@alt='Picture for category Camera, photo']");
	By Cellphones=By.xpath("//img[@alt='Picture for category Cell phones']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public ElectronicsPage(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver=driver; 
		wait = new WebDriverWait(driver, 10);
	}
	
	public void clickCameraIcon() {
		driver.findElement(Camera).click();
	}
	
	public void clickCellPhonesIcon() {
		driver.findElement(Cellphones).click();
	}

}
