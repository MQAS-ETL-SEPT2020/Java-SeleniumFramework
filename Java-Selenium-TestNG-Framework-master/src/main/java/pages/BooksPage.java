package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BooksPage {

	By computingInternet = By.xpath("//img[@alt='Picture of Computing and Internet']");

	WebDriver driver;
	WebDriverWait wait;

	public BooksPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void computingInternet() {
		driver.findElement(computingInternet).click();
	}
}
