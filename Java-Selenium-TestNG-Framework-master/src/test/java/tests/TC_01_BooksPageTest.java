package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BooksPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.LoginPage1;

public class TC_01_BooksPageTest extends BasePage {

	@Test
	public void Books() throws InterruptedException {

		LoginPage1 login = new LoginPage1(driver);
		login.clickOnLogin();
		Reporter.log("Clicking on Login Link", true);
		Assert.assertTrue(login.verifyLoginPage(), "not going to Login page");
		Reporter.log("Login Page is displayed", true);

		login.typeEmail("tejaswinirty@gmail.com");
		Reporter.log("Entering valid emailId in Email textfield", true);

		login.typePassword("Tejupooja123");
		Reporter.log("Entering valid password in password textfield", true);

		login.Loginbutton();
		Reporter.log("Clicking on Login button", true);
        Assert.assertTrue(login.verifyHomePage(), "Not displlaying user EmailId");
		
		HomePage home = new HomePage(driver);
		home.getTitle();
		Reporter.log("verifying title of the page", true);
		
		home.clickBooks();
		Reporter.log("Books page is displayed",true);

		BooksPage books = new BooksPage(driver);
		books.ClickBooks();
		Reporter.log("clicking on books menu", true);
		Assert.assertTrue(books.booksText(), "not clicking on books menu");

		Reporter.log("by default grid option is selected in viewas", true);
		Assert.assertTrue(books.gridview(), "by default grid option is not selected in view as");

		Reporter.log("Display 8 is selected in display", true);
		Assert.assertTrue(books.DisplayPage(), "Display 8 is not selected in display");

		Reporter.log("by default Position option is selected in sortby", true);
		Assert.assertTrue(books.SortPosition(), "by default Position option is not selected in sortby");

		books.clickonbook();
		Reporter.log("clicking on computing and Internet book", true);
	//	Assert.assertTrue(books.computingandInternetbook(), "not clicking on computing and internet");

		books.price();
		Reporter.log("price should be displayed", true);
		Assert.assertTrue(books.price(), "price is not displayed");

		books.quantity();
		Reporter.log("by default quantity is 1", true);
		Assert.assertTrue(books.quantity(), "by default quantity 1 is not displayed");

		books.clickonAddToCart();
		Reporter.log("adding book to cart", true);
		Assert.assertTrue(books.confirmMessage(), "not adding book to cart");

		books.Shoppingcart();
		Reporter.log("clicking on shopping cart link", true);
		Assert.assertTrue(books.shoppingcartlink(), "not clicking on shopping cart link");

		books.termsconditions();
		Reporter.log("clicking on terms and conditions", true);
		Assert.assertTrue(books.checkbox(), "not clicking on checkbox");

		books.checkoutpage();
		Reporter.log("clicking on checkout", true);

		Thread.sleep(2000);
		CheckoutPage checkout = new CheckoutPage(driver);
		Reporter.log("Billing adress page is displayed", true);
		Assert.assertTrue(checkout.isBillingAddressDisplayed(), "billing adress is not displayed");
		checkout.BillingDropdown();
		checkout.EnterCityNameInBilling("Bengaluru");
		Reporter.log("Entering city name in city textfield", true);
		checkout.CountryDropdownInBilling();
		checkout.EnterCompanyNameInBilling("Test Yantra");
		Reporter.log("Entering company name in company textfield");
		checkout.EnterAddress1InBilling("RT Nagar Post office");
		Reporter.log("entering address in address text field");
		checkout.EnterZipCodeInBilling("560032");
		Reporter.log("entering zipcode in zipcode text field");
		checkout.EnterMobileNumberInBilling("9864534781");
		Reporter.log("entering mobile number in mobile number text field");
		Thread.sleep(2000);
		checkout.ClickOnContinueInBillingAddress();

		Thread.sleep(5000);
		checkout.ShippingAddressDisplayed();
		Reporter.log("ShippingAddress is displayed", true);
		Assert.assertTrue(checkout.ShippingAddressDisplayed(), "shipping adress not displayed");
		checkout.shippingDropdown();
		checkout.EnterCityNameInShippingAddress("Bengaluru");
		Reporter.log("Entering city name in city textfield", true);
		checkout.CountryDropDownInShippingAddress();
		checkout.EnterAddress1InShippingAddress("RT Nagar Post office");
		Reporter.log("entering address in address text field");
		checkout.EnterZipCodeInShippingAddress("560032");
		Reporter.log("entering zipcode in zipcode text field");
		checkout.EnterMobileNumberInShippingAddress("9864534781");
		Reporter.log("entering mobile number in mobile number text field");
		checkout.ClickOnContinueInShippingAddress();
		Thread.sleep(5000);

		Reporter.log("Shipping method is displayed", true);
		Assert.assertTrue(checkout.clickShippingMethodContinue(), "shipping method is not displayed");
		checkout.selectground();
		checkout.shippingMethodContinue();

		Assert.assertTrue(checkout.isPaymentMethodDisplayed(), "Payment Method is displayed");
		Assert.assertTrue(checkout.isContinueButtonDisplayedInPaymentMethod(),
				"Continue button is displayed in Payment Method");
		checkout.ClickOnCheckMoneyOrder();
		Reporter.log("Clicking on CheckMoney Order  radio button", true);
		checkout.ClickOnContinueInPaymentMethod();
		Reporter.log("Clicking on Continue button in Payment Method", true);

		Assert.assertTrue(checkout.isPaymentInformationDisplayed(), "Payment Information is displayed");
		Assert.assertTrue(checkout.isContinueButtonDisplayedInPaymentInformation(),
				"Continue button is displayed in Payment Information");

		checkout.ClickOnContinueInPaymentInformation();
		Reporter.log("Clicking on Continue button in Payment Information", true);

		Assert.assertTrue(checkout.isConfirmOrderDisplayed(), " Confirm Order is displayed");
		// Assert.assertTrue(checkout.isBackButtonDisplayedInConfirmOrder(), "Back
		// button is displayed in Confirm Order");
		Assert.assertTrue(checkout.isConfirmButtonDisplayedInConfirmOrder(),
				"Continue button is displayed in Confirm Order");

		checkout.ClickOnConfirmInConfirmOrder();
		Reporter.log("Clicking on Confirm button in Confirm Order", true);

		Assert.assertTrue(checkout.isThankYouPageDisplayed(), " Thank You Page is displayed");
		Assert.assertTrue(checkout.isConfirmationMessageDisplayedInThankYouPage(),
				"Confirmation Message is displayed in Confirm Order");
		Assert.assertTrue(checkout.isOrderNumberDisplayedInThankYouPage(),
				"Continue button is displayed in Confirm Order");
		Assert.assertTrue(checkout.isContinueButtonDisplayedInThankYouPage(),
				"Continue button is displayed in Payment Information");

		checkout.ClickOnContinueInThankYouPage();
		Reporter.log("Clicking on Confirm button in Confirm Order", true);

		Assert.assertTrue(checkout.isHomePageDisplayed(), "Home Page is displayed");
	}
}
