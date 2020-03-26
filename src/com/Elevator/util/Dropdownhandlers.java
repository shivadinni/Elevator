package com.Elevator.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandlers {
	public static void selectddlbyindex(WebElement ddl, int index)
	{
		Select sct=new Select(ddl);
		sct.selectByIndex(index);
	}
	public static void selectddlByValue(WebElement ddl,String value)
	{
		Select sct=new Select(ddl);
		sct.selectByValue(value);
	}
	public static void selectddlByVisibleText(WebElement ddl,String value)
	{
		Select sct=new Select(ddl);
		sct.selectByVisibleText(value);
	}
	public static void deselectddlByIndex(WebElement ddl, int index)
	{
		Select sct=new Select(ddl);
		sct.deselectByIndex(index);
	}
	public static void deselectddlByvalue(WebElement ddl, String value)
	{
		Select sct=new Select(ddl);
		sct.deselectByValue(value);
	}
	public static void deselectddlByVisibleText(WebElement ddl, String value)
	{
		Select sct=new Select(ddl);
		sct.deselectByVisibleText(value);
	}
	public static void deselectddlAll(WebElement ddl)
	{
		Select sct=new Select(ddl);
		sct.deselectAll();
	}
	}

