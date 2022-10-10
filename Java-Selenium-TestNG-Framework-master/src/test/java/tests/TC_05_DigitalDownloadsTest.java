package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.DigitalDownloadsPage;
import pages.HomePage;
import pages.LoginPage1;

public class TC_05_DigitalDownloadsTest extends BasePage {
	//Step-1:Open the Application URL
//    
//	TC_05_DigitalDownloadsTest(String applicationUrl) {
//		super(applicationUrl);
//		// TODO Auto-generated constructor stub
//	}

	
	@Test
	public void navigateToCheckOut() {
//		String applicationUrl="https://demowebshop.tricentis.com/";
//		System.out.println("Iam in TC_05 "+ applicationUrl);
//		TC_05_DigitalDownloadsTest navigate=new TC_05_DigitalDownloadsTest(applicationUrl);
//		
		
		LoginPage1 login=new LoginPage1(driver);
		//Step-2:GIVEN URL
		login.clickOnLogin();
		login.typeEmail();
		login.typePassword();
		login.Loginbutton();
		
		HomePage home=new HomePage(driver);
		
		
		DigitalDownloadsPage digitaldownloads = new DigitalDownloadsPage(driver);
		digitaldownloads.digitalDownloads();
		Reporter.log("Clicking on DIGITAL DOWNLOADS", true);
		Assert.assertTrue(digitaldownloads.clickdigitalDownloads(), "Not clicking on DIGITAL DOWNLOADS");

		//digitaldownloads.clickdigitalDownloads();
		Reporter.log("DIGITAL DOWNLOADS page is  displayed", true);
		Assert.assertTrue(digitaldownloads.clickdigitalDownloads(), "Not dispalying DIGITAL DOWNLOADS page");
        
		Reporter.log("By default displaying Position Option", true);
		Assert.assertTrue(digitaldownloads.defaultSortBy(), "Not displaying Position option");

		Reporter.log("By default displaying Eight Option", true);
		Assert.assertTrue(digitaldownloads.defaultDisplayPerPage(), "Not displaying Eight option");

		Reporter.log("By default displaying Grid Option", true);
		Assert.assertTrue(digitaldownloads.defaultViewAs(), "Not displaying Grid option");

	    digitaldownloads.album1();
		Reporter.log("Clicking on 3rd image", true);
		Assert.assertTrue(digitaldownloads.click3rdAlbum(), "Not clicking on 3rd image");

        digitaldownloads.click3rdAlbum();
		Reporter.log("3rd image page is displayed", true);
		Assert.assertTrue(digitaldownloads.click3rdAlbum(), "Not displaying 3rd image page");
		
		Reporter.log("Price is displayed", true);
		Assert.assertTrue(digitaldownloads.defaultPrice(),"Not displaying Price");
		
		
		
		digitaldownloads.addToCart();
		Reporter.log("Clicking on Add to cart button", true);
		Assert.assertTrue(digitaldownloads.clickOnAddToCart(), "Not clicking on Add to cart button");
	}
}