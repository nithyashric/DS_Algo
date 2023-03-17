package com.numpy.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.numpy.PageObjects.HomePage;

public class TC_HomePage_001 extends BaseClass {

		@Test
	public void homePageTest() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		
		//driver.get(baseURL+"/home");
	//	driver.manage().window().maximize();
		if(driver.getTitle().equals("NumpyNinja"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
	//	Thread.sleep(sleeptime);

	}
		@Test
		
	public void checkDataStructures()
	
	{
		HomePage hp = new HomePage(driver);
		hp.clickDataStructures();
		WebElement logincheck=driver.findElement(By.xpath("/html/body/div[2]"));
		
		if(logincheck.getText().trim().equals("You are not logged in"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

		@Test
		
		public void checkArray()
		
		{
			HomePage hp = new HomePage(driver);
			hp.clickArray();
			WebElement logincheck=driver.findElement(By.xpath("/html/body/div[2]"));
			
			if(logincheck.getText().trim().equals("You are not logged in"))
			{
				Assert.assertTrue(true); 
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		
@Test
		
		public void checkLinkedList()
		
		{
			HomePage hp = new HomePage(driver);
			hp.clickLinkedList();
			WebElement logincheck=driver.findElement(By.xpath("/html/body/div[2]"));
			
			if(logincheck.getText().trim().equals("You are not logged in"))
			{
				Assert.assertTrue(true); 
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		
@Test

public void checkStack()

{
	HomePage hp = new HomePage(driver);
	hp.clickStack();
	WebElement logincheck=driver.findElement(By.xpath("/html/body/div[2]"));
	
	if(logincheck.getText().trim().equals("You are not logged in"))
	{
		Assert.assertTrue(true); 
	}
	else
	{
		Assert.assertTrue(false);
	}
	
	
}

@Test

public void checkQueue()

{
	HomePage hp = new HomePage(driver);
	hp.clickQueue();
	WebElement logincheck=driver.findElement(By.xpath("/html/body/div[2]"));
	
	if(logincheck.getText().trim().equals("You are not logged in"))
	{
		Assert.assertTrue(true); 
	}
	else
	{
		Assert.assertTrue(false);
	}
	
}

@Test

public void checkTree()

{
	HomePage hp = new HomePage(driver);
	hp.clickTree();
	WebElement logincheck=driver.findElement(By.xpath("/html/body/div[2]"));
	
	if(logincheck.getText().trim().equals("You are not logged in"))
	{
		Assert.assertTrue(true); 
	}
	else
	{
		Assert.assertTrue(false);
	}
	
}

@Test

public void checkGraph()

{
	HomePage hp = new HomePage(driver);
	hp.clickGraph();
	WebElement logincheck=driver.findElement(By.xpath("/html/body/div[2]"));
	
	if(logincheck.getText().trim().equals("You are not logged in"))
	{
		Assert.assertTrue(true); 
	}
	else
	{
		Assert.assertTrue(false);
	}
	
}

	}
		
