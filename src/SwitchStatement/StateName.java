package SwitchStatement;

import java.util.Scanner;

public class StateName {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("What is your state Name? :");
        String stateN=input.nextLine();

        switch(stateN) {
            case "Illinois":
                System.out.println("Please enter the city name: ");
                String cityName = input.nextLine();

                switch (cityName) {
                    case "Chicago":
                        System.out.println("You have selected the organization in " + stateN + " and " + cityName);
                       break;

                    case "Elgin":
                        System.out.println("You have selected the organization in " + stateN + " and " + cityName);
                        break;
                    case "Des Plains":
                        System.out.println("You have selected the organization in "+ stateN + " and " + cityName);
                        break;
                  default:
                        System.out.println("Selected city is not Available");
                        break;
                }

            case "Florida":
                System.out.println("Please enter City name: ");
                String cityName2 = input.nextLine();

                switch (cityName2) {
                    case "Miami":
                        System.out.println("You have selected the organization in " + stateN + " and " + cityName2);
                        break;

                    case "Tampa":
                        System.out.println("You have selected the organization in " + stateN + " and " + cityName2);
                        break;
                    case "Jacksonville":
                        System.out.println("You have selected the organization in " + stateN + " and " + cityName2);
                        break;

                    default:
                        System.out.println("Selected city is not Available");
                }         break;

            default:
                System.out.println("The selected State is not available" );
                break;
        }




    }
}
