package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.GiftcardPage;


public class GiftcardPageTest extends BasePage {

	@Test(priority=0)
	public void GiftcardsMenu() throws InterruptedException {
		GiftcardPage giftpage=new GiftcardPage(driver);
		giftpage.clickGiftcards(); //Clicking on Giftcards_Menu
		Reporter.log("Clicking on Giftcards Menu",true);
		Assert.assertTrue(giftpage.Giftcards_Text(),"Not clicking on Giftcards Menu");
	}

	@Test(priority=1)
	public void SortbyDropdown() {
		GiftcardPage giftpage=new GiftcardPage(driver);
		giftpage.ClickSortBy_Dropdown();
		Reporter.log("Clicking on Sort by dropdown",true);
		Assert.assertTrue(giftpage.sortbyoptions(),"Not Clicking on Sort by dropdown ");
	}

	@Test(priority=2)
	public void Displayperpage() throws InterruptedException {
		GiftcardPage giftpage=new GiftcardPage(driver);
		giftpage.ClickDisplayperpage_Dropdown();
		Reporter.log("Clicking on Display per page dropdown",true);
		Assert.assertTrue(giftpage.displayperPageoptions(),"Not Clicking on Display per page dropdown ");
	}

	@Test(priority=3)
	public void Viewas() {
		GiftcardPage giftpage=new GiftcardPage(driver);
		giftpage.ClickSortBy_Dropdown();
		Reporter.log("Clicking on View as dropdown",true);
		Assert.assertTrue(giftpage.Viewasoptions(),"Not Clicking on View as dropdown ");
	}
    
	
	@Test (priority=4)
	public void VitualgiftcardProduct() {
		GiftcardPage giftpage=new GiftcardPage(driver);
		giftpage.ClickVitualGiftcardProduct();
		Reporter.log("Clicking on $5 vitual Giftcard",true);
		Assert.assertTrue(giftpage.Addtoreviewlink(),"Not Clicking on $5 vitual Giftcard");
		
		
	}
}


