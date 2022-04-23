package com.m3.basics;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {

        String name = enterName();
        generateReport(name);

    }

    private static String enterName() {
        Scanner yourInput = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        return yourInput.nextLine();
    }

    public static void generateReport(String name){
        Random randomizer = new Random();
        String[] breeds = {"German Shepherd", "Husky", "Rottweiler", "Bulldog", "Corgi"};
        System.out.println(name + " is:");
        int bound = 100;
        for(int i = 0; i < breeds.length-1; i++){
            int x = randomizer.nextInt(bound);
            System.out.printf("%s %d", breeds[i], x);
            System.out.println("% ");
            bound -= x;
        }
        System.out.printf("%s %d", breeds[4], bound);
        System.out.println("%");

        }
    }
