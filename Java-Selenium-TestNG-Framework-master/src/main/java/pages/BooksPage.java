package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BooksPage {
	By Books = By.xpath("(//a[@href='/books'])[1]");
	By Books_text = By.xpath("//h1[text()='Books']");
	By sortby = By.id("products-orderby");
	By ViewAs = By.id("products-pagesize");
	By Display = By.id("products-viewmode");
	By clickonbook = By.linkText("Computing and Internet");
	By price = By.xpath("//span[@class='price-value-13']");
	By quantity = By.xpath("(//input[@type='text'])[3]");
	By AddToCart = By.id("add-to-cart-button-13");
	By confirmMessage = By.xpath("//p[@class='content']");
	By ShoppingCartLink = By.xpath("//a[text()='Shopping cart']");
	By Termsconditions = By.id("termsofservice");
	By Checkout = By.xpath("//div[@class='checkout-buttons']");

	WebDriver driver;
	WebDriverWait wait;

	public BooksPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	// Books page is displayed
	public void ClickBooks() {
		driver.findElement(Books).click();
	}

	public boolean booksText() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Books_text)).isDisplayed();
	}

	public void sortby() {
		WebElement sort = driver.findElement(sortby);
		Select sort1 = new Select(sort);
	}

	public boolean SortPosition() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(sortby)).isDisplayed();
	}

	public void ViewAs() {
		WebElement view = driver.findElement(ViewAs);
		Select viewas = new Select(view);
	}

	public boolean gridview() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ViewAs)).isDisplayed();
	}

	public void Display() {
		WebElement display = driver.findElement(Display);
		Select display8 = new Select(display);
	}

	public boolean DisplayPage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Display)).isDisplayed();
	}

	public void clickonbook() {
		driver.findElement(clickonbook).click();
	}

	public boolean computingandInternetbook() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(clickonbook)).isDisplayed();
	}

	public boolean price() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(price)).isDisplayed();
	}

	public boolean quantity() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(quantity)).isDisplayed();
	}

	public void clickonAddToCart() {
		driver.findElement(AddToCart).click();
	}

	public boolean confirmMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(confirmMessage)).isDisplayed();
	}

	public void Shoppingcart() {
		driver.findElement(ShoppingCartLink).click();
	}

	public boolean shoppingcartlink() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ShoppingCartLink)).isDisplayed();
	}

	public void termsconditions() {
		driver.findElement(Termsconditions).click();
	}

	public boolean checkbox() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Termsconditions)).isDisplayed();
	}

	public void checkoutpage() {
		driver.findElement(Checkout).click();
	}

	public boolean Checkout() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Checkout)).isSelected();
	}
}
