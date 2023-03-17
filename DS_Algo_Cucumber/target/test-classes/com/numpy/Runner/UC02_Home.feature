Feature: Test HomePage 
@TS_home_01
    Scenario Outline: User is on Home page and click getstarted link "<option>" on home page without sign in
    Given The user is on Home page
    When The user clicks on Get Started link on homepage "<option>" without login
    Then The user get warning message "You are not logged in"

  Examples:       
  	  | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
   @TS_home_02
   	Scenario: User is on homepage and click Sign in
   	Given The user is on Home page
   	When The user clicks Sign in link
   	Then The user redirected to Login page
   	
   	@TS_home_03
   	Scenario: User is on homepage and click Register
   	Given The user is on Home page
   	When The user clicks Register link
   	Then The user redirected to Register page
   	
   	
  @TS_home_04
  Scenario: Verifying Signin link
    Given The user is on Home page
    When The user clicks on Sign in link
    Then The user redirected to signin page