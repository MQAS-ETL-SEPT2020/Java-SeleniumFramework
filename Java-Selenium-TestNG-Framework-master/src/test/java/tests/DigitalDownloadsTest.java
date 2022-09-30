package tests;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.DigitalDownloadsPage;
import pages.HomePage;
import pages.ImagePage;
import pages.ShoppingCartPage;

public class DigitalDownloadsTest extends BasePage {
	@Test
	public void navigateToCheckOut() {

		HomePage home = new HomePage(driver);
		home.clickDigitalDownloads();
		//logger.log(LogStatus.INFO, "Clicking on DIGITAL DOWNLOADS");

		DigitalDownloadsPage digitaldownloads=new DigitalDownloadsPage(driver);
		digitaldownloads.album1();
		//logger.log(LogStatus.INFO, "Clicking on 3rd Album");
		
		ImagePage cart=new ImagePage(driver);
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