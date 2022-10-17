package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

public class ApparelAndShoesPage extends BasePage {

	By apparelAndShoes_menu = By.xpath("(//a[contains(.,'Apparel ')])[1]");
	By apparelAndShoes_text = By.xpath("//h1[text()='Apparel & Shoes']");
	By sortBy_dropdown = By.xpath("//select[@id='products-orderby']");
	By position_option = By.xpath("//option[text()='Position']");
	By display_dropdown = By.xpath("//select[@id='products-pagesize']");
	By eight_option = By.xpath("//option[text()='8']");
	By viewAs_dropdown = By.xpath("//select[@id='products-viewmode']");
	By grid_option = By.id("products-viewmode");
	By product = By.xpath("(//img[@title=\"Show details for 50's Rockabilly Polka Dot Top JR Plus Size\"])[2]");
	By size_dropdown = By.xpath("//select[@id='product_attribute_5_7_1']");
	By small_option = By.xpath("//option[@value=\"1\"] ");
	By price = By.xpath("//span[@itemprop='price']");
	By qty_textfield = By.xpath("//input[@class='qty-input']");
	By defaultQty = By.xpath("//input[@value='1']");
	By addToCart_Button = By.xpath("//input[@id='add-to-cart-button-5']");
	By confirMessage=By.xpath("//p[@class='content']");
	By shoppingCart=By.xpath("//span[text()='Shopping cart']");
	By termsAndConditions=By.id("termsofservice");
	By checkOut=By.id("checkout");
//	By billingAddress=By.id("billing-address-select");
//	By clickContinue=By.xpath("(//input[@type='button'])[2]");
//	By shippingAddress=By.id("shipping-address-select");
//	By shippingContinue=By.xpath("//input[@onclick='Shipping.save()']");
	By shippingMethod=By.xpath("(//div[@class='step-title'])[3]");
	By ground=By.xpath("//label[@for='shippingoption_0']");
	By shippingMethodContinue=By.xpath("//input[@onclick='ShippingMethod.save()']");
//	By paymentMethod=By.xpath("//li[@id='opc-payment_method']");
//	By cashOnDelivery=By.xpath("//label[text()='Cash On Delivery (COD) (7.00)']");
//	By paymentContinue=By.xpath("//input[@onclick='PaymentMethod.save()']");
//	By paymentInformation=By.xpath("//li[@class='tab-section allow active']");
//	By paymentInformationContinue=By.xpath("//input[@class='button-1 payment-info-next-step-button']");
//	By confirmOrder=By.xpath("//li[@class='tab-section allow active']");
//	By clickConfirm=By.xpath("//input[@onclick='ConfirmOrder.save()']");
	// By display = By.id("products-pagesize");
	// By viewAs = By.id("products-viewmode");
	// By image = By.xpath("(//div[@class='picture'])[1]");

	WebDriver driver;
	WebDriverWait wait;

	public ApparelAndShoesPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void clickApparelAndShoes() {
		driver.findElement(apparelAndShoes_menu).click();
	}

