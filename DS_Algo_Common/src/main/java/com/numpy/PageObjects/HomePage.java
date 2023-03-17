package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	public String baseURL="https://dsportalapp.herokuapp.com";
	public HomePage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		ldriver.get(baseURL+"/home");
	}

	
	@FindBy(xpath = "/html/body/div[1]/nav/div/div[2]/ul/a[3]")
	WebElement loginlink;

	
	@FindBy(xpath = "/html/body/div[1]/nav/div/div[2]/ul/a[3]")
	WebElement logoutlink;

	@FindBy(xpath = "/html/body/div[1]/nav/div/div[2]/ul/a[2]")	
	WebElement registerlink;

	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/a")
	WebElement dataStructuresGetStarted;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/a")
	WebElement arrayGetStarted;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/a")
	WebElement linkedListGetStarted;
	
	@FindBy(xpath = "/html/body/div[2]/div[4]/div/div/a")
	WebElement stackGetStarted;
	
	@FindBy(xpath = "/html/body/div[2]/div[5]/div/div/a")
	WebElement queueGetStarted;
	
	@FindBy(xpath = "/html/body/div[2]/div[6]/div/div/a")
	WebElement treeGetStarted;
	
	@FindBy(xpath = "//html/body/div[2]/div[7]/div/div/a")
	WebElement graphGetStarted;
	
	//@FindBy(xpath = "//html/body/div[1]/nav/div/div[1]/div/a")
	//WebElement dropDown;
	
	public void clicklogin() {
		loginlink.click();
	}

	public void clicklogout()

	{
		logoutlink.click();
	}

	public void clickregister()

	{
		registerlink.click();
	}
	
	public void clickDataStructures()

	{
		dataStructuresGetStarted.click();
	}
	
	public void clickArray()

	{
		arrayGetStarted.click();
	}
	
	public void clickLinkedList()

	{
		linkedListGetStarted.click();
	}
	
	public void clickStack()

	{
		stackGetStarted.click();
	}
	
	public void clickQueue()

	{
		queueGetStarted.click();
	}
	
	public void clickTree()

	{
		treeGetStarted.click();
	}
	
	public void clickGraph()

	{
		graphGetStarted.click();
	}
	
	
}
