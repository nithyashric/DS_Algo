package com.numpy.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.numpy.PageObjects.GraphPage;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.TreePage;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;
import com.numpy.utils.Screenshot;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD06_Tree {
	
	
	public static WebDriver driver;
	public HomePage hp;

	@BeforeAll
	public static void setup() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}
	//@TS_DS_02
	@When("The user clicks the Getting Started button in Tree page")
	public void the_user_clicks_the_getting_started_button_in_tree_page() {
		HomePage hp = new HomePage(driver);
		hp.clickTree();
	}

	@Then("The user be directed to Tree page")
	public void the_user_be_directed_to_tree_page() {
		WebElement graphLabel = driver.findElement(By.xpath("/html/body/div[2]/h4"));

		if (graphLabel.getText().trim().equals("Tree"))

		{
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}
	}
//@TS_DS_03
	
	@Given("The user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
		hp.clickTree();
	}

	@When("The user clicks {string} links in Tree page")
	public void the_user_clicks_links_in_tree_page(String string) {
		TreePage tp = new TreePage(driver);
		if (string.equals("Overview of Trees")) {
			tp.clickOverviewOfTrees();
		} else if (string.equals("Terminologies")) {
			tp.clickTerminologies();
		}else if (string.equals("Types of Trees")) {
			tp.clickTypesOfTrees();
		}else if (string.equals("Tree Traversals")) {
			tp.clickTreeTraversals();
		}else if (string.equals("Traversals-Illustration")) {
			tp.clickTraversals_Illustration();
		}else if (string.equals("Binary trees")) {
			tp.clickBinaryTrees();
		}else if (string.equals("Types of Binary Trees	")) {
		tp.clickTypesOfBinaryTrees();
	}else if (string.equals("Implementation in Python")) {
		tp.clickImplementationInPython();
	}else if (string.equals("Binary Tree Traversals")) {
		tp.clickBinaryTreeTraversals();
	}else if (string.equals("Implementation of Binary Trees")) {
		tp.clickImplementationOfBinaryTrees();
	}else if (string.equals("Applications of Binary trees")) {
		tp.clickApplicationsOfBinaryTrees();
	}else if (string.equals("Binary Search Trees")) {
		tp.clickBinarySearchTrees();
	}else if (string.equals("Implementation Of BST	")) {
		tp.clickImplementationOfBST();
	}
		
	}

	@Then("The user should be redirected to particular {string} links in Tree page")
	public void the_user_should_be_redirected_to_particular_links_in_tree_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	}


