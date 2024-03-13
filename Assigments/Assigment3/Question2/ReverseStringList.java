package com.basic.Assigments.Assigment3.Question2;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringList {
    public static void main(String[] args) {
        List<String > list= new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        System.out.println("Reversed list is : " + reverseList(list));
        
    }

    private static List<String> reverseList(List<String> list) {
        List<String> reversedList= new ArrayList<>();
        for (int i = list.size()-1; i >=0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
