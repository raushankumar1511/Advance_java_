package com.basic.Assigments.Assigment2.Question3;

abstract class Vaccine {
    int age;
    String nationality;

    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    abstract void boosterDose();

    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("You are eligible for the first dose of the vaccine.");
            System.out.println("Please pay 250 Rs after vaccination.");
        } else {
            System.out.println("You are not eligible for the first dose of the vaccine.");
        }
    }

    void secondDose(boolean isFirstDoseTaken) {
        if (isFirstDoseTaken) {
            System.out.println("You are eligible for the second dose of the vaccine.");
        } else {
            System.out.println("You need to complete the first dose before taking the second dose.");
        }
    }
}
