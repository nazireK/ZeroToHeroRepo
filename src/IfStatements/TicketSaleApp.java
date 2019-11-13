package IfStatements;

import java.util.Scanner;

public class TicketSaleApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the class name: ");
        String classAbc = input.nextLine();

        if (classAbc.equals("Class C")) {
            System.out.println("Please provide with price between $50 - $70 : ");
            int priceC = input.nextInt();

            if (priceC <= 70 && priceC >= 50) ;
            System.out.println("Column D  Row 19");

        } else if (classAbc.equals("Class B")) {
            System.out.println("Please provide with price between $70 - $90: ");
            int priceB = input.nextInt();

            if (priceB <= 90 && priceB >= 70) ;
            System.out.println("Cplumn C Row 10");

        } else if (classAbc.equals("Class A")) {
            System.out.println("Please provide with price between $90 - $110: ");
            int priceA = input.nextInt();

            if (priceA <= 110 && priceA >= 90) {
                System.out.println("Column A Row 5");

            } else if (priceA < 90) {
                int restPrice = 90 - priceA;
                System.out.println("Please enter the rest of the money $" + restPrice);
                int restAmount = input.nextInt();

                if ((restAmount + priceA) == 90) {
                    System.out.println("Column A row 5");
                } else {

                    System.out.println("Your session is completed. Please return to the beginning. ");
                }

            }

        }
        }
    }
