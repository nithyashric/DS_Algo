package com.numpy.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.QueuePage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;
import com.numpy.utils.ConfigReader;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;
import com.numpy.utils.Screenshot;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD11_Queue {
	
	public static WebDriver driver;
	public HomePage hp;

	@BeforeAll
	public static void setup() {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}

	//TS_DS_02
	@When("The user clicks the Getting Started button in Queue page")
	public void the_user_clicks_the_getting_started_button_in_queue_page() {

		HomePage hp = new HomePage(driver);
		hp.clickQueue();
	}

	@Then("The user be directed to Queue page")
	public void the_user_be_directed_to_queue_page() {
		WebElement Label = driver.findElement(By.xpath("/html/body/div[2]/h4"));

		if (Label.getText().trim().equals("Queue"))

		{
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}

	}
//TS_DS_03
	@Given("The user is on the Queue page after logged in")
	public void the_user_is_on_the_queue_page_after_logged_in() {
		MyLogger.info("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			MyLogger.error("Interrupted exception:"+e.toString());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp.clickQueue();
	}

	@When("The user clicks {string} links in Queue page")
	public void the_user_clicks_links_in_queue_page(String string) {
		QueuePage qp = new QueuePage(driver);
		string=string.trim();
		if (string.equals("Implementation of Queue in Python")) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			qp.clickImplementaionOfQueueInPython();
		} else if (string.equals("Implementation using collections.deque")) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			qp.clickImplementationUsingCollections();
		}else if (string.equals("Implementation using array")) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			qp.clickImplementationUsingArray();
		}else if (string.equals("Queue Operations")) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			qp.clickQueueOperations();
		}
		else
		{
			MyLogger.error("Invalid user click");
			Assert.fail("Invalid user click:"+string);
		}
	}

	@Then("The user should be redirected to particular {string} links in Queue page")
	public void the_user_should_be_redirected_to_particular_links_in_queue_page(String string) {
		string=string.trim();
		if (string.equals("Implementation of Queue in Python")) {

			WebElement Label = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Implementation of Queue in Python")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		} else if (string.equals("Implementation using collections.deque")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Implementation using collections.deque")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		} else if (string.equals("Implementation using array")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Implementation using array")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Queue Operations")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Queue Operations")) {
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
	@When("The user clicks Try Here button on {string} links in Queue page")
	public void the_user_clicks_try_here_button_on_links_in_queue_page(String string) {
		HomePage hp = new HomePage(driver);
		hp.clickQueue();
		string=string.trim();
		QueuePage qp = new QueuePage(driver);
		if (string.equals("Implementation of Queue in Python")) 
		
		{try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			qp.clickImplementaionOfQueueInPython();
			TryHerePage th = new TryHerePage(driver);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			th.clickTryHere();
			WebElement inputLabel = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

			if (inputLabel.getText().trim().equals("1")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
			            .getMethodName(), driver);
				Assert.assertTrue(false);
			}
			
		} else if (string.equals("Implementation using collections.deque")) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			qp.clickImplementationUsingCollections();
			TryHerePage th = new TryHerePage(driver);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		
	else if (string.equals("Implementation using array")) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			qp.clickImplementationUsingArray();
			TryHerePage th = new TryHerePage(driver);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
			else if (string.equals("Queue Operations")) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				qp.clickQueueOperations();
				TryHerePage th = new TryHerePage(driver);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
	@Given("The user is on the {string} in Queue page after logged in")
	
	public void the_user_is_on_the_in_queue_page_after_logged_in(String string) {
		string=string.trim();
		HomePage hp = new HomePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp.clickQueue();
		QueuePage qp = new QueuePage(driver);
		if (string.equals("Implementation of Queue in Python")) {
			qp.clickImplementaionOfQueueInPython();
			TryHerePage th = new TryHerePage(driver);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			th.clickTryHere();

			
		} else if (string.equals("Implementation using collections.deque")) {
			qp.clickImplementationUsingCollections();
			TryHerePage th = new TryHerePage(driver);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			th.clickTryHere();

		}else if (string.equals("Implementation using array")) {
			qp.clickImplementationUsingArray();
			TryHerePage th = new TryHerePage(driver);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			th.clickTryHere();

		}else if (string.equals("Queue Operations")) {
			qp.clickQueueOperations();
			TryHerePage th = new TryHerePage(driver);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			th.clickTryHere();
		}
		else
		{
			Assert.fail("Invalid user click:"+string);
		}

	}

	@When("The user enter python code with {string} syntax in tryEditor in {string} from config.properties in Queue page")
	public void the_user_enter_python_code_with_syntax_in_try_editor_in_from_config_properties_in_queue_page(String string, String string2) {
		TryHereRunPage rp=new TryHereRunPage(driver);
		rp.setInput(ConfigReader.getProperty("app."+string));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rp.clickbutton();
	}


	
	}

	