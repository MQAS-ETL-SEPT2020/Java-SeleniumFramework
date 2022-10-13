package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {

	By shoppingCart = By.xpath("//span[text()='Shopping cart']");
	By shoppingCartPage = By.xpath("//h1[text()='Shopping cart']");
	By termsOfService=By.xpath("//div[@class=\"terms-of-service\"]");
	By termsOfServiceCheckbox = By.id("termsofservice");
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

	public boolean isShoppingCartPageSuccessful() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingCartPage)).isDisplayed();
	}

	public void clickOnTermsOfService() {
		driver.findElement(termsOfServiceCheckbox).click();
	}

	public boolean termsOfServiceSelected() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(termsOfServiceCheckbox)).isSelected();
	}


	public void clickOnCheckOut() {
		driver.findElement(checkOut).click();
	}

}
