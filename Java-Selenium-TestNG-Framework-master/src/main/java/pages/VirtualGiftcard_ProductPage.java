package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VirtualGiftcard_ProductPage extends BasePage {
	By AddyourReview_Link=By.xpath("//a[text()='Add your review']");
	By five_number=By.xpath("//span[@itemprop='price']");
    By Qty_textfeild=By.id("addtocart_1_EnteredQuantity");
    
	
	
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	public VirtualGiftcard_ProductPage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, 10);
	}
	
	
	public boolean AddyourReview() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(AddyourReview_Link)).isDisplayed();
	}
	
	
	public boolean Number() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(five_number)).isDisplayed();
		return false;
	}
	
	

	
	
	
	
	
	
	
	
	

}
