package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BasePage;
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

		// Entering emailId
		loginPage.typeEmail("achyutkembhavi7@gmail.com");
		Reporter.log("Entering emailId", true);

		// Entering password
		loginPage.typePassword("131099");
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

		// Clicking on ShoppingCart Link
		electronics.ShoppingcartLink();
		Reporter.log("selecting 'India' dropdown", true);

		// Entering Postal address.
		//electronics.PostalCode();
		//Reporter.log("Entering postal number", true);

		// Checking Terms and Conditions CheckBox.
		electronics.TermsandServices();
		Reporter.log("Checked Terms and Conditions checkbox", true);

		// Clicking on Check Out button.
		electronics.CheckoutButton();
		Reporter.log("Clicking on Checkout button", true);
		
		//

	}

}
