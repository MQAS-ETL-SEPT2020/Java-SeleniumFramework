package tests;

import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.BasePage;
import pages.ElementsPage;
import pages.HomePage;
import pages.ShoppingCartPage;

public class DigitalDownloadsTest extends BasePage {
	@Test
	public void navigateToCheckOut() {

		HomePage home = new HomePage(driver);
		home.clickDigitalDownloads();
		//logger.log(LogStatus.INFO, "Clicking on DIGITAL DOWNLOADS");

		ElementsPage element = new  ElementsPage(driver);
		element.album1();
		//logger.log(LogStatus.INFO, "Clicking on 3rd Album");
		
		AddToCartPage cart=new AddToCartPage(driver);
		cart.addToCart();
		//logger.log(LogStatus.INFO, "Clicking on Add to cart");
		
		ShoppingCartPage shopping=new ShoppingCartPage(driver);
		shopping.shoppingCart();
		//logger.log(LogStatus.INFO, "Clicking on Shopping cart");

		shopping.termsAndConditions();
	   //logger.log(LogStatus.INFO, "Clicking on Terms and Conditions");

		shopping.checkOut();
		//logger.log(LogStatus.INFO, "Clicking on Checkout");

	}
}