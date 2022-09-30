package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.BasePage;
import pages.HomePage;
import pages.JewelShoppingPage;
import pages.NecklacePage;
import pages.ShoppingCartPage;
import pages.JewelleryPage;

public class JewelleryPageTest extends BasePage {
	@Test
	public void VerifyJewelPage() {
		JewelleryPage jewel = new JewelleryPage(driver);
		jewel.ClickOnjewel();
		// logger.log(LogStatus.INFO, "clicking on jewels");
		jewel.SortPosition();
		jewel.ViewPage();
		jewel.ClickOnImage();

		/*
		 * AddToCartPage Add=new AddToCartPage(driver); Add.MaterialType(); Add.size();
		 * Add.shape(); Add.Cart();
		 */

		NecklacePage necklace = new NecklacePage(driver);
		necklace.Addproduct();
		necklace.Addtowishlist();

		JewelShoppingPage shop = new JewelShoppingPage(driver);
		shop.ClickOnshoppingcart();
		shop.checkTermsandcondtions();
		shop.Checkout();
	}

}
