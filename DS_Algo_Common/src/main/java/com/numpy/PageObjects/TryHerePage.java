package com.numpy.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryHerePage {
	
WebDriver ldriver;
	
	public TryHerePage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
			}
	
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/a")
	WebElement tryHere;
	
	public void clickTryHere()
	
	{
	
	tryHere.click();
	
	}

}
