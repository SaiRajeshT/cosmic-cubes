package com.cosmic.cubes.utils.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	
	//Select Drop Down by Index Value
	public static void selectDDLByIndex(WebElement ddl, int index) {		
		Select sct = new Select(ddl);
		sct.selectByIndex(index);		
	}
	//Select Drop Down by Value
	public static void selectDDLByValue(WebElement ddl, String value) {
		Select sct = new Select(ddl);
		sct.selectByValue(value);
	}
	//Select Drop Down by Visible Text
	public static void selectDDLByVisibletext(WebElement ddl, String text) {
		Select sct = new Select(ddl);
		sct.selectByVisibleText(text);
	}
	//Verify Multi Selection Drop Down
	public static boolean verifyDropDown(WebElement ddl) {
		Select sct = new Select(ddl);
		boolean status = sct.isMultiple();
		return status;
	}
	//De-Select by Index Value
	public static void deSelectDDLByIndex(WebElement ddl, int index) {
		Select sct = new Select(ddl);
		try {
			sct.deselectByIndex(index);
		} catch (Exception e) {
			System.out.println("Invalid Operation");
		}
	}
	//De-Select by Value
	public static void deSelectDDLByValue(WebElement ddl, String value) {
		Select sct = new Select(ddl);
		try {
			sct.deselectByValue(value);
		} catch (Exception e) {
			System.out.println("Invalid Operation");
		}
	}
	//De-Select by Visible Text
	public static void deSelectDDLByVisibletext(WebElement ddl, String text) {
		Select sct = new Select(ddl);
		try {
			sct.deselectByVisibleText(text);
		} catch (Exception e) {
			System.out.println("Invalid Operation");
		}
	}
	//De-Select All
	public static void deSelectAllOptions(WebElement ddl) {
		Select sct = new Select(ddl);
		try {
			sct.deselectAll();
		} catch (Exception e) {
			System.out.println("Invalid Operation");
		}
	}

}
