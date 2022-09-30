package tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.BasePage;
import pages.ElectronicsPage;
import pages.HomePage;

public class CameraPageTest extends BasePage {
	
	@Test(priority = 0)
	public void navigateToCameraPage() {
		HomePage homePage=new HomePage(driver);
		homePage.clickElectronics();
		logger.log(LogStatus.INFO, "Clicking 'Electronics'");
		
		ElectronicsPage electronics=new ElectronicsPage(driver);
		electronics.clickCameraIcon();
		logger.log(LogStatus.INFO, "Clicking 'Camera'");
		
	}

}
