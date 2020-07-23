/*
* Blaine Smith 
* July 1, 2020
* Assignment 4.1
* Password.java
* This program will allow the user to enter in a password to make sure it is valid or not
*/ 
package assignment4_1;

import javax.swing.JOptionPane;

public class Password 
{

public static void main(String[] args) 
   {
       Password password = new Password();
       password.getPassword();
   }

   public void getPassword() 
   {

	   String password = JOptionPane.showInputDialog(null,"Please enter your password ", "Password", 1);

   while (true) 
   {

       boolean valid = true;
       if (password.length() < 6 || password.length() > 10) 
       {
           valid = false;
       } 	           
       else 
       {

	       boolean charactersFound = false;
	       boolean digitsFound = false;
	
	       for (int i = 0; i < password.length(); i++) 
	       {
	           if ((password.charAt(i) >= 65 && password.charAt(i) <= 90) || (password.charAt(i) >= 97 && password.charAt(i) <= 122)) 
	           {
	               charactersFound = true;
	           }
	           if ((password.charAt(i) >= 48 && password.charAt(i) <= 57)) 
	           {
	               digitsFound = true;
	           }
	       }
	
	       if (charactersFound && digitsFound) 
	       {
	           valid = true;
	       }
	       else 
	       {
	           valid = false;
	       }
           
       }

       if (valid) 
       {
           break;
       }

       password = JOptionPane.showInputDialog(null,"Password can not be less than 6 or more than 10 characters\n" + 
    		   "Password must contain at least 1 charcater and 1 digit" + 
    		   "\nPlease re-enter your password ", "Password", 1);
   }

   String Password2 = JOptionPane.showInputDialog(null,"Please re-enter your password ", "Password", 1);
   
	  while (!password.equalsIgnoreCase(Password2)) 
	   {
	       if (!password.equalsIgnoreCase(Password2)) 
	       {
	          Password2 = JOptionPane.showInputDialog(null, "Password Mismatch" + "\nPlease re-enter your password ", "Re-Password", 1); 
	       }
	       else 
	       {
	    	   JOptionPane.showMessageDialog(null, "Password is valid! ", "Password Check Result", 1);
	       }
	   }
   }
}
