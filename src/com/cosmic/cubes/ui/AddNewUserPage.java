package com.cosmic.cubes.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewUserPage
{
	WebDriver driver;
	public AddNewUserPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitForAddNewUserPage()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container")));
	}
	public WebElement getUsernameTextBox()
	{
		return driver.findElement(By.name("username"));
	}
	public WebElement getPasswordtextBox()
	{
		return driver.findElement(By.name("passwordText"));
	}
	public WebElement getAccessDDL()
	{
		return driver.findElement(By.name("active"));
	}
	public WebElement getRetypePasswordTextBox()
	{
		return driver.findElement(By.name("passwordTextRetype"));
	}
	public WebElement getFirstNameTextBox()
	{
		return driver.findElement(By.name("firstName"));
	}
	public WebElement getLastNameTextBox()
	{
		return driver.findElement(By.name("lastName"));
	}
	public WebElement getMiddleInitialTextBox()
	{
		return driver.findElement(By.name("middleName"));
	}
	public WebElement getEmailTextBox()
	{
		return driver.findElement(By.name("email"));
	}
	public WebElement getPhoneTextBox()
	{
		return driver.findElement(By.name("phone"));
	}
	public WebElement getFaxTextBox()
	{
		return driver.findElement(By.name("fax"));
	}
	public WebElement getMobileTextBox()
	{
		return driver.findElement(By.name("mobile"));
	}
	public WebElement getOtherContactTextBox()
	{
		return driver.findElement(By.name("otherContact"));
	}
	public WebElement getEnableOvertimeRadio()
	{
		return driver.findElement(By.id("overtimeTracking_Enable"));
	}
	public WebElement getDisableOvertimeRadio()
	{
		return driver.findElement(By.id("overtimeTracking_Disable"));
	}
	public WebElement getEnterTimeTrackCheckBox()
	{
		return driver.findElement(By.id("right9"));
	}
	public WebElement getEnterOrModifyCheckBox()
	{
		return driver.findElement(By.id("right12"));
	}
	public WebElement getManageCPTCheckBox()
	{
		return driver.findElement(By.id("right2"));
	}
	public WebElement getGenerateReportsCheckBox()
	{
		return driver.findElement(By.id("right1"));
	}
	public WebElement getPrepareInvoiceDataCheckBox()
	{
		return driver.findElement(By.id("right8"));
	}
	public WebElement getManageUsersCheckBox()
	{
		return driver.findElement(By.id("right5"));
	}
	public WebElement getManageBillingTypesCheckBox()
	{
		return driver.findElement(By.id("right7"));
	}
	public WebElement getManageWorkScheduleCheckBox()
	{
		return driver.findElement(By.id("right10"));
	}
	public WebElement getManageGeneralSettingsCheckBox()
	{
		return driver.findElement(By.id("right11"));
	}
	public WebElement getCreateUserButton()
	{
		return driver.findElement(By.xpath("//input[contains(@value,'Create User')]"));
	}
	public WebElement getCancelButton()
	{
		return driver.findElement(By.xpath("//input[contains(@value,'Cancel')]"));
	}
}
