package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {
	
	WebDriver ldriver;
	
	public GraphPage(WebDriver rdriver)
	{
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
	WebElement graph;
	
	@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
	WebElement graphRepresentations;
	
	public void clickGraph()
	{
		graph.click();
	}
	
	public void clickGraphRepresentations() 
	{
		graphRepresentations.click();
	}
}
