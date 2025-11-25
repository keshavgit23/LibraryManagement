package com.library;
 
import java.util.Scanner;
import java.util.ArrayList;
import com.library.models.Book;
import com.library.modules.AdminModule;
import com.library.modules.UserModule;




 public class Library{
     public void showUserMenu(Scanner sc,ArrayList<Book>books){
         UserModule  user = new UserModule(books); 
  

        int choice;  
           do{
            System.out.println("-------------------------------Welcome to Library---------------------------");
            System.out.println("1. Search Book.");
            System.out.println("2. Request Book.");
            System.out.println("3. Cancel Request.");
            System.out.println("4. Return Book.");
            System.out.println("5. Pay Penalty.");
            System.out.println("6. Choose Issue Period.");
            System.out.println("7. View Books.");
            System.out.println("8. Exit.");

            System.out.println();

            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                
                case 1: 
                System.out.println("Enter keyword of Book.");
                String bookKeyword = sc.nextLine();

                user.searchBook(bookKeyword);
                break;

                case 2:
                System.out.println("Enter name of Book.");
                String bookTitle = sc.nextLine();
                
                user.requestBook(bookTitle);
                   break;
                case 3:
                 System.out.println("Enter name of Book to cancel reqquest :"); 
                 bookTitle = sc.nextLine();

                user.cancelRequest(bookTitle);
                break;

                case 4: 
                System.out.println("Enter name of book to return: ");
                bookTitle = sc.nextLine();

                user.returnBook(bookTitle);
                break;

                case 5:
                System.out.println("Enter amount to pay penalty: ");
                double amount = sc.nextDouble();
                sc.nextLine();
                user.payPenalty(amount);
                break;

                case 6: 
                System.out.println("Enter no of issue period days: ");
                int days = sc.nextInt();
                sc.nextLine();
                user.chooseIssuePeriod(days);
                break;

                case 7:
                user.viewBooks();
                break;
                case 8:
                System.out.println("---------------------------------Thank you---------------------------------------");
                break;

                default:
                System.out.println("Invalid Choice!");
                break;
            }
          }while(choice!=8);

    }

    public void showAdminMenu(Scanner sc){
        int adminChoice;
       
        AdminModule ad = new AdminModule("","",0); 
      

        do{
            System.out.println("1. Add Book.");
            System.out.println("2. Remove Book.");
            System.out.println("3. Add Student.");
            System.out.println("4. Remove Student.");
            System.out.println("5. Block Student.");
            System.out.println("6. Accept Book Request.");
            System.out.println("7. Reject Book Request. ");
            System.out.println("8. Give Penalty. ");
            System.out.println("9. View Books.");
            System.out.println("10.Exit. ");
                                                
           
            
            System.out.println("Enter your choice: ");
            adminChoice = sc.nextInt();
                 sc.nextLine();

                  switch (adminChoice) {
                                     
                case 1: 
                   String bookTitle;
                  while(true){
                    System.out.println("Enter Book Title: ");
                    bookTitle = sc.nextLine().trim();
                    if(bookTitle.isEmpty())
                   {
                    break;
                    } else{
                    System.out.println("Book title cannot be empty! ");
                   }
                }
                    
                    System.out.println("Enter Book ID: ") ;
                    int bookID = sc.nextInt();
                    sc.nextLine();

                    if(bookID<=0){
                        System.out.println("Invalid Book ID! It must be positive.");
                        return;
                    }

                    System.out.println("Enter Book Category: ");
                    String bookCategory = sc.nextLine();
                    ad.addBook(bookTitle, bookID, bookCategory);
                     break;
                case 2:
                    System.out.println("Enter Book Name: ");
                    bookTitle = sc.nextLine();
                
                    System.out.println("Enter Book ID: ");
                    bookID = sc.nextInt();

                    System.out.println("Enter Book Category: ");
                    bookCategory = sc.nextLine();
                    ad.removeBook(bookTitle, bookID, bookCategory);
                     break;
                case 3:
                    System.out.println("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Student Class: ");
                    String Class = sc.nextLine();

                    System.out.println("Enter Student Roll No: ");
                    int roll = sc.nextInt();

                    ad.addStudent(name, Class, roll);
                 break;
                case 4:
                    System.out.println("Enter Student name: ");
                    name = sc.nextLine();

                    System.out.println("Enter Student class: ");
                    Class = sc.nextLine();

                    System.out.println("Enter Student roll no: ");
                    roll = sc.nextInt();
                    ad.removeStudent(name, Class, roll);
                break;
                case 5:
                    System.out.println("Enter Student Name: ");
                    name = sc.nextLine();

                    System.out.println("Enter Student Roll No: ");
                    roll = sc.nextInt();

                    ad.blockStudent(name, roll);
                 break;
                case 6:
                    System.out.println("Enter Student Name: ");
                    name = sc.nextLine();

                    System.out.println("Enter Book Name: ");
                     bookTitle = sc.nextLine();

                    ad.acceptBookRequest(name, bookTitle);
                 break;
                case 7:
                System.out.println("Enter Student name: ");
                name = sc.nextLine();

                System.out.println("Enter Book Name: ");
                String bookName = sc.nextLine();

                ad.rejectBookRequest(name, bookName);
               break;
                case 8: 
                System.out.println("Enter Student Name: ");
                name = sc.nextLine();

                System.out.println("Enter Penalty Amount: ");
                double amt = sc.nextDouble();
                ad.givePenalty(name, amt);
                 break;

                case 9:
                ad.viewBooks();
                break;

                case 10:
                System.out.println("--------------------------------Thank You---------------------------");
                System.out.println("                         Exiting from Admin Panel!");
                break;
            }
        }while(adminChoice!=10);
    }

 }