package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage{
	
	/*
	 * By oculusLogo = By.cssSelector("._2v0_"); By signinLink =
	 * By.xpath("//a[contains(text(), 'Log In or Sign Up')]"); By signinButton =
	 * By.xpath("//a[@id='u_0_1v'][contains(text(), 'Sign in')]"); By headsetsTab =
	 * By.id("u_0_x"); By appsGamesTab = By.id("u_0_y"); By communityTab =
	 * By.id("u_0_15"); By supportTab = By.id("u_0_17"); By oculusQuest =
	 * By.cssSelector("#u_0_10"); By buyNowButton = By.
	 * xpath("//button[@class='_8166 _4pg_ _3hmq _4phk _4ph1']//span[contains(text(), 'Buy Now')]"
	 * ); By oneTwentyEightGB = By.cssSelector("div>.modal__button-wrapper-128"); By
	 * checkoutButton = By.cssSelector("._4ju3._4pg_._3hmq._4phk"); By
	 * navigationLinks = By.cssSelector("._2xvt._wjv._2xvr"); By containers = By.
	 * xpath("//div[@class='_2xvt _wjv _2xvr']/span/a[contains(@data-testid, 'navlink-')]"
	 * ); By headsetsDropdown =
	 * By.xpath("//div[@class='_2xvy _8yxy _2xvr _7ujs _8yxz']"); By
	 * headsetsDropdownResults = By.
	 * xpath("//div[@class='_2xvy _8yxy _2xvr _7ujs _8yxz']/span/a[contains(@data-testid, 'navlink-')]"
	 * ); By forumsTab = By.cssSelector("#u_0_17");
	 */
	
	By RegisterLink=By.xpath("//a[text()='Register']");
	By LoginLink=By.xpath("//a[text()='Log in']");
    By ShoppingCartLink=By.xpath("//a[text()='Shopping cart']");
    By WishlistLink=By.xpath("//span[text()='Wishlist']");
	By Books=By.xpath("(//a[@href='/books'])[1]");
	By Computers=By.xpath("(//a[@href='/computers'])[1]");
	By Electronics=By.xpath("(//a[@href='/electronics'])[1]");
	By ApparelAndShoes=By.xpath("(//a[@href='/apparel-shoes'])[1]");
	By DigitalDownloads=By.xpath("(//a[@href='/digital-downloads'])[1]");
	By Jewelry=By.xpath("(//a[@href='/jewelry'])[1]");
	By GiftCards=By.xpath("(//a[@href='/gift-cards'])[1]");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, 5); 
	}
	
	public String getTitle() {
		return driver.getTitle();	
	}
	
	public void clickRegisterLink() {
		driver.findElement(RegisterLink).click();
	}
	
	public void clickLoginLink() {
		driver.findElement(LoginLink).click();
	}
	
	public void clickShoppingCartLink() {
		driver.findElement(ShoppingCartLink).click();
	}
	
	public void clickWishlistLink() {
		driver.findElement(WishlistLink);
		}
	
	public void clickBooks() {
		driver.findElement(Books).click();
        }
	
	public void clickComputers() {
		driver.findElement(Computers).click();
	}
	
	public void clickElectronics() {
		driver.findElement(Electronics).click();
	}
	
	public void clickApparelAndShoes() {
		driver.findElement(ApparelAndShoes).click();
	}
	
	public void clickDigitalDownloads() {
		driver.findElement(DigitalDownloads).click();
	}
	
	public void clickJewelry() {
		driver.findElement(Jewelry).click();
	}
	
	public void clickGiftCards() {
		driver.findElement(GiftCards).click();
	}
	
/*	}
	
	public boolean getLogo() {
		 return driver.findElement(oculusLogo).isDisplayed();
	}
	
	public void clickLogInLink() {
		 driver.findElement(signinLink).click();
	}
	
	public void clickSigninLink() {
		 wait.until(ExpectedConditions.elementToBeClickable(signinButton));
		 driver.findElement(signinButton).click();
	}
	
	public void hoverOverCommunityTab() {
		new Actions(driver).moveToElement(driver.findElement(communityTab)).perform();
	}
	
	public void clickOnForumsTab() {
		driver.findElement(forumsTab).click();
	}
	
	public void switchTabs() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}
	
	public void hoverOverHeadsetsTab() {
		new Actions(driver).moveToElement(driver.findElement(headsetsTab)).perform();
		
	}
	
	public List<WebElement> headsetsDropdownResults(){
		return driver.findElement(headsetsDropdown).findElements(headsetsDropdownResults);
	}

	public void clickOculusQuest() {
		driver.findElement(oculusQuest).click();
	}
	
	public void addToCart() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buyNowButton));
		driver.findElement(buyNowButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(oneTwentyEightGB));
		driver.findElement(oneTwentyEightGB).click();
	}
	
	public boolean isCartPageLoaded() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButton)).isDisplayed();
	}*/
	
}
