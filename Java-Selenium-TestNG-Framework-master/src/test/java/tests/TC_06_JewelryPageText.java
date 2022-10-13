package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.BasePage;
import pages.DemoCheckoutPage;
import pages.HomePage;

import pages.JewelShoppingPage;
import pages.NecklacePage;

import pages.JewelleryPage;
import pages.LoginPage1;

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
		
		DemoCheckoutPage address=new DemoCheckoutPage(driver);
		address.addbilladdress();
		Reporter.log("clicking on BillingAddress dropdown",true);
		
		address.addbilladdress();
		Reporter.log("Entering BillingAddress dropdown",true);
		
		address.Fname();
		Reporter.log("Entering Firstname dropdown",true);
		address.Lname();
		Reporter.log("Entering Lastname dropdown",true);
		address.emailid();
		Reporter.log("Entering Emailid dropdown",true);
		address.companyname();
		Reporter.log("Entering company dropdown",true);
		address.countryaddress();
		Reporter.log("select Country India dropdown",true);
		address.cityname();
		Reporter.log("Entering Country name",true);
		address.addressone();
		Reporter.log("Entering Address1 ",true);
		address.zipcode();
		Reporter.log("Entering Pincode",true);
		address.mobilenum();
		Reporter.log("Entering Mobile number",true);
		address.billcontinue();
		Reporter.log("clicking on continue button",true);
		
	//	address.shippingaddresspage();
		//Reporter.log("ShippingAdress Page is dispalyed",true);
		//Assert.assertTrue(cartpage.shoppingcartPage(), "Shipping Address page is displayed");
		
		//address.clickshippingaddressdropdown();
		
	//	address.selectshippingaddressdropdown();
		
		
		
		
	}
	
}
	
//}



//}
//		

//		jewel.SortPosition();
//		jewel.ViewPage();
//		jewel.ClickOnImage();

/*
 * AddToCartPage Add=new AddToCartPage(driver); Add.MaterialType(); Add.size();
 * Add.shape(); Add.Cart();
 */

// NecklacePage necklace = new NecklacePage(driver);
// necklace.Addproduct();
// necklace.Addtowishlist();

// JewelShoppingPage shop = new JewelShoppingPage(driver);
// shop.ClickOnshoppingcart();
// shop.checkTermsandcondtions();
// shop.Checkout();

// private void assertTrue(Object jewelText, String message) {
// TODO Auto-generated method stub

// }
