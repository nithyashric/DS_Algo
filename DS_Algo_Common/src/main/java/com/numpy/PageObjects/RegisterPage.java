package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
			}
	
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[2]")
	WebElement userNameInput;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[3]")
	WebElement passwordInput;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[4]")
	WebElement passwordConfirmationInput;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[5]")
	WebElement register;
	
	public void setuserNameInput(String uname)
	{
		userNameInput.sendKeys(uname);
	}
	
	public void setPasswordInput(String pwd)
	{
		passwordInput.sendKeys(pwd);
	}
	public void setPasswordConfirmationInput(String pwd)
	{
		passwordConfirmationInput.sendKeys(pwd);
	}
	public void clickregister()
	{
		register.click();
	}

}
