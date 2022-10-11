package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsPage {

	By Camera = By.xpath("//img[@alt='Picture for category Camera, photo']");
	By Cellphones = By.xpath("//img[@alt='Picture for category Cell phones']");
	By SmartPhones = By.xpath("(//div[@class=\"picture\"])[1]");
	By SmartPhonePrice = By.xpath("//span[@itemprop=\"price\"]");
	By AddtocartButton = By.id("add-to-cart-button-43");

	WebDriver driver;
	WebDriverWait wait;

	public ElectronicsPage(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void clickCameraIcon() {
		driver.findElement(Camera).click();
	}

	public boolean clickCellPhonesIcon() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Cellphones)).isDisplayed();
	}

	public void clickSmartphoneLink() {
		driver.findElement(By.xpath("(//div[@class=\"picture\"])[1]")).click();
	}

	public boolean verifySmartphoneQuantity() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(SmartPhones)).isDisplayed();
	}

	public boolean verifySmartphonePrice() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(SmartPhonePrice)).isDisplayed();
	}

	public void clickAddtoCartButton() {
		driver.findElement(By.id("add-to-cart-button-43")).click();
	}

}
