package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	By addToCart = By.id("add-to-cart-button-53");

	WebDriver driver;
	WebDriverWait wait;

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void addToCart() {
		driver.findElement(addToCart).click();
	}

}
