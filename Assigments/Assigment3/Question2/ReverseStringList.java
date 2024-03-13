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
         reverseList(list);
        System.out.println("Reversed list is : " +list);
        
    }

    private static void reverseList(List<String> list) {
        int s=0;
        int e = list.size()-1;
        while (s<=e){
            String temp = list.get(s);
            list.set(s,list.get(e));
            list.set(e,temp);
            s++;
            e--;
        }
    }
}
