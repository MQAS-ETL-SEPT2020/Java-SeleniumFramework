package tests;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.BooksPage;
import pages.ClickonAddToCart;
import pages.HomePage;

public class BooksPageTest extends BasePage {

	@Test
	public void AddbooksToCart() {
		HomePage homePage = new HomePage(driver);
		homePage.clickBooks();
		// logger.log(LogStatus.INFO, "Clicking 'Electronics'");

		BooksPage Books = new BooksPage(driver);
		Books.computingInternet();
		// logger.log(LogStatus.INFO, "Clicking on Books");

		ClickonAddToCart addToCart = new ClickonAddToCart(driver);
		addToCart.AddToCart();
		// logger.log(LogStatus.INFO, "Clicking on Computing and Internet");

		HomePage homePage1 = new HomePage(driver);
		homePage1.clickShoppingCartLink();
		// logger.log(LogStatus.INFO, "Clicking on Shopping cart");
	}
}
