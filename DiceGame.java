/*
Clinten Imada
2/14/2018
CS 1400
Programming Project 5
 */

package com.company;
import java.util.Scanner;
import java.util.Random;

public class DiceGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();
        String reset = "y";

        while (reset.equals("y")) {

            int choice = 0;
            int numberTimes;
            int times;
            int diceOne = 0;
            int diceTwo = 0;
            int[] theArray;
            String strChoice = " ";

            theArray = new int[12];

            theArray[0] = 0;
            theArray[1] = 0;
            theArray[2] = 0;
            theArray[3] = 0;
            theArray[4] = 0;
            theArray[5] = 0;
            theArray[6] = 0;
            theArray[7] = 0;
            theArray[8] = 0;
            theArray[9] = 0;
            theArray[10] = 0;
            theArray[11] = 0;

            System.out.println("Super Cho-Han Bakuchi 64");
            System.out.println("WELCOME! Please enter the number of times you would like to roll two six-sided dice: ");

            times = input.nextInt();

            while (times <= 0) {
                System.out.println("Invalid entry. Please enter the number of times you would like to roll two six-sided dice: ");
                times = input.nextInt();
            }

            numberTimes = times;

            while (numberTimes != 0) {

                diceOne = randomNum.nextInt(6) + 1;
                diceTwo = randomNum.nextInt(6) + 1;
                numberTimes--;

                if (diceOne + diceTwo == 2) {
                    theArray[0]++;
                    theArray[11] = theArray[11] + 2;
                } else if (diceOne + diceTwo == 3) {
                    theArray[1]++;
                    theArray[11] = theArray[11] + 3;
                } else if (diceOne + diceTwo == 4) {
                    theArray[2]++;
                    theArray[11] = theArray[11] + 4;
                } else if (diceOne + diceTwo == 5) {
                    theArray[3]++;
                    theArray[11] = theArray[11] + 5;
                } else if (diceOne + diceTwo == 6) {
                    theArray[4]++;
                    theArray[11] = theArray[11] + 6;
                } else if (diceOne + diceTwo == 7) {
                    theArray[5]++;
                    theArray[11] = theArray[11] + 7;
                } else if (diceOne + diceTwo == 8) {
                    theArray[6]++;
                    theArray[11] = theArray[11] + 8;
                } else if (diceOne + diceTwo == 9) {
                    theArray[7]++;
                    theArray[11] = theArray[11] + 9;
                } else if (diceOne + diceTwo == 10) {
                    theArray[8]++;
                    theArray[11] = theArray[11] + 10;
                } else if (diceOne + diceTwo == 11) {
                    theArray[9]++;
                    theArray[11] = theArray[11] + 11;
                } else if (diceOne + diceTwo == 12) {
                    theArray[10]++;
                    theArray[11] = theArray[11] + 12;
                }
            }

            System.out.println("PLACE BETS! Do you think the final total will be odd or even? ");

            strChoice = input.next();

            if (strChoice.equalsIgnoreCase("odd")) {
                choice = 1;
            } else if (strChoice.equalsIgnoreCase("even")) {
                choice = 2;
            }

            while (!strChoice.equals("odd") && !strChoice.equalsIgnoreCase("even")) {
                System.out.println("Invalid entry. Please enter odd or even: ");
                strChoice = input.next();
            }

            System.out.println("A pair of dice were just rolled " + times + " times! The results: ");
            System.out.println(" ");
            System.out.println(" Total 2s: " + theArray[0]);
            System.out.println(" Total 3s: " + theArray[1]);
            System.out.println(" Total 4s: " + theArray[2]);
            System.out.println(" Total 5s: " + theArray[3]);
            System.out.println(" Total 6s: " + theArray[4]);
            System.out.println(" Total 7s: " + theArray[5]);
            System.out.println(" Total 8s: " + theArray[6]);
            System.out.println(" Total 9s: " + theArray[7]);
            System.out.println(" Total 10s: " + theArray[8]);
            System.out.println(" Total 11s: " + theArray[9]);
            System.out.println(" Total 12s: " + theArray[10]);
            System.out.println(" ");
            System.out.println(" Total: " + theArray[11]);
            System.out.println(" ");

            if (choice == 1) {
                if (theArray[11] % 2 != 0) {
                    System.out.println("You win!");
                    System.out.println(" ");
                    System.out.println("You are awesome!");
                } else {
                    System.out.println("You lose!");
                    System.out.println(" ");
                    System.out.println("You are awesome!");
                }
            }
            if (choice == 2) {
                if (theArray[11] % 2 == 0) {
                    System.out.println("You win!");
                    System.out.println(" ");
                    System.out.println("You are awesome!");
                } else {
                    System.out.println("You lose!");
                    System.out.println(" ");
                    System.out.println("You are awesome!");
                }
            }

            System.out.println(" ");
            System.out.println("Play again? (y/n): ");
            reset = input.next();

            while (!reset.equals("y") && !reset.equals("n")) {
                System.out.println("TRY AGAIN, MORTAL! (y/n): ");
                reset = input.next();
            }
        }
    }
}