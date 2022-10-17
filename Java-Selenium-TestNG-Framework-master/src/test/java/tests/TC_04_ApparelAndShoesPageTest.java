package tests;
	
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.ApparelAndShoesPage;
import pages.BasePage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage1;
	
	public class TC_04_ApparelAndShoesPageTest extends BasePage{
		@Test()
		public void clickApparelAndShoes() throws InterruptedException {
			LoginPage1 login=new LoginPage1(driver);
			login.clickOnLogin();
			Reporter.log("Clicking on Login Link", true);
			
			login.typeEmail("pinkypriya@123gmail.com");
			Reporter.log("Entering valid emailId in Email textfield", true);
			
			login.typePassword("PinkyPriya@123");
			Reporter.log("Entering valid password in Password textfield", true);
			
			login.Loginbutton();
			Reporter.log("Clicking on Login button", true);
			
			HomePage home=new HomePage(driver);
			home.clickApparelAndShoes();
			
			ApparelAndShoesPage apparelAndShoes = new ApparelAndShoesPage(driver);
			apparelAndShoes.clickApparelAndShoes();
			Reporter.log("Clicking on apparelAndShoes menu", true);
			Assert.assertTrue(apparelAndShoes.apparelAndShoesText(), "not clicking on apparelAndShoes menu");
			
			apparelAndShoes.selectSort();
			Reporter.log("Clicking on sort option", true);
			Assert.assertTrue(apparelAndShoes.sortposition(), "not sorting ");
			
			apparelAndShoes.selectDisplay();
			Reporter.log("Clicking on display option", true);
			Assert.assertTrue(apparelAndShoes.displayeight(), "not dispalaying the options");
			
			apparelAndShoes.selectViewAs();
			Reporter.log("Clicking on view as dropdown", true);
			Assert.assertTrue(apparelAndShoes.viewgrid(), "not displaying the option");
			
			apparelAndShoes.selectProduct();
			Reporter.log("Clicking on product", true);
			
			apparelAndShoes.selectSize();
			Reporter.log("Clicking on size dropdown", true);
			Assert.assertTrue(apparelAndShoes.selectSmalll(), "not selecting the size ");
			
			apparelAndShoes.price();
			Reporter.log("price should be displayed", true);
			Assert.assertTrue(apparelAndShoes.price(), "price is not dispalyed ");
			
			apparelAndShoes.selectQty();
			Reporter.log("Qty should be displayed", true);
			Assert.assertTrue(apparelAndShoes.defaultQty(), "qty is not displayed");
			
			apparelAndShoes.addToCart();
			Reporter.log("Clicked on add to cart", true);
			Assert.assertTrue(apparelAndShoes.confirmationMsg(), "confirmation msg is not displayed");
			
			apparelAndShoes.shoppingCart();
			Reporter.log("Clicked on shopping cart", true);
			//Assert.assertTrue(apparelAndShoes.shoppingCart(), "shopping cart is not displayed");
			
			apparelAndShoes.checkBox();
			Reporter.log("Clicked on checkbox", true);
			Assert.assertTrue(apparelAndShoes.clickOnCheckBox(), "checkbox is not checked");
			
			apparelAndShoes.checkOut();
			Reporter.log("Clicked on checkOut", true);
			//Assert.assertTrue(apparelAndShoes.clickOnCheckOut(), "not clicked on checkOut");
			
			// clicking on new address in Billing Dropdown.
			CheckoutPage address = new CheckoutPage(driver);
			address.BillingDropdown();
			Reporter.log("clicking on billing adrress dropdown", true);

			address.EnterFirstNameInBilling("Priyanka");
			Reporter.log("entering 'FirstName' text", true);

			address.EnterLastNameInBilling("Malapur");
			Reporter.log("Entering 'Lastname' text", true);

			address.EnterEmailIdInBilling("pinkypriya@123gmail.com");
			Reporter.log("entering emailId", true);

			address.EnterCompanyNameInBilling("TestYantra");
			Reporter.log("Entering company dropdown", true);

			address.CountryDropdownInBilling();
			Reporter.log("select Country India dropdown", true);

			address.EnterCityNameInBilling("Bengaluru");
			Reporter.log("Entering Country name", true);

			address.EnterAddress1InBilling("Kattriguppe, Banashakari, Bangalore");
			Reporter.log("Entering Address1 ", true);

			address.EnterZipCodeInBilling("560085");
			Reporter.log("Entering Pincode", true);

			address.EnterMobileNumberInBilling("7019561257");
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
			address.EnterZipCodeInShippingAddress("560085");
			address.EnterMobileNumberInShippingAddress("7019561257");
			address.ClickOnContinueInShippingAddress();
			
			/*
			 * apparelAndShoes.shippingMethodContinue(); Reporter.log("click on continue",
			 * true); Assert.assertTrue(apparelAndShoes.clickShippingMethodContinue()
			 * ,"not clicked on continue"); Thread.sleep(2000);
			 */
			address.shippingMethod();
			Reporter.log("select shipping method", true);
			Assert.assertTrue(apparelAndShoes.selectShippingMethod(), "shipping method is not present");
			Thread.sleep(2000);
			
			address.ground();
			Reporter.log("select ground", true);
			Assert.assertTrue(apparelAndShoes.selectground(), "ground is not checked");
			
			address.shippingMethodContinue();
			Reporter.log("click on continue", true);
			Assert.assertTrue(apparelAndShoes.clickShippingMethodContinue(),"not clicked on continue");
			Thread.sleep(2000);
			
			address.ClickOnContinueInPaymentMethod();
			
			
			
//			apparelAndShoes.billingAddress();
//			Reporter.log("select billing Address", true);
//			Assert.assertTrue(apparelAndShoes.selectbillingAddress(), "billing address is not present");
//			Thread.sleep(5000);
//			
//			
//			apparelAndShoes.continueButton();
//			Reporter.log("clicked on continue", true);
//			Assert.assertTrue(apparelAndShoes.clickOnContinue(), "not clicked on continue");
//			Thread.sleep(2000);
//			
//			apparelAndShoes.shippingAddress();
//			Reporter.log("select shipping address", true);
//			Assert.assertTrue(apparelAndShoes.selectShippingAddress(),"shipping address is not present");
//			Thread.sleep(2000);
//						
//		apparelAndShoes.shippingContinue();
//			Reporter.log("click on continue", true);
//			Assert.assertTrue(apparelAndShoes.clickShippingContinue(),"not clicked on continue");
//			Thread.sleep(2000);
//			
//			apparelAndShoes.shippingMethod();
//			Reporter.log("select shipping method", true);
//			Assert.assertTrue(apparelAndShoes.selectShippingMethod(), "shipping method is not present");
//			Thread.sleep(2000);
//			
//			apparelAndShoes.ground();
//			Reporter.log("select ground", true);
//			Assert.assertTrue(apparelAndShoes.selectground(), "ground is not checked");
//			
//			apparelAndShoes.shippingMethodContinue();
//			Reporter.log("click on continue", true);
//			Assert.assertTrue(apparelAndShoes.clickShippingMethodContinue(),"not clicked on continue");
//			Thread.sleep(2000);
//			
//			apparelAndShoes.paymentMethod();
//			Reporter.log("select payment method", true);
//			Assert.assertTrue(apparelAndShoes.selectPaymentMethod(), "payment method is not present");
//			
//			apparelAndShoes.clickCashOnDelivery();
//			Reporter.log("click cash on delivery", true);
//			Assert.assertTrue(apparelAndShoes.clickCashOnDelivery(), "not clicked on cash on delivery");
//			
//			apparelAndShoes.paymentContinue();
//			Reporter.log("click on continue", true);
//			Assert.assertTrue(apparelAndShoes.clickPaymentContinue(),"not clicked on continue");
//			Thread.sleep(2000);
//			
//			apparelAndShoes.paymentInformation();
//			Reporter.log("select payment information", true);
//			Assert.assertTrue(apparelAndShoes.selectPaymentInformation(), "not selecting payment information");
//			Thread.sleep(2000);
//			
//			apparelAndShoes.paymentInformationContinue();
//			Reporter.log("click on continue", true);
//			Assert.assertTrue(apparelAndShoes.clickPaymentInformationContinue(), "not clicked on continue");
//			Thread.sleep(2000);
//			
			//apparelAndShoes.confirmOrder();
			//Reporter.log("select confirm order", true);
			
			
			
		}

		

	}


