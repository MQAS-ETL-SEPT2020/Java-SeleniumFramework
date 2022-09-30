package pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class JewelleryPage {
		By jewellery = By.xpath("(//a[contains(text(),'Jewelry')])[1]");
		By sort = By.id("products-orderby");
		By ViewAs = By.id("products-viewmode");
		By image = By.xpath("(//a[text()='Black & White Diamond Heart'])[1]");

		WebDriver driver;
		WebDriverWait wait;

		public JewelleryPage(WebDriver driver) {
			this.driver = driver;
			wait = new WebDriverWait(driver, 5);
		}

		public void ClickOnjewel() {
			driver.findElement(jewellery).click();
		}

		public void SortPosition() {
			WebElement sort1 = driver.findElement(sort);
			Select sel = new Select(sort1);
			sel.selectByIndex(3);
		}

		public void ViewPage() {
			WebElement sort3 = driver.findElement(ViewAs);
			Select sel = new Select(sort3);
			sel.selectByIndex(1);
		}

		public void ClickOnImage() {
			driver.findElement(image).click();
		}
	}


