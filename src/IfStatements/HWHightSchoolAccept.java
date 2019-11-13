package IfStatements;

import java.util.Scanner;

public class HWHightSchoolAccept {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Hello, Please provide your age: ");
        int age=input.nextInt();

        System.out.println("Please provide your city: ");
        String city=input.next();
        boolean cityCond;
        if(city.equalsIgnoreCase("Schaumburg")){
            cityCond=true;
        }else{
            cityCond=false;
        }

        System.out.println("Please provide your average score: ");
        int score=input.nextInt();

        System.out.println("Do you have U.S. Citizenship? ");
        String citizenship=input.next();
        boolean citizenshipCondition;
        if(citizenship.equalsIgnoreCase("yes")){
            citizenshipCondition=true;
        }else{
            citizenshipCondition=false;
        }

        if(age>14 && cityCond==true && score>75 && citizenshipCondition==true ){
            System.out.println("Welcome! You can attend The Schaumburg High School. ");
        }else{
            System.out.println("Sorry, unfortunatly you cannot attend The Schaumburg High School.");
        }
    }
}

