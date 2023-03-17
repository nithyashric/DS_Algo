package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructures_IntroPage {
	
WebDriver ldriver;
	
	public DataStructures_IntroPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
			}
	
	
	@FindBy(xpath="/html/body/div[2]/ul/a")
	WebElement timeComplexity;

	public void clicktimeComplexity()
	{
		timeComplexity.click();
	}

	
}
