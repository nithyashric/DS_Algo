package com.numpy.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.TreePage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;
import com.numpy.utils.ConfigReader;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;
import com.numpy.utils.Screenshot;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class SD07_Tree {
	
	
	public static WebDriver driver;
	public HomePage hp;

	@BeforeAll
	public static void setup() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		driver = DriverManager.getDriver();
	}
	//@TS_DS_02
	@When("The user clicks the Getting Started button in Tree page")
	public void the_user_clicks_the_getting_started_button_in_tree_page() {
		HomePage hp = new HomePage(driver);
		hp.clickTree();
	}

	@Then("The user be directed to Tree page")
	public void the_user_be_directed_to_tree_page() {
		WebElement Label = driver.findElement(By.xpath("/html/body/div[2]/h4"));

		if (Label.getText().trim().equals("Tree"))

		{
			Assert.assertTrue(true);
		} else {
			Screenshot.take(this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
					driver);
			Assert.assertTrue(false);
		}
	}
//@TS_DS_03
	
	@Given("The user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
		MyLogger.error("Function:" + Thread.currentThread().getStackTrace()[1].getMethodName());
		HomePage hp = new HomePage(driver);
		hp.clickTree();
	}

	@When("The user clicks {string} links in Tree page")
	public void the_user_clicks_links_in_tree_page(String string) {
		TreePage tp = new TreePage(driver);
		if (string.equals("Overview of Trees")) {
			tp.clickOverviewOfTrees();
		} else if (string.equals("Terminologies")) {
			tp.clickTerminologies();
		}else if (string.equals("Types of Trees")) {
			tp.clickTypesOfTrees();
		}else if (string.equals("Tree Traversals")) {
			tp.clickTreeTraversals();
		}else if (string.equals("Traversals-Illustration")) {
			tp.clickTraversals_Illustration();
		}else if (string.equals("Binary Trees")) {
			tp.clickBinaryTrees();
		}else if (string.equals("Types of Binary Trees")) {
			tp.clickTypesOfBinaryTrees();
	}else if (string.equals("Implementation in Python")) {
			tp.clickImplementationInPython();
	}else if (string.equals("Binary Tree Traversals")) {
			tp.clickBinaryTreeTraversals();
	}else if (string.equals("Implementation of Binary Trees")) {
			tp.clickImplementationOfBinaryTrees();
	}else if (string.equals("Applications of Binary trees")) {
			tp.clickApplicationsOfBinaryTrees();
	}else if (string.equals("Binary Search Trees")) {
		tp.clickBinarySearchTrees();
	}else if (string.equals("Implementation Of BST")) {
		tp.clickImplementationOfBST();
	}
		
	}

	@Then("The user should be redirected to particular {string} links in Tree page")
	public void the_user_should_be_redirected_to_particular_links_in_tree_page(String string) {
	   
		if (string.equals("Overview of Trees")) {

			WebElement Label = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Overview of Trees")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		} else if (string.equals("Terminologies")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Terminologies")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		} else if (string.equals("Types of Trees")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Types of Trees")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Tree Traversals")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Tree Traversals")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}

		else if (string.equals("Traversals-Illustration")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Traversals-Illustration")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Binary trees")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Binary trees")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		else if (string.equals("Types of Binary Trees")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Types of Binary Trees")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Implementation in Python")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Implementation in Python")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Binary Tree Traversals")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Binary Tree Traversals")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Implementation of Binary Trees")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Implementation of Binary Trees")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Applications of Binary trees")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Applications of Binary trees")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Binary Search Trees")) {

			WebElement Label = driver
					.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

			if (Label.getText().trim().equals("Binary Search Trees")) {
				Assert.assertTrue(true);
			} else {
				Screenshot.take(
						this.getClass().getName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName(),
						driver);
				Assert.assertTrue(false);
			}
		}
		
		else if (string.equals("Implementation Of BST")) {

			WebElement BSTLabel = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
			

			if (BSTLabel.getText().trim().equals("Implementation Of BST")) {
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

@When("The user clicks Try Here button on {string} links in Tree page")
public void the_user_clicks_try_here_button_on_links_in_tree_page(String string) {
    
	HomePage hp = new HomePage(driver);
	hp.clickTree();
	TreePage tp = new TreePage(driver);
	if (string.equals("Overview of Trees")) {
		tp.clickOverviewOfTrees();
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
		
	} else if (string.equals("Terminologies")) {
		
		tp.clickTerminologies();
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
	
else if (string.equals("Types of Trees")) {
	
		tp.clickTypesOfTrees();
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
		else if (string.equals("Tree Traversals")) {
			
			tp.clickTreeTraversals();
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
		
		else if (string.equals("Traversals-Illustration")) {
			
			tp.clickTraversals_Illustration();
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
		
		else if (string.equals("Binary Trees")) {
			
			tp.clickBinaryTrees();
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
		
		else if (string.equals("Types of Binary Trees")) {
			tp.clickTypesOfBinaryTrees();
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
		
		else if (string.equals("Implementation in Python")) {
			
			tp.clickImplementationInPython();
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
		
		else if (string.equals("Binary Tree Traversals")) {
			
			tp.clickBinaryTreeTraversals();
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
		
		else if (string.equals("Implementation of Binary Trees")) {
			
			tp.clickImplementationOfBinaryTrees();
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
		
		else if (string.equals("Applications of Binary trees")) {
			
			tp.clickApplicationsOfBinaryTrees();
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
		
		else if (string.equals("Binary Search Trees")) {
			
			tp.clickBinarySearchTrees();
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
		
		else if (string.equals("Implementation Of BST")) {
			
			tp.clickImplementationOfBST();
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
		
	} 
//TS_DS_05
@Given("The user is on the {string} in Tree page after logged in")
public void the_user_is_on_the_in_tree_page_after_logged_in(String string) {
	
	HomePage hp = new HomePage(driver);
	hp.clickTree();
	TreePage tp = new TreePage(driver);
	if (string.equals("Overview of Trees")) {
		
		tp.clickOverviewOfTrees();;
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	} 
	
	else if (string.equals("Terminologies")) {
		
		tp.clickTerminologies();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}
	
	else if (string.equals("Types of Trees")) {
		
		tp.clickTypesOfTrees();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}
	
	else if (string.equals("Tree Traversals")) {
		
		tp.clickTreeTraversals();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}

	
	else if (string.equals("Traversals-Illustration")) {
		
		tp.clickTraversals_Illustration();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}

	
	else if (string.equals("Binary Trees")) {
		
		tp.clickBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}

	
	else if (string.equals("Types of Binary Trees")) {
		
		tp.clickTypesOfBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}

	
	else if (string.equals("Implementation in Python")) {
		
		tp.clickImplementationInPython();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}

	
	else if (string.equals("Binary Tree Traversals")) {
		
		tp.clickBinaryTreeTraversals();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}

	
	else if (string.equals("Implementation of Binary Trees")) {
		
		tp.clickImplementationOfBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}

	
	else if (string.equals("Applications of Binary trees")) {
		
		tp.clickApplicationsOfBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}

	
	else if (string.equals("Binary Search Trees")) {
		
		tp.clickBinarySearchTrees();
		TryHerePage th = new TryHerePage(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.clickTryHere();

	}

	
	else if (string.equals("Implementation Of BST")) {
		
		tp.clickImplementationOfBST();
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

@When("The user enter python code with {string} syntax in tryEditor in {string} from config.properties in Tree page")
public void the_user_enter_python_code_with_syntax_in_try_editor_in_from_config_properties_in_tree_page(String string, String string2) {
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

	


