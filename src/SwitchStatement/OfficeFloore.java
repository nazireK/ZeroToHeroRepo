package SwitchStatement;

import java.util.Scanner;

public class OfficeFloore {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which floor do you wanna go? : ");
        int floor = input.nextInt();

        switch (floor) {
            case 30:
                System.out.println("There are three companies Wallgreens, CVS, Discover. Where do you wanna go? ");
                String company = input.next();

                switch (company) {
                    case "Wallgreens":
                        System.out.println("Elevator 1");
                        break;

                    case "CVS":
                        System.out.println("Elevator 2");
                        break;

                    case "Discover":
                        System.out.println("Elevator 3");
                        break;
                    default:
                        System.out.println("Company is not available :(");
                        break;
                }

                break;

            case 31:
                System.out.println("There are three companies: Techtorial, Blue Cross. Where do you wanna go? ");
                String company2 = input.next();

                switch (company2) {
                    case "Techtorial":
                        System.out.println("Elevator 4");
                        break;

                    case "Blue Cross":
                        System.out.println("Elevator 5");
                        break;

                    default:
                        System.out.println("Company is not available :(");
                        break;
                }
                break;

            default:
                System.out.println("There are only 50th. Floor is not available.");
                break;

        }


    }
}