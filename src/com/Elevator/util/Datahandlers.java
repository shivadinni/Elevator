package com.Elevator.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datahandlers
{
public static String readdataFromExcel(String filename, String sheetName, int rowindex, int cellindex) {
	String data="null";
	try
	{
	File f=new File("./test-data/"+filename+".xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row r=sh.getRow(rowindex);
	Cell c=r.getCell(cellindex);
	data=c.toString();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return data;
}
public static void WriteData(String filename, String sheetName,int rowindex, int cellindex,String data)
{
	try
	{
		File f=new File("./test-data/"+filename+".xlsx");
		FileInputStream fis=new FileInputStream(f);	
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row r=sh.getRow(rowindex);
		Cell c=r.getCell(cellindex);
		c.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static String getFromPropertyFile(String filename, String key)
{
	String data=null;
	try
	{
		File f=new File("./Config-data/"+filename+".properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		data=(String)prop.get(key);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return data;
}
public static void WriteFromPropertyFile(String filename, String key,String value, String comment)
{
	try
	{
		File f=new File("./Config-data/"+filename+".properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		prop.setProperty(key, value);
		FileOutputStream fos=new FileOutputStream(f);
		prop.store(fos,comment);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}


