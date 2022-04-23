package com.m3.basics;

import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner yourInput = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        String name = yourInput.next();
        generateReport(name);

    }

    public static void generateReport(String name){
        String[] breeds = {"German Shepherd", "Husky", "Rottweiler", "Bulldog", "Corgi"};
        System.out.println(name + " is:");

        }
    }
