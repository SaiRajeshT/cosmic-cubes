package com.cosmic.cubes.test.regression;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cosmic.cubes.ui.AddNewUserPage;
import com.cosmic.cubes.ui.HomePage;
import com.cosmic.cubes.ui.LoginPage;
import com.cosmic.cubes.ui.UsersPage;
import com.cosmic.cubes.utils.generic.HandleDropDown;
import com.cosmic.cubes.utils.projectspec.CreateDriver;

public class TestCreateUserSC_05
{
	WebDriver driver;
	LoginPage login;
	HomePage home;
	UsersPage userPage;
	AddNewUserPage addUser;
	
	@BeforeMethod
	public void setUp()
	{
		driver = CreateDriver.getDriver();
		login = new LoginPage(driver);
		home = new HomePage(driver);
		userPage = new UsersPage(driver);
		addUser = new AddNewUserPage(driver);
	}
	
	@Test
	public void testCreateUserTC_12()
	{
		login.waitForLoginPage();
		login.getUserNameTextBox().sendKeys("admin");
		login.getPasswordTextBox().sendKeys("manager");
		login.getLoginButton().click();
		home.waitForHomePage();
		home.getUsersTab().click();
		userPage.waitForUsersPage();
		userPage.getAddNewUserButton().click();
		addUser.waitForAddNewUserPage();
		addUser.getUsernameTextBox().sendKeys("untest2");
		WebElement accessDDL = addUser.getAccessDDL();
		HandleDropDown.selectDDLByVisibletext(accessDDL, "enabled");
		addUser.getPasswordtextBox().sendKeys("Pwtest2");
		addUser.getRetypePasswordTextBox().sendKeys("Pwtest2");
		addUser.getFirstNameTextBox().sendKeys("un");
		addUser.getLastNameTextBox().sendKeys("test");
		addUser.getMiddleInitialTextBox().sendKeys("2");
		addUser.getPhoneTextBox().sendKeys("1234567890");
		addUser.getFaxTextBox().sendKeys("1234567890");
		addUser.getMobileTextBox().sendKeys("1234567890");
		addUser.getOtherContactTextBox().sendKeys("1234567890");
		addUser.getDisableOvertimeRadio().click();
		addUser.getEnterTimeTrackCheckBox().click();
		addUser.getGenerateReportsCheckBox().click();
		addUser.getCreateUserButton().click();
		WebElement successMsg = userPage.getSuccessMessage();
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
