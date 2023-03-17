package com.numpy.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;
import com.numpy.PageObjects.StackPage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;

public class TC_Stack_010 extends BaseClass{
	
	private StackPage  setupPage()
	{
		HomePage hp = new HomePage(driver);
		//hp.clicklogin();
		//LoginPage lp = new LoginPage(driver);
		//lp.setUserName(username);
		//lp.setPassword(password);
		//lp.clickSubmit();
		//hp = new HomePage(driver);
		hp.clickStack();
		StackPage sp = new StackPage(driver);
		return sp;	
		
	}
	
	@Test
	public void checkOperationsinStack() throws Exception
	{
		StackPage sp = setupPage();
		sp.clickoperationsInStack();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Operations in Stack"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereOperationsinStack()
	
	{
		StackPage sp = setupPage();
		sp.clickoperationsInStack();
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
public void clickTryHereRunOperationsinStack() throws InterruptedException
	
	{
		StackPage sp = setupPage();
		sp.clickoperationsInStack();
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
	public void checkImplementation() throws Exception
	{
		StackPage sp = setupPage();
		sp.clickimplementation();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Implementation"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereImplementation()
	
	{
		StackPage sp = setupPage();
		sp.clickimplementation();
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
public void clickTryHereRunImplementation() throws InterruptedException
	
	{
		StackPage sp = setupPage();
		sp.clickimplementation();
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
	public void checkApplications() throws Exception
	{
		StackPage sp = setupPage();
		sp.clickapplications();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Applications"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereApplications()
	
	{
		StackPage sp = setupPage();
		sp.clickapplications();
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
public void clickTryHereRunApplications() throws InterruptedException
	
	{
		StackPage sp = setupPage();
		sp.clickapplications();
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
