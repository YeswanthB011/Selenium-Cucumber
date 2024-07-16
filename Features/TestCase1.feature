Feature: Register and Delete User

  @S01
  Scenario: New Login/Signup
    Given new browser opened
    When Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    When Click the 'Signup / Login' button

  @S02
  Scenario: signup
  	Given Im at signup page 'https://automationexercise.com/login'
    When Verify 'New User Signup!' is visible
    Then Enter name 'Tobirama' and email address 'tobirama1@konaha.com'
    Then submit Signup button
    When Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And Fill details: Title, Name, Email, Password
      | Title | Name     | Email               | Password   |
      | Mr.   | Tobirama | tobirama@konaha.com | HateUchiha |
    And Select DOB
    Then Select checkbox Sign up for our newsletter!
    Then Fill details the details
      | First name | Last name | Company | Address            | Address2  | Country     | State       | City   | Zipcode | Mobile Number |
      | Tobirama   | Senju     | Hokage  | konaha,leafvillage | near fort | narutoverse | leafvillage | konaha |    FYI1 |    9876543210 |
    When Click create account button
    Given redirected to account_created page
    When Verify that 'ACCOUNT CREATED!' is visible or not
    Then Click 'Continue' button
    When Verify that 'Logged in as username' is  visible or not 
    Then Click delete button if visible
    And Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
