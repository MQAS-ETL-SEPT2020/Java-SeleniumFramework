package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.CheckoutPage;
import pages.ElectronicsPage;
import pages.HomePage;
import pages.LoginPage1;

public class TC_03_CameraPageTest extends BasePage {

	@Test(priority = 0)
	public void navigateToCameraPage() throws InterruptedException {
		// clicking on login link
		LoginPage1 loginPage = new LoginPage1(driver);
		loginPage.clickOnLogin();
		Reporter.log("Clicking on login link", true);

		// verifying Login page.
		loginPage.verifyLoginPage();
		Reporter.log("Login Page is displayed", true);

		// Entering emailId
		loginPage.typeEmail("anilkumarsm28@gmail.com");
		Reporter.log("Entering emailId", true);

		// Entering password
		loginPage.typePassword("Password@12345");
		Reporter.log("Entering password", true);

		// Clicking on Login button
		loginPage.Loginbutton();
		Reporter.log("Clicking on Login button", true);

		HomePage homePage = new HomePage(driver);
		// getting Title of the Home Page.
		homePage.getTitle();
		Reporter.log("getting title of the page", true);

		// clicking on Electronics Menu.
		homePage.clickElectronics();

		ElectronicsPage electronics = new ElectronicsPage(driver);
		// clicking on CellPhones link.
		electronics.clickCellPhonesIcon();
		Reporter.log("Clicking on CellPhones link", true);

		// Verifying Default option in SortbydropDown.
		Reporter.log("default dropdown as 'position'", true);
		Assert.assertTrue(electronics.SortBydropDown());

		// Verifying Default option in DisplaydropDown.
		Reporter.log("default dropdown as '8'", true);
		Assert.assertTrue(electronics.DisplayDropDown());

		// Verifying Default option in ViewasdropDown.
		Reporter.log("default dropdown as 'Grid'", true);
		Assert.assertTrue(electronics.ViewasDropDown());

		// Clicking on SmartPhoneLink.
		electronics.clickSmartphoneLink();
		Reporter.log("clicking on Smartphonelink", true);

		// Displaying popup msg.
		electronics.popupMsg();
		Reporter.log("pop msg is displaying", true);

		// Clicking on ShoppingCart Link
		electronics.ShoppingcartLink();
		Reporter.log("clicking on shopping cart link", true);

		// selecting country Dropdown.
		electronics.CountryDropDown();
		Reporter.log("selecting 'India' country", true);

		// Entering Postal address.
		// electronics.PostalCode();
		// Reporter.log("Entering postal number", true);

		// Checking Terms and Conditions CheckBox.
		electronics.TermsandServices();
		Reporter.log("Checked Terms and Conditions checkbox", true);

		// Clicking on Check Out button.
		electronics.CheckoutButton();
		Reporter.log("Clicking on Checkout button", true);

		CheckoutPage address = new CheckoutPage(driver);

		// clicking on new address in Billing Dropdown.
		address.BillingDropdown();
		Reporter.log("clicking on billing adrress dropdown", true);

		address.EnterFirstNameInBilling("Anil");
		Reporter.log("entering 'FirstName' text", true);

		address.EnterLastNameInBilling("kumar");
		Reporter.log("Entering 'Lastname' text", true);

		address.EnterEmailIdInBilling("anilkumarsm28@gmail.com");
		Reporter.log("entering emailId", true);

		address.EnterCompanyNameInBilling("TestYantra");
		Reporter.log("Entering company dropdown", true);

		address.CountryDropdownInBilling();
		Reporter.log("select Country India dropdown", true);

		address.EnterCityNameInBilling("Bengaluru");
		Reporter.log("Entering Country name", true);

		address.EnterAddress1InBilling("Sonaganahalli(V),sadali(P),shidlagatta(T),CB pura(D)");
		Reporter.log("Entering Address1 ", true);

		address.EnterZipCodeInBilling("562104");
		Reporter.log("Entering Pincode", true);

		address.EnterMobileNumberInBilling("7892540781");
		Reporter.log("Entering Mobile number", true);

		address.ClickOnContinueInBillingAddress();
		Reporter.log("clicking on continue button", true);

		Thread.sleep(5000);

		address.ShippingAddressDisplayed();
		Reporter.log("verifying shippingaddress page is displayed", true);

		address.shippingDropdown();
		Reporter.log("clicking on Shipping address dropdown", true);

		address.CountryDropDownInShippingAddress();
		
		//
		address.EnterCityNameInShippingAddress("bengalore");
		address.EnterAddress1InShippingAddress("hjgfckytfkuy");
		address.EnterZipCodeInShippingAddress("562104");
		address.EnterMobileNumberInShippingAddress("7892540781");
		address.ClickOnContinueInShippingAddress();

		/*
		 * public void shippingDropdown() {
		 *  driver.findElement(ShippingAddress).click();
		 * WebElement shippingAddress=driver.findElement(ShippingAddress); Select
		 * newAddress=new Select(shippingAddress);
		 * newAddress.selectByVisibleText("New Address");
		 * driver.findElement(NewAddress).click();
		 */

	}

}
