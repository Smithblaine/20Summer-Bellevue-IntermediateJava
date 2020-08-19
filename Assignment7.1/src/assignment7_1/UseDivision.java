/*
 * Blaine Smith
 * July 23, 2020
 * Bellevue Universiy
 * The purpose of this assignment is to create 4 different classes that groups a company by types and sub-types.
 * UseDivision.java
 */
package assignment7_1;

public class UseDivision 
{

	public static void main(String[] args) 
	{
		DomesticDivision Domestic1 = new DomesticDivision("North Division", "98542", "Hampton");
		DomesticDivision Domestic2 = new DomesticDivision("East Division", "98631", "Jersey");
	
		System.out.println("\nDomestic division results");
		System.out.println(Domestic1.display());
		System.out.println(Domestic2.display());
	
		InternationalDivision International1 = new InternationalDivision("West Division", "87436598", "Russia", "English/Russian");
		InternationalDivision International2 = new InternationalDivision("South Division", "14785421", "Mexico", "Spainsh");
	
		System.out.println("\n\nInternational Division results");
		System.out.println(International1.display());
		System.out.println(International2.display());
	}
}