package com.crm.autodesk.GenericLiabraries;

import java.util.Random;

/**
 * This class contains generic methods pertaining to java
 * @author RAHUL
 *
 */

public class javaUtility {
	/**
	 * This method generates random number
	 */
	
	public int getRandomNum()
	{
		Random ran = new Random();
		int randomNum= ran.nextInt(1000);
		
		return randomNum;
	}

}
