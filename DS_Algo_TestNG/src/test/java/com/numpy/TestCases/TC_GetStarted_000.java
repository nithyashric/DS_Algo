package com.numpy.TestCases;

import org.testng.Assert;
import com.numpy.utils.Screenshot;
import org.testng.annotations.Test;

import com.numpy.PageObjects.GetStartedPage;

public class TC_GetStarted_000 extends BaseClass{
@Test
	public void GetStartedPageTest() throws InterruptedException
	{
		//Given
		GetStartedPage gsp = new GetStartedPage(driver);
		driver.get(baseURL);
		
		//When
		gsp.clickGetStarted();	
		//driver.manage().window().maximize();

		//Then
		if(driver.getTitle().equals("NumpyNinja"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
}
