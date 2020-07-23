/*
* Blaine Smith 
* June 14, 2020
* Assignment 1.1
* Dollars.java
* This program will allow the users to enter in currency amount to determine the number of bills needed to create the total.
*/
package assignment1_1;

import javax.swing.*;

public class Dollars {

	public static void main(String [] args){

	    double dblInput = 0.0;
	    int intInput = 0;
	    String rawInput;

	    rawInput = JOptionPane.showInputDialog(null, "Please enter a double value. Example: 33.44");
	    dblInput = Double.parseDouble(rawInput);
	    
	    System.out.println("The value entered is: " + dblInput);
	    
	    double Hundreds = (int) dblInput / 100;
	    double Fifties = (int) (dblInput - 100 * Hundreds) / 50;
	    double Twenties = (int) (dblInput - (50 * Fifties + 100 * Hundreds)) / 20;
	    double Tens = (int) (dblInput - (50 * Fifties + 100 * Hundreds + 20 * Twenties)) / 10;
	    double Fives = (int) (dblInput - (50 * Fifties + 100 * Hundreds + 20 * Twenties + 10 * Tens)) / 5;
	    double One = (int) (dblInput - (100 * Hundreds + 50 * Fifties + 20 * Twenties + 10 * Tens + 5 * Fives))/1;
	    
	    
	    System.out.println("That is :\n" + Hundreds + ": Hundreds\n" + Fifties + ": Fifties\n"
	        	+ Twenties + ": Twenties\n" + Tens + ": Tens \n" + Fives + ": Fives\n" + One + ": Ones");
	    

	    rawInput = JOptionPane.showInputDialog(null, "Please enter an int value. Example 231");
	    intInput = Integer.parseInt(rawInput);
	    
	    System.out.println("The value entered is: " + intInput);
	    
	    int hundreds = intInput / 100;
	    int fifties = (intInput - 100 * hundreds) / 50;
	    int twenties = (intInput - (50 * fifties + 100 * hundreds)) / 20;
	    int tens = (intInput - (50 * fifties + 100 * hundreds + 20 * twenties)) / 10;
	    int fives = (intInput - (50 * fifties + 100 * hundreds + 20 * twenties + 10 * tens)) / 5;
	    int one = (intInput - (100 * hundreds + 50 * fifties + 20 * twenties + 10 * tens + 5 * fives))/1;
	    
	    
	    System.out.println("That is :\n" + hundreds + ": Hundreds\n" + fifties + ": Fifties\n"
	        	+ twenties + ": Twenties\n" + tens + ": Tens \n" + fives + ": Fives\n" + one + ": Ones");

	    System.exit(0);
	  }

}
