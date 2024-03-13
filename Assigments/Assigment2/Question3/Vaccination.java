package com.basic.Assigments.Assigment2.Question3;

public class Vaccination {
    public static void main(String[] args) {
        int age = 18;
        String nationality = "Indian";

        Vaccine vaccine = new VaccinationSuccessful(age, nationality);

        vaccine.firstDose();

        boolean isFirstDoseTaken = true; // Assuming the user has taken the first dose
        vaccine.secondDose(isFirstDoseTaken);

        vaccine.boosterDose();
    }
}