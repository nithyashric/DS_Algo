package com.numpy.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private static ExcelReader reader;
	private XSSFWorkbook wbook;
private ExcelReader()
{
	try {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream  fs=loader.getResourceAsStream(ConfigReader.getProperty("app.excelLocation"));
		wbook=new XSSFWorkbook(fs);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static Map<String,String> getData(String sheetName,int row)
{
	if(reader==null)
	{
		reader=new ExcelReader();
	}
	HashMap hmap=new HashMap();
	XSSFSheet sheet=reader.wbook.getSheet(sheetName);
	XSSFRow title=sheet.getRow(0);
	XSSFRow selected=sheet.getRow(row);
	for (int i=0;i<3;i++)
	{
		hmap.put(title.getCell(i).getStringCellValue(), selected.getCell(i).getStringCellValue());
	}
	return hmap;
}

/*
public static void main(String arg[])
{
	Map map=ExcelReader.getData("login", 1);
	System.out.println("username:"+map.get("username"));
	System.out.println("password:"+map.get("password"));
	System.out.println("message:"+map.get("message"));
}
*/
}
