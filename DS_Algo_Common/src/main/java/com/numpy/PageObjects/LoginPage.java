package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
	//	ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(rdriver,this);
		//option 1 txtUsername=ldriver.findElement(By.name("username"));
		//option 1 Password=ldriver.findElement(By.name("password"));
	}
	//option 2 using annotations
	@FindBy(name="username")
	//@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[2]")
	//@FindBy(xpath="//*[@id='id_username']")
	WebElement txtUsername; 
	
	//option 2 using annotations	
	@FindBy(name="password")
	//@FindBy(name="//*[@id='id_password']")
	WebElement password; 
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Login; 
	
	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		Login.click();
	}
}


