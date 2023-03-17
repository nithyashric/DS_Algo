@TS_getstarted_01
Feature: GetStarted

Scenario: User launch dsalgo application and test Home page

	Given User Launch Chrome browser 
	When The user opens DS Algo portal URL "https://dsportalapp.herokuapp.com/"
	And The user clicks the "Get Started" button
    Then The user should be redirected to homepage
    