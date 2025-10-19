package com.library.interfaces;


public interface userFunctions{
    void searchBook(String keyword);
    void requestBook(String bookName);
    void cancelRequest(String bookName);
    void returnBook(String bookName);
    void payPenalty(double amount);
    void chooseIssuePeriod(int days);
}
