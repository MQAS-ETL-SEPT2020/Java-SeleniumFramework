package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NecklacePage {
	By AddToCart = By.id("add-to-cart-button-14");
	By Wishlist = By.id("add-to-wishlist-button-14");

	WebDriver driver;
	WebDriverWait wait;

	public NecklacePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void Addproduct() {
		driver.findElement(AddToCart).click();
	}

	public void Addtowishlist() {
		driver.findElement(Wishlist).click();
	}

}
