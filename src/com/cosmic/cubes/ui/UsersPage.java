package com.cosmic.cubes.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage
{
	WebDriver driver;
	public UsersPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitForUsersPage()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container")));
	}
	public WebElement getAddNewUserButton()
	{
		return driver.findElement(By.xpath("//input[@value='Add New User']"));
	}
	public WebElement getSuccessMessage()
	{
		return driver.findElement(By.cssSelector(".successmsg"));
	}
}
