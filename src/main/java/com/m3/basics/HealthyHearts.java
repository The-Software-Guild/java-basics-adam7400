package com.m3.basics;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        int age = Age();
        int max = maxRate(age);
        heartRateZone(max);

    }

    public static int Age(){
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        return reader.nextInt();
    }

    public static int maxRate(int age){
        int max = 220 - age;
        System.out.println("Maximum rate: " + max);
        return max;

    }

    public static void heartRateZone(int max){
        int upper = (int)(max*0.5);
        int lower = (int)(max*0.85);
        System.out.println("Range: " + upper + " to " + lower);



    }
}
