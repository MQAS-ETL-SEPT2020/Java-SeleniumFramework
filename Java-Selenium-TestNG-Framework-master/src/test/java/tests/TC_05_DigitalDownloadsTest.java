package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.CheckoutPage;
import pages.DigitalDownloadsPage;
import pages.HomePage;
import pages.LoginPage1;
import pages.ShoppingCartPage;
import pages.ThirdAlbumPage;

public class TC_05_DigitalDownloadsTest extends BasePage {
	// Step-1:Open the Application URL
//    
//	TC_05_DigitalDownloadsTest(String applicationUrl) {
//		super(applicationUrl);
//		// TODO Auto-generated constructor stub
//	}

	@Test(priority = 1)
	public void navigateToHomePage() {
//		String applicationUrl="https://demowebshop.tricentis.com/";
//		System.out.println("Iam in TC_05 "+ applicationUrl);
//		TC_05_DigitalDownloadsTest navigate=new TC_05_DigitalDownloadsTest(applicationUrl);
//		
		LoginPage1 login = new LoginPage1(driver);
		// Step-2:GIVEN URL
		login.clickOnLogin();
		Reporter.log("Clicking on Login Link", true);
		// Assert.assertTrue(login.clickOnLogin(), "Not clicking on login link");

		login.typeEmail("meghadevaraja1998@gmail.com");
		Reporter.log("Entering valid emailId in Email textfield", true);
		// Assert.assertTrue(login.typeEmail(), "Not Entering valid emailId in Email
		// textfield");

		login.typePassword("Megha@123");
		Reporter.log("Entering valid password in password textfield", true);
		// Assert.assertTrue(login.typePassword(), "Not Entering valid password in
		// password textfield");

		login.Loginbutton();
		Reporter.log("Clicking on Login button", true);
	}
	// Assert.assertTrue(login.clickOnLogin(), "Not clicking on login button");

	@Test(priority = 2)
	public void navigateToDigitalDownloadsPage() {
		HomePage home = new HomePage(driver);
		home.clickDigitalDownloads();
		Reporter.log("Clicking on DIGITAL DOWNLOADS button", true);
	}

	@Test(priority = 3)
	public void navigateToThirdAlbumPage() {
		DigitalDownloadsPage digitaldownloads = new DigitalDownloadsPage(driver);
//		Reporter.log("DIGITAL DOWNLOADS page is  displayed", true);
		Assert.assertTrue(digitaldownloads.isDigitalDownloadsPageSuccessful(), "Not dispalying DIGITAL DOWNLOADS page");

		Reporter.log("By default Sortby displaying Position Option", true);
		Assert.assertTrue(digitaldownloads.SortBy(), "Not displaying Position option");

		Reporter.log("By default Display per page displaying 8 Option", true);
		Assert.assertTrue(digitaldownloads.DisplayPerPage(), "Not displaying 8 option");

		Reporter.log("By default Viewas displaying Grid Option", true);
		Assert.assertTrue(digitaldownloads.ViewAs(), "Not displaying Grid option");

		digitaldownloads.clickOnAlbumLink();
	}

	@Test(priority = 4)
	public void navigateToShoppingcartPage() {
		ThirdAlbumPage thirdalbum = new ThirdAlbumPage(driver);
		
		Reporter.log("3rd image page is displayed", true);
		Assert.assertTrue(thirdalbum.isThirdAlbumPageSuccessful(), "Not displaying 3rd image page");

		Reporter.log("Price is displayed", true);
		Assert.assertTrue(thirdalbum.price(), "Not displaying Price");

		Reporter.log("Quantity is displayed", true);
		Assert.assertTrue(thirdalbum.defaultQuantity(), " Quantity is not displayed");

		Reporter.log("By default Quantity is displayed as 1", true);
		Assert.assertTrue(thirdalbum.defaultQuantity(), "Not displaying Quantity as 1");

		thirdalbum.clickOnAddToCart();
		Reporter.log("Clicking on Add to cart button", true);

		Reporter.log("Displaying the popup message The product has been added to your shopping cart", true);
		Assert.assertTrue(thirdalbum.displayConfirmationMessage(),
				"Not displaying popup message The product has been added to your shopping cart");
	}

	@Test(priority = 5)
	public void navigateToCheckoutPage() {
		ShoppingCartPage shoppingcart = new ShoppingCartPage(driver);
		shoppingcart.clickOnShoppingCartLink();
		Reporter.log("Displaying Shopping cart page", true);
		Assert.assertTrue(shoppingcart.isShoppingCartPageSuccessful(), "Not displaying Shopping cart page");

		shoppingcart.clickOnTermsOfService();
		Reporter.log("Clicking on TermsAndConditions checkbox", true);
		Assert.assertTrue(shoppingcart.termsOfServiceSelected(), "Not clicking on TermsAndConditions checkbox");

		shoppingcart.clickOnCheckOut();
		Reporter.log("Clicking on CheckOut checkbox", true);
	}

	@Test(priority = 6)
	public void navigateToThankYouPage() {

		CheckoutPage checkout = new CheckoutPage(driver);
		Reporter.log("Displaying Check Out page", true);
		Assert.assertTrue(checkout.isCheckOutPageSuccesful(), "Not displaying Check out page");

		Reporter.log("Selecting New Address", true);
		Assert.assertTrue(checkout.selectNewAddress(), "Not selecting new address");

		Reporter.log("Selecting Country as India ", true);
		Assert.assertTrue(checkout.selectNewAddress(), "Not selecting Country as India");

		checkout.cityName("Bengaluru");
		Reporter.log("Entering cityname in City textfield", true);
           
		checkout.address1("Katreguppe,Banashankari");
		Reporter.log("Entering address in Address1 textfield", true);
  
		checkout.zip("560085");
		Reporter.log("Entering zipcode in Zip textfield", true);
		
		checkout.phoneNumber("9874563210");
		Reporter.log("Entering phone number in Phone number textfield", true);


	}
}
