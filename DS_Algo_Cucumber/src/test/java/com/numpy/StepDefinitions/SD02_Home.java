package com.numpy.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import com.numpy.PageObjects.HomePage;
import com.numpy.utils.DriverManager;
import com.numpy.utils.Screenshot;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD02_Home {

	public static WebDriver driver;
	public HomePage hp;

	@BeforeAll
	public static void setup() {

		driver = DriverManager.getDriver();
	}

	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		hp = new HomePage(driver);

	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
		switch (string) {
		case "Datastructures":
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hp.clickDataStructures();
			break;
		case "Arrays":
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hp.clickArray();
			break;
		case "Linkedlist":
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hp.clickLinkedList();
			break;
		case "Stack":
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hp.clickStack();
			break;
		case "Queue":
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hp.clickQueue();
			break;
		case "Tree":
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hp.clickTree();
			break;
		case "Graph":
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hp.clickGraph();
			break;

		}

	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {

		WebElement logincheck = driver.findElement(By.xpath("/html/body/div[2]"));

		if (logincheck.getText().trim().equals("You are not logged in")) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@When("The user clicks Sign in link")
	public void the_user_clicks_sign_in_link() {
		hp.clicklogin();
	}

	@Then("The user redirected to Login page")
	public void the_user_redirected_to_login_page() {

		WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/label[1]"));

		if (Username.getText().trim().equals("Username:")) {
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

	@When("The user clicks Register link")
	public void the_user_clicks_register_link() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp.clickregister();
	}

	@Then("The user redirected to Register page")
	public void the_user_redirected_to_register_page() {
		WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/label[1]"));

		if (Username.getText().trim().equals("Username:"))

		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@When("The user clicks on Sign in link")
	public void the_user_clicks_on_sign_in_link() {
		hp = new HomePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp.clicklogin();
	}

	@Then("The user redirected to signin page")
	public void the_user_redirected_to_signin_page() {
		WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/label[1]"));

		if (Username.getText().trim().equals("Username:")) {
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName(), driver);
			Assert.assertTrue(false);
		}

	}

}
