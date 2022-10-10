package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftcardPage extends BasePage {

	By Giftcards_Menu=By.xpath("//ul[@class='top-menu']//li[7]");
	By Giftcards_text=By.xpath("//h1[text()='Gift Cards']");
	By Sortby_Dropdown=By.xpath("//select[@id='products-orderby']");
	By DisplayperPage_Dropdown=By.xpath("//select[@id='products-pagesize']");
	By Viewas_Dropdown=By.id("products-viewmode");
	By Product1=By.xpath("//a[text()='$5 Virtual Gift Card']");
	By AddyourReview_Link=By.xpath("//a[text()='Add your review']");


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

	public void ClickSortBy_Dropdown() {
		driver.findElement(Sortby_Dropdown).click();
	}

	public boolean sortbyoptions() { // Asserting  Sortby dropdown method
		WebElement dropdown1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Sortby_Dropdown));
		Select sel=new Select(dropdown1);
		for (WebElement Element : sel.getOptions()) {
			Element.isDisplayed();
		}

		return true;
	}

	public void ClickDisplayperpage_Dropdown() {
		driver.findElement(DisplayperPage_Dropdown);
	}

	public boolean displayperPageoptions() { // Asserting  display per page dropdown method
		WebElement dropdown2 = wait.until(ExpectedConditions.visibilityOfElementLocated(DisplayperPage_Dropdown));
		Select sel=new Select(dropdown2);
		for (WebElement Element : sel.getOptions()) {
			Element.isDisplayed();

		}
		return true;
	}

	public void Clickviewas_Dropdown() {
		driver.findElement(Viewas_Dropdown).click();
	}

	public boolean Viewasoptions() {   //Asserting Viewas dropdown method
		WebElement dropdown3 = wait.until(ExpectedConditions.visibilityOfElementLocated(Viewas_Dropdown));
		Select sel=new Select(dropdown3);
		for (WebElement Element : sel.getOptions()) {
			Element.isDisplayed();

		}
		return true;
	}
     
	 public void ClickVitualGiftcardProduct() {
		 driver.findElement(Product1).click();
		  }
	 
	 public boolean Addtoreviewlink() { //Asserting $5 Vitual Giftcard product clicking
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(AddyourReview_Link)).isDisplayed();
	 }

}
