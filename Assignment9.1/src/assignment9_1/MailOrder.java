/*
 * Blaine Smith
 * August 5, 2020
 * Bellevue University
 * The purpose of this assignment is to take in the users input then store it into a file.
 * MessageBoxes.java
 */
package assignment9_1;

import java.util.Scanner;
import java.io.*;

public class MailOrder 
{
	
	public static void main(String[] args) throws IOException
	{
		Scanner mo = new Scanner(System.in);
		
		PrintWriter file = new PrintWriter(new File("C:\\Users\\Ringo\\Desktop\\Program Repos\\20Summer-Bellevue-IntermediateJava\\Assignment9.1\\src\\assignment9_1\\MailOrderData.txt"));

		System.out.print("Enter the item number:");

		int item = mo.nextInt();

		System.out.print("Enter the item's quantity: ");
		int amount = mo.nextInt();

		file.println("Item Number :"+ item + "\t" + "Item Quantity: " + amount);	
		
		System.out.print("Values Succsessfully Recorded");

		file.close();
	}
}