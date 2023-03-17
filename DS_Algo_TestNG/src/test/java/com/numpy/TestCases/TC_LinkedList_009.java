package com.numpy.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LinkedListPage;
import com.numpy.PageObjects.LoginPage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;

public class TC_LinkedList_009 extends BaseClass {
	
	private LinkedListPage  setupPage()
	{
		HomePage hp = new HomePage(driver);
		//hp.clicklogin();
		//LoginPage lp = new LoginPage(driver);
		//lp.setUserName(username);
		//lp.setPassword(password);
		//lp.clickSubmit();
		//hp = new HomePage(driver);
		hp.clickLinkedList();
		LinkedListPage llp = new LinkedListPage(driver);
		//ap.clickarraysInPython();
		return llp;
		
	}
	@Test
	public void checkIntroduction() throws Exception
	{
		LinkedListPage llp = setupPage();
		llp.clickintroduction();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Introduction"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereIntroduction()
	
	{
		LinkedListPage llp = setupPage();
		llp.clickintroduction();
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
public void clickTryHereRunIntroduction() throws InterruptedException
	
	{
		LinkedListPage llp = setupPage();
		llp.clickintroduction();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		System.out.println(rp.getOutput());
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
	public void checkCreatingLinkedLIst() throws Exception
	{
		LinkedListPage llp = setupPage();
		llp.clickcreatingLinkedList();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Creating Linked LIst"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereCreatingLinkedLIst()
	
	{
		LinkedListPage llp = setupPage();
		llp.clickcreatingLinkedList();
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
public void clickTryHereRunCreatingLinkedLIst() throws InterruptedException
	
	{
		LinkedListPage llp = setupPage();
		llp.clickcreatingLinkedList();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		System.out.println(rp.getOutput());
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
	public void checkTypesofLinkedList() throws Exception
	{
		LinkedListPage llp = setupPage();
		llp.clicktypesOfLinkedList();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Types of Linked List"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereTypesofLinkedList()
	
	{
		LinkedListPage llp = setupPage();
		llp.clicktypesOfLinkedList();
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
public void clickTryHereRunTypesofLinkedList() throws InterruptedException
	
	{
		LinkedListPage llp = setupPage();
		llp.clicktypesOfLinkedList();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		System.out.println(rp.getOutput());
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
	public void checkImplementLinkedListinPython() throws Exception
	{
		LinkedListPage llp = setupPage();
		llp.clickimplementLinkedListInPython();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Implement Linked List in Python"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereImplementLinkedListinPython()
	
	{
		LinkedListPage llp = setupPage();
		llp.clickimplementLinkedListInPython();
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
public void clickTryHereRunImplementLinkedListinPython() throws InterruptedException
	
	{
		LinkedListPage llp = setupPage();
		llp.clickimplementLinkedListInPython();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		System.out.println(rp.getOutput());
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
	public void checkTraversal() throws Exception
	{
		LinkedListPage llp = setupPage();
		llp.clicktraversal();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Traversal"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereTraversal()
	
	{
		LinkedListPage llp = setupPage();
		llp.clicktraversal();
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
public void clickTryHereRunTraversal() throws InterruptedException
	
	{
		LinkedListPage llp = setupPage();
		llp.clicktraversal();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		System.out.println(rp.getOutput());
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
	public void checkInsertion() throws Exception
	{
		LinkedListPage llp = setupPage();
		llp.clickinsertion();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Insertion"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereInsertion()
	
	{
		LinkedListPage llp = setupPage();
		llp.clickinsertion();
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
public void clickTryHereRunInsertion() throws InterruptedException
	
	{
		LinkedListPage llp = setupPage();
		llp.clickinsertion();;
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		System.out.println(rp.getOutput());
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
	public void checkDeletion() throws Exception
	{
		LinkedListPage llp = setupPage();
		llp.clickdeletion();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Deletion"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test 
	public void clickTryHereDeletion()
	
	{
		LinkedListPage llp = setupPage();
		llp.clickdeletion();
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
public void clickTryHereRunDeletion() throws InterruptedException
	
	{
		LinkedListPage llp = setupPage();
		llp.clickdeletion();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		Thread.sleep(100);
		rp.clickbutton();
		System.out.println(rp.getOutput());
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
