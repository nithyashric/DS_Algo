package com.numpy.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	
	WebDriver ldriver;
	
public ArrayPage(WebDriver rdriver)

{
	this.ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	
}

	@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
	WebElement arraysInPython;
	
	@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
	WebElement arraysUsingList;
	
	@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
	WebElement basicsOperationsInLists;
	
	@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
	WebElement applicationsOfArray;
	
	public void clickarraysInPython()
	{
		arraysInPython.click();
	}
	
	public void clickarraysUsingList()
	{
		arraysUsingList.click();
	}
	
	public void clickbasicsOperationsInLists()
	{
		basicsOperationsInLists.click();

	}
	public void clickapplicationsOfArray()
	{
		applicationsOfArray.click();
	}
}
