package com.basic.Assigments.Assigment2.Question1;

public class Main {
        public static void main(String[] args) {
            HillStations hillStation = new HillStations();
            Manali manali = new Manali();
            Mussoorie mussoorie = new Mussoorie();
            Gulmarg gulmarg = new Gulmarg();

            // Calling methods using superclass instance
            System.out.println("Calling methods using superclass instance:");
            System.out.println("Location: " + hillStation.location());
            System.out.println("Famous for: " + hillStation.famousFor());
            System.out.println();

            // Calling methods using subclass instances
            System.out.println("Calling methods using subclass instances:");
            System.out.println("Manali - Location: " + manali.location());
            System.out.println("Manali - Famous for: " + manali.famousFor());
            System.out.println("Mussoorie - Location: " + mussoorie.location());
            System.out.println("Mussoorie - Famous for: " + mussoorie.famousFor());
            System.out.println("Gulmarg - Location: " + gulmarg.location());
            System.out.println("Gulmarg - Famous for: " + gulmarg.famousFor());
        }
    }