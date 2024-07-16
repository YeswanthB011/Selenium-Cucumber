package StepDefinitions_1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Elememts.TestCase1_WebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSteps {

	private WebDriver driver;

	TestCase1_WebElements testCase1_WebElements;

	@Before
	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void goToUrl(String url) {
		driver.get(url);
	}

	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentPageTitle() {
		return driver.getTitle();
	}

	public WebDriver getDriver() {
		return driver;
	}

	@After
	public void quit(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(Screenshot,"image/png",scenario.getName());
		}
		
		driver.quit();

	}

}
