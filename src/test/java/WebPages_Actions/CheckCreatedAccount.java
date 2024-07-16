package WebPages_Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Elememts.TestCase1_WebElements;
import StepDefinitions_1.CommonSteps;

public class CheckCreatedAccount {

	private WebDriver driver;

	TestCase1_WebElements testCase1_WebElements;

	CommonSteps commonSteps;

	public CheckCreatedAccount(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
		this.testCase1_WebElements = new TestCase1_WebElements(driver);
	

	}

	public void AccountCreatedPage(String string) {

		commonSteps.goToUrl(string);
	}

	public void Account_created(String string) throws Exception {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(testCase1_WebElements.created_msg, string));
	}

	public void Continue() {
		testCase1_WebElements.Continue.click();
	}

	public void logged_in_as(String string) {
		try {
			String userName = testCase1_WebElements.loggedInAs.getText();
			if (userName.equalsIgnoreCase("Logged in as username" + string)) {
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

	public void DeleteAndContinue() {
		try {
			WebElement deletedMessage = testCase1_WebElements.Account_Deleted;
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(deletedMessage));

			System.out.println("'ACCOUNT DELETED! is visible");
			testCase1_WebElements.Continue2.click();

		} catch (Exception E) {
			System.out.println("'ACCOUNT DELETED! is not visible");
		}

	}
}
