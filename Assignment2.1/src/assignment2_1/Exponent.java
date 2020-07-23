/*
* Blaine Smith 
* June 21, 2020
* Assignment 2.1
* Exponent.java
* This program will allow the user to enter in a number to obtain the Squared and Cubed value of that number that was entered.
*/
package assignment2_1;

import javax.swing.JOptionPane;

public class Exponent {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null,"Enter a Value to find the square and cube: ", "User Input", JOptionPane.QUESTION_MESSAGE);
		
		float digit = Float.parseFloat(input);
		Exponent exp = new Exponent();
		float squared = exp.Squared(digit);
		float cubed = exp.Cubed(digit);
		
		JOptionPane.showMessageDialog(null, "The Square of the entered value is : " + squared, "Square", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "The Cube of the entered value is : " + cubed, "Cube", JOptionPane.INFORMATION_MESSAGE);
		
	}

	public float Squared (double digit)
	{
		return (float) (digit * digit);
	}
	
	public float Cubed (double digit)
	{
		return (float) (digit * digit * digit);
	}
	
}
