package com.numpy.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class ConfigReader {
	
	private Properties prop = new Properties();
	private String fileName = "app.config";	
	
	private void parseFile() {
	MyLogger.debug("Parsing Config file");
	ClassLoader loader = Thread.currentThread().getContextClassLoader();
	try {
		InputStream resourceStream = loader.getResourceAsStream(fileName);
	    prop.load(resourceStream);
	    MyLogger.debug("props:"+prop);
		}
	catch (FileNotFoundException ex) 
	{
		MyLogger.error("Config file not found" + ex.toString());
	}
	catch (IOException ex1) 
	{
	    MyLogger.error("Error parsing the config file" + ex1.toString());
	}
}

	private String getProp(String propName) 
	{	
		return prop.getProperty(propName);
	}
	

	private static ConfigReader reader;
	public static String getProperty(String propName) 
	{
		if (reader==null)
		{
			reader=new ConfigReader();
			reader.parseFile();
		}
		return reader.getProp(propName);
	}
}
