package tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.BasePage;
import pages.ElectronicsPage;
import pages.HomePage;

public class TC_CameraPageTest extends BasePage {
	
	@Test(priority = 0)
	public void navigateToCameraPage() {
		HomePage homePage=new HomePage(driver);
		homePage.clickElectronics();
		
		ElectronicsPage electronics=new ElectronicsPage(driver);
		electronics.clickCameraIcon();
		
		
		
	}

}
