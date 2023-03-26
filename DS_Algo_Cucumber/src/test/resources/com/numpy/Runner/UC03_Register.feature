Feature: Validating Register page and registering new user

@TS_DS_01
  Scenario: User launch home page of an dsalgo project
    Given User Launch Chrome browser 
	When The user opens DS Algo portal URL "https://dsportalapp.herokuapp.com/"
	And The user clicks the "Get Started" button
    Then The user should be redirected to homepage
    
 @TS_DS_02
 
 Scenario: User redirected to register page 
    Given User is in home page without Sign in 
	When The user opens Register Page
    Then The user redirected to Register page

   Scenario: The user is presented with error message for empty fields below Username textbox
    Given The user opens Register Page
    When The user clicks Register button with all fields empty
    Then It should display an error message "Please fill out this field." below Username textbox