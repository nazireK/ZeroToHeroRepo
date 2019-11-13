package Methods;

import ScannerPackage.Scaner;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class StoreClass {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the quantity?: ");
        int quantity=input.nextInt();

        System.out.println("Please enter the price?");
        int price=input.nextInt();

        ProfitCalculator pc=new ProfitCalculator();
        if(quantity<20){
            System.out.println(pc.sell(price,quantity));
        }else if(quantity>=20 && quantity<40){
            System.out.println(pc.sell10disc(price,quantity));
            System.out.println("Theere is no discounmt, if you want to buy nore 20or more. ");
            System.out.println("Your price includes 10 % discount.");
        }else if(quantity>=40){
            System.out.println("Your price includes 20 % discount. ");
            System.out.println(pc.sell20Disc(price,quantity));
        }else{
            System.out.println("Your quantity is invalid ");
        } //we have to modify and and ask if user
        // if he wants to adsd more tables and get discount instead of  paying this much

    }
}
