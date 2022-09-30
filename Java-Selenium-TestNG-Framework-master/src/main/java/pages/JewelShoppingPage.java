package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JewelShoppingPage {
	By shoppingcart = By.xpath("//span[text()='Shopping cart']");
	By UpdateCart = By.name("button-2 update-cart-button");
	By Country = By.id("CountryId");
	By Pincode = By.id("ZipPostalCode");
	By Termsandconditions = By.id("termsofservice");
	By Checkout = By.id("checkout");

	WebDriver driver;
	WebDriverWait wait;

	public JewelShoppingPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void ClickOnshoppingcart() {
		driver.findElement(shoppingcart).click();
	}

	public void checkTermsandcondtions() {
		driver.findElement(Termsandconditions).click();
	}

	public void Checkout() {
		driver.findElement(Checkout).click();
	}

}
