package Methods;

import ScannerPackage.Scaner;

import java.util.Scanner;

public class Investtest {

    public static void main(String[] args) {
        Investment in=new Investment();

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an amount: ");
        in.amount=input.nextDouble();

        System.out.println("Please enter number of years you want to invest: ");
        in.year=input.nextDouble();

        System.out.println("Please enter the rate: ");
        in.rate=input.nextDouble();


        System.out.println("Your total will be "+in.totalAmount()+" in "+in.year+" years! ");


    }
}
