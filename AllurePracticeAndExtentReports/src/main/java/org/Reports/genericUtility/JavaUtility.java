package org.Reports.genericUtility;

import java.util.Random;

/**
 * This class contains java reusable methods
 * @author DELL
 *
 */
public class JavaUtility {
	
	/**
	 * This method is used to generate Random Number
	 * @return
	 */

	public int RandomNumber()
	{
		Random random= new Random();
		return random.nextInt(1000);
	}
	/**
	 * This method is used to generate Random Number
	 * @return
	 */

	public int RandomNumber3()
	{
		Random random= new Random();
		return random.nextInt(100000);
	}/**
	 * This method is used to generate Random Number
	 * @return
	 */

	public int RandomNumber2()
	{
		Random random= new Random();
		return random.nextInt(1000);
	}
	/**
	 * This method is used to generate Random Number
	 * @return
	 */
	public int RandomNumber1()
	{
		Random random= new Random();
		return random.nextInt(1000);
	}
	/**
	 * This method is used to convert the String to Long data type
	 * @param stringData
	 * @return
	 */
	public long convertStringToLong(String stringData)
	{
		return Long.parseLong(stringData);
	}
	
	/**
	 * This method is used to print the value in Console 
	 * @param statement
	 */
	
	public void printStatement(String data)
	{
		System.out.println(data);
	}

}
