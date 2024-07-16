package WebPages_Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Elememts.TestCase1_WebElements;
import StepDefinitions_1.CommonSteps;
import io.cucumber.datatable.DataTable;

public class NewUserData {

	TestCase1_WebElements testCase1_WebElements;

	private WebDriver driver;

	CommonSteps commonSteps;

	DataTable data_table;

	public NewUserData(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
		this.testCase1_WebElements = new TestCase1_WebElements(driver);
	}

	public void acc_info(String string) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.textToBePresentInElement(testCase1_WebElements.AccountInfo, string));
			System.out.println("'Enter Account Information' is visible");

		} catch (Exception e) {
			System.out.println("'Enter Account Information 'Not Visible");

		}

	}

	public void fill_details(String string) throws Exception {
		Thread.sleep(2500);
		testCase1_WebElements.gender.click();
		Thread.sleep(2500);
		testCase1_WebElements.password.sendKeys(string);
		
	}

	public void dob() throws Exception {

		Select dropdown_day = new Select(testCase1_WebElements.day);
		dropdown_day.selectByValue("1");
		Thread.sleep(2500);
		Select dropdown_months = new Select(testCase1_WebElements.months);
		dropdown_months.selectByVisibleText("March");
		Thread.sleep(2500);
		Select dropdown_years = new Select(testCase1_WebElements.years);
		dropdown_years.selectByValue("2002");

	}

	public void checkbox() {
		testCase1_WebElements.newsletter.click();
		testCase1_WebElements.specialOffers.click();
	}

	public void fill_allDetails(String first_name, String last_name, String company, String address1, String address2, 
			String country, String state, String city, String zipcode,String  string) throws InterruptedException {
		Thread.sleep(2500);
		testCase1_WebElements.first_name.sendKeys(first_name);
		Thread.sleep(2500);
		testCase1_WebElements.last_name.sendKeys(last_name);
		Thread.sleep(2500);
		testCase1_WebElements.company.sendKeys(company);
		Thread.sleep(2500);
		testCase1_WebElements.address1.sendKeys(address1);
		Thread.sleep(2500);
		testCase1_WebElements.address2.sendKeys(address2);
		Thread.sleep(2500);
		testCase1_WebElements.country.sendKeys(country);
		Thread.sleep(2500);
		testCase1_WebElements.state.sendKeys(state);
		Thread.sleep(2000);
		testCase1_WebElements.city.sendKeys(city);
		Thread.sleep(2000);
		testCase1_WebElements.zipcode.sendKeys(zipcode);
		Thread.sleep(2000);
		testCase1_WebElements.mobilenumber.sendKeys(string);
	}

	public void create_button() throws Exception {
		Thread.sleep(2000);
		testCase1_WebElements.Create_AccBtn.click();
	}



}
