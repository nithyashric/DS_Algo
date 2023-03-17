package com.numpy.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.numpy.PageObjects.DataStructures_IntroPage;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;

public class TC_DataStructures_007 extends BaseClass {
	
	private void setupPage()
	{
		HomePage hp = new HomePage(driver);
	//	hp.clicklogin();
			
	//	LoginPage lp = new LoginPage(driver);
//		lp.setUserName(username);
	//	lp.setPassword(password);
	//	lp.clickSubmit();
	//	hp = new HomePage(driver);
		hp.clickDataStructures();
		DataStructures_IntroPage ds = new DataStructures_IntroPage(driver);
		ds.clicktimeComplexity();
		
	}
	@Test
	public void checkTimeComplexity() throws Exception
	{
		setupPage();
		
WebElement timeComplexityLabel=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));
		
		if(timeComplexityLabel.getText().trim().equals("Time Complexity"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	@Test 
	public void clickTryHere()
	
	{
		setupPage();
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
public void clickTryHereRun() throws InterruptedException
	
	{
		setupPage();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();	
		//HomePage hp = new HomePage(driver);
	
		TryHereRunPage rp = new TryHereRunPage(driver);
		//Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		//Thread.sleep(100);
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