	public boolean apparelAndShoesText() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(apparelAndShoes_text)).isDisplayed();
	}

	public void selectSort() {
		WebElement drop = driver.findElement(sortBy_dropdown);
		Select sel = new Select(drop);
	}

	public boolean sortposition() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(position_option)).isDisplayed();
	}

	public void selectDisplay() {
		WebElement dropdown = driver.findElement(display_dropdown);
		Select sel = new Select(dropdown);

	}

	public boolean displayeight() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(eight_option)).isDisplayed();
	}

	public void selectViewAs() throws InterruptedException {
		WebElement drop2 = driver.findElement(viewAs_dropdown);
		Select sel = new Select(drop2);
		//Thread.sleep(2000);
	}

	public boolean viewgrid() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(grid_option)).isDisplayed();
	}

	public void selectProduct() {
		driver.findElement(product).click();
	}

	public void selectSize() {
		WebElement drop3 = driver.findElement(size_dropdown);
		Select sel = new Select(drop3);
	}

	public boolean selectSmalll() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(small_option)).isDisplayed();
	}

	public boolean price() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(price)).isDisplayed();
	}

	public void selectQty() {
		driver.findElement(qty_textfield).click();
	}

	public boolean defaultQty() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(defaultQty)).isDisplayed();
	}

	public void addToCart() {
		driver.findElement(addToCart_Button).click();

	}
	 public boolean confirmationMsg() {
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(confirMessage)).isDisplayed();

}
	 public void  shoppingCart() {
		 driver.findElement(shoppingCart).click();
	 }
	 public boolean clickOnAddToCart() {
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingCart)).isDisplayed();
	 }
	 public void checkBox() {
		 driver.findElement(termsAndConditions).click();
	 }
	 public boolean clickOnCheckBox() {
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(termsAndConditions)).isDisplayed();
	 }
	 public void checkOut() {
		 driver.findElement(checkOut).click();
	 }
	 public boolean clickOnCheckOut() {
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut)).isDisplayed();
	 }
//	 public void billingAddress() {
//		WebElement drop4 = driver.findElement(billingAddress);
//		 Select sel = new Select(drop4);
//	 }
//	 public boolean selectbillingAddress() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(billingAddress)).isDisplayed();
//	 }
//	 public void continueButton() {
//		 driver.findElement(clickContinue).click();
//	 }
//	 public boolean clickOnContinue() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(clickContinue)).isDisplayed();
//	 }
//	 public void shippingAddress() {
//		WebElement drop5 = driver.findElement(shippingAddress);
//		Select sel=new Select(drop5);
//	 }
//	 public boolean selectShippingAddress() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(shippingAddress)).isDisplayed();
//	 }
//	 public void shippingContinue() {
//		 driver.findElement(shippingContinue).click();
//	 }
//	 public boolean clickShippingContinue() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(shippingContinue)).isDisplayed();
//	 }
	 public void shippingMethod() {
		 driver.findElement(shippingMethod);
	 }
	 public boolean selectShippingMethod() {
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(shippingMethod)).isDisplayed();
	 }
	 public void ground() {
		 driver.findElement(ground);
	 }
	 public boolean selectground(){
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(ground)).isDisplayed();
	 }
	 public void shippingMethodContinue() {
		 driver.findElement(shippingMethodContinue).click();
	 }
	 public boolean clickShippingMethodContinue() {
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(shippingMethodContinue)).isDisplayed();
	 }
	 
	 public void paymentMethod() {
//		 driver.findElement(paymentMethod);
	 }
//	 public boolean selectPaymentMethod() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(paymentMethod)).isDisplayed();
//	 }
//	 public void cashOnDelivery() {
//		 driver.findElement(cashOnDelivery).click();
//	 }
//	 public boolean clickCashOnDelivery() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(cashOnDelivery)).isDisplayed();
//	 }
//	 public void paymentContinue() {
//		 driver.findElement(paymentContinue).click();
//	 }
//	 public boolean clickPaymentContinue() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(paymentContinue)).isDisplayed();
//	 }
//	 public void paymentInformation() {
//		 driver.findElement(paymentInformation);
//	 }
//	 public boolean selectPaymentInformation() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(paymentInformation)).isDisplayed();
//	 }
//	 public void paymentInformationContinue() {
//		 driver.findElement(paymentInformationContinue).click();
//	 }
//	 public boolean clickPaymentInformationContinue() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(paymentInformationContinue)).isDisplayed();
//	 }
//	 public void confirmOrder() {
//		 driver.findElement(confirmOrder);
//	 }
//	 public boolean selectConfirmOrder() {
//		 return wait.until(ExpectedConditions.visibilityOfElementLocated(confirmOrder)).isDisplayed();
//	 }
	 
}
