package com.basic.Assigments.Assigment2.Question3;

class VaccinationSuccessful extends Vaccine {
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        System.out.println("You are eligible for the booster dose of the vaccine.");
    }
}
