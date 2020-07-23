/*
* Blaine Smith 
* June 21, 2020
* Assignment 2.2
* CollegeStudent.java
* This program will allow the user to store the information that will be requested of them from the main class
*/
package assignment2_2;

import java.util.*;

public class CollegeStudent
{
	String fName;
	String lName;
	GregorianCalendar enrollDate;
	GregorianCalendar gradDate;
	
	public CollegeStudent(String firstName, String lastName, GregorianCalendar enrollmentDate){
		fName = firstName;
		lName = lastName;
		enrollDate = enrollmentDate;
		gradDate = new GregorianCalendar(
		enrollDate.get(enrollmentDate.YEAR),
		enrollDate.get(enrollmentDate.MONTH),
		enrollDate.get(enrollmentDate.DAY_OF_MONTH));
		gradDate.add(enrollmentDate.YEAR,4);
								
	}

	public String getFirstName() 
	{
		return fName;
	}
	public void setFirstName(String firstname)
	{
		fName = firstname;
	}

	public String getLastName() 
	{
		return lName;
	}
	public void setLastName(String lastname)
	{
		lName = lastname;
	}

	public GregorianCalendar getEnrollDate()
	{
		return enrollDate;
	}
	public void setEnrollDate(GregorianCalendar eDate)
	{
		enrollDate = eDate;
	}

}
