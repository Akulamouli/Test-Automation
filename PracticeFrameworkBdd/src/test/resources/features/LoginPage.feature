Feature: Login page feature

@test
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

@test
Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

@test
Scenario: Login with correct credentials
Given user is on login page
When user enters username "dec2020secondbatch@gmail.com"
And user enters password "Selenium@12345"
And user clicks on Login button
Then user gets the title of the Home page
And page title should be "My account - My Store"