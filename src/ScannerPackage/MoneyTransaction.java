package ScannerPackage;

import java.util.Scanner;

public class MoneyTransaction {

    public static void main(String[] args) {
         //input three times different amount  money, the amounts 500, 1000,1500,
        //then i bought phone, I spent 750,
        //tyhen i bought used computer ansd I spent 300
        //calculate how much i have money left in account

            Scanner input=new Scanner(System.in) ;

        System.out.println("Please provide three times three different amount of money: ");
        int deposit1=input.nextInt();
        int deposit2=input.nextInt();
        int deposit3=input.nextInt();

        int totalMoney=deposit1+deposit2+deposit3;
        System.out.println("The total amount in my Savings is $"+totalMoney);
        System.out.println("How much is your phone cost: ");
        int phone=input.nextInt();
        System.out.println("How much is your computer cost: ");
        int computer=input.nextInt();

        int spentMoney=phone+computer;
        System.out.println("How much did you spent $"+spentMoney);

        System.out.println("I have left $"+(totalMoney-spentMoney));




    }
}
