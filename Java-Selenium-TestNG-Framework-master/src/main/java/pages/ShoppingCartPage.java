package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {
	By shoppingCart = By.xpath("//span[text()='Shopping cart']");
	By termsAndConditions = By.id("termsofservice");
	By checkOut = By.id("checkout");

	WebDriver driver;
	WebDriverWait wait;

	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void shoppingCart() {
		driver.findElement(shoppingCart).click();
	}
	
	public void termsAndConditions() {
		driver.findElement(termsAndConditions).click();
	}
	
	public void checkOut() {
		driver.findElement(checkOut).click();
	}
}
