package com.numpy.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;
import com.numpy.PageObjects.QueuePage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;

public class TC_Queue_011 extends BaseClass {
	
	private QueuePage setupPage()
	
	{
		HomePage hp = new HomePage(driver);
		//hp.clicklogin();
		//LoginPage lp = new LoginPage(driver);
		//lp.setUserName(username);
		//lp.setPassword(password);
		//lp.clickSubmit();
		//hp = new HomePage(driver);
		hp.clickQueue();
		QueuePage qp = new QueuePage(driver);
		return qp;
	}
	
	@Test
	public void checkImplementationofQueueinPython() throws Exception
	{
		QueuePage qp = setupPage();
		qp.clickImplementaionOfQueueInPython();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Implementation of Queue in Python"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		//Thread.sleep(sleeptime);
	}
	
	@Test 
	public void clickTryHereImplementationofQueueinPython()
	
	{
		QueuePage qp = setupPage();
		qp.clickImplementaionOfQueueInPython();
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
public void clickTryHereRunImplementationofQueueinPython() throws InterruptedException
	
	{
		QueuePage qp = setupPage();
		qp.clickImplementaionOfQueueInPython();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		//Thread.sleep(10000);
		
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
	public void checkImplementationUsingCollectionsDeque() throws Exception
	{
		QueuePage qp = setupPage();
		qp.clickImplementationUsingCollections();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Implementation using collections.deque"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		//Thread.sleep(sleeptime);
	}
	
	@Test 
	public void clickTryHereImplementationUsingCollectionsDeque()
	
	{
		QueuePage qp = setupPage();
		qp.clickImplementationUsingCollections();
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
public void clickTryHereRunImplementationUsingCollectionsDeque() throws InterruptedException
	
	{
		QueuePage qp = setupPage();
		qp.clickImplementationUsingCollections();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		//Thread.sleep(10000);
		
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
	public void checkImplementationUsingArray() throws Exception
	{
		QueuePage qp = setupPage();
		qp.clickImplementationUsingArray();
		WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Implementation using array"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test 
	public void clickTryHerecheckImplementationUsingArray()
	
	{
		QueuePage qp = setupPage();
		qp.clickImplementationUsingArray();
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
public void clickTryHereRuncheckImplementationUsingArray() throws InterruptedException
	
	{
		QueuePage qp = setupPage();
		qp.clickImplementationUsingArray();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		//Thread.sleep(10000);
		
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
	public void checkQueueOperations() throws Exception
	{
		QueuePage qp = setupPage();
		qp.clickQueueOperations();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Queue Operations"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		}
	
	@Test 
	public void clickTryHereQueueOperations()
	
	{
		QueuePage qp = setupPage();
	qp.clickQueueOperations();
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
public void clickTryHereRunQueueOperations() throws InterruptedException
	
	{
		QueuePage qp = setupPage();
		qp.clickQueueOperations();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		//System.out.println(rp.getOutput());
		//Thread.sleep(10000);
		
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
