package IfStatements;

import java.util.Scanner;

public class HWShoppingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of Tomatoes that you are buying:  ");
        int tomatoes = input.nextInt();

        System.out.println("Please enter number of Cucumbers that you are buying: ");
        int cucumbers = input.nextInt();

        System.out.println("Please enter number of Eggplants that you are buying: ");
        int eggplants = input.nextInt();

        double tomatoP = tomatoes * 1;
        double cucumberP = cucumbers * 0.50;
        double eggplantP = eggplants * 2;
        double totalP = tomatoP + cucumberP + eggplantP;
        if (totalP >= 10) {
            System.out.println("Your total payment after discount is -  $" + ((totalP) - (totalP * 10 / 100)));
            } else {
                System.out.println("Your total payment is - $"+totalP);
            }

        }
    }
