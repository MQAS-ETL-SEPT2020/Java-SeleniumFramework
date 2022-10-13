package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DigitalDownloadsPage {
	By digitalDownloads = By.xpath("(//a[contains(text(),'Digital downloads')])[1]");
	By digitalDownloadsPage = By.xpath("//h1[text()='Digital downloads']");

	By sortby = By.id("products-orderby");
	By position_sortby = By.xpath("//option[text()='Position']");

	By displayPerPage = By.id("products-pagesize");
	By eight_displayPerPage = By.xpath("//option[text()='8']");

	By viewAs = By.id("products-viewmode");
	By grid_viewAs = By.xpath("//option[text()='Grid']");

	By thirdAlbumLink= By.xpath("(//h2[@class=\"product-title\"])[1]");

	WebDriver driver;
	WebDriverWait wait;

	public DigitalDownloadsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 7);
	}

	// Digital Downloads page is displayed
	public boolean isDigitalDownloadsPageSuccessful() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(digitalDownloadsPage)).isDisplayed();
	}

	public void filtersDropdown() {
		WebElement sort = driver.findElement(sortby);
		Select sort1 = new Select(sort);
		// sort1.selectByVisibleText("Position");
		
		WebElement page = driver.findElement(displayPerPage);
		Select page1 = new Select(page);
		// page1.selectByVisibleText(8);
		
		WebElement viewas = driver.findElement(viewAs);
		Select viewas1 = new Select(viewas);
		// viewas1.selectByIndex(1);
	}

	public boolean SortBy() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(position_sortby)).isDisplayed();
	}

	public boolean DisplayPerPage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(eight_displayPerPage)).isDisplayed();
	}

	public boolean ViewAs() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(grid_viewAs)).isDisplayed();
	}

//	 Click on "3rd album" link
	public void clickOnAlbumLink() {
		driver.findElement(thirdAlbumLink).click();
	}

}
