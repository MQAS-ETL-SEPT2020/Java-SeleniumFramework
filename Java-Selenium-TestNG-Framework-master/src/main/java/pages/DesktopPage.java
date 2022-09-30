package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesktopPage {
		By Desktop_Click = By.xpath("//img[@alt='Picture of Desktop PC with CDRW']");

		WebDriver driver;
		WebDriverWait wait;

		public DesktopPage(WebDriver driver) {
			this.driver = driver;
			wait = new WebDriverWait(driver, 3);
		}

		public void Desktop() {
			driver.findElement(Desktop_Click).click();
		}
	}


