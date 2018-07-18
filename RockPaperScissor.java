/*
Clinten Imada
3/18/2018
CS 1400
 */

package com.company;
import java.util.*;

public class RockPaperScissor {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        game();
        while (restart()) {
            game();
        }
    }

        public static void game() {
            String com = comChoice();
            String player = playerChoice();
            winner(com, player);
        }

        public static String comChoice() {
            Random random = new Random();
            int comInput = random.nextInt(3) + 1;
            String com = "rps";

            if (comInput == 1) {
                com = "Rock";
            }
            if (comInput == 2) {
                com = "Paper";
            }
            if (comInput == 3) {
                com = "Scissors";
            }
            return com;
        }

        public static boolean restart() {
            System.out.println("Play again? (y/n)");
            String input = scan.nextLine();

            if (input.toLowerCase().equals("y")) {
                return true;
            }
            else if (input.toLowerCase().equals("n")) {
                return false;
            }
            else {
                System.out.println("Invalid input, please enter 'y' if you'd like to play again or 'n' if you are done.");
                return restart();
            }
        }

        public static String playerChoice() {
            String player = "me";
            System.out.println("Rock, Paper, or Scissors?");
            player = scan.nextLine();

            if (player.equalsIgnoreCase("Rock") || player.equalsIgnoreCase("Paper") || player.equalsIgnoreCase("Scissors")) {

                return player;
            }
            else {
                System.out.println("What is that nonsense? Please choose Rock, Paper, or Scissors.");
                return playerChoice();
            }
        }

        public static void winner(String com, String player) {
            System.out.println("Computer chose " + com);
            System.out.println("You chose " + player);

            if (com.equals("Rock")) {
                if (player.equalsIgnoreCase("Paper")) {
                    System.out.println("You win!");
                }
                else if (player.equalsIgnoreCase("Scissors")) {
                    System.out.println("You lose!");
                }
                else {
                    System.out.println("It's a tie!");
                }
            }
            if (com.equals("Paper")) {
                if (player.equalsIgnoreCase("Scissors")) {
                    System.out.println("You win!");
                }
                else if (player.equalsIgnoreCase("Rock")) {
                    System.out.println("You lose!");
                }
                else {
                    System.out.println("It's a tie!");
                }
            }
            if (com.equals("Scissors")) {
                if (player.equalsIgnoreCase("Rock")) {
                    System.out.println("You win!");
                }
                else if (player.equalsIgnoreCase("Paper")) {
                    System.out.println("You lose!");
                }
                else {
                    System.out.println("It's a tie!");
                }
            }
    }
}
