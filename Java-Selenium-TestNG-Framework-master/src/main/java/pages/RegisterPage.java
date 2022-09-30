package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	By MaleRadioButton = By.id("gender-male");
	By FemaleRadioButton = By.id("gender-female");
	By FirstNameTextField = By.id("FirstName");
	By LastNameTextField = By.id("LastName");
	By EmailTextField = By.id("Email");
	By PasswordTextField = By.id("Password");
	By ConfPasswordTextField = By.id("ConfirmPassword");
	By RegisterButton = By.id("register-button");

	WebDriver driver;
	WebDriverWait wait;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}
	public void MaleRadioButton() {
		 driver.findElement(MaleRadioButton).click();
	}
	public void FemaleRadioButton() {
		 driver.findElement(FemaleRadioButton).click();
	}
	public void FirstNameTextField() {
		 driver.findElement(FirstNameTextField).click();
	}
	public void LastNameTextField() {
		 driver.findElement(LastNameTextField).click();
	}
	public void EmailTextField() {
		 driver.findElement(EmailTextField).click();
	}
	public void PasswordTextField() {
		 driver.findElement(PasswordTextField).click();
	}
	public void ConfPasswordTextField() {
		 driver.findElement(ConfPasswordTextField).click();
	}
	public void RegisterButton() {
		 driver.findElement(RegisterButton).click();
	}
}
