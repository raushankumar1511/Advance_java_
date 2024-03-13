package com.basic.Assigments.Assigment3.Question3;

import java.util.ArrayList;
import java.util.List;

public class AddEvenNos {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(sumEvenNos(list));
    }
    private static int sumEvenNos(List<Integer> list){
        int ans=0;
        for(int num:list){
            if(num%2==0)
                ans+=num;
        }
        return ans;
    }
}
