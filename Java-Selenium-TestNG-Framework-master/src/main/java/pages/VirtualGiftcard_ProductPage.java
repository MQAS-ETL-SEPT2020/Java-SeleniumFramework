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
    
//Methods for checkout page
    By CashonDelivery=By.xpath("//label[text()='Cash On Delivery (COD) (7.00)']");
    By CheckMoney_OrderRadioButton=By.xpath("//label[text()='Check / Money Order (5.00)']");
    By Creditcard_RadioButton=By.xpath("//label[text()='Credit Card']");
    By PurchaseOrder_RadioButton=By.xpath("//label[text()='Purchase Order']");
    By Back_Button=By.xpath("(//a[text()='Back'])[1]");
    By Continue_Button=By.xpath("//input[@class='button-1 payment-method-next-step-button']");
    By Continue_Button2=By.xpath("//input[@class='button-1 payment-info-next-step-button']") ;                                         
    By Cod_Text=By.xpath("//p[text()='You will pay by COD']");
    By BillingAddress_Text=By.xpath("//strong[text()='Billing Address']");
    By Paymentmethod_text=By.xpath("//strong[text()='Payment Method']");
    By Confirm_Button=By.xpath("//input[@class='button-1 confirm-order-next-step-button']");
    By ConfirmationOrder_Text=By.xpath("//strong[text()='Your order has been successfully processed!']");
    By OrderNumber_Text=By.xpath("//li[contains(.,'Order number')]");
    
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
    
    //Method of Checkoutpage
    public boolean CashonDeliveryisDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(CashonDelivery)).isDisplayed();
    }
    
    public boolean CheckMoneyOrder_RadioButtonisDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(CheckMoney_OrderRadioButton)).isDisplayed();
    }
    
    public boolean Creditcard_RadioButtonisDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(Creditcard_RadioButton)).isDisplayed();
    }
    
    public boolean PurchaseOrder_RadioButtonisDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(PurchaseOrder_RadioButton)).isDisplayed();
    }
    
    public boolean Back_ButtonisDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(Back_Button)).isDisplayed();
    }
    
    public void Click_ContinueButton() {
    	driver.findElement(Continue_Button).click();
    }
    
    public boolean CodTextIsDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(Cod_Text)).isDisplayed();
    }
    
    public void ClickContinueButton2() {
    	driver.findElement(Continue_Button2).click();
    }
    
    public boolean BillingAddress_isDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(BillingAddress_Text)).isDisplayed();
    }
    public boolean Paymentmethodtext_isDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(Paymentmethod_text)).isDisplayed();
    }
    
    public void ClickConfirm_Button() {
    	driver.findElement(Confirm_Button).click();
    }
    
    public boolean ConfirmationOrder_TextisDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmationOrder_Text)).isDisplayed();
    }
    
    public boolean OrderNumber_TextisDisplayed() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(OrderNumber_Text)).isDisplayed();
    }
}
