package assignment6_1;

/*
* Blaine Smith 
* July 14, 2020
* Assignment 6.1
* ClassRoster.java
* This program show the user the usage of the linked lists, objects, and the passing of data between classes.
*/

public class Student
{
	   private String firstName;
	   private String lastName;
	   private Integer studentID;

	   public Student() 
	   {
	      
	   }

	   public Student(String firstName, String lastName, Integer studentID) 
	   {
	       FirstName(firstName);
	       LastName(lastName);
	       StudentID(studentID);
	   }
	  
	   public String FirstName() 
	   {
	       return firstName;
	   }
	   
	   public void FirstName(String firstName) 
	   {
	       this.firstName = firstName;
	   }
	   
	   public String LastName() 
	   {
	       return lastName;
	   }
	   
	   public void LastName(String lastName) 
	   {
	       this.lastName = lastName;
	   }
	   
	   public Integer StudentID() 
	   {
	       return studentID;
	   }
	   
	   public void StudentID(Integer studentID) 
	   {
	       this.studentID = studentID;
	   }
	            
}