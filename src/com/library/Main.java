package com.library;
import com.library.models.Book;
import java.util.Scanner;
import java.util.ArrayList;

class InvalidInputException extends Exception{
   InvalidInputException(String msg){
    super(msg);
   }
}
class Main{
        public static void main(String[] args)
        {
          Scanner sc = new Scanner(System.in);

          Library lib = new Library();
          

            ArrayList<Book> books = new ArrayList<>();
             books.add(new Book(1, "Java Programming", "James Gosling", "Programming", 0)); 
             books.add(new Book(2, "Database Systems", "Elmasri", "Database", 0));
            books.add(new Book(3, "Data Structures", "Narsimha Karumanchi", "DSA", 0) ); 
            books.add(new Book(4, "C++","Bajarne Strostroup","Programming",0));
              books.add(new Book(5, "Rich Dad Poor Dad","Robert T. Kiyosaki","Phylosophical",0));
              books.add(new Book(6, "Pride and Prejudice","Jane Austen","Reading",0)); 
             books.add(new Book(7, "Justice and Redemption","Peter lang","Social", 0));
               books.add(new Book(8, "Just Mercy","Bryan Stevenson","Non-fiction",0));
        
  
              int mainMenu;
              
              do{
              System.out.println("1.User Module.");
              System.out.println("2.Admin Module.");
              System.out.println("3.Exit.");
             
               System.out.println("Enter your choice.");
               mainMenu = sc.nextInt();
               sc.nextLine();
            try{
               if(mainMenu>=4||mainMenu<=0){
                throw new InvalidInputException("OOPS! Invalid Input");
               }
            }catch(InvalidInputException e){
              System.out.println("Error:"+e.getMessage());
            }finally{
              System.out.println("Try again...");
            }
             switch(mainMenu){
                case 1: 
                    lib.showUserMenu(sc, books);                 
                break;

                case 2:
                     lib.showAdminMenu(sc);       
                break;

                case 3:
                 System.out.println("Exiting Program!");
                break;
              }
            }while(mainMenu!=3);
          sc.close();
        }
    }
