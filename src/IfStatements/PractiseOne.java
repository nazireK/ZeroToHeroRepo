package IfStatements;

import java.util.Scanner;

public class PractiseOne {

    public static void main(String[] args) {

        //int averageScore=85;

        //80-89 = B
        //if(averageScore>=80 && averageScore<90){
          //  System.out.println("Letter Grade is B.");
            //System.out.println("Student pass the class.");

            //jdk, jre, jvm --> is important for intervew

            //primitive data types --> is important to write the code
            //String --> this is important for interview and to write the code
            //Scanner --> not important
            //If Statement --> IT IS IMPORTANT TO WRITE THE CODE
            //"civic" -- civic --> Palindrome
            //"Techtorial" -->"lairotech"--> for loops statement
            //NOTE
            //IN IF STATEMENT if there is no curly braces, it will affect
            // only first line after first line after first line all of them will be executed.
            //we also can do if(true)
            // +++++++++++++++++++int x=5
            //inside paranteses always should be boolean condition. or (true/false).
            // If there is not boolean condition it ewill give compile time error
       // }

        Scanner input=new Scanner(System.in);

        System.out.println("What is your age? ");
        int age=input.nextInt();

        System.out.println("What is your exam score? ");
        int score=input.nextInt();

        System.out.println("Do you have a state ID?");
        boolean id=input.nextBoolean();

        System.out.println("Did you pass the driving test?");
        boolean drivingTest=input.nextBoolean();

        if(age>=16 && score>=70 && id==true && drivingTest==true ){
            System.out.println("You can get the drivers license :) ");
        }else{
            System.out.println("You can not get the drivers license :( ");
        }


    }
}
