package com.numpy.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.numpy.PageObjects.ArrayPage;
import com.numpy.PageObjects.GraphPage;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;
import com.numpy.utils.ConfigReader;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;
import com.numpy.utils.Screenshot;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD08_Array {
	
	public static WebDriver driver;
	public HomePage hp;

	@BeforeAll
	public static void setup() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}

	//TS_DS_02
	@When("The user clicks the Getting Started button in Array page")
	public void the_user_clicks_the_getting_started_button_in_array_page() {
		
		HomePage hp = new HomePage(driver);
		hp.clickArray();
	    
	}

	@Then("The user be directed to Array page")
	public void the_user_be_directed_to_array_page() {
	    
		WebElement Label = driver.findElement(By.xpath("/html/body/div[2]/h4"));

		if (Label.getText().trim().equals("Array"))

		{
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}
		
	}
	
	//TS_DS_03
	
	@Given("The user is on the Array page after logged in")
	public void the_user_is_on_the_array_page_after_logged_in() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
		hp.clickArray();
	    
	}

	@When("The user clicks {string} links in Array page")
	public void the_user_clicks_links_in_array_page(String string) {
		ArrayPage ap = new ArrayPage(driver);
		string=string.trim();
		if (string.equals("Arrays in Python")) {
			ap.clickarraysInPython();
		} else if (string.equals("Arrays Using List")) {
			ap.clickarraysUsingList();
		}else if (string.equals("Basic Operations in Lists")) {
			ap.clickbasicsOperationsInLists();
		}else if (string.equals("Applications of Array")) {
			ap.clickapplicationsOfArray();
		}
		else
		{
			Assert.fail("Invalid user click:"+string);
		}
	}

	@Then("The user should be redirected to particular {string} links in Array page")
	public void the_user_should_be_redirected_to_particular_links_in_array_page(String string) {
		string=string.trim();
		if (string.equals("Arrays in Python")) {

			WebElement Label = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Arrays in Python")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		} else if (string.equals("Arrays Using List")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Arrays Using List")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		} else if (string.equals("Basic Operations in Lists")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Basic Operations in Lists")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Applications of Array")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Applications of Array")) {
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
	
	@When("The user clicks Try Here button on {string} links in Array page")
	public void the_user_clicks_try_here_button_on_links_in_array_page(String string) {
		HomePage hp = new HomePage(driver);
		hp.clickArray();
		string=string.trim();
		ArrayPage ap = new ArrayPage(driver);
		if (string.equals("Arrays in Python")) 
		
		{
			ap.clickarraysInPython();
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
			
		} else if (string.equals("Arrays Using List")) {
			
			ap.clickarraysUsingList();
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
		
	else if (string.equals("Basic Operations in Lists")) {
			
			ap.clickbasicsOperationsInLists();
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
			else if (string.equals("Applications of Array")) {
				
				ap.clickapplicationsOfArray();
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
	
	@Given("The user is on the {string} in Array page after logged in")
	public void the_user_is_on_the_in_array_page_after_logged_in(String string) {
		string=string.trim();
		HomePage hp = new HomePage(driver);
		hp.clickArray();
		ArrayPage ap = new ArrayPage(driver);
		if (string.equals("Arrays in Python")) {
			ap.clickarraysInPython();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

			
		} else if (string.equals("Arrays Using List")) {
			ap.clickarraysUsingList();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}else if (string.equals("Basic Operations in Lists")) {
			ap.clickbasicsOperationsInLists();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();

		}else if (string.equals("Applications of Array")) {
			ap.clickapplicationsOfArray();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();
		}
		else
		{
			Assert.fail("Invalid user click:"+string);
		}
	}

	@When("The user enter python code with {string} syntax in tryEditor in {string} from config.properties in Array page")
	public void the_user_enter_python_code_with_syntax_in_try_editor_in_from_config_properties_in_array_page(String string, String string2) {
		TryHereRunPage rp=new TryHereRunPage(driver);
		rp.setInput(ConfigReader.getProperty("app."+string));
		rp.clickbutton();
	}



	}


