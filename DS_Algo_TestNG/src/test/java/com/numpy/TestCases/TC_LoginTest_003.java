package com.numpy.TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;



public class TC_LoginTest_003 extends BaseClass{

@BeforeClass	
	public void beforeTest()
	{
		
	}
@AfterTest
	public void afterTest()
	{
		//driver.close();
	}
	@Test 
	
	public void loginTest() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clicklogin();
		//driver.get(baseURL+"/login");
	//	driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		WebElement logincheck=driver.findElement(By.xpath("/html/body/div[2]"));
		
		if(logincheck.getText().trim().equals("You are logged in"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		Thread.sleep(sleeptime);
		
	//	/html/body/div[2]	

	}
}
