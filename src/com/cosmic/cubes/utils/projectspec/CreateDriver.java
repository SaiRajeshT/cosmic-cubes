package com.cosmic.cubes.utils.projectspec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cosmic.cubes.utils.generic.GetData;

public class CreateDriver {
	
	public static WebDriver getDriver() {
		WebDriver driver = null;
		String browserName = GetData.fromExcel("tdata", "Configuration", 1, 0);
		String url = GetData.fromExcel("tdata", "Configuration", 1, 1);
		if (browserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.firefox.marionette", "./browser_servers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("gc")) {
			System.setProperty("webdriver.chrome.driver", "./browser_severs/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.out.println("Invalid Browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	
}
