package Elememts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TestCase1_WebElements {
	
	
	//Page 1 - Home Page
	@FindBy(xpath="//*[contains(text(),' Home')]")public WebElement home;
	@FindBy(xpath="//*[contains(text(),' Signup / Login' )]")public WebElement NewUsertext;
	
	
	//Page 2 - Sign-Up	
	@FindBy(xpath="//*[contains(text(),'New User Signup!')]") public WebElement Signup_ui;
	@FindBy(xpath="//input[@placeholder='Name']") public WebElement UserName;
	@FindBy(xpath="//input[@placeholder='Email Address' and @data-qa='signup-email']") public WebElement UserEmail;
	@FindBy(xpath="//button[text()='Signup']") public WebElement Signup_button;
	
	//Page 3 - New User Details
	
	@FindBy(xpath="//*[contains(text(),'Enter Account Information')]") public WebElement AccountInfo;
	@FindBy(xpath="//input[@id='id_gender1']") public WebElement gender;
	@FindBy(xpath="//input[@id='password']") public WebElement password;
	@FindBy(id="days") public WebElement day;
	@FindBy(id="months") public WebElement months;
	@FindBy(id="years") public WebElement years;
	@FindBy(id="newsletter") public WebElement newsletter;
	@FindBy(id="optin") public WebElement specialOffers;
	@FindBy(id="first_name") public WebElement first_name;
	@FindBy(id="last_name") public WebElement last_name;
	@FindBy(id="company") public WebElement company;
	@FindBy(id="address1") public WebElement address1;
	@FindBy(id="address2") public WebElement address2;
	@FindBy(id="country") public WebElement country;
	@FindBy(id="state") public WebElement state;
	@FindBy(id="city") public WebElement city;
	@FindBy(id="zipcode") public WebElement zipcode;
	@FindBy(id="mobile_number") public WebElement mobilenumber;
	@FindBy(xpath="//button[text()='Create Account']") public WebElement Create_AccBtn;
	
	//Page 4 - Account Created
	
	@FindBy(xpath="//*[contains(text(),'Account Created!')]") public WebElement created_msg;
	@FindBy(xpath="//*[contains(text(),'Continue')]") public WebElement Continue;
	
	//Page 5 - Delete Account
	@FindBy(xpath="//*[contains(text(),' Logged in as ')]") public WebElement loggedInAs;
	@FindBy(xpath="//*[contains(text(),'Delete Account')]") public WebElement DelAcc;
	@FindBy(xpath="//*[contains(text(),'Account Deleted!')]") public WebElement Account_Deleted;
	@FindBy(xpath="//button[text()='Continue']") public WebElement Continue2;
	public WebDriver driver;
	
	 
	public TestCase1_WebElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	}
	
	


