package com.Elevator.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mousehoverhandlers {

		public static void mousemovetoElement(WebDriver driver,WebElement element)
		{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void doubleclick(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	public static void dragAnddrop(WebDriver driver,WebElement src,WebElement tgt)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, tgt).perform();
	}
	}

