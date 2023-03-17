package com.numpy.TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.numpy.PageObjects.ArrayPage;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;

public class TC_Array_008 extends BaseClass {
	
	private ArrayPage  setupPage()
	{
		HomePage hp = new HomePage(driver);
		//hp.clicklogin();
			
		//LoginPage lp = new LoginPage(driver);
		//lp.setUserName(username);
		//lp.setPassword(password);
		//lp.clickSubmit();
		//hp = new HomePage(driver);
		hp.clickArray();
		ArrayPage ap = new ArrayPage(driver);
		return ap;
		
	}
	@Test
	public void checkArraysInPython() throws Exception
	{
		ArrayPage ap = setupPage();
		ap.clickarraysInPython();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Arrays in Python"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereArraysInPython()
	
	{
		ArrayPage ap = setupPage();
		ap.clickarraysInPython();
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
public void clickTryHereRunArraysInPython() throws InterruptedException
	
	{
		ArrayPage ap = setupPage();
		ap.clickarraysInPython();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
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
	public void checkArraysUsingList() throws Exception
	{
		ArrayPage ap = setupPage();
		ap.clickarraysUsingList();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Arrays Using List"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHereArraysUsingList()
	
	{
		ArrayPage ap = setupPage();
		ap.clickarraysUsingList();
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
public void clickTryHereRunArraysUsingList() throws InterruptedException
	
	{
		ArrayPage ap = setupPage();
		ap.clickarraysUsingList();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
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
		public void checkBasicOperationsInLists() throws Exception
		{
			ArrayPage ap = setupPage();
			ap.clickbasicsOperationsInLists();
			
	WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
			
			if(timeComplexityLabel.getText().trim().equals("Basic Operations in Lists"))
			{
				Assert.assertTrue(true); 
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		@Test 
		public void clickTryHereBasicOperationsInLists()
		
		{
			ArrayPage ap = setupPage();
			ap.clickbasicsOperationsInLists();
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
	public void clickTryHereRunBasicOperationsInLists() throws InterruptedException
		
		{
			ArrayPage ap = setupPage();
			ap.clickbasicsOperationsInLists();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();	
			TryHereRunPage rp = new TryHereRunPage(driver);
			Thread.sleep(100);
			rp.setInput("print(\"Hello\")");
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
		public void checkApplicationsofArray() throws Exception
		{
			ArrayPage ap = setupPage();
			ap.clickapplicationsOfArray();
			
	WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
			
			if(timeComplexityLabel.getText().trim().equals("Applications of Array"))
			{
				Assert.assertTrue(true); 
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		@Test 
		public void clickTryHereApplicationsofArray()
		
		{
			ArrayPage ap = setupPage();
			ap.clickapplicationsOfArray();
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
	public void clickTryHereRunApplicationsofArray() throws InterruptedException
		
		{
			ArrayPage ap = setupPage();
			ap.clickapplicationsOfArray();
			TryHerePage th = new TryHerePage(driver);
			th.clickTryHere();	
			TryHereRunPage rp = new TryHereRunPage(driver);
			Thread.sleep(100);
			rp.setInput("print(\"Hello\")");
			Thread.sleep(100);
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
