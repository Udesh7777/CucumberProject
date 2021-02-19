@End_To_End_Testing
Feature: To validate the login functionality

  Background: 
    Given user has to launch chrome and hit the FB url

  Scenario: To verify login functionality with valid username and invalid password
    When user has to enter the  username and password
      | username  | password |
      | Alluarjun | 12345456 |
      | Mahesh    |  6543211 |
      | Chiru     | 09876567 |
    And click the login button
    Then user unable to enter the home page

  Scenario: To verify the Forgot Password
    When user has to click the forgotten password link
    And user has to enter credentials
    And user has to click serach button
    Then user has to be redirected the OTP page
