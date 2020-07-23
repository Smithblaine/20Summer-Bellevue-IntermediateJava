/*
* Blaine Smith 
* July 6, 2020
* Assignment 5.1
* Password.java
* This program will allow the user to choose a the way that a set of books will be compared/organized
*/ 
package assignment5_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SchoolTextBookSort{

   public static void main(String args[])
   {

       List<SchoolTextBook> books = new ArrayList<>();

       books.add(new SchoolTextBook("Author2", "Title1", "ISBN3", 1525, 321));
       books.add(new SchoolTextBook("Author4", "Title3", "ISBN2", 125, 15));
       books.add(new SchoolTextBook("Author1", "Title5", "ISBN4", 664, 35));
       books.add(new SchoolTextBook("Author5", "Title2", "ISBN1", 594, 219));
       books.add(new SchoolTextBook("Author3", "Title4", "ISBN5", 2289, 300));

       Scanner sc = new Scanner(System.in);
       
       System.out.println("\n1. Author"
       					+ "\n2. Title"
       					+ "\n3. ISBN"
       					+ "\n4. Page Count"
       					+ "\n5. Price\n");
       System.out.print("\nIn what way would you like to sort these books? : ");
       
       int order = sc.nextInt();

       switch (order)
       {
	       case 1:
	           Collections.sort(books, new AuthorComparator());
	           break;
	       case 2:
	           Collections.sort(books, new TitleComparator());
	           break;
	       case 3:
	           Collections.sort(books, new ISBNComparator());
	           break;
	       case 4:
	           Collections.sort(books, new PageCountComparator());
	           break;
	       case 5:
	           Collections.sort(books, new PriceComparator());
	           break;
	       default:
	           break;
       }

       System.out.println("\nAfter sorting, the books are listed below: \n");

		for (SchoolTextBook b : books)
		{
			System.out.printf("%s, %s, %s, %d, %2.2f\n", b.getAuthor(), b.getTitle(), b.getISBN(), b.getpageCount(), b.getPrice());
		}
   }
}
