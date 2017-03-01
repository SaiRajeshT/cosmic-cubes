package com.cosmic.cubes.utils.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class HandleAlert {
	
	//Click on OK button on Alert
	public static void acceptAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	//Click on Cancel button on Alert
	public static void dismissAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	//To get Alert Text
	public static String getAlertText(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		String alertText = alt.getText();
		return alertText;
	}
	//To enter text on Alert textbox
	public static void enterTextToAlert(WebDriver driver, String text) {
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(text);
	}

}
