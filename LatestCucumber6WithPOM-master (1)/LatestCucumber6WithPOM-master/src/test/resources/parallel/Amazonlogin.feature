Feature: Login page feature

  @tag1
  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Amazon Sign In"

  @tag2
  Scenario: Login with correct credentials
    Given user is on login page
    When user clicks on "Account & Lists" dropdown
    Then user redirected to the Sign in page
    When user enters username "moulimouli789@gmail.com"
    And user clicks on the continue button
    Then user redirected to the Sign in page
    And user enters password "mouliAkula3"
    And user clicks on Signin button
    Then user gets the title of the page
    And page title should be "Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available."

  @tag3
  Scenario: Verify if a user cannot login with a valid username and an invalid password.
    Given user is on login page
    When user clicks on "Account & Lists" dropdown
    Then user redirected to the Sign in page
    When user enters username "moulimouli789@gmail.com"
    And user clicks on the continue button
    Then user redirected to the Sign in page
    And user enters worng password "mouliAkula33"
    And user clicks on Signin button
    Then user gets the error message
    And error message should be "Your password is incorrect"

  @tag4
  Scenario: Verify if a user cannot login with a invalid username.
    Given user is on login page
    When user clicks on "Account & Lists" dropdown
    Then user redirected to the Sign in page
    When user does not enters username
    And user clicks on the continue button
    Then user gets the error message
    And error message should be "We cannot find an account with that email address"

  @tag5
  Scenario: Verify the login page for user name, when the field is blank and continue button is clicked
    Given user is on login page
    When user clicks on "Account & Lists" dropdown
    Then user redirected to the Sign in page
    When user enters dose not enter username
    Then user gets the error message
    And error message should be "Enter your email or mobile phone number"

  @tag7
  Scenario: Verify the login page for password, when the field is blank and Submit button is clicked
    Given user is on login page
    When user clicks on "Account & Lists" dropdown
    Then user redirected to the Sign in page
    When user enters username "moulimouli789@gmail.com"
    And user clicks on the continue button
    Then user redirected to the Sign in page
    And user does not enters  password
    Then user gets the error message
    And error message should be "Enter your password"
