package com.numpy.TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;



public class TC_LogoutTest_004 extends BaseClass{


@BeforeClass	
	public void beforeTest()
	{
	
	}
@AfterTest
	public void afterTest()
	{
//		driver.close();
	}

@Test 
	
	public void loginFailureTest() throws InterruptedException
	{
	HomePage hp=new HomePage(driver);
	//hp.clicklogin();
	//driver.manage().window().maximize();
	
		//LoginPage lp = new LoginPage(driver);
		//lp.setUserName(username);
		//lp.setPassword(password);
		//lp.clickSubmit();
		WebElement logoutlink=driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[3]"));
		logoutlink.click();
		
	
	WebElement logoutcheck=driver.findElement(By.xpath("/html/body/div[2]"));
	
		
		if(logoutcheck.getText().trim().equals("Logged out successfully"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
}
