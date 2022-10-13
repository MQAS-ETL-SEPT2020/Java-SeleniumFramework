package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	By BillingAddress = By.id("billing-address-select");
	By NewAddress = By.xpath("//option[text()='New Address']");
	By FirstName = By.id("BillingNewAddress_FirstName");
	By LastName = By.id("BillingNewAddress_LastName");
	By Email = By.id("BillingNewAddress_Email");
	By Company = By.id("BillingNewAddress_Company");
	By AddressCountry = By.id("BillingNewAddress_CountryId");
	By City = By.id("BillingNewAddress_City");
	By Address1 = By.id("BillingNewAddress_Address1");
	By Zipcode = By.id("BillingNewAddress_ZipPostalCode");
	By phonenumber = By.id("BillingNewAddress_PhoneNumber");
	By Continue = By.xpath("//input[@onclick='Billing.save()']");
	By ShippingAddress = By.xpath("//h2[text()='Shipping address']");
	By ShippingAddressdropdown = By.id("shipping-address-select");
	By ShippingAddressdefault = By.xpath(
			"(//option[text()='vani gowda, #62 7th cross Jai maruti nagar nandini layout, Bangalore 560096, India'])[2]");

	WebDriver driver;
	WebDriverWait wait;

	public DemoCheckoutPage(WebDriver driver) {
			this.driver = driver;
			wait = new WebDriverWait(driver, 10);

		}

	public void addbilladdress() {
		driver.findElement(BillingAddress).click();
		WebElement drop1 = driver.findElement(BillingAddress);
		Select sel1 = new Select(drop1);
		sel1.selectByVisibleText("New Address");
		driver.findElement(NewAddress).click();
	}

	public void Fname() {
		driver.findElement(FirstName).clear();
		driver.findElement(FirstName).sendKeys("Vanigowda");
	}

	public void Lname() {
		driver.findElement(LastName).clear();
		driver.findElement(LastName).sendKeys("L");
	}

	public void emailid() {
		driver.findElement(Email).clear();
		driver.findElement(Email).sendKeys("vanigowdas54@gmail.com");
	}

	public void companyname() {
		driver.findElement(Company).clear();
		driver.findElement(Company).sendKeys("TestYantra");
	}

	public void countryaddress() {
		driver.findElement(AddressCountry).click();
		WebElement drop = driver.findElement(AddressCountry);
		Select sel = new Select(drop);
		sel.selectByVisibleText("India");
	}

	public void cityname() {
		driver.findElement(City).clear();
		driver.findElement(City).sendKeys("Bengaluru");
	}

	public void addressone() {
		driver.findElement(Address1).clear();
		driver.findElement(Address1).sendKeys("#62,jai maruti nagar");
	}

	public void zipcode() {
		driver.findElement(Zipcode).clear();
		driver.findElement(Zipcode).sendKeys("560099");
	}

	public void mobilenum() {
		driver.findElement(phonenumber).clear();
		driver.findElement(phonenumber).sendKeys("7411313729");
	}

	public void billcontinue() {
		driver.findElement(Continue).click();

	}
}

// public boolean shippingaddresspage()
// {
// return
// wait.until(ExpectedConditions.visibilityOfElementLocated(ShippingAddress)).isDisplayed();

// }
// public void clickshippingaddressdropdown()
// {
// driver.findElement(ShippingAddressdropdown).click();

//

// public void selectshippingaddressdropdown()
//

// driver.findElement(ShippingAddressdefault).click();
// WebElement drop2 = driver.findElement(BillingAddress);
// Select sel2=new Select(drop2);
// sel2.selectByVisibleText("ShippingAddressdefault");
// driver.findElement(ShippingAddressdefault).click();
// }

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
