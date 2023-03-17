@Tree
Feature: User launch dsalgo application and test Tree page

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user Login with valid username and password from config 
    Then The user is redirected to homepage
    
    @TS_DS_02
  Scenario: The user is able to navigate to Tree page
    Given The user is on the home page after logged in
    When The user clicks the Getting Started button in Tree page
    Then The user be directed to Tree page
    
    @TS_DS_03
  Scenario Outline: The user is able to navigate "<topics>" links in Tree page
    Given The user is on the Tree page after logged in
    When The user clicks "<topics>" links in Tree page
    Then The user should be redirected to particular "<topics>" links in Tree page
    Examples: 
      | topics		  |	
      | Overview of Trees	|
| Terminologies	|
| Types of Trees	|
| Tree Traversals	|
| Traversals-Illustration	|
| Binary trees	|
| Types of Binary Trees		|
| Implementation in Python	|
| Binary Tree Traversals 	|
| Implementation of Binary Trees	|
| Applications of Binary trees		|
| Binary Search Trees	|
| Implementation Of BST		|