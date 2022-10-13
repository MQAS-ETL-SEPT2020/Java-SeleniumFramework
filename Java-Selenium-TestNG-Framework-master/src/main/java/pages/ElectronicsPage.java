package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsPage {

	By Camera = By.xpath("//img[@alt='Picture for category Camera, photo']");
	By Cellphones = By.xpath("(//a[@title=\"Show products in category Cell phones\"])[1]");
	By SmartPhonesAddtoCartbutton = By.xpath("(//input[@value=\"Add to cart\"])[1]");
	By SmartPhonePrice = By.xpath("//span[@itemprop=\"price\"]");
	By AddtocartButton = By.xpath("//input[@id='add-to-cart-button-43']");
	By HardriveCandiCam = By.xpath("//a[text()='1MP 60GB Hard Drive Handycam Camcorder']");
	By Camcorder = By.xpath("//a[text()='Camcorder']");
	By SlrCamrea = By.xpath("//a[text()='Digital SLR Camera 12.2 Mpixel']");
	By HighDefinationCamcorder = By.xpath("//a[text()='High Definition 3D Camcorder']");
	By SortbyDropdown = By.id("products-orderby");
	By DisplayDropdown = By.id("products-pagesize");
	By ViewasDropdown = By.id("products-viewmode");
	By ShoppingCartLink = By.xpath("//span[text()='Shopping cart']");
	By CountryDropdown = By.id("CountryId");
	By PostalCode = By.id("ZipPostalCode");
	By TermsAndServicesCheckbox = By.id("termsofservice");
	By CheckoutButton = By.id("checkout");

	WebDriver driver;
	WebDriverWait wait;

	public ElectronicsPage(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void clickHardriveCandiCam() {
		driver.findElement(HardriveCandiCam).click();
	}

	public void clickCamcorder() {
		driver.findElement(Camcorder).click();
	}

	public void clickSlrCamrea() {
		driver.findElement(SlrCamrea).click();
	}

	public void clickHighDefinationCamcorder() {
		driver.findElement(HighDefinationCamcorder).click();
	}

	public void clickCameraIcon() {
		driver.findElement(Camera).click();
	}

	public void clickCellPhonesIcon() {
		driver.findElement(Cellphones).click();
	}

	public boolean SortBydropDown() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(SortbyDropdown)).isDisplayed();
	}

	public boolean DisplayDropDown() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(DisplayDropdown)).isDisplayed();
	}

	public boolean ViewasDropDown() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ViewasDropdown)).isDisplayed();
	}

	public void clickSmartphoneLink() {
		driver.findElement(SmartPhonesAddtoCartbutton).click();
	}

	public void ShoppingcartLink() {
		driver.findElement(ShoppingCartLink).click();

	}

	public void clickAddtoCartButton() {
		driver.findElement(AddtocartButton).click();
	}

	public void CountryDropDown() {
		driver.findElement(CountryDropdown).sendKeys("India");
	}

	public void PostalCode() {
		driver.findElement(PostalCode);
	}

	public void TermsandServices() {
		driver.findElement(TermsAndServicesCheckbox).click();
	}

	public void CheckoutButton() {
		driver.findElement(CheckoutButton).click();
	}

}
