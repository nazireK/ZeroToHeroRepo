package IfStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CarSpeed {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter three different input: ");
        System.out.println("What is your Current Speed?");
        int currentSpeed=input.nextInt();

        System.out.println("what is your speed limit :");
        int speedLimit=input.nextInt();

        System.out.println("Please provide the Gas Pedal");
        boolean gasPedal=input.nextBoolean();

        System.out.println("Please provide the Break Pedal");
        boolean breakPedal=input.nextBoolean();

        System.out.println("Please provide the Gas Pedal Percentage");
        int gasPedalPercentage=input.nextInt();

        boolean increaseSpeed=currentSpeed<speedLimit && gasPedalPercentage>20 &&
                gasPedal==true && breakPedal==false;
        System.out.println("Can I increase the speed? "+increaseSpeed);
        // percentage=20  --> it will stay same speed
        // percentage<20  --> decrease speed
        // percentage>20  --> increase speed


















}
}
