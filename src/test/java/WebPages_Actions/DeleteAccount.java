package WebPages_Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Elememts.TestCase1_WebElements;
import StepDefinitions_1.CommonSteps;

public class DeleteAccount {

	private WebDriver driver;

	private TestCase1_WebElements testCase1_WebElements;

	public DeleteAccount(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
		this.testCase1_WebElements = new TestCase1_WebElements(driver);
	}

	public void logged_in_as(String string) {
		try {
			String userName = testCase1_WebElements.loggedInAs.getText();
			if (userName.toLowerCase().equalsIgnoreCase(("Logged in as username" + string).toLowerCase())) {
				System.out.println("'Logged in as username' is visible");
			} else {
				System.out.println("'Logged in as username' is not visible");
			}
		} catch (Exception e) {

		}
	}

	public void deleteButtom() {
		try {
			WebElement DeleteButton = testCase1_WebElements.DelAcc;
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(DeleteButton));

			System.out.println("'Delete Account' is visible");
			DeleteButton.click();

		} catch (Exception E) {
			System.out.println("'Delete Account' is not visible");
		}

	}

}
