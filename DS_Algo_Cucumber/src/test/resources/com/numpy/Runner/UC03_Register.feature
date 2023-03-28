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
	When The user clicks Register button in Home Page
    Then The user redirected to Register page
 @TS_DS_03
   Scenario: The user is presented with error message for empty fields below Username textbox
    Given The user is on the Register Page
    When The user clicks Register button with all fields empty
    Then It should display an error message "Please fill out this field." below Username textbox
    
  @TS_DS_04
    Scenario: The user is presented with error message for empty fields below Password textbox
    Given The user is on the Register Page
    When The user clicks Register button after entering "username" with other fields empty
      | username       |
      | Nithya26 	   |	
    Then It should display an error message "Please fill out this field." below Password textbox
    
    @TS_DS_05
  Scenario: The user is presented with error message for empty fields below confirm Password textbox
    Given The user is on the Register Page
    When The user clicks Register button after entering "username" and "password" with Password Confirmation field empty
      | username       | password     |
      | Nithya26 | Numpyninja |
    Then It should display an error message "Please fill out this field." below Password Confirmation textbox
    
      @TS_DS_06
    Scenario: The user is presented with error message for password mismatch
    Given The user is on the Register Page
    When The user clicks Register button after entering valid "username" and different passwords in "password" and "password confirmation" fields
      | username       | password     | password confirmation |
      | Nithya26 | Numpyninja | Numpyninja123         |
    Then It should display an error message "password_mismatch:The two password fields didn't match."
   
     @TS_DS_07
  Scenario: The user is presented with error message for invalid username
    Given The user is on the Register Page
    When The user enters the "username" with characters other than Letters, digits and "@/./+/-/_ and enters valid passwords in "password" and "password confirmation" fields"
      | username | password     | password confirmation |
      | Nithya** | Numpyninja | Numpyninja          |
    Then It should display an error message " Please enter a valid username "
    
    @TS_DS_08
  
  Scenario: The user is presented with error message for password with characters less than 8
    Given The user is on the Register Page
    When The user enters a valid "username" and "password" "password confirmation" with characters less than 8
      | username       | password | password confirmation |
      | Nithya26 | Numpy  | Numpy         |
    Then It should display an error message "Password should contain at least 8 characters."
    
       
     
    @TS_DS_09
  Scenario: The user is presented with error message for password too similar to your other personal information
    Given The user is on the Register Page
    When The user enters a valid "username" and "password" and "password confirmation" similar to username
      | username       | password   | password confirmation |
      | Nithya26 | nithya2626 | nithya2626            |
    Then It should display an error message "password can’t be too similar to your other personal information."
    
 
    @TS_DS_10
  Scenario: The user is presented with error message for commonly used password
    Given The user is on the Register Page
    When The user enters a valid "username" and commonly used password for "password" and "password confirmation" 
      | username       | password | password confirmation |
      | Nithya26 | Welcome123 | Welcome123              |
    Then It should display an error message "Password can’t be commonly used password"
    
    @TS_DS_11
  Scenario: The user is presented with error message for password with only numbers
    Given The user is on the Register Page
    When The user enters a valid "username" and "password" and "password confirmation" with only numbers
      | username       | password | password confirmation |
      | Nithya26 | 12345678 |              12345678 |
    Then It should display an error message "Password cannot be entirely numeric."
    
    @TS_DS_12
  Scenario: The user redirected to Homepage with valid details
    Given The user is on the Register Page
    When The user enters a valid "username" and "password" and "password confirmation"
      | username       | password  | password confirmation |
      | Nithya41 | Numpyninja | Numpyninja             |
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in" in Homepage
    
    
    
   