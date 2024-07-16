package StepDefinitions_1;

import WebPages_Actions.CheckCreatedAccount;
import WebPages_Actions.Homepage;
import WebPages_Actions.NewUserData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class singup_Step2 {
	CommonSteps commonSteps;

	Homepage homePage;

	NewUserData newUserData;

	CheckCreatedAccount checkCreatedAccount;

	public singup_Step2(CommonSteps commonSteps, Homepage homePage, NewUserData newUserData,
			CheckCreatedAccount checkCreatedAccount) {

		this.commonSteps = commonSteps;
		this.newUserData = newUserData;
		this.homePage = homePage;
		this.checkCreatedAccount = checkCreatedAccount;
	}

	@Given("Im at signup page {string}")
	public void signup_page(String string) {
		commonSteps.goToUrl(string);

	}

	@When("Verify {string} is visible")
	public void verify_is_visible(String string) throws Exception {
		homePage.newuser(string);
	}

	@Then("Enter name {string} and email address {string}")
	public void enter_name_and_email_address(String string, String string1) throws Exception {
		homePage.signup_Data(string, string1);

	}

	@Then("submit Signup button")
	public void click_button() throws Exception {
		homePage.Sumbit_Signup();
	}

	@When("Verify that {string} is visible")
	public void verify_that_is_visible(String string) throws Exception {
		newUserData.acc_info(string);
	}

	@Then("Fill details: Title, Name, Email, Password")
	public void fill_details_title_name_email_password(DataTable dataTable) throws Exception {
		newUserData.fill_details(dataTable.cell(1, 1));
	}

	@Then("Select DOB")
	public void select_dob() throws Exception {
		newUserData.dob();

	}

	@Then("Select checkbox Sign up for our newsletter!")
	public void select_checkbox() {
		newUserData.checkbox();
	}

	@Then("Fill details the details")
	public void fill_details(DataTable data_table) throws InterruptedException {
		newUserData.fill_allDetails(data_table.cell(1, 0), data_table.cell(1, 1), data_table.cell(1, 2),
				data_table.cell(1, 3), data_table.cell(1, 4), data_table.cell(1, 5), data_table.cell(1, 6),
				data_table.cell(1, 7), data_table.cell(1, 8), data_table.cell(1, 9));

	}

	@When("Click create account button")
	public void click() throws Exception {
		newUserData.create_button();

	}

	@Given("redirected to account_created page")
	public void redirected_to_acc_created_page() {
		// checkCreatedAccount.AccountCreatedPage(string);

	}

	@When("Verify that {string} is visible or not")
	public void verify_account_created_message(String string) throws Exception {
		try {
			checkCreatedAccount.Account_created(string);
			System.out.println("ACCOUNT CREATED!' is visible");

		} catch (Exception e) {
			System.out.println("'ACCOUNT CREATED!' Not Visible");

		}

	}

	@Then("Click {string} button")
	public void click_continue_button(String string) {
		checkCreatedAccount.Continue();
	}

	@When("Verify that {string} is  visible or not")
	public void verify_logged_in_message(String string) {
		checkCreatedAccount.logged_in_as(string);
	}

	@Then("Click delete button if visible")
	public void click_delete_account_button() {
		checkCreatedAccount.deleteButtom();
	}

	@And("Verify that {string} is visible and click {string} button")
	public void verify_that_is_visible_and_click_button(String string, String string2) {
		checkCreatedAccount.DeleteAndContinue();
	}

}
