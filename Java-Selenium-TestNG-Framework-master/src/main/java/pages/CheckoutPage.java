package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

	By CheckoutPage = By.xpath("//h1[text()='Checkout']");
	By BillingAddressField = By.xpath("//h2[text()='Billing address']");
	By BillingAddress = By.id("billing-address-select");
	By NewAddress = By.xpath("//option[text()='New Address']");
	By FirstName = By.id("BillingNewAddress_FirstName");
	By LastName = By.id("BillingNewAddress_LastName");
	By Email = By.id("BillingNewAddress_Email");
	By Company = By.id("BillingNewAddress_Company");
	By CountryId = By.id("BillingNewAddress_CountryId");
	By CountryName = By.xpath("//option[text()='India']");
	By City = By.id("BillingNewAddress_City");
	By Address1 = By.id("BillingNewAddress_Address1");
	By ZipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
	By PhoneNumber = By.id("BillingNewAddress_PhoneNumber");
	By Continue = By.xpath("//input[@onclick='Billing.save()']");

	By ShippingAddress = By.xpath("//h2[text()='Shipping address']");
	By ShippingAddressdropdown = By.id("shipping-address-select");
	By ShippingNewAddress = By.xpath(("//option[text()='New Address'])[2]"));
	// By ShippingFirstName = By.id("BillingNewAddress_FirstName");
	// By LastName = By.id("BillingNewAddress_LastName");
	// By Email = By.id("BillingNewAddress_Email");
	By ShippingCompany = By.id("ShippingNewAddress_Company");
	By ShippingCountryId = By.id("ShippingNewAddress_CountryId");
	By ShippingCountryName = By.xpath("//option[text()='India']");
	By ShippingCity = By.id("ShippingNewAddress_City");
	By ShippingAddress1 = By.id("ShippingNewAddress_Address1");
	By ShipppingZipPostalCode = By.id("ShippingNewAddress_ZipPostalCode");
	By ShippingPhoneNumber = By.id("ShippingNewAddress_PhoneNumber");
	By ShippingContinue = By.xpath("//input[@onclick='Shipping.save()']");

	WebDriver driver;
	WebDriverWait wait;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public boolean isCheckOutPageSuccesful() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(CheckoutPage)).isDisplayed();
	}

	public boolean isBillingAddressDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(BillingAddressField)).isDisplayed();
	}

	public boolean isContinueButtonDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Continue)).isDisplayed();
	}

	public void BillingDropdown() {
		driver.findElement(BillingAddress).click();
		WebElement drop1 = driver.findElement(BillingAddress);
		Select sel1 = new Select(drop1);
		sel1.selectByVisibleText("New Address");
		driver.findElement(NewAddress).click();
	}

	public boolean SelectNewAddress() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(NewAddress)).isSelected();
	}

	public void EnterFirstName(String Firstname) {
		driver.findElement(FirstName).clear();
		driver.findElement(FirstName).sendKeys(Firstname);
	}

	public void EnterLastName(String Lastname) {
		driver.findElement(LastName).clear();
		driver.findElement(LastName).sendKeys(Lastname);
	}

	public void EnterEmailId(String Emailid) {
		driver.findElement(Email).clear();
		driver.findElement(Email).sendKeys(Emailid);
	}

	public void EnterCompanyName(String Companyname) {
		driver.findElement(Company).clear();
		driver.findElement(Company).sendKeys(Companyname);
	}

	public void CountryDropdown() {
		driver.findElement(CountryId).click();
		WebElement drop = driver.findElement(CountryId);
		Select sel = new Select(drop);
		sel.selectByVisibleText("India");
	}

	public boolean SelectCountry() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(CountryName)).isSelected();
	}

	public void EnterCityName(String Cityname) {
		driver.findElement(City).clear();
		driver.findElement(City).sendKeys(Cityname);
	}

	public void EnterAddress1(String Address) {
		driver.findElement(Address1).clear();
		driver.findElement(Address1).sendKeys(Address);
	}

	public void EnterZipCode(String ZipCode) {
		driver.findElement(ZipPostalCode).clear();
		driver.findElement(ZipPostalCode).sendKeys(ZipCode);
	}

	public void EnterMobileNumber(String Mobilenumber) {
		driver.findElement(PhoneNumber).clear();
		driver.findElement(PhoneNumber).sendKeys(Mobilenumber);
	}

	public void ClickOnContinueInBillingAddress() {
		driver.findElement(Continue).click();

	}

	public boolean isShippingAddressDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ShippingAddress)).isDisplayed();

	}

	public void shippingDropdown() {
		driver.findElement(ShippingAddressdropdown).click();
		WebElement drop3 = driver.findElement(ShippingNewAddress);
		Select sel3 = new Select(drop3);
		sel3.selectByVisibleText("New Address");
		driver.findElement(NewAddress).click();
	}

	public void shippingEnterCompanyName(String Companyname) {
		driver.findElement(Company).clear();
		driver.findElement(Company).sendKeys(Companyname);
	}

	public void shippingCountryDropdown() {
		driver.findElement(CountryId).click();
		WebElement drop = driver.findElement(CountryId);
		Select sel = new Select(drop);
		sel.selectByVisibleText("India");
	}

	public boolean shippingSelectCountry() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(CountryName)).isSelected();
	}

	public void shippingEnterCityName(String Cityname) {
		driver.findElement(City).clear();
		driver.findElement(City).sendKeys(Cityname);
	}

	public void shippingEnterAddress1(String Address) {
		driver.findElement(Address1).clear();
		driver.findElement(Address1).sendKeys(Address);
	}

	public void shippingEnterZipCode(String ZipCode) {
		driver.findElement(ZipPostalCode).clear();
		driver.findElement(ZipPostalCode).sendKeys(ZipCode);
	}

	public void shippingEnterMobileNumber(String Mobilenumber) {
		driver.findElement(PhoneNumber).clear();
		driver.findElement(PhoneNumber).sendKeys(Mobilenumber);
	}

}
// }

//<<Default Checkout page>>

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
