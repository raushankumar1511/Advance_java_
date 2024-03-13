package com.basic.Assigments.Assigment3.Question1;
import java.util.*;
import com.basic.Collection.Arraylist;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> BookList = new ArrayList<>();
        BookList.add(new Book(1,"gita","shakti"));
        BookList.add(new Book(2,"Ramayan","Balmiki"));
        BookList.add(new Book(3,"Arun sir ki jivani","Raushan"));

        for (Book obj:BookList){
            System.out.println(obj);
        }
    }
}
