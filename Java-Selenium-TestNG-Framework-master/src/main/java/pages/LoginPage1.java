package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage1 {

	By EmailTextField=By.id("Email");
	By PasswordTextField=By.id("Password");
	By RememberMeCheckBox=By.id("RememberMe");
	By ForgotPassword=By.xpath("//a[text()='Forgot password?']");
	By LoginButton=By.xpath("//input[@class='button-1 login-button']");
	By RegisterButton=By.xpath("//input[@class='button-1 register-button']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage1(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver=driver; 
		wait = new WebDriverWait(driver, 10);
	}
	
	public void typeEmail(String EmailId) {
		driver.findElement(EmailTextField).clear();
		driver.findElement(EmailTextField).sendKeys(EmailId);
	}
	
	public void typePassword(String password) {
		driver.findElement(PasswordTextField).clear();
		driver.findElement(PasswordTextField).sendKeys(password);
	}
	
	public void clickRemembermeCheckbox() {
		driver.findElement(RememberMeCheckBox).click();
	}
	
	public void ForgotPasswordLink() {
		driver.findElement(ForgotPassword).click();
	}
	
	public void Loginbutton() {
		driver.findElement(LoginButton).click();
	}
}
