package pages;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class LoginPage1 {
	    By login=By.xpath("//a[text()='Log in']");
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
		
		public void clickOnLogin() {
			driver.findElement(login).click();
		}
		public void typeEmail() {
			driver.findElement(EmailTextField).clear();
			driver.findElement(EmailTextField).sendKeys("meghadevaraja1998@gmail.com");
		}
		
		public void typePassword() {
			driver.findElement(PasswordTextField).clear();
			driver.findElement(PasswordTextField).sendKeys("Megha@123");
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
