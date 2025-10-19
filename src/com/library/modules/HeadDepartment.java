package com.library.modules;
import com.library.interfaces.CommonFunction;

public class HeadDepartment implements CommonFunction
    {
        String bookName;
        int bookID;
        String issueDate;
        String returnDate;

        HeadDepartment(String issueDate, String returnDate)
        {

            this.issueDate = issueDate;
            this.returnDate = returnDate;
        }
        @Override
       public void issueBook(String bookName,int bookID,String issueDate)
        {
            System.out.println("------------------Your book issued succesfully!-----------------------------");
            System.out.println("Book Name: " + bookName);
            System.out.println("Book ID: " + bookID);
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Return Date: " + returnDate);
        }
        @Override
        public void dueDate(String bookName, int bookID,String returnDate)
        {
          System.out.println("---------------------Due Books--------------------------------------------------");
          System.out.println("Book Name: " + bookName);
          System.out.println("Book ID: " + bookID);
          System.out.println("Return Date: " + returnDate);  
        }
    }
