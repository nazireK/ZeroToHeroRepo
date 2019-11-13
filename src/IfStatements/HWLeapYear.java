package IfStatements;

import java.util.Scanner;

public class HWLeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide any year that you want to know whether it is leap year or not? ");
        int year = input.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " -  It is leap year.");
        } else {
            System.out.println(year + " - It is not a Leap year ");
        }
    }
}