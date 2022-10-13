package tests;
	
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.ApparelAndShoesPage;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage1;
	
	public class TC_04_ApparelAndShoesPageTest extends BasePage{
		@Test()
		public void clickApparelAndShoes() throws InterruptedException {
			LoginPage1 login=new LoginPage1(driver);
			login.clickOnLogin();
			Reporter.log("Clicking on Login Link", true);
			
			login.typeEmail("pinkypriya@123gmail.com");
			Reporter.log("Entering valid emailId in Email textfield", true);
			
			login.typePassword("PinkyPriya@123");
			Reporter.log("Entering valid password in Password textfield", true);
			
			login.Loginbutton();
			Reporter.log("Clicking on Login button", true);
			
			HomePage home=new HomePage(driver);
			home.clickApparelAndShoes();
			
			ApparelAndShoesPage apparelAndShoes = new ApparelAndShoesPage(driver);
			apparelAndShoes.clickApparelAndShoes();
			Reporter.log("Clicking on apparelAndShoes menu", true);
			Assert.assertTrue(apparelAndShoes.apparelAndShoesText(), "not clicking on apparelAndShoes menu");
			
			apparelAndShoes.selectSort();
			Reporter.log("Clicking on sort option", true);
			Assert.assertTrue(apparelAndShoes.sortposition(), "not sorting ");
			
			apparelAndShoes.selectDisplay();
			Reporter.log("Clicng on display option", true);
			Assert.assertTrue(apparelAndShoes.displayeight(), "not dispalaying the options");
			
			apparelAndShoes.selectViewAs();
			Reporter.log("Clicking on view as dropdown", true);
			Assert.assertTrue(apparelAndShoes.viewgrid(), "not displaying the option");
			
			apparelAndShoes.selectProduct();
			Reporter.log("Clicking on product", true);
			
			apparelAndShoes.selectSize();
			Reporter.log("Clicking on size dropdown", true);
			Assert.assertTrue(apparelAndShoes.selectSmalll(), "not selecting the size ");
			
			apparelAndShoes.price();
			Reporter.log("price should be displayed", true);
			Assert.assertTrue(apparelAndShoes.price(), "price is not dispalyed ");
			
			apparelAndShoes.selectQty();
			Reporter.log("Qty should be displayed", true);
			Assert.assertTrue(apparelAndShoes.defaultQty(), "qty is not displayed");
			
			apparelAndShoes.addToCart();
			Reporter.log("Clicked on add to cart", true);
			Assert.assertTrue(apparelAndShoes.confirmationMsg(), "confirmation msg is not displayed");
			
			apparelAndShoes.shoppingCart();
			Reporter.log("Clicked on shopping cart", true);
			//Assert.assertTrue(apparelAndShoes.shoppingCart(), "shopping cart is not displayed");
			
			apparelAndShoes.checkBox();
			Reporter.log("Clicked on checkbox", true);
			Assert.assertTrue(apparelAndShoes.clickOnCheckBox(), "checkbox is not checked");
			
			apparelAndShoes.checkOut();
			Reporter.log("Clicked on checkOut", true);
			//Assert.assertTrue(apparelAndShoes.clickOnCheckOut(), "not clicked on checkOut");
			
			apparelAndShoes.billingAddress();
			Reporter.log("select billing Address", true);
			Assert.assertTrue(apparelAndShoes.selectbillingAddress(), "billing address is not present");
			Thread.sleep(5000);
			
			
			apparelAndShoes.continueButton();
			Reporter.log("clicked on continue", true);
			Assert.assertTrue(apparelAndShoes.clickOnContinue(), "not clicked on continue");
			Thread.sleep(2000);
			
			apparelAndShoes.shippingAddress();
			Reporter.log("select shipping address", true);
			Assert.assertTrue(apparelAndShoes.selectShippingAddress(),"shipping address is not present");
			Thread.sleep(2000);
			
			apparelAndShoes.shippingContinue();
			Reporter.log("click on continue", true);
			Assert.assertTrue(apparelAndShoes.clickShippingContinue(),"not clicked on continue");
			Thread.sleep(2000);
			}

		

	}


