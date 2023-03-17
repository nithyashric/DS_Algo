Feature: Validating Sign in page

    
  @TS_signin_02
  Scenario: User on Sign in page and sign in with invalid inputs from config.properties
    Given The user is on signin page 
    When Login with invalid username "username" and password "password"
    Then It should display error message "Invalid Username and Password"

     
  @TS_signin_03
  Scenario: User on Sign in page and sign in with valid inputs from config.properties
    Given The user is on signin page
    When Login with valid username password from config
    Then The user redirected to homepage
    
 @TS_signout_04
 Scenario: Verifying Signout link 
    Given The user is logged in
    When The user clicks signout button
    Then It should display message "Logged out successfully"
    
    
  