/*
Clinten Imada
4/18/2018
CS 1400
Project 11
 */
package com.company;
import java.util.*;
import java.lang.*;

public class NumberGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameOptions opt = new GameOptions(); // Your created class
        int userChoice = -1;
        int tries = 0;
        int answer = -1;
        boolean keepPlaying = true;
        answer = (int) (Math.random() * 10) + 1;

        System.out.println("Guess the Number Game\n");

        while (keepPlaying == true) {
            boolean win = false;

            try {
                System.out.println("Please choose a number between 1 and 10:");
                tries++;

                //Create a getChoice method in your class and make sure it accepts a Scanner argument
                userChoice = opt.getChoice();

                //Create a checkAnswer method in your class. Make sure it accepts two integer arguments and a Scanner argument
                opt.checkAnswer(userChoice, answer, input);

                win = opt.win();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number between 1 and 10. Game will be forced to restart.");
                answer = (int) (Math.random() * 10) + 1;
                tries = 0;
                keepPlaying = opt.continueGame();
            }

            // Create a continueGame method in your class and make sure it accepts a Scanner argument


            if (win) {
                System.out.println("Number of tries: " + tries);
                System.out.println("Thanks for playing.");
                answer = (int) (Math.random() * 10) + 1;
                tries = 0;
                keepPlaying = opt.continueGame();
            }
    }
    }

    private static class GameOptions {
        Scanner input = new Scanner (System.in);
        boolean winner = false;

        public int getChoice() {
            int choice = input.nextInt();

            while (choice < 1 || choice > 10) {
                    System.out.println("Please enter a valid number between 1 and 10:");
                    choice = input.nextInt();
                }

            return choice;
        }

        public void checkAnswer(int userChoice, int answer, Scanner input) {

            if (userChoice > answer) {
                System.out.println("Too high. Try again.");
                winner = false;
            } else if (userChoice < answer) {
                System.out.println("Too low. Try again.");
                winner = false;
            } else if (userChoice == answer) {
                System.out.println("You got it!");
                winner = true;
            }
        }

        public boolean win() {
            if (winner) {
                return true;
            } else {
                return false;
            }
        }

        public boolean continueGame() {
            System.out.println("Would you like to play again? (Y/N):");
            String inputR = input.next();
            if (inputR.toLowerCase().equals("y")) {
                return true;
            } else if (inputR.toLowerCase().equals("n")) {
                return false;
            } else {
                System.out.println("Invalid entry. Please enter Y or N:");
                return continueGame();
            }
        }
    }
}