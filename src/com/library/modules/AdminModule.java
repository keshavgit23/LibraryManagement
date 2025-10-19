package com.library.modules;
import com.library.interfaces.Admin;

public class AdminModule implements Admin{

        String studentName;
        String studentClass;
        int studentRollNo;

       public AdminModule(String studentName, String studentClass, int studentRollNo)
       {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentRollNo = studentRollNo;
       } 
        @Override
       public void addBook(String bookName,int bookID,String bookCategory)
       {
          System.out.println("Book Name: " + bookName);
          System.out.println("Book ID: " + bookID);
          System.out.println("Book Caregory: " + bookCategory);
       }

       @Override
       public void removeBook(String bookName,int bookID,String bookCategory)
       {
          System.out.println("Book Name: " + bookName);
          System.out.println("Book ID: " + bookID);
          System.out.println("Book Caregory: " + bookCategory);
       }
       @Override
      public void addStudent(String studentName, String studentClass,int studentRollNo)
       {
       System.out.println("---------------------------Student added successfully!----------------------------------");
       System.out.println("Student Name: " + studentName);
       System.out.println("Student Class: " + studentClass);
       System.out.println("Student Roll No: " + studentRollNo);
       }
        @Override
       public void removeStudent(String studentName, String studentClass,int studentRollNo)
       {
       System.out.println("--------------------------Student removed successfully-----------------------------------");
       System.out.println("Student Name: " + studentName);
       System.out.println("Student Class: " + studentClass);
       System.out.println("Student Roll No: " + studentRollNo);
       }
       @Override
      public void blockStudent(String studentName, int studentRollNo)
       {
        System.out.println("-------------------------Student blocked successfully-------------------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Roll No: " + studentRollNo);
       }
       @Override
       public void acceptBookRequest(String studentName, String bookName)
       {
         System.out.println("------------------------Book request Accepted!--------------------------------------------");
         System.out.println("Student Name: " + studentName);
         System.out.println("Book Name: " + bookName);
       }
       @Override
      public void rejectBookRequest(String studentName, String bookName)
       {
         System.out.println("------------------------Book request Rejected!--------------------------------------------");
         System.out.println("Student Name: " + studentName);
         System.out.println("Book Name: " + bookName);
       }
       @Override
      public void givePenalty(String studentName, double amount)
       {
        System.out.println("-------------------------Penalty to student!------------------------------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Penalty amount: " + amount);
       }
       
    }

