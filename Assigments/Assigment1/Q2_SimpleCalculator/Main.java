package com.basic.Assigments.Assigment1.Q2_SimpleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean test = true;
        while (test) {
            System.out.print("enter First number : ");
            double a = in.nextDouble();
            System.out.print("enter Second number : ");
            double b = in.nextDouble();

            System.out.print("Enter the operation : ");
            String operator = in.next();

            if(operator.equals("+")) {
                System.out.println("Addition of and b is: " + a + b);
            }else if(operator.equals("-")) {
                System.out.println("subtraction of and b is " + (a - b));
            }else if(operator.equals("*")) {
                System.out.println("mul of and b is " + (a * b));
            }else if(operator.equals("/")) {
                if (b == 0) {
                    System.out.println("can't divide by zero");
                } else {
                    System.out.println("div of and b is " + (a / b));
                }
            }else if(operator.equals("%")) {
                System.out.println("rem of and b is " + (a % b));
            } else if (operator.equals("false")) {
                test = false;
            }

        }
    }
}
