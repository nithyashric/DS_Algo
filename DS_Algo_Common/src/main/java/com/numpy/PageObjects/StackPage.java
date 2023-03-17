package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {

	WebDriver ldriver;
	
	public StackPage(WebDriver rdriver)
	{
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
	WebElement operationsInStack;
	
	@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
	WebElement implementation;
	
	@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
	WebElement applications;
	
	public void clickoperationsInStack()
	{
		operationsInStack.click();
	}
	
	public void clickimplementation()
	{
	implementation.click();		
	}
	
	public void clickapplications()
	{
	applications.click();
	}
}
