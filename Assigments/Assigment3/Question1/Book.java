package com.basic.Assigments.Assigment3.Question1;

public class Book {
    int bookId;
    String bookName;
    String authorName;
    Book(int bookId,String bookName,String authorName){
        this.bookId= bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "BookId : " +bookId +" BookName: "+bookName+" AuthorName: "+authorName;
    }
}
