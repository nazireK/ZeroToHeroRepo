package IfStatements;

import java.util.Scanner;

public class SpeedCars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the speed of the car: ");
        int speed = input.nextInt();

        if (speed >= 1 && speed < 20) {
            System.out.println("Car gear is 1");
        } else if (speed >= 20 && speed < 40) {
            System.out.println("Gear is 2");
        } else if (speed >= 40 && speed < 60) {
            System.out.println("Car gear is 3");
        } else if (speed >= 60 && speed < 80) {
            System.out.println("Car gear is 4");
        } else if (speed >= 80 && speed < 200) {
            System.out.println("Car gear is 5");
        }else if(speed < 0 && speed > -20) {
        System.out.println("The car gear is Rear");
    }else{
            System.out.println("Gear is not defined");

        }
    }
}