package com.m3.basics;

public class SummativeSums {
    public static void main(String[] args) {
        int[] a1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] a2 = { 999, -60, -77, 14, 160, 301 };
        int[] a3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99};

        arraySum(a1);
        arraySum(a2);
        arraySum(a3);
    }

    public static void arraySum(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("Sum of the array: " + sum);
    }
}
