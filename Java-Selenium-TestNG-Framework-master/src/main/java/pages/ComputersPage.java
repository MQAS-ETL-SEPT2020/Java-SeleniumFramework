
	package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class ComputersPage {
		By gmailverification=By.xpath("//a[text()='lalipreeti9@gmail.com']");
		By computerPage = By.xpath("//h1[text()='Computers']");
		By Desktops = By.xpath("(//a[contains(text(),'Desktops')])[4]");
		By desktopText = By.xpath("//h1[text()='Desktops']");
		By sortBy = By.id("products-orderby");
		By Display = By.id("products-pagesize");
		By viewAs = By.id("products-viewmode");
		By Addtocart = By.xpath("(//input[@value='Add to cart'])[3]");
		By price=By.xpath("//span[contains(text(),'1800.00')]");
		By processor=By.xpath("//label[text()='Medium  [+15.00]']");
		By RAM=By.xpath("//label[text()='2 GB ']");
		By HDD=By.xpath("//label[text()='320 GB ']");
		By software=By.xpath("//label[text()='Image Viewer  [+5.00]']");
		By Quality=By.id("addtocart_74_EnteredQuantity");
		By AddtocartText = By.xpath("(//div[@class='buttons'])[5]");
		By BuildText = By.xpath("//h1[@itemprop='name']");
		By SoftwareText = By.xpath("(//label[@class='text-prompt'])[4]");
		By Cart = By.id("(//input[@type='button'])[3]");
		By cartText = By.xpath("(//input[@type='button'])[3]");
		By AddedToCartPopUp=By.id("bar-notification");
		By shopping = By.xpath("(//a[@class='ico-cart'])[1]");
		By ShoppingCartText = By.xpath("(//span[@class='cart-label'])[1]");
		By Quality1=By.xpath("//input[@name='itemquantity2742731']");
		By ProductImage=By.xpath("//td[@class='product-picture']");
		
		By TermsCheckbox=By.xpath("//input[@name='termsofservice']");
	    By TermsText=By.xpath("//div[@class='terms-of-service']");
	    By Checkout=By.xpath("//div[@class='checkout-buttons']");
	    By checkoutpage=By.id("checkout-steps");
	    By billingAddress=By.xpath("//h2[text()='Billing address']");
	    By NewAddress=By.id("billing-address-select");
	    By ContinueButtonInBilling=By.xpath("(//input[@title='Continue'])[1]");
	    By shippingAddress=By.xpath("//h2[text()='Shipping address']");
	    By ContinueButtonInShipping=By.xpath("(//input[@title='Continue'])[2]");
	    By ShippingMethod=By.xpath("(//input[@name='shippingoption'])[1]");
	    By ContinueButtonInShippingMethod=By.xpath("(//input[@value='Continue'])[3]");
	    By PaymentMethod=By.xpath("//h2[text()='Payment method']");
	    By CashOnDelivery=By.xpath("(//input[@name='paymentmethod'])[1]");
	    By ContinueInPaymentMethod=By.xpath("(//input[@value='Continue'])[4]");
	    By PaymentInformation=By.xpath("//h2[text()='Payment information']");
	    By PaymentMessage=By.xpath("//p[text()='You will pay by COD']");
	    By ContinueInPaymentInformation=By.xpath("(//input[@value='Continue'])[4]");
	    By ComfirmOrder=By.xpath("//h2[text()='Confirm order']");
	    
		WebDriver driver;
		WebDriverWait wait;

		public ComputersPage(WebDriver driver) {
			this.driver = driver;
			wait = new WebDriverWait(driver, 5);
		}

		public boolean GmailVerification() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(gmailverification)).isDisplayed();
		}
		
		public boolean computerText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(computerPage)).isDisplayed();
		}

		public void desktop() {
			driver.findElement(Desktops).click();
		}

		public boolean DesktopText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(desktopText)).isDisplayed();
		}

		public void position() {
			WebElement sort = driver.findElement(sortBy);
			Select sort1 = new Select(sort);
		}

		public boolean SortPosition() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(sortBy)).isDisplayed();
		}

		public void displaypage() {
			WebElement page = driver.findElement(Display);
			Select page1 = new Select(page);
		}

		public boolean DisplayPerPage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(Display)).isDisplayed();
		}

		public void viewasdropdown() {
			WebElement view = driver.findElement(viewAs);
			Select view1 = new Select(view);
		}

		public boolean ViewAs() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(viewAs)).isDisplayed();
		}

		public void button() {
			driver.findElement(Addtocart).click();
		}

		public boolean AddtocartText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(AddtocartText)).isDisplayed();
		}

		public boolean PriceText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(price)).isDisplayed();
		}

		public boolean buildText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(BuildText)).isDisplayed();
		}

		public boolean Processor() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(processor)).isDisplayed();
		}
		
		public boolean Ram() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(RAM)).isDisplayed();
		}
		
		public boolean hdd() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(HDD)).isDisplayed();
		}
		
		public void Software() {
			driver.findElement(software).click();
		}
	
		public boolean selectSoftware() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(SoftwareText)).isDisplayed();
		}

		public void CartButton() {
			driver.findElement(Addtocart).click();
		}

		public boolean CartText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(cartText)).isDisplayed();
		}

		public boolean Quality() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(Quality)).isDisplayed();
		}
		
		public boolean PopUpMessage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(AddedToCartPopUp)).isDisplayed();
		}
		
		public void shoppinglink() {
			driver.findElement(shopping).click();
		}

		public boolean shoppingText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(ShoppingCartText)).isDisplayed();
		}
		
		public boolean DefaultQuality() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(Quality1)).isDisplayed();
		}
		
		public boolean productimage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(ProductImage)).isDisplayed();
		}
		public void CheckBox() {
			driver.findElement(TermsCheckbox).click();
		}

		public boolean CheckboxText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(TermsText)).isDisplayed();
		}
		
		public void CheckoutButton() {
			driver.findElement(Checkout).click();
		}

		public boolean CheckoutText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutpage)).isDisplayed();
		}
		
		public boolean BillingAddress() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(billingAddress)).isDisplayed();
		}
		
		public boolean AddressBook() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(NewAddress)).isDisplayed();
		}
		
		public void continueInBilling() {
			driver.findElement(ContinueButtonInBilling).click();
		}
		
		public boolean ShippingText() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(shippingAddress)).isDisplayed();
		}
		
		public void clickOnContinueInShipping() {
			driver.findElement(ContinueButtonInShipping).click();
		}
		
		public boolean ShippingInGround() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(ShippingMethod)).isDisplayed();
		}
		
		public void continuuButtonInshippingMethod() {
			driver.findElement(ContinueButtonInShippingMethod).click();
		}
		
		public boolean PaymentMethodPage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(PaymentMethod)).isDisplayed();
		}
		
		public boolean CashOnDeliveryButton() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(CashOnDelivery)).isDisplayed();
		}
		
		public void continuuButtonInPaymentMethod() {
			driver.findElement(ContinueInPaymentMethod).click();
		}
		
		public boolean paymentinformation() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(PaymentInformation)).isDisplayed();
		}
		
		public boolean message() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(PaymentMessage)).isDisplayed();
		}
		
		public void ContinueButtonInPaymentInformation() {
			driver.findElement(ContinueInPaymentInformation).click();
		}
		
		public boolean confirmPage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(ComfirmOrder)).isDisplayed();

		}
	}


