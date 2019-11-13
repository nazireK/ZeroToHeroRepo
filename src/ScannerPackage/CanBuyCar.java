package ScannerPackage;

import java.util.Scanner;

public class CanBuyCar {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("How much do you have? $");
        double currentSavings=input.nextDouble();

        System.out.println(" How much is the car? ");
        double carPrice=input.nextDouble();

        double difference=carPrice-currentSavings;
        System.out.println("Difference between current savings and car price is $"+difference);

        boolean canBuy=currentSavings>=carPrice;
        System.out.println("Can I buy the car? "+canBuy);

        System.out.println("Where are you living? ");
        String city=input.next();
        //for String input.next() --> if you are entering only one value
        // if you need to enter more tahn one string you need to use input.nextLine();

        System.out.println("My city is "+city);












    }



}
