package com.numpy.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.RegisterPage;
import com.numpy.utils.DriverManager;
import com.numpy.utils.Screenshot;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD03_Register {
	
	
	public static WebDriver driver;
	public HomePage hp;
	@BeforeAll
	public static void setup()
	{

		driver=DriverManager.getDriver();
	}

	@AfterAll
	public static void teardown()
	{
		//driver.close();
	}
	
	@Given("User is in home page without Sign in")
	public void user_is_in_home_page_without_sign_in() {
		hp = new HomePage(driver);
	}

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
	    hp=new HomePage(driver);
	    hp.clickregister();
	}
	


	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty() {
	   RegisterPage rp=new RegisterPage(driver);
	   rp.clickregister();
	}

	@Then("It should display an error message {string} below Username textbox")
	public void it_should_display_an_error_message_below_username_textbox(String string) {
	  
		WebElement registercheck=driver.findElement(By.xpath("/html/body/div[2]"));
		
		if(registercheck.getText().trim().equals(string))
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

	
}
