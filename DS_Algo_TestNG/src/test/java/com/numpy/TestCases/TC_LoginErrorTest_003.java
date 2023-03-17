package com.numpy.TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;



public class TC_LoginErrorTest_003 extends BaseClass{

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
	
	public void loginFailureTest() throws InterruptedException
	{
	HomePage hp=new HomePage(driver);
	hp.clicklogin();
	//driver.manage().window().maximize();
	
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword("hello");
		lp.clickSubmit();
		
		WebElement errorlogincheck=driver.findElement(By.xpath("/html/body/div[3]"));
		
		if(errorlogincheck.getText().trim().equals("Invalid Username and Password"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		Thread.sleep(2000);
	}
}
