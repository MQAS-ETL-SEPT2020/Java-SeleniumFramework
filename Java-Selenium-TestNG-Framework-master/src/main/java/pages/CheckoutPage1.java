package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage1 {
	By BillingAddress=By.xpath("//h2[text()='Billing address']");
    By Continue_Button=By.xpath("");
    By BillingaddressDROPDOWN=By.id("billing-address-select");
    
    
    
   
    
    WebDriver driver;
    WebDriverWait wait;
    
    public CheckoutPage1(WebDriver driver) {
    	this.driver=driver;
    	wait=new WebDriverWait(driver, 10);
    }
    
    
    
    public boolean BillingAddress_Text() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(BillingAddress)).isDisplayed();
    }
    
    public boolean Continue_Button() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(Continue_Button)).isDisplayed();
    }
    
    public boolean BillingAddress_dropdown() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(BillingaddressDROPDOWN)).isDisplayed();
    }
    
    
    public void ClickContinue_Button() {
    	driver.findElement(Continue_Button).click();
    }
}
