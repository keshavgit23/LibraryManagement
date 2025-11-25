package com.library.models;

public class Book {    
        private int bookID;
        private String bookTitle;
        private String authorName;
        private String bookCategory;
        int isIssued;

        public Book(int bookID,
        String bookTitle,
        String authorName,
        String bookCategory,
        int isIssued)
        {
            this.bookID = bookID;
            this.bookTitle = bookTitle;
            this.authorName = authorName;
            this.bookCategory = bookCategory;
            this.isIssued = isIssued;
        }

        public int getBookID(){return bookID;}
        public void setBookID(int bookID){
         this.bookID = bookID;
        }

        public String getBookTitle(){return bookTitle;}
        public void setBookTitle(String bookTitle){
            this.bookTitle = bookTitle;
        }

        public String getAuthorName(){return authorName;}
        public void setAuthorName(String authorName){
            this.authorName = authorName;
        }

        public String getBookCategory(){return bookCategory;}
        public void setBookCategory(String bookCategory){
            this.bookCategory = bookCategory;
        }
    }
