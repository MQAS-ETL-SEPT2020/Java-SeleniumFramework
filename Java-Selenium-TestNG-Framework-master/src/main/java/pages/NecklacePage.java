package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NecklacePage {
	By blackandwhiteproductPage = By.xpath("//h1[contains(text(),'Black & White Diamond Heart')]");
	By blackandwhitejewelPrice = By.xpath("(//span[contains(.,'130')])[2]");
	// By jewelQty=By.xpath("//input[@value='1']");
	By Addtocart = By.xpath("//input[@class='button-1 add-to-cart-button']");
	//By shoppingcartpopup = By.xpath("//a[text()='shopping cart']");
	// By Wishlist = By.id("add-to-wishlist-button-14");

	WebDriver driver;
	WebDriverWait wait;

	public NecklacePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public boolean blackandwhitePage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(blackandwhiteproductPage)).isDisplayed();

	}

	public boolean blackandwhitePrice(){
		return wait.until(ExpectedConditions.visibilityOfElementLocated(blackandwhitejewelPrice)).isDisplayed();
	}

	// public boolean ProductQty()
	// {
	// JavascriptExecutor jse1=(JavascriptExecutor)driver;
	// jse1.executeScript("window.scrollBy(0,600)");
	//return wait.until(ExpectedConditions.visibilityOfElementLocated(jewelQty)).isDisplayed();

	// }
	public void addjewel()
	{
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,400)");
		driver.findElement(Addtocart).click();
	}
	
	//public boolean shoppingpopup() {
		//return wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingcartpopup)).isDisplayed();

	}


