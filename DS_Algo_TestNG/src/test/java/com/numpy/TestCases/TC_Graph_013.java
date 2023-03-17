package com.numpy.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.numpy.PageObjects.GraphPage;
import com.numpy.PageObjects.HomePage;
import com.numpy.PageObjects.LoginPage;
import com.numpy.PageObjects.TryHerePage;
import com.numpy.PageObjects.TryHereRunPage;

public class TC_Graph_013 extends BaseClass {

	private GraphPage setupPage() {
		HomePage hp = new HomePage(driver);

		/*
		 * hp.clicklogin(); LoginPage lp = new LoginPage(driver);
		 * lp.setUserName(username); lp.setPassword(password); lp.clickSubmit(); hp =
		 * new HomePage(driver);
		 */

		hp.clickGraph();
		GraphPage gp = new GraphPage(driver);
		return gp;
	}

	@Test
	public void checkGraph() throws Exception {
		GraphPage gp = setupPage();
		gp.clickGraph();

		WebElement graphLabel = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

		if (graphLabel.getText().trim().equals("Graph")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickTryHereGraph()

	{
		GraphPage gp = setupPage();
		gp.clickGraph();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();

		WebElement inputLabel = driver
				.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

		if (inputLabel.getText().trim().equals("1")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void clickTryHereRunGraph() throws InterruptedException

	{
		GraphPage gp = setupPage();
		gp.clickGraph();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		TryHereRunPage rp = new TryHereRunPage(driver);
		// Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		// Thread.sleep(100);
		rp.clickbutton();
		// System.out.println(rp.getOutput());

		if (rp.getOutput().equals("Hello")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void checkGraphRepresentations() throws Exception {
		GraphPage gp = setupPage();
		gp.clickGraphRepresentations();

		WebElement graphRepresentationsLabel = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/strong/p"));

		if (graphRepresentationsLabel.getText().trim().equals("Graph Representations")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickTryHereGraphRepresentations()

	{
		GraphPage gp = setupPage();
		gp.clickGraphRepresentations();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();

		WebElement inputLabel = driver
				.findElement(By.xpath("/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[5]/div/div/div"));

		if (inputLabel.getText().trim().equals("1")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void clickTryHereRunGraphRepresentations() throws InterruptedException

	{
		GraphPage gp = setupPage();
		gp.clickGraphRepresentations();
		TryHerePage th = new TryHerePage(driver);
		th.clickTryHere();
		TryHereRunPage rp = new TryHereRunPage(driver);
		// Thread.sleep(100);
		rp.setInput("print(\"Hello\")");
		// Thread.sleep(100);
		rp.clickbutton();
		// System.out.println(rp.getOutput());

		if (rp.getOutput().equals("Hello")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}
