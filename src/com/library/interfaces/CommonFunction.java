package com.library.interfaces;

public interface CommonFunction{
    void issueBook(String bookName, int bookID,String issueDate);
    void dueDate(String bookName, int bookID, String returnDate);
}

