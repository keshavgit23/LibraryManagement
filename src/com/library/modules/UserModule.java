package com.library.modules;
import java.util.ArrayList;
import com.library.models.Book;
import com.library.interfaces.userFunctions;

public class UserModule implements userFunctions{
        ArrayList<Book> books;

        public UserModule(ArrayList<Book> books){
            this.books=books;
        }
        @Override
      public  void searchBook(String keyword)
        {
            
           System.out.println("\n Searching for books with keyword:" + keyword);
           boolean found = false;

           for(Book b:books){
            if
             (b.getBookTitle().toLowerCase().contains(keyword.toLowerCase()) 
             || 
             b.getAuthorName().toLowerCase().contains(keyword.toLowerCase()) 
             || 
             b.getBookCategory().toLowerCase().contains(keyword.toLowerCase()))
             {
                System.out.println("Found: " +b.getBookID() +"|"+b.getBookTitle()+"|"+b.getAuthorName()+"|"+b.getBookCategory());
                found=true;
             }
           }

           if(!found){
            System.out.println("No books found with keyword:"+keyword);
           }
        }

        @Override
       public void requestBook(String bookTitle)
        {
             System.out.println("Request sent for Book:"+ bookTitle +"!");
        }
        @Override
       public void cancelRequest(String bookTitle)
        {
            System.out.println("Cancelled request for book:"+bookTitle+"!");
        }
        @Override
       public void returnBook(String bookTitle)
        {
             System.out.println("Returned Book:"+bookTitle+"!");
        }
        @Override
       public void payPenalty(double amount)
        {
            System.out.println("Payed penalty amount rs:"+amount+"!");
        }
        @Override
       public void chooseIssuePeriod(int days)
        {
             System.out.println("Book issued for:"+days+"!");
        }

        @Override
        public void viewBooks()
        {
            System.out.println("----------------------------------Available Books-----------------------------------------");
        }
    }
