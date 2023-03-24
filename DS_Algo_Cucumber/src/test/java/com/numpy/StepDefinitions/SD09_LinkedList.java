package com.numpy.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LinkedListPage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;
import com.numpy.utils.ConfigReader;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;
import com.numpy.utils.Screenshot;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD09_LinkedList {
	
	public static WebDriver driver;
	public HomePage hp;

	@BeforeAll
	public static void setup() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}
	
	//@TS_DS_02
	
	@When("The user clicks the Getting Started button in Linked List page")
	public void the_user_clicks_the_getting_started_button_in_linked_list_page() {
		HomePage hp = new HomePage(driver);
		hp.clickLinkedList();
	}

	@Then("The user be directed to Linked List page")
	public void the_user_be_directed_to_linked_list_page() {
		WebElement Label = driver.findElement(By.xpath("/html/body/div[2]/h4"));

		if (Label.getText().trim().equals("Linked List"))

		{
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}
	}
	
	//TS_DS_03

	@Given("The user is on the Linked List page after logged in")
	public void the_user_is_on_the_linked_list_page_after_logged_in() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
		hp.clickLinkedList();
	}

	@When("The user clicks {string} links in Linked List page")
	public void the_user_clicks_links_in_linked_list_page(String string) {
		string=string.trim();
		LinkedListPage lp = new LinkedListPage(driver);
		if (string.equals("Introduction")) {
			lp.clickintroduction();
		} else if (string.equals("Creating Linked List")) {
			lp.clickcreatingLinkedList();
		}else if (string.equals("Types of Linked List")) {
			lp.clicktypesOfLinkedList();
		}else if (string.equals("Implement Linked List in Python")) {
			lp.clickimplementLinkedListInPython();
		}else if (string.equals("Traversal")) {
			lp.clicktraversal();
		}else if (string.equals("Insertion")) {
			lp.clickinsertion();
		}else if (string.equals("Deletion")) {
			lp.clickdeletion();
		}
		else
		{
			Assert.fail("Invalid user click:"+string);
		}

	}

	
	@Then("The user should be redirected to particular {string} links in Linked List page")
	public void the_user_should_be_redirected_to_particular_links_in_linked_list_page(String string) {
		string=string.trim();
		if (string.equals("Introduction")) {

			WebElement Label = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Introduction")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		} else if (string.equals("Creating Linked List")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Creating Linked LIst")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}else if (string.equals("Types of Linked List")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Types of Linked List")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}else if (string.equals("Implement Linked List in Python")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Implement Linked List in Python")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}else if (string.equals("Traversal")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Traversal")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}else if (string.equals("Insertion")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Insertion")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}else if (string.equals("Deletion")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Deletion")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		else
		{
			Assert.fail("Invalid user click:"+string);
		}

	}
	//TS_DS_04
	@When("The user clicks Try Here button on {string} links in Linked List page")
	public void the_user_clicks_try_here_button_on_links_in_linked_list_page(String string) {
		string=string.trim();
		HomePage hp = new HomePage(driver);
		hp.clickLinkedList();
		LinkedListPage lp = new LinkedListPage(driver);
		if (string.equals("Introduction")) {
						lp.clickintroduction();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

			WebElement inputLabel = driver
					.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		} else if (string.equals("Creating Linked List")) {
			
			lp.clickcreatingLinkedList();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();
			WebElement inputLabel = driver
					.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		} else if (string.equals("Types of Linked List")) {
			
			lp.clicktypesOfLinkedList();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();
			WebElement inputLabel = driver
					.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		} else if (string.equals("Implement Linked List in Python")) {
			
			lp.clickimplementLinkedListInPython();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();
			WebElement inputLabel = driver
					.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		} else if (string.equals("Traversal")) {
			
			lp.clicktraversal();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();
			WebElement inputLabel = driver
					.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		} else if (string.equals("Insertion")) {
			
			lp.clickinsertion();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();
			WebElement inputLabel = driver
					.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		} else if (string.equals("Deletion")) {
			
			lp.clickdeletion();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();
			WebElement inputLabel = driver
					.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		} 
		else
		{
			Assert.fail("Invalid user click:"+string);
		}
	}
	//TS_DS_05
	@Given("The user is on the {string} in Linked List page after logged in")
	public void the_user_is_on_the_in_linked_list_page_after_logged_in(String string) {
		string=string.trim();
		HomePage hp = new HomePage(driver);
		hp.clickLinkedList();
		LinkedListPage lp = new LinkedListPage(driver);
		if (string.equals("Introduction")) {
			lp.clickintroduction();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

			
		} else if (string.equals("Creating Linked List")) {
			lp.clickcreatingLinkedList();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}else if (string.equals("Types of Linked List")) {
			lp.clicktypesOfLinkedList();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}else if (string.equals("Implement Linked List in Python")) {
			lp.clickimplementLinkedListInPython();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}else if (string.equals("Traversal")) {
			lp.clicktraversal();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}else if (string.equals("Insertion")) {
			lp.clickinsertion();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}else if (string.equals("Deletion")) {
			lp.clickdeletion();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}
		else
		{
			Assert.fail("Invalid user click:"+string);
		}
	}

	@When("The user enter python code with {string} syntax in tryEditor in {string} from config.properties in Linked List page")
	public void the_user_enter_python_code_with_syntax_in_try_editor_in_from_config_properties_in_linked_list_page(String string, String string2) {
		TryHereRunPage rp=new TryHereRunPage(driver);
		
		rp.setInput(ConfigReader.getProperty("app."+string));
		rp.clickbutton();
	}



}
