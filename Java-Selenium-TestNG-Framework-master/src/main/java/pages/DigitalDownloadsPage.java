package pages;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class DigitalDownloadsPage {
		By digitalDownloads = By.xpath("(//a[contains(text(),'Digital downloads')])[1]");
		By digitalDownloadsPage = By.xpath("//h1[text()='Digital downloads']");

		By sortby = By.id("products-orderby");
		By position_sortby = By.xpath("//option[text()='Position']");

		By displayPerPage = By.id("products-pagesize");
		By eight_displayPerPage = By.xpath("//option[text()='8']");

		By viewAs = By.id("products-viewmode");
		By grid_viewAs = By.xpath("//option[text()='Grid']");

		By album = By.xpath("//a[text()='3rd Album']");
		
		By thirdAlbumPage = By.xpath("//div[@class='overview']/..//h1"); 
		By price=By.xpath("//div[@class='product-price']");
		By qty=By.xpath("//label[text()='Qty:']");
		By quantity=By.id("addtocart_53_EnteredQuantity");
		By addToCart = By.xpath("(//input[@value='Add to cart'])[1]");

		By shoppingCart = By.xpath("//span[text()='Shopping cart']");
		By termsAndConditions = By.id("termsofservice");
		By checkOut = By.id("checkout");
		By city = By.id("BillingNewAddress_City");
		By address1 = By.id("BillingNewAddress_Address1");
		By zip = By.id("BillingNewAddress_ZipPostalCode");
		By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
		By continue1 = By.xpath("//input[@title='Continue']");
		By moneyOrder = By.id("paymentmethod_1");
		By continue2 = By.className("button-1 payment-method-next-step-button");
		By continue3 = By.className("button-1 payment-info-next-step-button");
		By continue4 = By.className("button-1 confirm-order-next-step-button");
		By continue5 = By.className("button-2 order-completed-continue-button");

		WebDriver driver;
		WebDriverWait wait;

		public DigitalDownloadsPage(WebDriver driver) {
			this.driver = driver;
			wait = new WebDriverWait(driver, 7);
		}

		// Click on "digital downloads" button
		public void digitalDownloads() {
			driver.findElement(digitalDownloads).click();
		}

		// Digital Downloads page is displayed
		public boolean clickdigitalDownloads() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(digitalDownloadsPage)).isDisplayed();
		}

		public void sortBy() {
			WebElement sort = driver.findElement(sortby);
			Select sort1 = new Select(sort);
			// sort1.selectByVisibleText("Position");
		}

		public boolean defaultSortBy() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(position_sortby)).isDisplayed();
		}

		public void displayPerPage() {
			WebElement page = driver.findElement(displayPerPage);
			Select page1 = new Select(page);
			// page1.selectByVisibleText(null);
		}

		public boolean defaultDisplayPerPage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(eight_displayPerPage)).isDisplayed();
		}

		public void viewAs() {
			WebElement viewas = driver.findElement(viewAs);
			Select viewas1 = new Select(viewas);
			// viewas1.selectByIndex(1);
		}

		public boolean defaultViewAs() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(grid_viewAs)).isDisplayed();
		}

		// Click on "3rd album" link
		public void album1() {
			driver.findElement(album).click();
		}

		// 3rd image page is displayed
		public boolean click3rdAlbum() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(thirdAlbumPage)).isDisplayed();
		}
		
//		public void price() {
//			driver.findElement(price).click();
//		}
		
		public boolean defaultPrice() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(price)).isDisplayed();
		}
		
		public void quantity() {
			driver.findElement(qty).click();
		}
		public boolean defaultQuantity() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(quantity)).isDisplayed();
		}

		public void addToCart() {
			driver.findElement(addToCart).click();
		}
		
		public boolean clickOnAddToCart() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart)).isSelected();
		}

		public void shoppingCart() {
			driver.findElement(shoppingCart).click();
		}

		public void termsAndConditions() {
			driver.findElement(termsAndConditions).click();
		}

		public void checkOut() {
			driver.findElement(checkOut).click();
		}

		public void billingAddress() {
			driver.findElement(city).sendKeys("Bengaluru");
		}

		public void address1() {
			driver.findElement(address1).sendKeys("Katreguppe,Banashankari");
		}

		public void zip() {
			driver.findElement(zip).sendKeys("560085");
		}

		public void phoneNumber() {
			driver.findElement(phoneNumber).sendKeys("987654210");
		}

	}
