package com.library.interfaces;

public interface CommonFunction{
    void issueBook(String bookTitle, int bookID,String issueDate);
    void dueDate(String bookTitle, int bookID, String returnDate);
    void viewBooks();
}

