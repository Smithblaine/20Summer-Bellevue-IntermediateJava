/*
 * Blaine Smith
 * July 23, 2020
 * Bellevue Universiy
 * The purpose of this assignment is to create 4 different classes that groups a company by types and sub-types.
 * InternationalDivision.java
 */
package assignment7_1;

public class InternationalDivision extends Division
{
	private String CountryName;
	private String LanguageSpoken;

	public InternationalDivision(String DivisionName, String AccountNumber,String CountryName, String LanguageSpoken) 
	{
		super (DivisionName, AccountNumber);
		this.CountryName = CountryName;
		this.LanguageSpoken = LanguageSpoken;
	}

	@Override
	public String display() 
	{
		return "\nDivision Name = " + DivisionName +
				"\nAccount Numbe r= " + AccountNumber+ 
				"\nCountry Name = " + CountryName + 
				"\nLanguage Spoken = " + LanguageSpoken;
		
	}

}
