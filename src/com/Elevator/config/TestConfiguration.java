package com.Elevator.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Elevator.util.Datahandlers;


public class TestConfiguration {
	public static WebDriver getinstance()
	{
		WebDriver driver=null;
		String browseType=Datahandlers.getFromPropertyFile("configuration","browser");
		String url=Datahandlers.getFromPropertyFile("configuration","url");
		if(browseType.equalsIgnoreCase("firefox"))
		{
			System.setProperty("WebDriver.firefox.marionette",".browser-servers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		elseif(browseType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver",".browser-servers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.err.println("invalid browser type");
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(url);
	return driver;
	}

}
