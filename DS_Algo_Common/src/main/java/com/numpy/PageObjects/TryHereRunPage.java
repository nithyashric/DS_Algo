package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.numpy.utils.MyLogger;

public class TryHereRunPage {
	WebDriver ldriver;
	
	
	public TryHereRunPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(xpath="//textarea[@tabindex='0']")
			//html/body/div/div/form/div/div/div[1]/textarea")
				    //html/body/div/div/form/div/div/div[1]/textarea
//	@FindBy(id="editor")
	// /html/body/div/div/form/div/textarea/
	// 			   /html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span
	//			   /html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span
	//			   /html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span
	//			   /html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span
	WebElement commandinput;
	
	public void setInput(String input)
	{
		//System.out.println("here:"+commandinput.getTagName());
		commandinput.sendKeys(input);
	}
	
	@FindBy(xpath="//*[@id='answer_form']/button")
	WebElement button;
	
	public void clickbutton()
	{
		button.click();
	}
	
	@FindBy(xpath="/html/body/div/div/div/pre")
	
	WebElement commandOutput;
	
	public String getOutput()
	{

		if(commandOutput!=null)
		{
			MyLogger.info("command output is not null");
			return commandOutput.getText(); 
		}
		MyLogger.info("command output is null");
		return null;
	}	
	
	
}
