@data_structure_intro
Feature: User launch dsalgo application and test Data Structure introduction page

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user Login with valid username and password from config 
    Then The user is redirected to homepage


  @TS_DS_02
  Scenario: The user is able to navigate to Data Structure introduction page
    Given The user is on the home page after logged in
    When The user clicks the Getting Started button in Data Structures_Introduction Page introduction Panel
    Then The user be directed to Data Structures-Introduction page
  
  @TS_DS_03
  Scenario: The user is able to navigate to Time Complexity page
    Given The user is on the Data Structures Introduction after logged in
    When The user clicks Time Complexity link
    Then The user should be redirected to Time Complexity page
   
  @TS_DS_04
  Scenario: The user is able to navigate to a page having an tryEditor from Time Complexity page
    Given The user is on the Data Structures Introduction after logged in
    When The user clicks Try Here button on Time Complexity page
    Then The user should be redirected to a page having an tryEditor with a Run button to test  
  
  @TS_DS_05
  Scenario: The user is able run validInput code in tryEditor for Time Complexity page
    Given The user is on the Data Structures Introduction after logged in
    When The user enter python code with "validInput" syntax in tryEditor from config.properties
    Then The user should be presented with "validOutput" result

    
@TS_DS_06
  Scenario: The user is able run invalidInput code in tryEditor for Time Complexity page
    Given The user is on the Data Structures Introduction after logged in
    When The user enter python code with "invalidInput" syntax in tryEditor from config.properties
    Then The user should be presented with "invalidOutput" result
    
  