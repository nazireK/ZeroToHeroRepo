package IfStatements;

import java.util.Scanner;

public class AmazonPriceRates {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter product's Price: ");
        double price=input.nextDouble();

        System.out.println("Please enter product's Reviews: ");
        double reviews=input.nextDouble();

        System.out.println("Please enter product's Star Rating: ");
        double rating=input.nextDouble();

       if (price<50 && reviews>200 && rating>4){
           System.out.println("Product is on the first page :)");
       }else if(price>50 && reviews>200 && rating>4) {
           System.out.println("Product is on the second page :)");
       }else if (price>50 && reviews<200 && rating>4) {
           System.out.println("Product is on the third page :)");
       }else if(price>50 && reviews<200 && rating<4 && rating>2 ) {
           System.out.println("Product is on the fourth page :)");
       }else{
           System.out.println("Page is not defined :( ");
       }
    }



}
