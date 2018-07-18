package com.company;
import java.util.Scanner;
import java.util.Random;

public class CoinFlip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();
        String reset = "y";

        while (reset.equals("y")) {

            int choice = 0;
            int numberTimes;
            int times;
            int result = 0;
            int heads = 0;
            int tails = 0;
            String strChoice = " ";

            System.out.println("Coin Flipping Game");
            System.out.println("Please enter the number of times you would like to flip the coin: ");

            times = input.nextInt();
            numberTimes = times;

            while (numberTimes != 0) {

                result = randomNum.nextInt(2);
                numberTimes--;

                if (result == 0) {
                    heads++;
                } else {
                    tails++;
                }
            }

            System.out.println("Choose heads or tails: ");

            strChoice = input.next();

            if (strChoice.equalsIgnoreCase("heads")) {
                choice = 1;
            } else if (strChoice.equalsIgnoreCase("tails")) {
                choice = 2;
            }

            while (!strChoice.equals("heads") && !strChoice.equalsIgnoreCase("tails")) {
                System.out.println("Invalid entry. Please enter heads or tails: ");
                strChoice = input.next();
            }

            System.out.println("A coin was just flipped " + times + " times! The results -- Heads: " + heads + " Tails: " + tails);

            if (choice == 1) {
                if (heads > tails) {
                    System.out.println("You win!");
                } else if (heads < tails) {
                    System.out.println("You lose!");
                } else {
                    System.out.println("It's a tie!");
                }
            }
            if (choice == 2) {
                if (heads < tails) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
            System.out.println("Play again? (y/n): ");
            reset = input.next();

            while (!reset.equals("y") && !reset.equals("n")) {
                System.out.println("TRY AGAIN, MORTAL! (y/n): ");
                reset = input.next();
            }

        }
    }
}

