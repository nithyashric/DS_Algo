package com.numpy.Runner;
import com.numpy.utils.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:reports/dsAlgoReport.html" }, // reporting purpose
		monochrome = false, // console output
		tags = "", // tags from feature file
		features = { "src/test/resources/com/numpy/Runner" }, // location of feature files
		glue = { "com.numpy.StepDefinitions" }) // location of step definition files

public class StepDefinitionRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	@Parameters({"browser"})
	public void loadBrowser(String browser)
	{
		MyLogger.error("loading browser");
			DriverManager.getDriver(browser,true);
	
	}

}