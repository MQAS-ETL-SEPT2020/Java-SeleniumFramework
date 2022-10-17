package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.CheckoutPage;
import pages.JewelShoppingPage;
import pages.JewelleryPage;
import pages.LoginPage1;
import pages.NecklacePage;

public class TC_06_JewelryPageText extends BasePage {
	@Test(priority = 1)
	public void VerifyJewelPage() throws InterruptedException {

		LoginPage1 login = new LoginPage1(driver);
		login.clickOnLogin();
		login.typeEmail("vanigowdas54@gmail.com");
		login.typePassword("Vani@7411");
		login.Loginbutton();

		JewelleryPage jewel = new JewelleryPage(driver);
		jewel.clickOnjewel();
		Reporter.log("clicking on jewelry", true);
		Assert.assertTrue(jewel.jewelText(), "not clicking on jewelText");

		Reporter.log("By default sortby position is selected", true);
		Assert.assertTrue(jewel.sortbyText(), "by default position is not selected");

		Reporter.log("By default Display 4 is selected", true);
		Assert.assertTrue(jewel.DisplayText(), "by default Display is not selected");

		Reporter.log("By default Viewas Grid is selected", true);
		Assert.assertTrue(jewel.ViewasText(), "by default Display is not selected");

		jewel.clickOnImage();
		Reporter.log("clicking on Black and white jewel");

		NecklacePage necklacejewel = new NecklacePage(driver);
		Reporter.log("Black and white jewel Page is displaying");
		Assert.assertTrue(necklacejewel.blackAndWhiteJewelText(), "not displaying Black&whiteText page");
    
		//necklacejewel.blackandwhitePrice();
		//Reporter.log("Black and White Diamond Heart Prdouct price is 130 ", true);
		//Assert.assertTrue(necklacejewel.blackandwhitePrice(),"Black and White Diamond Heart Product price 130 is not displaying");

		// necklacejewel.jewelQty();
		//Reporter.log("By default Black and White Diamond Heart Prdouct is 1", true);
		//Assert.assertTrue(necklacejewel.ProductQty(), "Black and White Diamond Heart Product Qty 1 is not displaying");
		

		necklacejewel.addjewel();
		Reporter.log("Product is added to shoppingcart page", true);
		// Assert.assertTrue(necklacejewel.addjewel(),"Black and White Diamond Heart Product is not added to shoppingcart page");

		JewelShoppingPage cartpage = new JewelShoppingPage(driver);

		cartpage.shoppingcartlink();
		Reporter.log("clicking on shoppingcart Link", true);
		Assert.assertTrue(cartpage.shoppingcartPage(), "not clicking on shoppingcart");

		cartpage.productCountry();
		Reporter.log("selecting India country", true);
		Assert.assertTrue(cartpage.countryProduct(), "not selecting on India");

		cartpage.zipcode();
		Reporter.log("Entering pincode", true);
		Assert.assertTrue(cartpage.pincodenumber(), "not selecting on India");

		cartpage.termscheckbox();
		Reporter.log("Clicking on checkoutbutton", true);

		cartpage.checkOut();
		Reporter.log("Checkoutpage is displaying", true);
		Assert.assertTrue(cartpage.checkoutpage(), "not displaying checkoutpage");

		CheckoutPage address = new CheckoutPage(driver);
		address.BillingDropdown();
		Reporter.log("clicking on BillingAddress dropdown", true);

		//address.ClickOnContinueInBillingAddress();
		//Reporter.log("Entering BillingAddress dropdown", true);

		address.EnterFirstNameInBilling("Vanishree");
		Reporter.log("Entering Firstname", true);
		Thread.sleep(2000);

		address.EnterLastNameInBilling("gowda");
		Reporter.log("Entering Lastname", true);
		Thread.sleep(2000);

		address.EnterEmailIdInBilling("vanigowdas54@gmail.com");
		Reporter.log("Entering Emailid", true);
		Thread.sleep(2000);

		address.EnterCompanyNameInBilling("Malabar");
		Reporter.log("Entering company dropdown", true);
		Thread.sleep(2000);

		address.CountryDropdownInBilling();
		Reporter.log("select Country India dropdown", true);
		Thread.sleep(2000);

		address.EnterCityNameInBilling("Bengaluru");
		Reporter.log("Entering Country name", true);
		Thread.sleep(2000);

		address.EnterAddress1InBilling("#62 jai maruti nagar nandini layout");
		Reporter.log("Entering Address1 ", true);
		Thread.sleep(2000);

		address.EnterZipCodeInBilling("560096");
		Reporter.log("Entering Pincode", true);
		Thread.sleep(2000);

		address.EnterMobileNumberInBilling("7411313729");
		Reporter.log("Entering Mobile number", true);
		Thread.sleep(2000);

		address.ClickOnContinueInBillingAddress();
		Reporter.log("clicking on continue button", true);
		Thread.sleep(5000);

		address.ShippingAddressDisplayed();
		Reporter.log("verifying shippingaddress page is displayed", true);

		address.shippingDropdown();
		Reporter.log("clicking on Shipping address dropdown", true);

		address.CountryDropDownInShippingAddress();
		Reporter.log("clicking on shipping Address country drop down", true);

		address.EnterCityNameInShippingAddress("bengaluru");
		Reporter.log("Entering shipping Address city name", true);

		address.EnterAddress1InShippingAddress("nandini layout");
		Reporter.log("Entering shipping address", true);

		address.EnterZipCodeInShippingAddress("560096");
		Reporter.log("Entering shipping Address pincode", true);

		address.EnterMobileNumberInShippingAddress("7019561257");
		Reporter.log("Entering shipping Address Mobile number", true);

		address.ClickOnContinueInShippingAddress();
		Reporter.log("clicking on continue shipping Address", true);

		address.shippingMethod();
		Reporter.log("select shipping method", true);
		Assert.assertTrue(address.selectShippingMethod(), "shipping method is not present");
		Thread.sleep(2000);

		address.ground();
		Reporter.log("select ground", true);
		Assert.assertTrue(address.selectground(), "ground is not checked");

		address.shippingMethodContinue();
		Reporter.log("click on continue", true);
		Assert.assertTrue(address.isPaymentMethodDisplayed(), "not clicked on continue");
		Thread.sleep(2000);

		address.ClickOnCashOnDelivery();
		Reporter.log("clicking on cash on delivery", true);
		Assert.assertTrue(address.isContinueButtonDisplayedInPaymentMethod());

		//Reporter.log("Back button is displayed in Payment method", true);
		//Assert.assertTrue(address.isBackButtonDisplayedInPaymentMethod(), "not displaying back button");
		// Thread.sleep(2000);

		address.ClickOnContinueInPaymentMethod();
		Reporter.log("clicking on continue button in Payment method", true);
		Assert.assertTrue(address.isPaymentInformationDisplayed(), "Payment Information page is displayed");

		//address.isBackButtonDisplayedInPaymentInformation();
		// Reporter.log("clicking on continue button in Payment method", true);
		// Assert.assertTrue(address.isBackButtonDisplayedInPaymentInformation(),"Payment
		// Information page is displayed");

		Reporter.log("continue button is displayed in Payment method", true);
		Assert.assertTrue(address.isContinueButtonDisplayedInPaymentInformation(),
				"Payment Information page is not displayed");

		address.ClickOnContinueInPaymentInformation();
		Reporter.log("clicking on continue button in Payment method", true);
		Assert.assertTrue(address.isConfirmOrderDisplayed(), "confirm order page is displayed");

		Reporter.log("continue button is displayed in confirm order", true);
		Assert.assertTrue(address.isConfirmButtonDisplayedInConfirmOrder(),
				"continue button is not displayed in confirm oder page");

		address.isConfirmButtonDisplayedInConfirmOrder();
		Reporter.log("continue button is displayed in confirm order", true);
		Assert.assertTrue(address.isConfirmButtonDisplayedInConfirmOrder(),
				"continue button is not displayed in confirm oder page");

		Reporter.log("confirm button is displayed in confirm order", true);
		Assert.assertTrue(address.isConfirmButtonDisplayedInConfirmOrder(),
				"continue button is not displayed in confirm oder page");

		address.ClickOnConfirmInConfirmOrder();
		Reporter.log("Demo web shop home page is displayed");
		Assert.assertTrue(address.isThankYouPageDisplayed(), " Thank You Page is displayed");
		Assert.assertTrue(address.isConfirmationMessageDisplayedInThankYouPage(), "Confirmation Message is displayed in Confirm Order");
		Assert.assertTrue(address.isOrderNumberDisplayedInThankYouPage(),"Continue button is displayed in Confirm Order");
		Assert.assertTrue(address.isContinueButtonDisplayedInThankYouPage(),"Continue button is displayed in Payment Information");

		address.ClickOnContinueInThankYouPage();
		Reporter.log("Clicking on Confirm button in Confirm Order",true);

		Assert.assertTrue(address.isHomePageDisplayed(), "Home Page is displayed");
		

	}

}
