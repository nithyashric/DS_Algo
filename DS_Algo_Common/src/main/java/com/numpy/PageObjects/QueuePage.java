package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {

	WebDriver ldriver;
	
	public QueuePage(WebDriver rdriver)
	{
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
	WebElement implementaionOfQueueInPython;
	
	@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
	WebElement implementationUsingCollections;
	
	@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
	WebElement implementationUsingArray;
	
	@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
	WebElement queueOperations;
	
	public void clickImplementaionOfQueueInPython()
	{
		implementaionOfQueueInPython.click();
	}
	
	public void clickImplementationUsingCollections()
	{
		implementationUsingCollections.click();
	}
	
	public void clickImplementationUsingArray()
	{
		implementationUsingArray.click();
	}
	public void clickQueueOperations()
	{
		queueOperations.click();
	}
	
}
