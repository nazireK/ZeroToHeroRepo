package IfStatements;

import java.util.Scanner;

public class FalcaoCame {

    public static void main(String[] args) {

        //first Galatasaray should pay 3 mil to the club
        //Galatasaray should pay 5 mil to Falcao

        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter Galatasaray budget: ");
//        int galataBudget = input.nextInt();
//
//        System.out.println("Please enter Players Salary: ");
//        int playerSalary = input.nextInt();
//
//        if (galataBudget == 3000000 && playerSalary == 5000000) {
//
//            System.out.println("Falcao can came to the galatasaray. ");
//        } else {
//            System.out.println("Falcao can not come to the Galatasaray. ");
//        }


        //to buy Microphone from Amazon

        System.out.println("What is star rate for these Microphone? ");
        double star=input.nextDouble();

        System.out.println("How many reviews has this Microphone? ");
        int reviews=input.nextInt();

        System.out.println("What is the price for these Microphone? ");
        double price=input.nextDouble();

        if (star>=4 && reviews>=100 && price<=20){
            System.out.println("I can buy the Microphone ");
            System.out.println("The price for the product is "+price);
        }else{
            System.out.println("I can not buy the Microphone");
        }

    }
}