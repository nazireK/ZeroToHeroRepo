package IfStatements;

import java.util.Scanner;

public class ClothesColor {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println(" Please enter where do you study? : ");
        String schoolName=input.nextLine();

        if (schoolName.equalsIgnoreCase("Kinder Garden")){
            System.out.println("Give red color");
        }else if(schoolName.equalsIgnoreCase("Elementary School")){
            System.out.println("Give blue color");
        }else if(schoolName.equalsIgnoreCase("Middle School")){
            System.out.println("The School outfit is white shirt and gray pants");
        }else if(schoolName.equalsIgnoreCase("High School")){
            System.out.println("The school outfit should be blue shirts with blue pants");
        }else{
            System.out.println("The school is not defined :( ");
        }

    }
}
