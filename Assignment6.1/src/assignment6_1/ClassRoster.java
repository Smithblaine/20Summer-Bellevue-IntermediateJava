/*
* Blaine Smith 
* July 14, 2020
* Assignment 6.1
* ClassRoster.java
* This program show the user the usage of the linked lists, objects, and the passing of data between classes.
*/ 
package assignment6_1;

import java.util.LinkedList;
import java.util.ListIterator;

public class ClassRoster 
{

   public static void main(String[] args) 
   {

       LinkedList<Student> studentList = new LinkedList<Student>();

       studentList.add(new Student("Deacon","Brewer",103));
       studentList.add(new Student("Charli","Bender",298));
       studentList.add(new Student("Lacey","Huffman",97));
       studentList.add(new Student("Aryan","Thomson",26));
       studentList.add(new Student("Maksim","Justice",95));
       studentList.add(new Student("Isla","Knights",9));
       studentList.add(new Student("Johnnie","Yang",923));
       studentList.add(new Student("Lily","Brook",92));
       studentList.add(new Student("Huseyin","Dale",71));
       studentList.add(new Student("Cynthia","Bowman",20));
       studentList.add(new Student("Alexander","Albon",89));
       studentList.add(new Student("Aislinn","Pineda",88));
       studentList.add(new Student("Romain","Kaur",87));
       studentList.add(new Student("Nico","Hulkenberg",16));
       studentList.add(new Student("Robert","Kubica",52));
       studentList.add(new Student("Kevin","Magnussen",84));
       studentList.add(new Student("Conah","Perez",83));
       studentList.add(new Student("Gallegos","Ricciardo",82));
       studentList.add(new Student("George","Mohamad",88));
       studentList.add(new Student("Lance","Walmsley",80));
      
       System.out.println("Linked List Content in normal order: ");
       ListIterator<Student> listIterator = studentList.listIterator();
       
		while (listIterator.hasNext()) 
		{
		   Student student = listIterator.next();
		   System.out.printf("%10s %15s %5d\n",student.FirstName() ,student.LastName(), student.StudentID());
		}

	   System.out.println("\n\nLinked List Content in Reverse Order: \n");
       ListIterator<Student> reverseIterator = studentList.listIterator(studentList.size());

		while (reverseIterator.hasPrevious()) 
		{
		   Student student = reverseIterator.previous();
		   System.out.printf("%10s %15s %5d\n",student.FirstName() ,student.LastName(), student.StudentID());
		}

   }

}
