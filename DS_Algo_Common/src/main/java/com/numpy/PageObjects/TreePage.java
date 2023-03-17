package com.numpy.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {

	WebDriver ldriver;
	
	public TreePage(WebDriver rdriver)
	{
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/ul[1]/a")
	WebElement overviewOfTrees;
	
	@FindBy(xpath="/html/body/div[2]/ul[2]/a")
	WebElement terminologies;
	
	@FindBy(xpath="/html/body/div[2]/ul[3]/a")
	WebElement typesOfTrees;
	
	@FindBy(xpath="/html/body/div[2]/ul[4]/a")
	WebElement treeTraversals;
	
	@FindBy(xpath="/html/body/div[2]/ul[5]/a")
	WebElement traversals_Illustration;
	
	@FindBy(xpath="/html/body/div[2]/ul[6]/a")
	WebElement binaryTrees;
	
	@FindBy(xpath="/html/body/div[2]/ul[7]/a")
	WebElement typesOfBinaryTrees;

	@FindBy(xpath="/html/body/div[2]/ul[8]/a")
	WebElement implementationInPython;
	
	@FindBy(xpath="/html/body/div[2]/ul[9]/a")
	WebElement binaryTreeTraversals;
	
	@FindBy(xpath="/html/body/div[2]/ul[10]/a")
	WebElement implementationOfBinaryTrees;
	
	@FindBy(xpath="/html/body/div[2]/ul[11]/a")
	WebElement applicationsOfBinaryTrees;
	
	@FindBy(xpath="/html/body/div[2]/ul[12]/a")
	WebElement binarySearchTrees;
	
	@FindBy(xpath="/html/body/div[2]/ul[13]/a")
	WebElement implementationOfBST;
	
	
	public void clickOverviewOfTrees()
	{
		overviewOfTrees.click();
	}
	
	public void clickTerminologies()
	{
		terminologies.click();
	}
	
	public void clickTypesOfTrees()
	{
		typesOfTrees.click();
	}
	
	public void clickTreeTraversals()
	{
		treeTraversals.click();
	}
	
	public void clickTraversals_Illustration()
	{
		traversals_Illustration.click();
	}
	
	public void clickBinaryTrees()
	{
		binaryTrees.click();
	}
	
	public void clickTypesOfBinaryTrees()
	{
		typesOfBinaryTrees.click();
	}
	
	public void clickImplementationInPython()
	{
		implementationInPython.click();
	}
	
	public void clickBinaryTreeTraversals()
	{
		binaryTreeTraversals.click();
	}
	public void clickImplementationOfBinaryTrees()
	{
		implementationOfBinaryTrees.click();
	}
	
	public void clickApplicationsOfBinaryTrees()
	{
		applicationsOfBinaryTrees.click();
	}
	
	public void clickBinarySearchTrees()
	{
		binarySearchTrees.click();
	}
	
	public void clickImplementationOfBST()
	{
		implementationOfBST.click();
	}
	
}
