package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {

	By shoppingCart = By.xpath("//span[text()='Shopping cart']");
	By shoppingCartPage = By.xpath("//h1[text()='Shopping cart']");
	By termsAndConditions = By.id("termsofservice");
	By checkOut = By.id("checkout");

	public WebDriver driver;
	public WebDriverWait wait;

	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void clickOnShoppingCartLink() {
		driver.findElement(shoppingCart).click();
	}

	public boolean shoppingCart() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingCartPage)).isDisplayed();
	}

	public void clickOnTermsAndConditions() {
		driver.findElement(termsAndConditions).click();
	}

	public boolean termsAndCondition() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(termsAndConditions)).isSelected();
	}

	public void clickOnCheckOut() {
		driver.findElement(checkOut).click();
	}

}
