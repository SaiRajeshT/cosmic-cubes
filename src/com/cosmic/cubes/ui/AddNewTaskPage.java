package com.cosmic.cubes.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewTaskPage
{
	WebDriver driver;
	public AddNewTaskPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getCustomerDDL()
	{
		return driver.findElement(By.name("customerId"));
	}
	public WebElement getCustomerNameTextBox()
	{
		return driver.findElement(By.name("customerName"));
	}
	public WebElement getProjectNameTextBox()
	{
		return driver.findElement(By.name("projectName"));
	}
	public WebElement getTaskNameFirstTextBox()
	{
		return driver.findElement(By.name("task[0].name"));
	}
	public WebElement getCreateTasksButton()
	{
		return driver.findElement(By.xpath("//input[@value='Create Tasks']"));
	}
	public void waitForAddNewTask()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container")));
	}
}
