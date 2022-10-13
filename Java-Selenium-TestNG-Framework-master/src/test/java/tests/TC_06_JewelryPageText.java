package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.CheckoutPage;
import pages.JewelShoppingPage;
import pages.JewelleryPage;
import pages.LoginPage1;
import pages.NecklacePage;

public class TC_06_JewelryPageText extends BasePage
{
	@Test(priority = 1)
	public void VerifyJewelPage() throws InterruptedException 
	{
		LoginPage1 login=new LoginPage1(driver);
		login.clickOnLogin();
		login.typeEmail("vanigowdas54@gmail.com");
		login.typePassword("Vani@7411");
		login.Loginbutton();
		
		
		JewelleryPage jewel = new JewelleryPage(driver);
		jewel.clickOnjewel();
		Reporter.log("clicking on jewelry", true);
		Assert.assertTrue(jewel.jewelText(), "not clicking on jewelText");
		
		
		Reporter.log("By default sortby position is selected", true);
		Assert.assertTrue(jewel.sortbyText(), "by default position is not selected");
		
		
		Reporter.log("By default Display 4 is selected", true);
		Assert.assertTrue(jewel.DisplayText(), "by default Display is not selected");
		
		
		Reporter.log("By default Viewas Grid is selected", true);
		Assert.assertTrue(jewel.ViewasText(), "by default Display is not selected");
	    
		jewel.clickOnImage();
		
		NecklacePage necklacejewel=new NecklacePage(driver);
	   // necklacejewel.blackandwhitePage();
	    Reporter.log("clicking on Black & White Diamomd Heart Product", true);
	    Assert.assertTrue(necklacejewel.blackandwhitePage(),"not clicking on Black And White Diamond Heart Product");
	    
	   // necklacejewel.blackandwhitePrice();
	    Reporter.log("Black and White Diamond Heart Prdouct price is 130 ", true);
	    Assert.assertTrue(necklacejewel.blackandwhitePrice(), "Black and White Diamond Heart Product price 130 is not displaying");
	    
	    //necklacejewel.jewelQty();
	    //Reporter.log("By default Black and White Diamond Heart Prdouct is 1", true);
	    //Assert.assertTrue(necklacejewel.ProductQty(),"Black and White Diamond Heart Product Qty 1 is not displaying");
	    
	    necklacejewel.addjewel();
	  //Reporter.log("Product is added to shoppingcart page", true);
	  //Assert.assertTrue(necklacejewel.shoppingpopup(),"Black and White Diamond Heart Product is not added to shoppingcart page");
	    
        JewelShoppingPage cartpage=new JewelShoppingPage(driver);
        
		cartpage.shoppingcartlink();
		Reporter.log("clicking on shoppingcart Link", true);
		Assert.assertTrue(cartpage.shoppingcartPage(), "not clicking on shoppingcart");
		
		cartpage.productCountry();
		Reporter.log("selecting India country",true);
		Assert.assertTrue(cartpage.countryProduct(), "not selecting on India");
		
		cartpage.zipcode();
		Reporter.log("Entering pincode",true);
		Assert.assertTrue(cartpage.pincodenumber(), "not selecting on India");
		
		cartpage.termscheckbox();
		Reporter.log("Clicking on checkoutbutton",true);
		
		cartpage.checkOut();
		Reporter.log("Checkoutpage is displaying",true);
		Assert.assertTrue(cartpage.checkoutpage(),"not displaying checkoutpage");
		
		CheckoutPage address=new CheckoutPage(driver);
		address.BillingDropdown();
		Reporter.log("clicking on BillingAddress dropdown",true);
		
		address.ClickOnContinueInBillingAddress();
		Reporter.log("Entering BillingAddress dropdown",true);
		
		address.EnterFirstName("Vanishree");
		Reporter.log("Entering Firstname",true);
		address.EnterLastName("gowda");
		Reporter.log("Entering Lastname",true);
		address.EnterEmailId("vanigowdas54@gmail.com");
		Reporter.log("Entering Emailid",true);
		address.EnterCompanyName("TestYantra");
		Reporter.log("Entering company dropdown",true);
		address.CountryDropdown();
		Reporter.log("select Country India dropdown",true);
		address.EnterCityName("Bengaluru");
		Reporter.log("Entering Country name",true);
		address.EnterAddress1("#62 jai maruti nagar nandini layout");
		Reporter.log("Entering Address1 ",true);
		address.EnterZipCode("560096");
		Reporter.log("Entering Pincode",true);
		address.EnterMobileNumber("7411313729");
		Reporter.log("Entering Mobile number",true);
		address.ClickOnContinueInBillingAddress();
		Reporter.log("clicking on continue button",true);
		
	   address.isShippingAddressDisplayed();
	   Reporter.log("ShippingAdress Page is dispalyed",true);
	   Assert.assertTrue(cartpage.shoppingcartPage(), "Shipping Address page is not displayed");
		
	   
	   address.shippingDropdown();
	   address.shippingEnterCompanyName("MQAS");
	   address.CountryDropdown();
	   address.shippingSelectCountry();
	   address.shippingEnterCityName("Mysore");
	   address.shippingEnterAddress1("#62,7thcross jai maruti nagar");
	   address.EnterZipCode("560096");
	   address.shippingEnterMobileNumber("7411313729");
//		address.shippingDropdown();
//		//address.selectShippingAddressdropdown();
//		address.shippingEnterCompanyName("MQAS");
//		address.shippingCountryDropdown();
//		address.selectShippingAddressdropdown();
//		address.shippingEnterCityName("Bengaluru");
//		address.shippingEnterAddress1("#62,7th cross jai maruti nagar");
//		address.shippingEnterZipCode("560096");
//		address.shippingEnterMobileNumber("7411313729");
//		
		
	}
		
	//	address.selectshippingaddressdropdown();
		
		
		
		
	}
	

	