package com.numpy.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.numpy.PageObjects.GetStartedPage;
import com.numpy.utils.ConfigReader;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;
import com.numpy.utils.Screenshot;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.*;

public class SD01_GetStarted {

	public WebDriver driver;
	public GetStartedPage gsp;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		MyLogger.debug("Launching Browser");
		driver = DriverManager.getDriver();
		gsp = new GetStartedPage(driver);

	}

	@When("The user opens DS Algo portal URL {string}")
	public void the_user_opens_ds_algo_portal_url(String url) {
		driver.get(url);
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		gsp.clickGetStarted();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		if (driver.getTitle().equals(ConfigReader.getProperty("homepage.title"))) {
			Assert.assertTrue(true);

		} else {
			Screenshot.take(this.getClass().getName(), driver);
			Assert.assertTrue(false);

		}
	}

	@AfterAll
	public static void tearDown() {
		DriverManager.close();
	}

}
