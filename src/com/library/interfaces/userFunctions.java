package com.library.interfaces;


public interface userFunctions{
    void searchBook(String keyword);
    void requestBook(String bookTitle);
    void cancelRequest(String bookTitle);
    void returnBook(String bookTitle );
    void payPenalty(double amount);
    void chooseIssuePeriod(int days);
    void viewBooks();
}
