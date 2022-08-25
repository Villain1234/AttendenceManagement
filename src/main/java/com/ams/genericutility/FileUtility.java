package com.ams.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * it contains External File specific Libraries 
 * @author Sai
 */





public class FileUtility {
	
	/**
	 * its used to return the value from the property file based on key
	 * @param uRL
	 * @return value
	 * @throws IOException 
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream(IConstants.propertyFilePath);
		Properties p= new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		
		return value ;
	}
	
	

	

}
