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
	public void navigateToCameraPage() {
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
		Assert.assertTrue(electronics.clickCellPhonesIcon());

		// Clicking on SmartPhoneLink.
		electronics.clickSmartphoneLink();
		Reporter.log("clicking on Smartphonelink", true);

		// verifying the Quantity of SmartPhone.
		electronics.verifySmartphoneQuantity();
		Reporter.log("verifyinig the default quantity as 1", true);

		// Verify click on AddtoCart Button.
		electronics.clickAddtoCartButton();
		// Reporter.log("clicking on AddToCart button", true);

	}

}
