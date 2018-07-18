/*
Clinten Imada
3/28/2018
CS 1400
Programming Project 9
 */

package com.company;
import java.util.*;
import java.io.*;
import java.lang.*;

public class CodeWord {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Code();
        while (restart()) {
            Code();
        }
    }

        public static void Code() {

            ArrayList<String> codeArray = new ArrayList<>();
            int index = 1;
            boolean inputDone = false;

                System.out.println("Code Word File Generator");
                System.out.println("");

                while (!inputDone) {

                    try {
                        PrintWriter fileOutput = new PrintWriter("codewords.txt");
                        for (index = 1; index <= 10; index++) {
                            System.out.print("Enter code word #" + index + ": ");
                            String input = scan.nextLine();


                            codeArray.add(input);
                            fileOutput.print(input + " ");
                        }

                        fileOutput.close();
                        inputDone = true;

                    } catch (FileNotFoundException e) {
                        System.out.println("Error - File Not Found");
                    }
                }

                System.out.println("");
                System.out.println("Code word file generated successfully. This system will self destruct soon.");

        }

    public static boolean restart() {
        System.out.println("Generate new file? (y/n)");
        String inputR = scan.nextLine();

        if (inputR.toLowerCase().equals("y")) {
            return true;
        } else if (inputR.toLowerCase().equals("n")) {
            return false;
        } else {
            System.out.println("Invalid input, please enter 'y' if you'd like to restart or 'n' if you'd like to quit.");
            return restart();
        }

    }
}
