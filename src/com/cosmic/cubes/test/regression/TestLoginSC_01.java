package com.cosmic.cubes.test.regression;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cosmic.cubes.ui.LoginPage;
import com.cosmic.cubes.utils.projectspec.CreateDriver;

//Step 1
public class TestLoginSC_01 {
	
	//Step 2
	WebDriver driver;
	//Step 3
	LoginPage login;
	
	//Step 4
	@BeforeMethod
	public void setUp()
	{
		driver = CreateDriver.getDriver();
		login = new LoginPage(driver);
	}
	//Step 5
	@Test
	public void testInvalidLoginTC_05()
	{
		login.waitForLoginPage();
		//Enter Username
		login.getUserNameTextBox().sendKeys("admin");
		//Enter Password
		login.getPasswordTextBox().sendKeys("asasasasa");
		//Click on Login button
		login.getLoginButton().click();
		//Get Error Message
		String actualErrorMessage = login.getErrorMessageText().getText();
		String expectedErrorMessage = "Username or Password is invalid. Please try again.";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}
	//Step 6
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
