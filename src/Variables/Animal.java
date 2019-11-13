package Variables;

import java.sql.SQLOutput;

public class Animal {

    /*
    In farm we have 23 cow and 42 chicken.
    Calculate the total number of leg in this farm.
    23*4
    42*2
    */

    /*
    one cow price is $2000
    one chicken price $20
    calculate total price for all animals in the farm
    */
 public static void main(String [] args) {

     int cow=23;
     int cowsLegs=cow*4;

     System.out.println("The number of cows les are " +cowsLegs);

     int chicken=42;
     int  chickenLegs=chicken*2;

     System.out.println("The number of chicken legs are "+chickenLegs);

     int totalNumbersofLegs=cowsLegs+chickenLegs;
     System.out.println("The total number of legs are "+totalNumbersofLegs);

     int cowTotalPrice=cow*2000;
     int chickenTotalPrice=chicken*20;

     int totalAnimalPrice=cowTotalPrice+chickenTotalPrice;

     System.out.println("The total price for all animals is $"+totalAnimalPrice);

     System.out.println("Total Animal "+ (cow+chicken));




 }

}
