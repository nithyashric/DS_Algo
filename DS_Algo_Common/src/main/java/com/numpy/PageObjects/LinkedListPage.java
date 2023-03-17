package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
	
	WebDriver ldriver;
	
	public LinkedListPage (WebDriver rdriver)
	{
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
	WebElement introduction;
	
	@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
	WebElement creatingLinkedList;
	
	@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
	WebElement typesOfLinkedList;
	
	@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
	WebElement implementLinkedListInPython;
	
	@FindBy(xpath = "/html/body/div[2]/ul[5]/a")
	WebElement traversal;
	
	@FindBy(xpath = "/html/body/div[2]/ul[6]/a")
	WebElement insertion;
	
	@FindBy(xpath = "/html/body/div[2]/ul[7]/a")
	WebElement deletion;
	
	public void clickintroduction()
	{
		introduction.click();
	}
	
	public void clickcreatingLinkedList()
	{
		creatingLinkedList.click();
	}
	public void clicktypesOfLinkedList()
	{
		typesOfLinkedList.click();
	}
	public void clickimplementLinkedListInPython()
	{
		implementLinkedListInPython.click();
	}
	public void clicktraversal()
	{
	traversal.click();	
	}
	public void clickinsertion()
	{
	insertion.click();
	}
	public void clickdeletion()
	{
	deletion.click();
	}
	
}
