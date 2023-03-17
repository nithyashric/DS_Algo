package com.numpy.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;
import com.numpy.PageObjects.TreePage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;

public class TC_Tree_012 extends BaseClass{

	private TreePage setupPage()
	{
		HomePage hp = new HomePage(driver);
		/*
		hp.clicklogin();
		LoginPage lp = new LoginPage(driver);
		//Thread.sleep(10000000);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		hp = new HomePage(driver);
		*/
		hp.clickTree();
		TreePage tp = new TreePage(driver);
		return tp;
	}
	
	@Test
	public void checkOverviewofTrees() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickOverviewOfTrees();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Overview of Trees"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereOverviewofTrees()
	
	{
		TreePage tp = setupPage();
		tp.clickOverviewOfTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunOverviewofTrees() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickOverviewOfTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(10000000);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(10000000);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
	public void checkTerminologies() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickTerminologies();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Terminologies"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereTerminologies()
	
	{
		TreePage tp = setupPage();
		tp.clickTerminologies();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunTerminologies() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickTerminologies();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	
	@Test
	public void checkTypesofTrees() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickTypesOfTrees();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Types of Trees"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}
	
	@Test 
	public void clickTryHereTypesofTrees()
	
	{
		TreePage tp = setupPage();
		tp.clickTypesOfTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunTypesofTrees() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickTypesOfTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
	
	@Test
	public void checkTreeTraversals() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickTreeTraversals();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Tree Traversals"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereTreeTraversals()
	
	{
		TreePage tp = setupPage();
		tp.clickTreeTraversals();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunTreeTraversals() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickTreeTraversals();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	
	@Test
	public void checkTraversalsIllustration() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickTraversals_Illustration();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Traversals-Illustration"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereTraversalsIllustration()
	
	{
		TreePage tp = setupPage();
		tp.clickTraversals_Illustration();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunTraversalsIllustration() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickTraversals_Illustration();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
	@Test
	public void checkBinaryTrees() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickBinaryTrees();
		WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Binary Trees"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereBinaryTrees()
	
	{
		TreePage tp = setupPage();
		tp.clickBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunBinaryTrees() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
	
	@Test
	public void checkTypesofBinaryTrees() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickTypesOfBinaryTrees();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Types of Binary Trees"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereTypesofBinaryTrees()
	
	{
		TreePage tp = setupPage();
		tp.clickTypesOfBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunTypesofBinaryTrees() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickTypesOfBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
	@Test
	public void checkImplementationinPython() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickImplementationInPython();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Implementation in Python"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereImplementationinPython()
	
	{
		TreePage tp = setupPage();
		tp.clickImplementationInPython();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunImplementationinPython() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickImplementationInPython();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
	@Test
	public void checkBinaryTreeTraversals() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickBinaryTreeTraversals();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Binary Tree Traversals"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereBinaryTreeTraversals()
	
	{
		TreePage tp = setupPage();
		tp.clickBinaryTreeTraversals();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunBinaryTreeTraversals() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickBinaryTreeTraversals();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
	@Test
	public void checkImplementationofBinaryTrees() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickImplementationOfBinaryTrees();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Implementation of Binary Trees"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereImplementationofBinaryTrees()
	
	{
		TreePage tp = setupPage();
		tp.clickImplementationOfBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunImplementationofBinaryTrees() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickImplementationOfBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
	@Test
	public void checkApplicationsofBinarytrees() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickApplicationsOfBinaryTrees();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Applications of Binary trees"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereApplicationsofBinarytrees()
	
	{
		TreePage tp = setupPage();
		tp.clickApplicationsOfBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunApplicationsofBinarytrees() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickApplicationsOfBinaryTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
	
	@Test
	public void checkBinarySearchTrees() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickBinarySearchTrees();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Binary Search Trees"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereBinarySearchTrees()
	
	{
		TreePage tp = setupPage();
		tp.clickBinarySearchTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunBinarySearchTrees() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickBinarySearchTrees();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
	
	@Test
	public void checkImplementationOfBST() throws Exception
	{
		TreePage tp = setupPage();
		tp.clickImplementationOfBST();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Implementation Of BST"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickImplementationOfBST()
	
	{
		TreePage tp = setupPage();
		tp.clickImplementationOfBST();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		
WebElement inputLabel=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));
		
		if(inputLabel.getText().trim().equals("1"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@Test
public void clickTryHereRunImplementationOfBST() throws InterruptedException
	
	{
		TreePage tp = setupPage();
		tp.clickImplementationOfBST();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		
		if(rp.getOutput().equals("Hello"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}	
}
