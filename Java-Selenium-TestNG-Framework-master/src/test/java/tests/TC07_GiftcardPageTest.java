package tests;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckoutPage1;
import pages.GiftcardPage;
import pages.LoginPage1;
import pages.VirtualGiftcard_ProductPage;




public class TC07_GiftcardPageTest extends BasePage  {
	@Test(priority=0)
	public void Login() throws InterruptedException {
		LoginPage1 page=new LoginPage1(driver);
		page.clickOnLogin();
		page.typeEmail("achyutkembhavi4@gmail.com");
		page.typePassword("131099");
		page.Loginbutton();

	}

	@Test(priority=1)
	public void giftcardsMenu() throws InterruptedException {
		GiftcardPage giftpage=new GiftcardPage(driver);
		giftpage.clickGiftcards(); //Clicking on Giftcards_Menu
		Reporter.log("Clicking on Giftcards Menu",true);
		Assert.assertTrue(giftpage.Giftcards_Text(),"Not clicking on Giftcards Menu");
		Reporter.log("Verifying the Postion option present in Sortby Dropdown",true);//Asserting postion option
		Assert.assertTrue(giftpage.DefaultPostion_option(),"Postion option is not present in Sortby Dropdown");
		Reporter.log("Verifying the 8 option present in Display per page Dropdown",true);//Asserting 8 option
		Assert.assertTrue(giftpage.Default8_option(),"8 option is not present in Display per page Dropdown");
		Reporter.log("Verifying the Grid option present in Viewas Dropdown",true);
		Assert.assertTrue(giftpage.DefaultGrid_option(),"Grid option is not present in Viewas Dropdown");
	}



	@Test(priority=2)
	public void VitualgiftcardProduct() throws InterruptedException {
		GiftcardPage giftpage=new GiftcardPage(driver);
		giftpage.ClickVitualGiftcardProduct();
		Reporter.log("Clicking on $5 vitual Giftcard",true);
		VirtualGiftcard_ProductPage productpage=new VirtualGiftcard_ProductPage(driver);
		productpage.Number();
		Reporter.log("Verifying Price as 5",true);
		Assert.assertTrue(productpage.Number(),"Price is not displayed as per ");//Verifying the 5.00 as price
		productpage.Qty_textfeild();
		Reporter.log("Verifying the qty textfeild as 1",true);
		Assert.assertTrue(productpage.Qty_textfeild(),"Qty as 1 in textfeild is not displayed");//Verifying the qty as 1
		productpage.Addtocart_text();
		Reporter.log("Verifying the Add to cart Button is displayed",true);
		Assert.assertTrue(productpage.Addtocart_text(),"Add to cart button is displayed");//Verifying Add to cart button is displayed
	}

	@Test(priority=3)
	public void Addtocart() throws InterruptedException {
		VirtualGiftcard_ProductPage productpage=new VirtualGiftcard_ProductPage(driver);
    	productpage.textfeild("Bhartha", "bharatakumar@gmail.com","his got the whole world in his hands");
		Reporter.log("Entering the data in all the texfeilds");
		productpage.Addtocart_Button();
		Reporter.log("Clicking on Addtocart button");
		Assert.assertTrue(productpage.Message_addedtocart(),"Not clicking on Addtocart");
	}
     
     @Test(priority=4)
     public void ClickShoppingcart() {
    	 VirtualGiftcard_ProductPage productpage=new VirtualGiftcard_ProductPage(driver);
    	 productpage.ShoppingCart();
    	 Reporter.log("Clicking on Shopping cart",true);
    	 Assert.assertTrue(productpage.virtualgiftcard_inShoppingcart(),"not clicking on shopping cart");
    	 productpage.Twentyfive_Price();//Verifying Price as 25.00
    	 Reporter.log("Verifying the 25.00 price is displayed",true);
    	 Assert.assertTrue(productpage.Twentyfive_Price(),"25.00 price is not displayed");
//    	 productpage.qty_1();
//    	 Reporter.log("Verifying qty textfeild is displayed",true);
//    	 Assert.assertTrue(productpage.qty_1(), "qty textfeild is not displayed");
    	 productpage.Iagree_Checkbox();//Verifying I agree checkbox is displayed
    	 Reporter.log("Verifying the I agree checkbox is displayed",true);
    	 Assert.assertTrue(productpage.Iagree_Checkbox(),"I agree checkbox is not displayed");
    	 productpage.ClickIagree_Checkbox();//Clicking on I Agree Checkbox
    	 Reporter.log("Clicking on I Agree Checkbox",true);
    	 productpage.Checkout_Button();//Verifying the Checkout Button is displayed
    	 Reporter.log("Verifying the Checkout Button is displayed",true);
    	 Assert.assertTrue(productpage.Checkout_Button(),"Checkout Button is not displayed");
    	   }
     
     @Test(priority=5)
     public void ClickCheckout_Button() {
    	 VirtualGiftcard_ProductPage productpage=new VirtualGiftcard_ProductPage(driver);
    	 productpage.ClickCheckout_Button();//clicking on Checkout Button
    	 Reporter.log("Clicking on Checkout Button",true);
    	 CheckoutPage1 checkpage=new CheckoutPage1(driver);
    	 Assert.assertTrue(checkpage.BillingAddress_Text(),"Not clicking on Checkout Button");
    	 checkpage.Continue_Button();
    	 Reporter.log("Verifying Continue Button is Displayed");
    	 Assert.assertTrue(checkpage.Continue_Button(),"Continue Button is not Displayed");
     }
    	 
    	 @Test
    	 public void ClickContinue_Button() {
        	 CheckoutPage1 checkpage=new CheckoutPage1(driver);
        	 checkpage.BillingAddress_dropdown();//Verifying Billing Address Dropdown
        	 Reporter.log("Verifying the Billing Address dropdown is displayed",true);
        	 Assert.assertTrue(checkpage.BillingAddress_dropdown(),"Billing Address dropdown is not displayed");
        	// checkpage.ClickContinue_Button();
        	 

    	 
	}
}










