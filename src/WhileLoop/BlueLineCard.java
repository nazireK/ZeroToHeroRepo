package WhileLoop;

import java.util.Scanner;

public class BlueLineCard {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter balance : ");
        int cardBalance=input.nextInt();
        int ridePrice=2;
        int count=1;

        while(cardBalance>=2){
            cardBalance=cardBalance-ridePrice;
            System.out.println("Card used "+count+" times");
            count++;
        }

    }
}
