package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage1 {
	By login = By.xpath("//a[text()='Log in']");
	By EmailTextField = By.id("Email");
	By PasswordTextField = By.id("Password");
	By RememberMeCheckBox = By.id("RememberMe");
	By ForgotPassword = By.xpath("//a[text()='Forgot password?']");
	By LoginButton = By.xpath("//input[@class='button-1 login-button']");
	By RegisterButton = By.xpath("//input[@class='button-1 register-button']");
	By verifyLoginpage = By.xpath("//h1[text()='Welcome, Please Sign In!']");
	By verifyUserEmailIdisDIsplaying = By.xpath("(//a[@class='account'])[1]");

	WebDriver driver;
	WebDriverWait wait;

	public LoginPage1(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void clickOnLogin() {
		driver.findElement(login).click();
	}

	public boolean verifyclickOnLogin() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(login)).isDisplayed();
	}

	public boolean verifyHomePage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(verifyUserEmailIdisDIsplaying)).isDisplayed();
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
		// return
		// wait.until(ExpectedConditions.visibilityOfElementLocated(LoginButton)).isDisplayed();
		driver.findElement(LoginButton).click();
	}

	public boolean verifyLoginPage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(verifyLoginpage)).isDisplayed();
	}

}
