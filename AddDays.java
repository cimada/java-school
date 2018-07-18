package com.company;
import java.util.Scanner;

public class AddDays {

    public static void main (String[] args) {

        int[] daysInMonths = {-1,31,28,31,30,31,30,31,31,30,31,30,31};

        Scanner input = new Scanner(System.in);
        int sMonth = -1, sDay = -1, sYear = -1, addDays = -1;
        int fMonth = -1000, fDay = -1000, fYear = -1000;

        System.out.println("Please enter the starting month: ");
        sMonth = input.nextInt();
        while (sMonth > 12 || sMonth < 1) {
            System.out.print("Invalid month. Please enter a month between 1 and 12: ");
            sMonth = input.nextInt();
        }

        System.out.println("Please enter the starting day: ");
        sDay = input.nextInt();
        while (sDay > 31 || sDay < 1) {
            System.out.print("Invalid day. Please enter a value between 1 and 31: ");
            sDay = input.nextInt();
        }

        System.out.println("Please enter the starting year: ");
        sYear = input.nextInt();
        while (sYear < 0) {
            System.out.print("Invalid number. Please enter a positive value: ");
            sYear = input.nextInt();
        }

        System.out.println("Please enter the number of days to add: ");
        addDays = input.nextInt();

        fDay = sDay + addDays;
        fMonth = sMonth;
        fYear = sYear;

        while (fDay > daysInMonths[fMonth]) {
            fDay = fDay - daysInMonths[fMonth];
            fMonth++;
            if (fMonth > 12) {
                fYear++;
                fMonth = 1;
            }
            if ( (fYear % 100 != 0 && fYear % 4 == 0) || (fYear % 400 == 0) ) {
                daysInMonths[2] = 29;
            }
            else {
                daysInMonths[2] = 28;
            }
        }

        //System.out.println("fday: " + fDay + " fMonth: " + fMonth + " fYear: " + fYear);

        System.out.println("Starting Date: " + sMonth + "/" + sDay + "/" + sYear);
        System.out.println("Added Days: " + addDays);
        System.out.println("Ending Date: " + fMonth + "/" + fDay + "/" + fYear);

    }
}