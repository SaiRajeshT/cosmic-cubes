package com.cosmic.cubes.test.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cosmic.cubes.ui.AddNewTaskPage;
import com.cosmic.cubes.ui.HomePage;
import com.cosmic.cubes.ui.LoginPage;
import com.cosmic.cubes.ui.ProjectAndTaskPage;
import com.cosmic.cubes.utils.generic.HandleDropDown;
import com.cosmic.cubes.utils.projectspec.CreateDriver;

public class TestCreateTaskSC_009
{
	WebDriver driver;
	LoginPage login;
	HomePage home;
	ProjectAndTaskPage pAndT;
	AddNewTaskPage addNewTask;
	
	@BeforeMethod
	public void setUp()
	{
		driver = CreateDriver.getDriver();
		login = new LoginPage(driver);
		home = new HomePage(driver);
		pAndT = new ProjectAndTaskPage(driver);
		addNewTask = new AddNewTaskPage(driver);
	}
	@Test
	public void testCreateTaskTC_015()
	{
		login.waitForLoginPage();
		login.getUserNameTextBox().sendKeys("admin");
		login.getPasswordTextBox().sendKeys("manager");
		login.getLoginButton().click();
		home.waitForHomePage();
		home.getProjectAndTaskTab().click();
		pAndT.waitForProjectAndTaskPage();
		pAndT.getAddNewTaskButton().click();
		addNewTask.waitForAddNewTask();
		WebElement customerDDL = addNewTask.getCustomerDDL();
		HandleDropDown.selectDDLByValue(customerDDL, "0");
		addNewTask.getCustomerNameTextBox().sendKeys("Customer2");
		addNewTask.getProjectNameTextBox().sendKeys("Projetc2");
		addNewTask.getTaskNameFirstTextBox().sendKeys("Task2");
		addNewTask.getCreateTasksButton().click();
		pAndT.waitForProjectAndTaskPage();
		WebElement successMsg = pAndT.getSuccessMsgone();
		Assert.assertEquals(successMsg.isDisplayed(), true);
	}
	@AfterMethod
	public void tearDown()
	{
		home.getLogoutButton().click();
		login.waitForLoginPage();
		driver.close();
	}
}
