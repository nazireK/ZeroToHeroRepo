package IfStatements;

import java.util.Scanner;

public class TaskBestBuy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double phonePrice=1000;
        System.out.println("The phone costs 1000$. Please enter the amount: ");
        double paymentAmount=input.nextDouble();

        if(paymentAmount>=phonePrice) {
            System.out.println("You can buy the phone");

        }else if(paymentAmount<phonePrice){
            double restAmount=phonePrice-paymentAmount;
            System.out.println("Please enter the rest of the amount $"+restAmount);
            double restPayment=input.nextDouble();
            if(restAmount>=restAmount){
                System.out.println("You can by the phone");
            }else{
                System.out.println("You cannot buy the phone");
            }

        }

    }
}