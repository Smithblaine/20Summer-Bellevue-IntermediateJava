/*
 * Blaine Smith
 * July 23, 2020
 * Bellevue Universiy
 * The purpose of this assignment is to create 4 different classes that groups a company by types and sub-types.
 * DomesticDivision.java
 */
package assignment7_1;

public class DomesticDivision extends Division 
{
	private String stateName;

	public DomesticDivision(String DivisionName, String AccountNumber,String StateName)
	{
		super( DivisionName, AccountNumber );
		this.stateName = StateName;
	}

	@Override
	public String display() 
	{
	
		return "\nDivision Name = " + DivisionName +
				"\nAccount Number = " + AccountNumber+ 
				"\nState Name = " + stateName; 
	}
}