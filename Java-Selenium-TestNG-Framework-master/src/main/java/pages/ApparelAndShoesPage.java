package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

public class ApparelAndShoesPage extends BasePage {

	By apparelAndShoes = By.xpath("(//a[contains(.,'Apparel ')])[1]");
	By sortBy = By.xpath("//select[@id='products-orderby']");
	By display = By.id("products-pagesize");
	By viewAs = By.id("products-viewmode");
	By image = By.xpath("(//div[@class='picture'])[1]");

	WebDriver driver;
	WebDriverWait wait;

	public ApparelAndShoesPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void clickApparelAndShoes() {
		driver.findElement(apparelAndShoes).click();
	}

	public void selectSort() {
		WebElement drop = driver.findElement(sortBy);
		drop.click();
		Select sel = new Select(drop);
		sel.selectByIndex(3);
	}

	public void selectDisplay() {
		WebElement dropdown = driver.findElement(display);
		dropdown.click();
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);

	}

	public void selectViewAs() {
		WebElement drop2 = driver.findElement(viewAs);
		drop2.click();
		Select sel = new Select(drop2);
		sel.selectByIndex(0);

	}

	public void dress() {
		driver.findElement(image).click();

	}
}
