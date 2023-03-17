package com.numpy.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage {
	
	WebDriver ldriver;
	public String baseURL="https://dsportalapp.herokuapp.com";
	public GetStartedPage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		ldriver.get(baseURL+"/home");
	}

@FindBy(xpath = "/html/body/div[1]/div/div/a/button")
WebElement GetStarted;

public void clickGetStarted() {
	GetStarted.click();
}
}
