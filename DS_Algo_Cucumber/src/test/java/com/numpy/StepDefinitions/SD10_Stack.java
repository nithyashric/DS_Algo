package com.numpy.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.numpy.PageObjects.ArrayPage;
import com.numpy.PageObjects.GraphPage;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.StackPage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;
import com.numpy.utils.ConfigReader;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;
import com.numpy.utils.Screenshot;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD10_Stack {
	
	public static WebDriver driver;
	public HomePage hp;

	@BeforeAll
	public static void setup() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}
//@TS_DS_02
	
	@When("The user clicks the Getting Started button in Stack page")
	public void the_user_clicks_the_getting_started_button_in_stack_page() {
		HomePage hp = new HomePage(driver);
		hp.clickStack();
	}

	@Then("The user be directed to Stack page")
	public void the_user_be_directed_to_stack_page() {
		WebElement graphLabel = driver.findElement(By.xpath("/html/body/div[2]/h4"));

		if (graphLabel.getText().trim().equals("Stack"))

		{
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}
	}
//TS_DS_03
	
	@Given("The user is on the Stack page after logged in")
	public void the_user_is_on_the_stack_page_after_logged_in() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
		hp.clickStack();
	}

	@When("The user clicks {string} links in Stack page")
	public void the_user_clicks_links_in_stack_page(String string) {
		StackPage sp = new StackPage(driver);
		if (string.equals("Operations in Stack")) {
			sp.clickoperationsInStack();
		} else if (string.equals("Implementation")) {
			sp.clickimplementation();
		}else if (string.equals("Applications")) {
			sp.clickapplications();
		}
	}

	@Then("The user should be redirected to particular {string} links in Stack page")
	public void the_user_should_be_redirected_to_particular_links_in_stack_page(String string) {
		
		string=string.trim();
		if (string.equals("Operations in Stack")) {

			WebElement Label = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Operations in Stack")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		} else if (string.equals("Implementation")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Implementation")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		} else if (string.equals("Applications")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Applications")) {
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
	@When("The user clicks Try Here button on {string} links in Stack page")
	public void the_user_clicks_try_here_button_on_links_in_stack_page(String string) {
		HomePage hp = new HomePage(driver);
		hp.clickStack();
		string=string.trim();
		StackPage sp = new StackPage(driver);
		if (string.equals("Operations in Stack")) 
		
		{
			sp.clickoperationsInStack();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();
			WebElement inputLabel = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		} else if (string.equals("Implementation")) {
			
			sp.clickimplementation();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();
			
			WebElement inputLabel = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		}
		
	else if (string.equals("Applications")) {
			
			sp.clickapplications();
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
	@Given("The user is on the {string} in Stack page after logged in")
	public void the_user_is_on_the_in_stack_page_after_logged_in(String string) {
		string=string.trim();
		HomePage hp = new HomePage(driver);
		hp.clickStack();
		StackPage sp = new StackPage(driver);
		if (string.equals("Operations in Stack")) {
			sp.clickoperationsInStack();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

			
		} else if (string.equals("Implementation")) {
			sp.clickimplementation();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}else if (string.equals("Applications")) {
			sp.clickapplications();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}else
		{
			Assert.fail("Invalid user click:"+string);
		}
	}

	

	@When("The user enter python code with {string} syntax in tryEditor in {string} from config.properties in Stack page")
	public void the_user_enter_python_code_with_syntax_in_try_editor_in_from_config_properties_in_stack_page(String string, String string2) {
		TryHereRunPage rp=new TryHereRunPage(driver);
		rp.setInput(ConfigReader.getProperty("app."+string));
		rp.clickbutton();

	}



}
