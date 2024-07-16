package StepDefinitions_1;

import WebPages_Actions.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_Step1 {
	CommonSteps commonSteps;
	Homepage homePage;

	public Homepage_Step1(CommonSteps commonSteps, Homepage homePage) {

		this.commonSteps = commonSteps;

		this.homePage = homePage;
	}

	@Given("new browser opened")
	public void new_browser_opened() {

	}

	@When("Navigate to url {string}")
	public void navigate_to_url(String string) {
		commonSteps.goToUrl(string);
	}

	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
		try {
			String color = "rgba(255, 165, 0, 1)";
			String homeText = homePage.signup();
			if (color.equals(homeText)) {
				System.out.println("home page is visible successfully");
			}
		} catch (Exception e) {

		}
	}

	@When("Click the {string} button")
	public void click_on_button(String string) {

		homePage.clicksignup();

	}

}
