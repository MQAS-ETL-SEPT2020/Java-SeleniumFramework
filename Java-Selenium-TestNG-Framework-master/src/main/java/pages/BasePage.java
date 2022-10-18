package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BasePage {
//String url1;	

//	protected BasePage(String applicationUrl){
//  String applicationUrl="https://demowebshop.tricentis.com/";
//	url1 = applicationUrl;
//	System.out.println("Iam in Basepage "+ url1);
//	}

//BasePage url1=new BasePage(applicationUrl);
//String url = applicationUrl;
	public static WebDriver driver;
	public static ExtentTest logger;
	public static ExtentReports report;

	@BeforeClass(alwaysRun = true)
	public void setup(ITestContext context) {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); // This suppresses the
																								// Severe Timed out
																								// receiving messages
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://demowebshop.tricentis.com/";
		driver.get(url);
		// driver.get(url1);
		context.setAttribute("WebDriver", driver);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
