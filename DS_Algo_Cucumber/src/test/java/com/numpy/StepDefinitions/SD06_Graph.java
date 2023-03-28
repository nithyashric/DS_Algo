package com.numpy.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class SD06_Graph {

	public static WebDriver driver;
	public HomePage hp;

	@BeforeAll
	public static void setup() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}
//@TS_DS_02
	@When("The user clicks the Getting Started button in Graph page")
	public void the_user_clicks_the_getting_started_button_in_graph_page() {
		HomePage hp = new HomePage(driver);
		hp.clickGraph();
	}

	@Then("The user be directed to Graph page")
	public void the_user_be_directed_to_graph_page() {

		WebElement graphLabel = driver.findElement(By.xpath("/html/body/div[2]/h4"));

		if (graphLabel.getText().trim().equals("Graph"))

		{
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}
	}
//TS_DS_03
	@Given("The user is on the Graph page after logged in")
	public void the_user_is_on_the_graph_page_after_logged_in() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
		hp.clickGraph();
	}

@When("The user clicks {string} links in Graph page")
public void the_user_clicks_links_in_graph_page(String string) {
	GraphPage gp = new GraphPage(driver);
	if (string.equals("Graph")) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gp.clickGraph();
	} else if (string.equals("Graph Representations")) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gp.clickGraphRepresentations();
	}

}

@Then("The user should be redirected to particular {string} links in Graph page")
public void the_user_should_be_redirected_to_particular_links_in_graph_page(String string) {
	if (string.equals("Graph")) {

		WebElement graphLabel = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

		if (graphLabel.getText().trim().equals("Graph")) {
			Assert.assertTrue(true);
		} else {
			Screenshot.take(
					this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}
	} else if (string.equals("Graph Representations")) {
		
		WebElement graphRepresentationsLabel = driver
				.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

		if (graphRepresentationsLabel.getText().trim().equals("Graph Representations")) {
			Assert.assertTrue(true);
		} else {
			Screenshot.take(
					this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}
	}


}
//TS_DS_04
@When("The user clicks Try Here button on {string} links in Graph page")
public void the_user_clicks_try_here_button_on_links_in_graph_page(String string) {
	HomePage hp = new HomePage(driver);
	hp.clickGraph();
	GraphPage gp = new GraphPage(driver);
	if (string.equals("Graph")) {
					gp.clickGraph();
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
		
	} else if (string.equals("Graph Representations")) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		gp.clickGraphRepresentations();
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
}
//TS_DS_05
@Given("The user is on the {string} in Graph page after logged in")
public void the_user_is_on_the_in_graph_page_after_logged_in(String string) {
	HomePage hp = new HomePage(driver);
	hp.clickGraph();
	GraphPage gp = new GraphPage(driver);
	if (string.equals("Graph")) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gp.clickGraph();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

		
	} else if (string.equals("Graph Representations")) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gp.clickGraphRepresentations();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}
}

@When("The user enter python code with {string} syntax in tryEditor in {string} from config.properties in Graph page")
public void the_user_enter_python_code_with_syntax_in_try_editor_in_from_config_properties_in_graph_page(String string, String string2) {
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
