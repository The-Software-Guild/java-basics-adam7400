package com.m3.basics;

import java.util.Random;
import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        int userWins = 0;
        int computerWins = 0;
        int ties = 0;

        System.out.printf("Welcome to ROCK PAPER SCISSORZ!%n%n");
        int n = noOfRounds();

        for (int i = 0; i < n; i++) {
            System.out.println("Round " + (i+1));
            int user = userChoice();
            int computer = computerChoice();
            printChoice(user);
            System.out.print(" vs. ");
            printChoice(computer);

            int outcome = referee(user, computer);

            if (outcome == 1) {
                System.out.printf("%nPlayer wins%n");
                userWins++;
            } else if (outcome == 2) {
                System.out.printf("%nComputer wins%n");
                computerWins++;
            } else {
                System.out.printf("%nTie%n");
                ties++;
            }
        }
        printScores(userWins, computerWins, ties);


    }

    private static void printScores(int userWins, int computerWins, int ties) {
        System.out.printf("%nFinal scores%n");
        System.out.println("Player: " + userWins);
        System.out.println("Computer: " + computerWins);
        System.out.println("Ties " + ties);

        if (userWins > computerWins) {
            System.out.println("You are the WINNER!");
        } else if (userWins < computerWins) {
            System.out.println("You lose");
        } else {
            System.out.println("It's a TIE!");
        }
    }

    private static int noOfRounds() {
        Scanner scanner = new Scanner(System.in);
        int rounds;
        System.out.print("Please enter no. of rounds to be played - choose from 1 to 10: ");
        rounds = scanner.nextInt();
        if (rounds < 1 | rounds > 10) {
            System.out.println("ERROR - entered number out of range. The application will now quit");
            System.exit(0);
            return 0;
        } else {
            return rounds;
        }
    }

    private static int userChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose your weapon - 1 (Rock), 2 (Paper), 3 (Scissors): ");
        return scanner.nextInt();
    }

    private static int computerChoice() {
        Random randomizer = new Random();
        return randomizer.nextInt(3) + 1;
    }

    private static int referee(int p1, int p2) {
        if (p1 == p2) {
            return 0;
        } else if (p1 == 1 && p2 == 2 || p1 == 2 && p2 == 3 || p1 == 3 && p2 == 1) {
            return 2;
        } else {
            return 1;
        }
    }
    private static void printChoice(int c){
        if (c==1){
            System.out.print("ROCK");
        }
        else if (c==2){
            System.out.print("PAPER");
        }
        else{
            System.out.print("SCISSORS");
        }
    }
}





