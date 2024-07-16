package WebPages_Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Elememts.TestCase1_WebElements;
import StepDefinitions_1.CommonSteps;

public class Homepage {

	private WebDriver driver;
	
	private TestCase1_WebElements testCase1_webElements;
	
	// Constructor

	public Homepage(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
		this.testCase1_webElements = new TestCase1_WebElements(driver);
	}

	// WebPageActions

	public String signup() {

		String color = testCase1_webElements.home.getCssValue("color");
		return color;
	}

	public void clicksignup() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		testCase1_webElements.NewUsertext.click();

	}

	public void newuser(String string) throws Exception {
		Thread.sleep(3000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.textToBePresentInElement(testCase1_webElements.Signup_ui, string));
			System.out.println("'New User Signup!' is visible");

		} catch (Exception e) {
			System.out.println("'New User Signup!' Not Visible");
			e.fillInStackTrace();

		}

	}

	public void signup_Data(String username, String Email) throws Exception  {
		testCase1_webElements.UserName.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		testCase1_webElements.UserEmail.sendKeys(Email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
	}

	public void Sumbit_Signup() throws Exception {
		testCase1_webElements.Signup_button.click();
	}

	
	

}
