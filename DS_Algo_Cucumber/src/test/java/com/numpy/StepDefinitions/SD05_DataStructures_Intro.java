package com.numpy.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.numpy.utils.Screenshot;
import org.junit.Assert;

import com.numpy.PageObjects.DataStructures_IntroPage;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;
import com.numpy.utils.ConfigReader;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD05_DataStructures_Intro {
	
	public static WebDriver driver;
	public HomePage hp;
	@BeforeAll
	public static void setup()
	{
		MyLogger.error("Function:"+Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}

//Background
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
		MyLogger.error("Function:"+Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp=new HomePage(driver);		
		WebElement checkSignin=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]"));
		if(checkSignin.getText().trim().equals("Sign in"))
		{
			hp.clicklogin();
		}
	}

	@When("The user Login with valid username and password from config")
	public void the_user_login_with_valid_username_and_password_from_config() {
		MyLogger.error("Function:"+Thread.currentThread().getStackTrace()[1].getMethodName());
		WebElement checkSignin=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]"));
		MyLogger.error("gettext:"+checkSignin.getText());
		
		if(checkSignin.getText().trim().equals("Sign in"))
		{
			MyLogger.error("logging in:"+checkSignin.getText());
			LoginPage lp = new LoginPage(driver);
			lp.setUserName(ConfigReader.getProperty("app.userName"));
			lp.setPassword(ConfigReader.getProperty("app.password"));
			lp.clickSubmit();
		}
		else
		{
			MyLogger.error("not logging in:"+checkSignin.getText());
		}
	}

	@Then("The user is redirected to homepage")
	public void the_user_is_redirected_to_homepage()
	{
		MyLogger.error("Function:"+Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage lp = new HomePage(driver);
	}

	//@TS_DS_02
	@Given("The user is on the home page after logged in")
	public void the_user_is_on_the_home_page_after_logged_in() {
		MyLogger.error("Function:"+Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp=new HomePage(driver);
	}

	@When("The user clicks the Getting Started button in Data Structures_Introduction Page introduction Panel")
	public void the_user_clicks_the_getting_started_button_in_data_structures_introduction_page_introduction_panel() {
		HomePage hp = new HomePage(driver);
		hp.clickDataStructures();
		
	}

	@Then("The user be directed to Data Structures-Introduction page")
	public void the_user_be_directed_to_data_structures_introduction_page() {
		
		WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/h4"));
																	  	
		if(timeComplexityLabel.getText().trim().equals("Data Structures-Introduction"))
				
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
		            .getMethodName(), driver);
			Assert.assertTrue(false);
		}
	}
//@TS_DS_03
	@Given("The user is on the Data Structures Introduction after logged in")
	public void the_user_is_on_the_data_structures_introduction_after_logged_in() {
		MyLogger.error("Function:"+Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp=new HomePage(driver);
		hp.clickDataStructures();
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		DataStructures_IntroPage ds = new DataStructures_IntroPage(driver);
		ds.clicktimeComplexity();
	}

	@Then("The user should be redirected to Time Complexity page")
	public void the_user_should_be_redirected_to_time_complexity_page() {
		WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Time Complexity"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
		            .getMethodName(), driver);
			Assert.assertTrue(false);
		}
	}

	//@TS_DS_04
	@When("The user clicks Try Here button on Time Complexity page")
	public void the_user_clicks_try_here_button_on_time_complexity_page() {
		DataStructures_IntroPage ds = new DataStructures_IntroPage(driver);
		ds.clicktimeComplexity();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
	}
	

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		
		WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{	
			Assert.assertTrue(true); 
		}
		else
		{
			Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
		            .getMethodName(), driver);
			Assert.assertTrue(false);
		}
	}

	//@TS_DS_04
	@When("The user enter python code with {string} syntax in tryEditor from config.properties")
	public void the_user_enter_python_code_with_valid_syntax_in_try_editor_from_config_properties(String string) {
	    // Write code here that turns the phrase above into concrete actions
		DataStructures_IntroPage ds = new DataStructures_IntroPage(driver);
		ds.clicktimeComplexity();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		TryHereRunPage rp=new TryHereRunPage(driver);
		
		rp.setInput(ConfigReader.getProperty("app."+string));
		rp.clickbutton();
		
	}

	@Then("The user should be presented with {string} result")
	public void the_user_should_be_presented_with_run_result(String string) {
		TryHereRunPage rp=new TryHereRunPage(driver);

		if(string.equals("validOutput") && rp.getOutput().equals(ConfigReader.getProperty("app."+string)))
		{
			Assert.assertTrue(true); 
			return;
		}
		else if(string.equals("invalidOutput"))
		{
			driver.switchTo().alert().accept();
			if (rp.getOutput().equals(""))
			{
				Assert.assertTrue(true);
				return;
			}
		}
		
			Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
		            .getMethodName(), driver);
			Assert.assertTrue(false);
	
	}

}
