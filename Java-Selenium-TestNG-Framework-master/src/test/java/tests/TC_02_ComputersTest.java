package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BasePage;
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

		// WHEN I click on "COMPUTERS" Menu.
		home.clickComputers();
		ComputersPage computer = new ComputersPage(driver);

		// VERIFY "Demo Web Shop" page with user "mail Id" should displayed,
		computer.GmailVerification();
		Reporter.log("By default registered email id is displayed", true);
		Assert.assertTrue(computer.GmailVerification(), "not clicked on Computers");

		// WHEN I click on "Desktop" link
		computer.desktop();
		computer.DesktopText();
		Reporter.log("Clicked on desktops ", true);
		Assert.assertTrue(computer.DesktopText(), "not clicking on desktops");

		// VERIFY "Desktop" page should be displayed by default "Position" as 'Sort by'
		// drop down,
		computer.position();
		computer.SortPosition();
		Reporter.log("By default position is selected", true);
		Assert.assertTrue(computer.SortPosition(), "By default position is not selected");

		// VERIFY by default "8" value should be in 'Display' drop down,
		computer.displaypage();
		computer.DisplayPerPage();
		Reporter.log("By default DisplayPerPage 8 is selected", true);
		Assert.assertTrue(computer.DisplayPerPage(), "By default DisplayPerPage 8 is not selected");

		// VERIFY by default "Grid" value should be in 'View as' drop down.
		computer.viewasdropdown();
		computer.ViewAs();
		Reporter.log("By default viewasdropdown grid is selected", true);
		Assert.assertTrue(computer.ViewAs(), "By default viewasdropdown Grid is not selected");

		// WHEN I click on "Build your own computer" link.
		computer.button();
		Thread.sleep(5000);
		computer.AddtocartText();
		Reporter.log("By default Clicked on cart button", true);
		Assert.assertTrue(computer.AddtocartText(), "By default not clicked on cart ");

		// VERIFY that "Build your own computer" page should be displayed with price as
		// "1800.00",
		computer.PriceText();
		Reporter.log("By default Price as 1800.00 is displayed", true);
		Assert.assertTrue(computer.PriceText(), "By default Price as 1800.00 is not displayed ");

		// VERIFY by default "Processor" as Medium[15.00]
		computer.Processor();
		Reporter.log("By default Medium[15.00] processor is selected", true);
		Assert.assertTrue(computer.PriceText(), "By default Medium[15.00] processor is selected ");

		// VERIFY by default "RAM" as "2GB" in RAM redio button.
		computer.Ram();
		Reporter.log("By default 2GB RAM is selected", true);
		Assert.assertTrue(computer.Ram(), "By default 2GB RAM is selected ");

		// VERIFY by default "Software" as "Microsoft Office [+50.00]
		computer.Software();
		computer.selectSoftware();
		Reporter.log("Selected the Image viever as software", true);
		Assert.assertTrue(computer.selectSoftware(), "Not selected the Image viever as software ");

		//VERIFY "HDD" 320GB redio button Should be selected.
		computer.hdd();
		Reporter.log("By default HDD 320GB is selected", true);
		Assert.assertTrue(computer.hdd(), "By default HDD 320GB is not selected ");

		//VERIFY by default Qty as "1"
		computer.Quality();
		Reporter.log("By default Quality as 1 is displayed", true);
		Assert.assertTrue(computer.Quality(), "By default Quality as 1 is not displayed ");
		
		//VERIFY "Add to cart" button should be available.
		computer.CartButton();
		computer.CartText();
		Thread.sleep(5000);
		Reporter.log("Add to cart button should be available", true);
		Assert.assertTrue(computer.CartText(), "Add to cart button should not be available ");

		//WHEN I click on "Add to cart" button.
//		computer.PopUpMessage();
//		Thread.sleep(5000);
//		Reporter.log("The product has been added to your shopping cart popup message should be displayed.", true);
//		Assert.assertTrue(computer.PopUpMessage(), "The product has not been added to your shopping cart popup message should be displayed.");

		//WHEN I click "Shopping cart" link. 
		computer.shoppinglink();
		computer.shoppingText();
		Reporter.log("Clicked on shopping cart link", true);
		Assert.assertTrue(computer.shoppingText(), "Not Clicked on shopping cart link ");

		//VERIFY that "Shopping cart" page with the "Desktops" product should be displayed
		computer.productimage();
		Reporter.log("Desktops product should be displayed", true);
		Assert.assertTrue(computer.DefaultQuality(), "Desktops product should be displayed ");
		
		//with the default Qty as "1"
		computer.DefaultQuality();
		Reporter.log(" default Qty as 1", true);
		Assert.assertTrue(computer.DefaultQuality(), "default Qty as 1 ");
		
//		computer.CheckBox();
//		computer.CheckboxText();
//		Thread.sleep(5000);
//		Reporter.log("Clicked on terms check box", true);
//		Assert.assertTrue(computer.CheckboxText(), "Not Clicked on terms check box ");
//
//		computer.CheckoutButton();
//		computer.CheckoutText();
//		Thread.sleep(5000);
//		Reporter.log("Billing Address page is displayed ", true);
//		Assert.assertTrue(computer.CheckoutText(), " Billing Address page is not displayed");
//
//		computer.AddressBook();
//		Reporter.log("By default billing address is displayed ", true);
//		Assert.assertTrue(computer.AddressBook(), " By default billing address page is not displayed");
//
//		computer.continueInBilling();
//		computer.ShippingText();
//		Thread.sleep(5000);
//		Reporter.log("Shipping page is displayed", true);
//		Assert.assertTrue(computer.ShippingText(), " Shipping page is not displayed ");
//
//		computer.clickOnContinueInShipping();
//		computer.ShippingInGround();
//		Reporter.log("By default shipping method as Ground is selected", true);
//		Assert.assertTrue(computer.ShippingText(), " Shipping page is not displayed ");
//
//		computer.continuuButtonInshippingMethod();
//		computer.PaymentMethodPage();
//		computer.CashOnDeliveryButton();
//		Reporter.log("By default Cash on delivery redio button is selected", true);
//		Assert.assertTrue(computer.CashOnDeliveryButton(), " By default Cash on delivery redio button not selected ");
//
//		computer.continuuButtonInPaymentMethod();
//		computer.paymentinformation();
//		Thread.sleep(5000);
//		Reporter.log("payment information page is displayed", true);
//		Assert.assertTrue(computer.paymentinformation(), " payment information page is not displayed");
//
//		computer.message();
//		Reporter.log("payment conformtion message  is displayed", true);
//		Assert.assertTrue(computer.message(), " payment conformtion message is not displayed");

//		computer.ContinueButtonInPaymentInformation();
//		computer.confirmPage();
//		Reporter.log("payment conformtion page  is displayed", true);
//		Assert.assertTrue(computer.confirmPage(), " payment conformtion page is not displayed");

	}
}
