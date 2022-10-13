package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VirtualGiftcard_ProductPage extends BasePage {
	By AddyourReview_Link=By.xpath("//a[text()='Add your review']");
	By five_number=By.xpath("//span[@itemprop='price']");
	By Qty_textfeild=By.xpath("//input[@value='1']");
	By Reciepents_Name=By.xpath("//input[@class='recipient-name']");
	By Reciepents_email=By.id("giftcard_2_RecipientEmail");
	By Message_textareafeild=By.id("giftcard_2_Message");
	By Addtocart_Button=By.xpath("//input[@id='add-to-cart-button-2']");
	By Addtocart_message=By.xpath("//p[text()='The product has been added to your ']");
    By ShoppingCart_link=By.xpath("//span[text()='Shopping cart']");
    By vitualgiftcardshoppingcart=By.xpath("//td[@class='product']//a[text()='$25 Virtual Gift Card']");
    By twentyFive_text=By.xpath("//span[@class='product-subtotal']");
    By qty1=By.xpath("//input[@class='qty-input valid']");
    By Iagree_Checkbox=By.id("termsofservice");
    By Checkout=By.xpath("//button[@id='checkout']");
    



	WebDriver driver;
	WebDriverWait wait;


	public VirtualGiftcard_ProductPage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, 10);
	}


	public boolean AddyourReview() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(AddyourReview_Link)).isDisplayed();
	}


	public boolean Number() throws InterruptedException {
		Actions act=new Actions(driver);
		Thread.sleep(5);
		act.moveToElement(driver.findElement(five_number));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(five_number)).isDisplayed();

	}

	public boolean Qty_textfeild() throws InterruptedException {
		Thread.sleep(5);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(Qty_textfeild));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Qty_textfeild)).isDisplayed();
	}


	public boolean Addtocart_text() throws InterruptedException {
		Thread.sleep(5);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(Addtocart_Button));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Addtocart_Button)).isDisplayed();
	}

	public void textfeild(String Name,String email,String message) {
		driver.findElement(Reciepents_Name).sendKeys(Name);
		driver.findElement(Reciepents_email).sendKeys(email);
		driver.findElement(Message_textareafeild).sendKeys(message);
	}

	public void Addtocart_Button() {
		driver.findElement(Addtocart_Button).click();
	}

	public boolean Message_addedtocart() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Addtocart_message)).isDisplayed();

	}

    public void ShoppingCart() {
    	driver.findElement(ShoppingCart_link).click();
    }

    public boolean virtualgiftcard_inShoppingcart() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(vitualgiftcardshoppingcart)).isDisplayed();
    }

    public boolean Twentyfive_Price() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(twentyFive_text)).isDisplayed();
    }

    public boolean qty_1() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(qty1)).isDisplayed();
    	
    }
    
    
    public boolean Iagree_Checkbox() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(Iagree_Checkbox)).isDisplayed();
    }
    
    public void ClickIagree_Checkbox() {
    	driver.findElement(Iagree_Checkbox).click();
    }
    
    public boolean Checkout_Button() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(Checkout)).isDisplayed();
    }
    
    public void ClickCheckout_Button() {
    	driver.findElement(Checkout).click();
    }
    
    
}
