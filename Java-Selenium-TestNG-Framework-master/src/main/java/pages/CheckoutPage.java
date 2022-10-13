//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class CheckoutPage {
//	By checkOutPage = By.xpath("//h1[text()='Checkout']");
//	By billingAddress = By.id("billing-address-select"); 
//	By selectCountry=By.id("BillingNewAddress_CountryId");
//	By countryName=By.xpath("//option[text()='India']");
//	By city = By.id("BillingNewAddress_City");
//	By address1 = By.id("BillingNewAddress_Address1");
//	By zip = By.id("BillingNewAddress_ZipPostalCode");
//	By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
//	By continue1 = By.xpath("//input[@title='Continue']");
//	By moneyOrder = By.id("paymentmethod_1");
//	By continue2 = By.className("button-1 payment-method-next-step-button");
//	By continue3 = By.className("button-1 payment-info-next-step-button");
//	By continue4 = By.className("button-1 confirm-order-next-step-button");
//	By continue5 = By.className("button-2 order-completed-continue-button");
//
//	public WebDriver driver;
//	public WebDriverWait wait;
//
//	public CheckoutPage(WebDriver driver) {
//		this.driver = driver;
//		wait = new WebDriverWait(driver, 5);
//	}
//
//	public boolean isCheckOutPageSuccesful() {
//		return wait.until(ExpectedConditions.visibilityOfElementLocated(checkOutPage)).isDisplayed();
//	}
//
//	public void billingDropdown() {
//		WebElement billingaddress = driver.findElement(billingAddress);
//		Select address = new Select(billingaddress);
//		address.selectByVisibleText("New Address");
//		driver.findElement(newAddress).click();
//	}
//
//	public void countryDropdown() {
//		WebElement country=driver.findElement(selectCountry);
//		Select selectcountry=new Select(country);
//		selectcountry.selectByVisibleText("India");
//		driver.findElement(countryName).click();
//	}
//	
//	public boolean selectNewAddress() {
//		return wait.until(ExpectedConditions.visibilityOfElementLocated(newAddress)).isSelected();
//	}
//	
//	public boolean selectCountry() {
//		return wait.until(ExpectedConditions.visibilityOfElementLocated(countryName)).isSelected();
//	}
//	public void cityName(String CityName) {
//		driver.findElement(city).sendKeys(CityName);
//	}
//
//	public void address1(String Address) {
//		driver.findElement(address1).sendKeys(Address);
//	}
//
//	public void zip(String Zipcode) {
//		driver.findElement(zip).sendKeys(Zipcode);
//	}
//
//	public void phoneNumber(String PhoneNumber) {
//		driver.findElement(phoneNumber).sendKeys(PhoneNumber);
//	}
//}

//
//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class CheckoutPage {
//
//	By firstNameField = By.name("firstName");
//	By lastNameField = By.name("lastName");
//	By phoneField = By.name("phoneNumber");
//	By addressField = By.name("address1");
//	By cityField = By.name("city");
//	By stateProvinceDropdown = By.cssSelector("._296s._47p_");
//	By zipcodeField = By.name("postalCode");
//	By emailField = By.name("email");
//	By emailOptInCheckbox = By.name("optInAsGuest");
//	By continueToPaymentButton = By.name("submit");
//	By errorContainer = By.xpath("//div[@class=' _64f3'][contains(text(), 'Please specify a valid email')]");
//
//	WebDriver driver;
//	WebDriverWait wait;
//
//	public CheckoutPage(WebDriver driver) {
//		this.driver = driver;
//		wait = new WebDriverWait(driver, 5);
//	}
//
//	public void enterFirstName(String firstName) {
//		driver.findElement(firstNameField).clear();
//		driver.findElement(firstNameField).sendKeys(firstName);
//	}
//
//	public void enterLastName(String lastName) {
//		driver.findElement(lastNameField).clear();
//		driver.findElement(lastNameField).sendKeys(lastName);
//	}
//
//	public void enterPhoneNumber(String phone) {
//		driver.findElement(phoneField).clear();
//		driver.findElement(phoneField).sendKeys(phone);
//	}
//
//	public void enterAddress(String address) {
//		driver.findElement(addressField).clear();
//		driver.findElement(addressField).sendKeys(address);
//	}
//
//	public void enterCity(String city) {
//		driver.findElement(cityField).clear();
//		driver.findElement(cityField).sendKeys(city);
//	}
//
//	public void selectState(String state) {
//		new Select(driver.findElement(stateProvinceDropdown)).selectByValue(state);
//	}
//
//	public void enterZipcode(String zipcode) {
//		driver.findElement(zipcodeField).clear();
//		driver.findElement(zipcodeField).sendKeys(zipcode);
//	}
//
//	public void enterEmail(String email) {
//		driver.findElement(emailField).clear();
//		driver.findElement(emailField).sendKeys(email);
//	}
//
//	public void refresh() {
//		driver.navigate().refresh();
//	}
//
//	public boolean isErrorContainerDisplayed() {
//		return wait.until(ExpectedConditions.visibilityOfElementLocated(errorContainer)).isDisplayed();
//	}
//
//	public boolean isContinueButtonEnabled() {
//		return wait.until(ExpectedConditions.elementToBeClickable(continueToPaymentButton)).isDisplayed();
//	}
//
//}
