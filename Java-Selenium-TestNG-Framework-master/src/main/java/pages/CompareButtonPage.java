package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompareButtonPage {
		By compareClick = By.xpath("//input[@title='Remove']");

		WebDriver driver;
		WebDriverWait wait;

		public CompareButtonPage(WebDriver driver) {
		  this.driver=driver;
		  wait=new WebDriverWait(driver, 5);
		}
		public void click() {
			driver.findElement(compareClick).click();
		}

	}
