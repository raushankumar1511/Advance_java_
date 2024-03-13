package com.basic.Assigments.Assigment1.Q1_GradeCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double avg =0;
        int sum = 0;
        System.out.print("Enter the no of subjects : ");
        int noOfSub= in.nextInt();
        for (int i = 1; i <= noOfSub; i++) {
            System.out.print("Enter the marks of sub "+i +" : " );
            int marks = in.nextInt();
            sum +=marks;
        }
        avg = (double)sum/noOfSub;

        if(avg>=90){
            System.out.println("grade is A");
        } else if (avg >= 80) {
            System.out.println("grade is B");
        } else if (avg >=60) {
            System.out.println("grade is C");
        }else {
            System.out.println("grade is D");
        }

    }
}
