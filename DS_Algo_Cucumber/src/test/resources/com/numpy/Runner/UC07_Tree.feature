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
| Binary Trees	|
| Types of Binary Trees		|
| Implementation in Python	|
| Binary Tree Traversals 	|
| Implementation of Binary Trees	|
| Applications of Binary trees		|

@TS_DS_04
  Scenario Outline: The user is able to navigate to a page having a tryHere from "<topics>" links in Tree page
    Given The user is on the Tree page after logged in
    When The user clicks Try Here button on "<topics>" links in Tree page
    Then The user should be redirected to a page having an tryEditor with a Run button to test 
    Examples: 
      | topics		  |	
      | Overview of Trees	|
| Terminologies	|
| Types of Trees	|
| Tree Traversals	|
| Traversals-Illustration	|
| Binary Trees	|
| Types of Binary Trees		|
| Implementation in Python	|
| Binary Tree Traversals 	|
| Implementation of Binary Trees	|
| Applications of Binary trees		|     
| Binary Search Trees	|
| Implementation Of BST		|

@TS_DS_05
  Scenario Outline: The user is able run validInput code in tryEditor for "<topics>" in Tree page
    Given The user is on the "<topics>" in Tree page after logged in
    When The user enter python code with "validInput" syntax in tryEditor in "<topics>" from config.properties in Tree page
    Then The user should be presented with "validOutput" result
    Examples: 
    | topics		  |	
    | Overview of Trees	|
	| Terminologies	|
	| Types of Trees	|
	| Tree Traversals	|
	| Traversals-Illustration	|
	| Binary Trees	|
	| Types of Binary Trees		|
	| Implementation in Python	|
	| Binary Tree Traversals 	|
	| Implementation of Binary Trees	|
	| Applications of Binary trees		|     
	| Binary Search Trees	|
	| Implementation Of BST		|
    
    @TS_DS_06
  Scenario Outline: The user is able run invalidInput code in tryEditor for "<topics>" in Tree page
    Given The user is on the "<topics>" in Tree page after logged in
    When The user enter python code with "invalidInput" syntax in tryEditor in "<topics>" from config.properties in Tree page
    Then The user should be presented with "invalidOutput" result
    Examples: 
    | topics		  |	
    | Overview of Trees	|
	| Terminologies	|
	| Types of Trees	|
	| Tree Traversals	|
	| Traversals-Illustration	|
	| Binary Trees	|
	| Types of Binary Trees		|
	| Implementation in Python	|
	| Binary Tree Traversals 	|
	| Implementation of Binary Trees	|
	| Applications of Binary trees		|     
	| Binary Search Trees	|
	| Implementation Of BST		|
    