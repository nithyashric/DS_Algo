package com.numpy.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.RegisterPage;
import com.numpy.utils.Screenshot;
public class TC_RegisterTest_002 extends BaseClass {
	

	@Test 
	public void register() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clickregister();
		//driver.manage().window().maximize();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setuserNameInput("Nithya25");
		rp.setPasswordInput("Numpyninja");
		rp.setPasswordConfirmationInput("Numpyninja");
		//Thread.sleep(sleeptime);
		rp.clickregister();
		//Thread.sleep(sleeptime);
		WebElement registercheck=driver.findElement(By.xpath("/html/body/div[2]"));
		//System.out.println(registercheck.getText());
		//Thread.sleep(100000);
		if(registercheck.getText().trim().equals("New Account Created. You are logged in as Nithya25"))
		{
			Assert.assertTrue(true); 
		}
		else
		{
			Screenshot.take(this.getClass().getName()+"_"+Thread.currentThread().getStackTrace()[1]
            .getMethodName(), driver);
			Assert.assertTrue(false);
		}
}
}