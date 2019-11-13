package IfStatements;

import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter average Score: ");
        int averageScore = input.nextInt();

        if (averageScore >= 80 && averageScore < 100) {
            System.out.println("Your Grade is A");
        } else if (averageScore >= 60 && averageScore < 80) {
            System.out.println("Your Grade is B");
        } else if (averageScore >= 40 && averageScore < 60) {
            System.out.println("Your Grade is C");
        } else if (averageScore >= 20 && averageScore < 40) {
            System.out.println("Your Grade is D");
        } else if (averageScore >= 0 && averageScore < 20) {
            System.out.println("Your Grade is F");
        }else{
            System.out.println("Score is not defined:(");
        }
    }
}