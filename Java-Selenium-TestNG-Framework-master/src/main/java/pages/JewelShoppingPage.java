package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JewelShoppingPage {
	By shoppingCart = By.xpath("//span[text()='Shopping cart']");
	By shoppingcartPageText=By.xpath("//h1[text()='Shopping cart']");
	By Country=By.id("CountryId");
	By Pincode=By.id("ZipPostalCode");
	By termsAndConditions = By.id("termsofservice");
	By CheckOutButton = By.id("checkout");
	By CheckOutPage=By.xpath("//h1[text()='Checkout']");

	WebDriver driver;
	WebDriverWait wait;

	public JewelShoppingPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	//public boolean shoppingcartpopup() {
		//return wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingcartpopup)).isDisplayed();

	//}

	public void shoppingcartlink() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingCart)).isDisplayed();

		driver.findElement(shoppingCart).click();
	}
	public boolean shoppingcartPage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingcartPageText)).isDisplayed();
	}
	
	public void productCountry()
	{
		driver.findElement(Country).click();
		WebElement drop = driver.findElement(Country);
		Select sel=new Select(drop);
		sel.selectByVisibleText("India");
	}
	public boolean countryProduct() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Country)).isDisplayed();
	}
	
	public void zipcode()
	{
		driver.findElement(Pincode).clear();
		driver.findElement(Pincode).sendKeys("560099");
	}
	public boolean pincodenumber() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Pincode)).isDisplayed();
	}
	
	public void termscheckbox() {
	driver.findElement(termsAndConditions).click();
	}

	public void checkOut() {
		driver.findElement(CheckOutButton).click();
	}
	
	public boolean checkoutpage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(CheckOutPage)).isDisplayed();
	}
}
	
//}