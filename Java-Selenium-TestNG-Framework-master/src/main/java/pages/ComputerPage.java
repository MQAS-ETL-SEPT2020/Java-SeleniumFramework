
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComputerPage {

	By Desktop = By.xpath("//img[@alt='Picture for category Desktops']");
	By NotebookClick = By.xpath("//img[@alt='Picture for category Notebooks']");
	By AeessoriesClick = By.xpath("//img[@title='Show products in category Accessories']");

	WebDriver driver;
	WebDriverWait wait;

	public ComputerPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void ClickOnDesktop() {
		driver.findElement(Desktop).click();
	}

}
