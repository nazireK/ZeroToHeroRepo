package IfStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalesPerson {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How much money do you earn one week if each of your product costs 50$ ?: ");
        System.out.println("How much did you earn Monday? : ");
        int monday=input.nextInt();
        System.out.println("How much did you earn Tuesday? : ");
        int tuesday=input.nextInt();
        System.out.println("How much did you earn Wednesday? : ");
        int wednesday=input.nextInt();
        System.out.println("How much did you earn Thursday? : ");
        int thursday=input.nextInt();
        System.out.println("How much did you earn Friday? : ");
        int friday=input.nextInt();

        int totalProdPrice=monday+tuesday+wednesday+thursday+friday;
        int baseSalary=400;
        double bonus=totalProdPrice*5/100;

        if(totalProdPrice>=800 && totalProdPrice<1000){
            System.out.println("Sales Persons weekly salary with 5% bonus will be - $ "+(bonus+baseSalary));
        }else if(totalProdPrice>=1000 && totalProdPrice<1200){
            System.out.println("Sales Person's weekly salary with 7% bonus will be -  $ "+((totalProdPrice*7/100)+baseSalary));
        }else if(totalProdPrice>=1200 && totalProdPrice<1400){
            System.out.println("Sales persons weekly salary with 9% bonus will be $"+((totalProdPrice*9/100)+baseSalary));//if tyotal sales is more than 800 and less then 1000 commision is 5%
        }else if (totalProdPrice>1400) {
            System.out.println("Sales Person's weekly salary with 11% bonus will be - $"+((totalProdPrice*11/100)+baseSalary));
        }else{
            System.out.println("Salary did not defined :( ");
        }
        //if total sale is more than or equals to 1000 and 1200 commisiionn 7%
        //total sale is more tham or equals to 1200 and leess then 1400 commision is 9%

    }
}
