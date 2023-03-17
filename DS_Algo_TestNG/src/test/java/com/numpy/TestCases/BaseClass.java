package com.numpy.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.numpy.utils.ConfigReader;
import com.numpy.utils.DriverManager;
import com.numpy.utils.MyLogger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	
	public String baseURL="https://dsportalapp.herokuapp.com"; //ConfigReader.getProperty("app.baseUrl"); 
	public String username ="Nithya91";//ConfigReader.getProperty("app.userName");
	public String password ="sahana@12";//ConfigReader.getProperty("app.password");
	public WebDriver driver; 
	public int sleeptime=2000;
	
	
	
@BeforeMethod
@Parameters("browser")
public void setup(String browser)
	{
		MyLogger.info("before method");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		//ChromeOptions ops=new ChromeOptions();
		//ops.addArguments("--remote-allow-origins=*");
		//driver = new ChromeDriver(ops); 
		driver=DriverManager.getDriver(browser);
	}

	@AfterSuite 
	public void tearDown()
	{
		MyLogger.info("after suite teardown");
		driver.quit(); 
	}
}
