/*
Clinten Imada
3/26/2018
CS 1400
Programming Project 8
 */

package com.company;
import java.util.*;
import java.lang.*;

public class RaiseCalculator {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        raiseCalc();
        while (restart()) {
            raiseCalc();
        }
    }

    public static void raiseCalc() {

        double salary = -10, newSalary = -10;
        double raise = -10;
        double percent = -10;
        boolean salaryEntry = true;
        boolean raiseEntry = true;

        while (salaryEntry) {
            try {
                System.out.println("Please enter your annual salary: ");
                salary = scan.nextDouble();
                while (salary < 0) {
                    System.out.println("Error - Please enter a valid amount.");
                    salary = scan.nextDouble();
                }
                salaryEntry = false;
                System.out.println("You entered: $" + salary);
            }
            catch (InputMismatchException e) {
                System.out.println("Error - Please enter a valid numerical amount.");
                scan.nextLine();
            }
        }

        while (raiseEntry) {
            try {
                System.out.println("Please enter the anticipated raise percentage: ");
                percent = scan.nextDouble();
                while (percent < 0) {
                    System.out.println("Error - Please enter a valid amount.");
                    percent = scan.nextDouble();
                }
                raiseEntry = false;
                System.out.println("You entered: " + percent + "%.");
            } catch (InputMismatchException e2) {
                System.out.println("Error - Please enter a numerical value.");
                scan.nextLine();
            }
        }
            System.out.println("");
            System.out.println("Current Salary: $" + salary);
            System.out.println("Raise Percentage: " + percent + "%");
            raise = ((salary * percent) / 100);
            System.out.println("Raise Amount: $" + (raise));
            newSalary = (salary + raise);
            System.out.println("New Salary: $" + (newSalary));
            scan.nextLine();
        }

    public static boolean restart() {
        System.out.println("Restart? (y/n)");
        String input = scan.nextLine();

        if (input.toLowerCase().equals("y")) {
            return true;
        } else if (input.toLowerCase().equals("n")) {
            return false;
        } else {
            System.out.println("Invalid input, please enter 'y' if you'd like to restart or 'n' if you'd like to quit.");
            return restart();
        }

    }
}