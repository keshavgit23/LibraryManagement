package com.library.interfaces;

public interface Admin{
    void addBook(String bookName,int bookID, String bookCategory);
    void removeBook(String bookName,int bookID, String bookCategory);
    void addStudent(String name,String studentClass, int rollNo);
    void removeStudent(String name,String studentClass, int rollNo);
    void blockStudent(String name, int rollNO);
    void acceptBookRequest(String studentName, String bookName);
    void rejectBookRequest(String studentName, String bookName);
    void givePenalty(String studentName, double amount);
}
