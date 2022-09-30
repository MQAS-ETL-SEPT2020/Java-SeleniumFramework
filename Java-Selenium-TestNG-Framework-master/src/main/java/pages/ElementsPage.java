package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {
	By album = By.xpath("//a[text()='3rd Album']");
	By music1 = By.xpath("(//a[text()='Music 2'])[1]");
	By music2 = By.xpath("(//a[text()='Music 2'])[2]");
	
	WebDriver driver;
	WebDriverWait wait;

	public ElementsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void album1() {
		driver.findElement(album).click();
	}

}
