package com.numpy.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;
import com.numpy.utils.ConfigReader;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;
import com.numpy.utils.Screenshot;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD04_SigninAndSignout {

	public static WebDriver driver;
	public HomePage hp;

	@BeforeAll
	public static void setup() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}

	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp.clicklogin();
	}

	@When("Login with invalid username {string} and password {string}")
	public void login_with_invalid_username(String string1, String string2) {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(string1);
		lp.setPassword(string2);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.clickSubmit();
	}

	@Then("It should display error message {string}")
	public void it_should_display_error_message(String string) {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		WebElement Text = driver.findElement(By.xpath("/html/body/div[3]"));
		if (Text.getText().trim().equals("Invalid Username and Password")) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName(), driver);
			Assert.assertTrue(false);
		}
	}

	@When("Login with valid username password from config")
	public void login_with_valid_username_password_from_config() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(ConfigReader.getProperty("app.userName"));
		lp.setPassword(ConfigReader.getProperty("app.password"));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.clickSubmit();
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		WebElement logincheck = driver.findElement(By.xpath("/html/body/div[2]"));

		if (logincheck.getText().trim().equals("You are logged in"))

		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName(), driver);
			Assert.assertTrue(false);
		}
	}

	@Given("The user is logged in")
	public void the_user_is_logged_in() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
	}

	@When("The user clicks signout button")
	public void the_user_click_signout_button() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp.clicklogout();
	}

	@Then("It should display message \"Logged out successfully\"")
	public void it_should_display_message() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		WebElement logoutcheck = driver.findElement(By.xpath("/html/body/div[2]"));

		if (logoutcheck.getText().trim().equals("Logged out successfully"))

		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}

	}

}
