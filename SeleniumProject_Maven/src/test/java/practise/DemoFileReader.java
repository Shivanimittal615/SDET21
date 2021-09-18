package practise;

import com.crm.autodesk.GenericLiabraries.jSONFileUtility;

public class DemoFileReader {
	public  static void main (String[] args) throws Throwable {
		
		jSONFileUtility jsonLib = new jSONFileUtility();
		String val= jsonLib.readDataFromJSON("browser");
		String val1= jsonLib.readDataFromJSON("url");
		String val2= jsonLib.readDataFromJSON("username");
		String val3= jsonLib.readDataFromJSON("password");
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
	}

}
