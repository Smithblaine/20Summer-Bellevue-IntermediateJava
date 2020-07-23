/*
* Blaine Smith 
* July 6, 2020
* Assignment 5.1
* Password.java
* This program will allow the user to choose a the way that a set of books will be compared/organized
*/ 
package assignment5_1;

import java.util.Comparator;

class SchoolTextBook 
{
   private String author;
   private String title;
   private String ISBN;
   private int pageCount;
   private double price;

   public SchoolTextBook(String author, String title, String isbn, int pageCount, double price) 
   {
       super();
       this.author = author;
       this.title = title;
       ISBN = isbn;
       this.pageCount = pageCount;
       this.price = price;
   }

   public String getAuthor() 
   {
       return author;
   }

   public void setAuthor(String author) 
   {
       this.author = author;
   }

   public String getTitle() 
   {
       return title;
   }
   
   public void setTitle(String title) 
   {
       this.title = title;
   }

   public String getISBN() 
   {
       return ISBN;
   }

   public void setISBN(String isbn) 
   {
       ISBN = isbn;
   }
   
   public int getpageCount() 
   {
       return pageCount;
   }

   public void setpageCount(int pageCount) 
   {
       this.pageCount = pageCount;
   }

   public double getPrice() 
   {
       return price;
   }
   
   public void setPrice(double price) 
   {
       this.price = price;
   }

  
   @Override

   public String toString() 
   {
       return "SchoolTextBook [Author=" + author + ", Title=" + title 
    		+ ", ISBN=" + ISBN + ", Page Count=" + pageCount + ", Price=" + price + "]";
   }  
}

class AuthorComparator implements Comparator<SchoolTextBook> 
{
	@Override
	
	public int compare(SchoolTextBook s1, SchoolTextBook s2) 
	{
		return s1.getAuthor().compareTo(s2.getAuthor());
	}
}

class TitleComparator implements Comparator<SchoolTextBook> 
{
	@Override
	
	public int compare(SchoolTextBook s1, SchoolTextBook s2) 
	{
		return s1.getTitle().compareTo(s2.getTitle());
	}
}

class ISBNComparator implements Comparator<SchoolTextBook> 
{
	@Override
	
	public int compare(SchoolTextBook s1, SchoolTextBook s2) 
	{
		return s1.getISBN().compareTo(s2.getISBN());
	}
}

class PageCountComparator implements Comparator<SchoolTextBook> 
{
	@Override
	
	public int compare(SchoolTextBook s1, SchoolTextBook s2) 
	{
		if(s1.getpageCount() > s2.getpageCount())
		
		       return 1;
		
		else if(s1.getpageCount() == s2.getpageCount())
		
		       return 0;
		
		return -1;
	}
}

class PriceComparator implements Comparator<SchoolTextBook> 
{
	@Override
	
	public int compare(SchoolTextBook s1, SchoolTextBook s2) 
	{
		if(s1.getPrice() > s2.getPrice())
		
		       return 1;
		
		else if(s1.getPrice() == s2.getPrice())
		
		       return 0;
		
		return -1;
	}
}
