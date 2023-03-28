package com.numpy.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.RegisterPage;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;
import com.numpy.utils.Screenshot;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD03_Register {

	public static WebDriver driver;
	public HomePage hp;
	public RegisterPage rp;

	@BeforeAll
	public static void setup() {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}

//TS_DS_02

	@Given("User is in home page without Sign in")
	public void user_is_in_home_page_without_sign_in() {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		hp = new HomePage(driver);
	}

	@When("The user clicks Register button in Home Page")
	public void the_user_clicks_register_button_in_home_page() {

		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		hp = new HomePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp.clickregister();

	}
//TS_DS_03

	@Given("The user is on the Register Page")
	public void the_user_is_on_the_register_page() {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		rp = new RegisterPage(driver);

	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
		rp = new RegisterPage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();

	}

	@Then("It should display an error message {string} below Username textbox")
	public void it_should_display_an_error_message_below_username_textbox(String string) {

		// WebElement registercheck=driver.findElement(By.xpath("/html/body/div[2]"));
		WebElement registercheck = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form"));

		if (registercheck.getText().trim().equals(string)) {
			Assert.assertTrue(false);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(true);
		}
	}

	// TS_DS_04

	@When("The user clicks Register button after entering {string} with other fields empty")
	public void the_user_clicks_register_button_after_entering_with_other_fields_empty(String string,
			io.cucumber.datatable.DataTable dataTable) {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya26");
		rp.setPasswordInput("");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();
	}

	@Then("It should display an error message {string} below Password textbox")
	public void it_should_display_an_error_message_below_password_textbox(String string) {
		WebElement registercheck = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/span[2]/ul/li[1]"));
		if (registercheck.getText().trim().equals(string)) {
			Assert.assertTrue(false);
		} else {
			MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(true);
		}

	}

	// TS_DS_05
	@When("The user clicks Register button after entering {string} and {string} with Password Confirmation field empty")
	public void the_user_clicks_register_button_after_entering_and_with_password_confirmation_field_empty(String string,
			String string2, io.cucumber.datatable.DataTable dataTable) {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya26");
		rp.setPasswordInput("Numpyninja");
		rp.setPasswordConfirmationInput("");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();
	}

	@Then("It should display an error message {string} below Password Confirmation textbox")
	public void it_should_display_an_error_message_below_password_confirmation_textbox(String string) {
		WebElement registercheck = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/span[3]"));
		if (registercheck.getText().trim().equals(string)) {
			Assert.assertTrue(false);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(true);
		}

	}

	// TS_DS_06
	@When("The user clicks Register button after entering valid {string} and different passwords in {string} and {string} fields")
	public void the_user_clicks_register_button_after_entering_valid_and_different_passwords_in_and_fields(
			String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya26");
		rp.setPasswordInput("Numpyninja");
		rp.setPasswordConfirmationInput("Numpyninja123");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
		WebElement alertcheck = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/span[3]"));
		if (alertcheck.getText().trim().equals(string)) {
			Assert.assertTrue(false);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(true);
		}

	}

	// TS_DS_07

	@When("The user enters the {string} with characters other than Letters, digits and \"@\\/.\\/+\\/-\\/_ and enters valid passwords in \"password\" and \"password confirmation\" fields\"")
	public void the_user_enters_the_with_characters_other_than_letters_digits_and_and_enters_valid_passwords_in_password_and_password_confirmation_fields(
			String string, io.cucumber.datatable.DataTable dataTable) {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya**");
		rp.setPasswordInput("Numpyninja");
		rp.setPasswordConfirmationInput("Numpyninja");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();
	}

//TS_DS_08
	@When("The user enters a valid {string} and {string} {string} with characters less than {int}")
	public void the_user_enters_a_valid_and_with_characters_less_than(String string, String string2, String string3,
			Integer int1, io.cucumber.datatable.DataTable dataTable) {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya26");
		rp.setPasswordInput("Numpy");
		rp.setPasswordConfirmationInput("Numpy");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();
	}

//TS_DS_09	
	@When("The user enters a valid {string} and {string} and {string} similar to username")
	public void the_user_enters_a_valid_and_and_similar_to_username(String string, String string2, String string3,
			io.cucumber.datatable.DataTable dataTable) {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya26");
		rp.setPasswordInput("nithya2626");
		rp.setPasswordConfirmationInput("nithya2626");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();
	}

//TS_DS_10
	@When("The user enters a valid {string} and commonly used password for {string} and {string}")
	public void the_user_enters_a_valid_and_commonly_used_password_for_and(String string, String string2,
			String string3, io.cucumber.datatable.DataTable dataTable) {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya26");
		rp.setPasswordInput("Welcome123");
		rp.setPasswordConfirmationInput("Welcome123");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();
	}

	@When("The user enters a valid {string} and {string} and {string} with only numbers")
	public void the_user_enters_a_valid_and_and_with_only_numbers(String string, String string2, String string3,
			io.cucumber.datatable.DataTable dataTable) {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya26");
		rp.setPasswordInput("12345678");
		rp.setPasswordConfirmationInput("12345678");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();
	}
//TS_DS_12

	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String string, String string2, String string3,
			io.cucumber.datatable.DataTable dataTable) {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya39");
		rp.setPasswordInput("Numpyninja");
		rp.setPasswordConfirmationInput("Numpyninja");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickregister();
	}

	@Then("The user should be redirected to Homepage with the message {string} in Homepage")
	public void the_user_should_be_redirected_to_homepage_with_the_message_in_homepage(String string) {
		WebElement registercheck = driver.findElement(By.xpath("/html/body/div[2]"));
		if (registercheck.getText().trim().equals("New Account Created. You are logged in as Nithya39")) {
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}
	}

}
