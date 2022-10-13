package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BooksPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage1;

public class TC_01_BooksPageTest extends BasePage {

	@Test
	public void Books() {

		LoginPage1 login = new LoginPage1(driver);
		login.clickOnLogin();
		Reporter.log("Clicking on Login Link", true);
		// Assert.assertTrue(login.clickOnLogin(), "Not clicking on login link");

		login.typeEmail("tejaswinirty@gmail.com");
		Reporter.log("Entering valid emailId in Email textfield", true);

		login.typePassword("Tejupooja123");
		Reporter.log("Entering valid password in password textfield", true);

		login.Loginbutton();
		Reporter.log("Clicking on Login button", true);

		HomePage home = new HomePage(driver);
		home.clickBooks();

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
		// Assert.assertTrue(books.computingandInternetbook(), "not clicking on
		// computing and internet");

		books.price();
		Reporter.log("price should be displayed", true);
		Assert.assertTrue(books.price(), "price is not displayed");

		books.quantity();
		Reporter.log("by default quantity is 1", true);
		Assert.assertTrue(books.quantity(), "by default quantity 1 is not displayed");

		books.clickonAddToCart();
		Reporter.log("adding book to cart", true);
		// Assert.assertTrue(books.confirmMessage(), "not adding book to cart");

		books.Shoppingcart();
		Reporter.log("clicking on shopping cart link", true);
		// Assert.assertTrue(books.shoppingcartlink(), "not clicking on shopping cart
		// link");

		books.termsconditions();
		Reporter.log("clicking on terms and conditions", true);
		Assert.assertTrue(books.checkbox(), "not clicking on checkbox");

		books.checkoutpage();
		Reporter.log("clicking on checkout", true);
		// Assert.assertTrue(books.Checkout(), "not clicking on checkout");

//		CheckoutPage checkout = new CheckoutPage(driver);
//		checkout.EnterFirstName("Tejaswini");
//		checkout.EnterLastName("R");
//		checkout.EnterEmailId("tejaswinirty@gmail.com");
//		checkout.EnterCompanyName("Bengaluru");
//		checkout.EnterAddress1("RT Nagar Post office");
//		checkout.EnterZipCode("560032");
//		checkout.EnterMobileNumber("9864534781");
	}
}