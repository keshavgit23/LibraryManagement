package com.library.modules;
import com.library.interfaces.CommonFunction;

public class HeadDepartment implements CommonFunction
    {
        private String bookTitle;
        private int bookID;
        private String issueDate;
        private String returnDate;

        HeadDepartment(String issueDate, String returnDate)
        {

            this.issueDate = issueDate;
            this.returnDate = returnDate;
        }
        @Override
       public void issueBook(String bookTitle,int bookID,String issueDate)
        {
            System.out.println("------------------Your book issued succesfully!-----------------------------");
            System.out.println("Book Name: " + bookTitle);
            System.out.println("Book ID: " + bookID);
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Return Date: " + returnDate);
        }
        @Override
        public void dueDate(String bookName, int bookID,String returnDate)
        {
          System.out.println("---------------------Due Books--------------------------------------------------");
          System.out.println("Book Title: " + bookTitle);
          System.out.println("Book ID: " + bookID);
          System.out.println("Return Date: " + returnDate);  
        }
        @Override
        public void viewBooks()
        {
            System.out.println("---------------------------------Available Books---------------------------");
        }
        public String getBookTitle(){return bookTitle;}
        public void setBookTitle(String bookTitle){
            this.bookTitle = bookTitle;
        }

        public int getBookID(){return bookID;}
        public void setBookID(int bookID){
            this.bookID = bookID;
        }

        public String getIssueDate(){return issueDate ;}
        public void setIssueDate(String issueDate){
            this.issueDate = issueDate;
        }

        public String getReturnDate () {return returnDate;}
        public void setReturnDate(String returnDate){
            this.returnDate = returnDate;
        }
    }
