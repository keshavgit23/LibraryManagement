package com.library.interfaces;

public interface Admin{
    void addBook(String bookTitle,int bookID, String bookCategory);
    void removeBook(String bookTitle,int bookID, String bookCategory);
    void addStudent(String name,String studentClass, int rollNo);
    void removeStudent(String name,String studentClass, int rollNo);
    void blockStudent(String name, int rollNO);
    void acceptBookRequest(String studentName, String bookTitle);
    void rejectBookRequest(String studentName, String bookTitle);
    void givePenalty(String studentName, double amount);
    void viewBooks();
}
