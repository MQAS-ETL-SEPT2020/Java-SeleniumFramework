package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickonAddToCart {

	By addToCart = By.id("add-to-cart-button-13");
	WebDriver driver;
	WebDriverWait wait;

	public ClickonAddToCart(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void AddToCart() {
		driver.findElement(addToCart).click();
	}
}
