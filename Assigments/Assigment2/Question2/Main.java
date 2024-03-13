package com.basic.Assigments.Assigment2.Question2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling makeSound() method for each object
        System.out.println("Calling makeSound() method for each object:");
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}