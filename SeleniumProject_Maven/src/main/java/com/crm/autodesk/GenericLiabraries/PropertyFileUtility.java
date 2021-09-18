package com.crm.autodesk.GenericLiabraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	
	public String getpropertyFileData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IpathConstaints.PropertyFilePath);
		Properties p= new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}

}
