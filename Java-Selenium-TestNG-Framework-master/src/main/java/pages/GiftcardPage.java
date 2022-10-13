package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftcardPage extends BasePage {

	By Giftcards_Menu=By.xpath("//ul[@class='top-menu']//li[7]");
	By Giftcards_text=By.xpath("//h1[text()='Gift Cards']");
	By Sortby_Dropdown=By.xpath("//select[@id='products-orderby']");
	By postion_Option=By.xpath("//option[text()='Position']");
	By DisplayperPage_Dropdown=By.xpath("//select[@id='products-pagesize']");
	By eight_option=By.xpath("//option[text()='8']");
	By Viewas_Dropdown=By.id("products-viewmode");
	By Grid_option=By.xpath("//option[text()='Grid']");
	By Vitual_giftcardProduct=By.xpath("//div[@class='product-grid']//a[text()='$25 Virtual Gift Card']");
	

	WebDriver driver;
	WebDriverWait wait;

	public GiftcardPage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, 10);
	}

	public void clickGiftcards() {          
		driver.findElement(Giftcards_Menu).click();
	}

	public boolean Giftcards_Text() { //Asserting Giftcards page
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Giftcards_text)).isDisplayed();
	}


	public boolean DefaultPostion_option() { //Asserting Position option in  Sortby Dropdown
		return wait.until(ExpectedConditions.visibilityOfElementLocated(postion_Option)).isDisplayed();
	}


	public boolean Default8_option() { //Asserting 8 Option in Display per page Dropdown
		return wait.until(ExpectedConditions.visibilityOfElementLocated(eight_option)).isDisplayed();
	}


	public boolean DefaultGrid_option() { //Asserting Grid option in View as Dropdown
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Grid_option)).isDisplayed();
	}


	public void ClickVitualGiftcardProduct() {//Clicking on $5 Vitual Giftcard {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Vitual_giftcardProduct)).click();
	}
 
	
	
}
