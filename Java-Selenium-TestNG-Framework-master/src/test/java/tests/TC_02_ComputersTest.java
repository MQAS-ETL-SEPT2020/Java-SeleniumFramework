package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.CheckoutPage;
import pages.ComputersPage;
import pages.HomePage;
import pages.LoginPage1;

public class TC_02_ComputersTest extends BasePage {
	@Test
	public void computer() throws InterruptedException {

		// WHEN I click on "login" link
		LoginPage1 login = new LoginPage1(driver);
		login.clickOnLogin();

		// WHEN I login with "Email" and "Password" AND click  on "Log in" button
		login.typeEmail("lalipreeti9@gmail.com");
		login.typePassword("PreetiLali@123");
		login.clickRemembermeCheckbox();
		login.Loginbutton();

		HomePage home = new HomePage(driver);

		home.clickComputers();
		ComputersPage computer = new ComputersPage(driver);

		computer.GmailVerification();
		Reporter.log("By default registered email id is displayed", true);
		Assert.assertTrue(computer.GmailVerification(), "not clicked on Computers");

		computer.desktop();
		computer.DesktopText();
		Reporter.log("Clicked on desktops ", true);
		Assert.assertTrue(computer.DesktopText(), "not clicking on desktops");

		computer.position();
		computer.SortPosition();
		Reporter.log("By default position is selected", true);
		Assert.assertTrue(computer.SortPosition(), "By default position is not selected");

		computer.displaypage();
		computer.DisplayPerPage();
		Reporter.log("By default DisplayPerPage 8 is selected", true);
		Assert.assertTrue(computer.DisplayPerPage(), "By default DisplayPerPage 8 is not selected");

		computer.viewasdropdown();
		computer.ViewAs();
		Reporter.log("By default viewasdropdown grid is selected", true);
		Assert.assertTrue(computer.ViewAs(), "By default viewasdropdown Grid is not selected");

		computer.button();
		Thread.sleep(5000);
		computer.AddtocartText();
		Reporter.log("By default Clicked on cart button", true);
		Assert.assertTrue(computer.AddtocartText(), "By default not clicked on cart ");

		computer.PriceText();
		Reporter.log("By default Price as 1800.00 is displayed", true);
		Assert.assertTrue(computer.PriceText(), "By default Price as 1800.00 is not displayed ");

		computer.Processor();
		Reporter.log("By default Medium[15.00] processor is selected", true);
		Assert.assertTrue(computer.PriceText(), "By default Medium[15.00] processor is selected ");

		computer.Ram();
		Reporter.log("By default 2GB RAM is selected", true);
		Assert.assertTrue(computer.Ram(), "By default 2GB RAM is selected ");

		computer.Software();
		computer.selectSoftware();
		Reporter.log("Selected the Image viever as software", true);
		Assert.assertTrue(computer.selectSoftware(), "Not selected the Image viever as software ");

		computer.hdd();
		Reporter.log("By default HDD 320GB is selected", true);
		Assert.assertTrue(computer.hdd(), "By default HDD 320GB is not selected ");

		computer.Quality();
		Reporter.log("By default Quality as 1 is displayed", true);
		Assert.assertTrue(computer.Quality(), "By default Quality as 1 is not displayed ");

		computer.CartButton();
		computer.CartText();
		Thread.sleep(5000);
		Reporter.log("Add to cart button should be available", true);
		Assert.assertTrue(computer.CartText(), "Add to cart button should not be available ");

//		computer.PopUpMessage();
//		Thread.sleep(5000);
//		Reporter.log("The product has been added to your shopping cart popup message should be displayed.", true);
//		Assert.assertTrue(computer.PopUpMessage(), "The product has not been added to your shopping cart popup message should be displayed.");

		computer.shoppinglink();
		computer.shoppingText();
		Reporter.log("Clicked on shopping cart link", true);
		Assert.assertTrue(computer.shoppingText(), "Not Clicked on shopping cart link ");

		computer.CheckBox();
		Thread.sleep(5000);
		Reporter.log("Clicked on terms check box", true);

		computer.CheckoutButton();
		computer.CheckoutText();
		Thread.sleep(5000);
		Reporter.log("Billing Address page is displayed ", true);
		Assert.assertTrue(computer.CheckoutText(), " Billing Address page is not displayed");

		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.isBillingAddressDisplayed();
		Reporter.log("Billing Address page is displayed ", true);
		Assert.assertTrue(checkout.isBillingAddressDisplayed(), " Billing Address page is not displayed");

		checkout.BillingDropdown();
		checkout.EnterFirstNameInBilling("Preeti");
		checkout.EnterLastNameInBilling("shabadi");
		checkout.EnterEmailIdInBilling("lalipreeti9@gmail.com");
		checkout.EnterCompanyNameInBilling("Test Yantra");
		checkout.CountryDropdownInBilling();
		checkout.EnterCityNameInBilling("Bangalore");
		checkout.EnterAddress1InBilling("#51 Preeti s Wardnumber-01 ilkal");
		checkout.EnterZipCodeInBilling("587125");
		checkout.EnterMobileNumberInBilling("9019139736");
		checkout.ClickOnContinueInBillingAddress();

		checkout.isCheckOutPageSuccesful();
		Reporter.log("Billing Address is successful ", true);
		Assert.assertTrue(checkout.isCheckOutPageSuccesful(), " Billing Address page is not displayed");

		checkout.isContinueButtonDisplayedInShipping();
		Reporter.log("Continue Button Displayed In Shipping is displayed ", true);
		Assert.assertTrue(checkout.isContinueButtonDisplayedInShipping(), " Billing Address page is not displayed");
		checkout.shippingDropdown();
		checkout.CountryDropDownInShippingAddress();
		checkout.EnterCityNameInShippingAddress("Bangalore");
		checkout.EnterAddress1InShippingAddress("#51 Preeti s Wardnumber-01 ilkal");
		checkout.EnterZipCodeInShippingAddress("587125");
		checkout.EnterMobileNumberInShippingAddress("9019139736");

		checkout.ClickOnContinueInShippingAddress();
		Reporter.log("Continue Button Displayed In Shipping is displayed ", true);
		Thread.sleep(5000);

		checkout.shippingMethod();
		checkout.selectShippingMethod();
		Reporter.log("Selected shipping method asCash on delivery ", true);
		Assert.assertTrue(checkout.selectShippingMethod(), " Not selected shipping method asCash on delivery");

		checkout.ground();
		checkout.selectground();
		Reporter.log("Selected shipping method as ground ", true);
		Assert.assertTrue(checkout.selectShippingMethod(), " Not selected shipping method as ground");

		checkout.shippingMethodContinue();
		checkout.clickShippingMethodContinue();
		Reporter.log("Payment Method page is displayed ", true);
		Assert.assertTrue(checkout.clickShippingMethodContinue(), "Payment Method page is not displayed ");

		checkout.isPaymentMethodDisplayed();
		Reporter.log("Payment Method page is displayed successfully ", true);
		Assert.assertTrue(checkout.isPaymentMethodDisplayed(), "Payment Method page is not displayed successfully ");
		
//		checkout.isBackButtonDisplayedInPaymentMethod();
//		Reporter.log("Back Button In Payment Method is displayed successfully ", true);
//		Assert.assertTrue(checkout.isBackButtonDisplayedInPaymentMethod(), "Back Button In Payment Method is not displayed successfully ");
		
		checkout.isContinueButtonDisplayedInPaymentMethod();
		Reporter.log("Continue Button is Displayed In Payment Method ", true);
		Assert.assertTrue(checkout.isContinueButtonDisplayedInPaymentMethod(),
				"Continue Button is not displayed In Payment Method ");
		
		checkout.ClickOnCheckMoneyOrder();
		checkout.ClickOnContinueInPaymentMethod();

		checkout.isPaymentInformationDisplayed();
		Reporter.log("Payment information page is displayed successfully ", true);
		Assert.assertTrue(checkout.isPaymentInformationDisplayed(),
				"Payment information page is not displayed successfully ");
		
//		checkout.isBackButtonDisplayedInPaymentInformation();
//		Reporter.log("Back Button In Payment Information is displayed successfully ", true);
//		Assert.assertTrue(checkout.isBackButtonDisplayedInPaymentInformation(), "Back Button In Payment Information is not displayed successfully ");


		checkout.isContinueButtonDisplayedInPaymentInformation();
		Reporter.log("Continue button in payment information page is displayed successfully ", true);
		Assert.assertTrue(checkout.isContinueButtonDisplayedInPaymentInformation(),
				"Continue button in payment information page is not displayed successfully ");
		Thread.sleep(5000);

		checkout.ClickOnContinueInPaymentInformation();

		checkout.isConfirmOrderDisplayed();
		Reporter.log("Confirm order  page is displayed successfully ", true);
		Assert.assertTrue(checkout.isConfirmOrderDisplayed(), "Confirm order  page is not displayed successfully ");

//		checkout.isBackButtonDisplayedInConfirmOrder();
//		Reporter.log("Back Button In confirm order is displayed successfully ", true);
//		Assert.assertTrue(checkout.isBackButtonDisplayedInConfirmOrder(), "Back Button In confirm order is displayed successfully ");

		checkout.isConfirmButtonDisplayedInConfirmOrder();
		Reporter.log("Confirm button is displayed successfully ", true);
		Assert.assertTrue(checkout.isConfirmButtonDisplayedInConfirmOrder(),
				"Confirm button is not displayed successfully ");

		checkout.ClickOnConfirmInConfirmOrder();

	}
}
