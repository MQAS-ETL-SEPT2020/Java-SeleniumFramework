package tests;


	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;
	import org.testng.Reporter;
	import static org.testng.Assert.assertTrue;

	import org.apache.logging.log4j.core.util.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;


	import com.relevantcodes.extentreports.LogStatus;

import pages.ApparelAndShoesPage;
import pages.BasePage;
	import pages.HomePage;
	
	public class ApparelAndShoesPageTest extends BasePage{
		@Test()
		public void clickApparelAndShoes() throws InterruptedException {
		ApparelAndShoesPage titlePage = new ApparelAndShoesPage(driver);
		titlePage.clickApparelAndShoes();
		Thread.sleep(3000);
	   Reporter.log("clicking on ApparelAndShoesPage module ",true);	//logger.log(LogStatus.INFO, "clicked on ApparelAndShoesPage module");
		WebElement apparelpage = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']"));
		assertTrue(apparelpage.isDisplayed(), "user is not able to click on ApparelAndShoesPage module ");
		
		}
		
		@Test
		public void dress() throws InterruptedException {
			ApparelAndShoesPage titlePage = new ApparelAndShoesPage(driver);
			titlePage.dress();
			 Reporter.log("clicking on dress module ",true);
			
		}
		

	}


