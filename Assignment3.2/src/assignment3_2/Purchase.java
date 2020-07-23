/*
* Blaine Smith 
* June 27, 2020
* Assignment 3.2
* Purchase.java
* This program will allow the user to produce a sales tickets that will calculate the sales tax for them and include tax as well.
*/ 
package assignment3_2;

import java.util.*;

public class Purchase
  {
    String invoiceNum;
    double saleAmt;
    double salesTax;
    double totalBill;
    
        
    private final static double TAX = .075;  
    
    public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
       
        Purchase purchase = new Purchase();
        displayGreet(); 
        
        System.out.print("Enter invoice number: ");
        purchase.setInvoiceNum( sc.nextLine() );
        
        System.out.print("\nEnter sales amount: ");
        purchase.setSaleAmt( Double.parseDouble(sc.nextLine()) );
        
        purchase.totalBill = purchase.saleAmt + purchase.salesTax;
        purchase.displaySummary(purchase.invoiceNum,purchase.saleAmt,purchase.salesTax,purchase.totalBill);
        
        System.exit(0);
        
      }
    
    public void displaySummary(String invoiceNumber, double saleAmt, double salesTax, double totalB)
    {
       System.out.printf("\n\n~~~  Sales Summary  ~~~\n");
       System.out.printf("Invoice #: %s", invoiceNumber);
       System.out.printf("\nSales Amount: $%.2f", saleAmt);
       System.out.printf("\nSales Tax: $%.2f", salesTax);
       System.out.println("\n-----------------");
       System.out.printf("Total: $%.2f\n\n",totalB);
    }
    
    public static void displayGreet(){
        System.out.println("\n-- Welcome to the Invoice application --\n");
    }
    
    public void setInvoiceNum(String invoice)
    {
         invoiceNum = invoice;
    }
    
    
    public void setSaleAmt(double amtOfSales)
    {
        saleAmt = amtOfSales;
        salesTax = TAX * amtOfSales;
    }
  }
