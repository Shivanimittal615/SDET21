package com.crm.autodesk.GenericLiabraries;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

/**
 * 
 * @author RAHUL
 *
 */

public class jSONFileUtility {
	/**
	 * this method reads the data from json file
	 * @throws Throwable
	 */
	
	@SuppressWarnings("rawtypes")
	public String readDataFromJSON(String key) throws Throwable
	{
		//read the data from json file
		
		FileReader file = new FileReader("C:\\Users\\RAHUL\\eclipse-workspace\\SeleniumProject_Maven\\src\\main\\resources\\commonData.json");
		
		//Convert the json file into java object
		JSONParser jsonobj = new JSONParser();
		Object jobj = jsonobj.parse(file);
		
		//Type cast java obj to hashmap
		
		HashMap map = (HashMap)jobj;
		String value = map.get(key).toString();
		
		//return the value
		return value;
	}

}
