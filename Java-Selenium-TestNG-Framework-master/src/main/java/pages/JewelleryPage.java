package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JewelleryPage 
{
	
	By jewellery = By.xpath("(//a[contains(text(),'Jewelry')])[1]");
	By jewelryText=By.xpath("//h1[text()='Jewelry']");
	By sortbyText=By.xpath("//option[text()='Position']");
	By DisplayText=By.xpath("//option[text()='8']");
	By ViewasText=By.xpath("//option[text()='Grid']");
    //By Productimage=By.xpath("(//a[text()='Black & White Diamond Heart'])[2]");
	By Productimage=By.xpath("//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000029_black-white-diamond-heart_125.jpg']");
	WebDriver driver;
	WebDriverWait wait;
   
	public JewelleryPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void clickOnjewel() {
		driver.findElement(jewellery).click();
	}
	
	public boolean jewelText()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(jewelryText)).isDisplayed();
		
	}
	public boolean sortbyText()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(sortbyText)).isDisplayed();
	}
	public boolean DisplayText()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(DisplayText)).isDisplayed();
	}
	public boolean ViewasText()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ViewasText)).isDisplayed();
	}
	
	public void clickOnImage()
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		driver.findElement(Productimage).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(Productimage)).isDisplayed();
		//driver.findElement(Productimage).click();
	}
	
	
}
	


