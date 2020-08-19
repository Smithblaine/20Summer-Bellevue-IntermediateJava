/*
 * Blaine Smith
 * July 23, 2020
 * Bellevue Universiy
 * The purpose of this assignment is to create 4 different classes that groups a company by types and sub-types.
 * Division.java
 */
package assignment7_1;

public abstract class Division 
{
	protected String DivisionName;
	protected String AccountNumber;

	public Division(String DivisionName, String AccountNumber) 
	{
		super();
		this.DivisionName = DivisionName;
		this.AccountNumber = AccountNumber;
	}

	abstract String display();

}