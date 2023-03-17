package com.numpy.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;

public class TC_HomePage_LoginCheck_006 extends BaseClass {

	private HomePage setupPage()
	{
		HomePage hp = new HomePage(driver);
	//	hp.clicklogin();
			
	//	LoginPage lp = new LoginPage(driver);
	// lp.setUserName(username);
	//	lp.setPassword(password);
	//	lp.clickSubmit();
	//	hp = new HomePage(driver);
		return hp;
	}
		@Test
		
	public void checkDataStructures()
	
	{
		HomePage hp=setupPage();
		hp.clickDataStructures();
		WebElement dataStructuresLabel=driver.findElement(By.xpath("/html/body/div[2]/h4"));
		
		if(dataStructuresLabel.getText().trim().equals("Data Structures-Introduction"))
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
		HomePage hp=setupPage();
		hp.clickArray();
		WebElement arrayLabel=driver.findElement(By.xpath("/html/body/div[2]/h4"));
		
		if(arrayLabel.getText().trim().equals("Array"))
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
		HomePage hp=setupPage();
		hp.clickLinkedList();
		WebElement linkedListLabel=driver.findElement(By.xpath("/html/body/div[2]/h4"));
		
		if(linkedListLabel.getText().trim().equals("Linked List"))
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
		HomePage hp=setupPage();
		hp.clickStack();
		WebElement stackLabel=driver.findElement(By.xpath("/html/body/div[2]/h4"));
		
		if(stackLabel.getText().trim().equals("Stack"))
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
		HomePage hp=setupPage();
		hp.clickQueue();
		WebElement queueLabel=driver.findElement(By.xpath("/html/body/div[2]/h4"));
		
		if(queueLabel.getText().trim().equals("Queue"))
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
		HomePage hp=setupPage();
		hp.clickTree();
		WebElement treeLabel=driver.findElement(By.xpath("/html/body/div[2]/h4"));
		
		if(treeLabel.getText().trim().equals("Tree"))
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
		HomePage hp=setupPage();
		hp.clickGraph();
		WebElement graphLabel=driver.findElement(By.xpath("/html/body/div[2]/h4"));
		
		if(graphLabel.getText().trim().equals("Graph"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	}
		
