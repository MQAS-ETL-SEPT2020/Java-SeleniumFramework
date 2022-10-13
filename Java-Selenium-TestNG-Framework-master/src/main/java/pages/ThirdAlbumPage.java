package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThirdAlbumPage {

	By thirdAlbumPage = By.xpath("//div[@class=\"product-name\"]");
	By price = By.xpath("//div[@class='product-price']");
	By qty = By.xpath("//label[text()='Qty:']");
	By quantity = By.id("addtocart_53_EnteredQuantity");
	By addToCart = By.id("add-to-cart-button-53");
	By confirmationMessage = By.xpath("//p[contains(text(),'The product has been added to your')]");

	WebDriver driver;
	WebDriverWait wait;

	public ThirdAlbumPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,7);
	}

	// 3rd image page is displayed
	public boolean isThirdAlbumPageSuccessful() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(thirdAlbumPage)).isDisplayed();
	}

//	public void price() {
//	driver.findElement(price);
//	}

	public boolean price() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(price)).isDisplayed();
	}

	public void quantity() {
		driver.findElement(qty).click();
	}

	public boolean defaultQuantity() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(quantity)).isDisplayed();
	}

	public void clickOnAddToCart() {
		driver.findElement(addToCart).click();
	}

	public boolean displayConfirmationMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage)).isDisplayed();
	}

}
