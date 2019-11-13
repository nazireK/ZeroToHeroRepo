package ScannerPackage;

import java.util.Scanner;

public class HomeworkCommission {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
// 1.
//        System.out.println("What is your total sales worth? ");
//        double salesWorth=input.nextDouble();
//
//        System.out.println("What is your commission Rate ?  %");
//        double commissionRate=input.nextDouble();
//
//        double totalCom=salesWorth*commissionRate/100;
//        System.out.println("Your total commission payment is: $"+totalCom);

         ///////////////////////////////////////////////////////////////////////////

// 2.
//        System.out.println("Please enter 5 full names of your family members: ");
//        String name1=input.nextLine();
//        String name2=input.nextLine();
//        String name3=input.nextLine();
//        String name4=input.nextLine();
//        String name5=input.nextLine();
//
//        System.out.println("The list of names are: 1." +name1+ " 2."+name2+" 3."+name3+"  4."+name4+" 5."+name5);

        /////////////////////////////////////////////////////////////////////////////////
 // 3.
//        System.out.println("What is the pen price? $");
//        double penPrice=input.nextDouble();
//
//        System.out.println("What is the discount percentage? % ");
//        double discount=input.nextDouble();
//
//        double discountPrice=penPrice*discount/100;
//        System.out.println("What is the discount Price of Pen?  $"+discountPrice);

        ////////////////////////////////////////////////////////////////////////////////////////////////
 // 4.
        System.out.println("Please deposit $Money to yor keep Calling account ");
        int deposit=input.nextInt();

        System.out.println("International Calls are -- $5 per Call ");
        System.out.println("Local Calls are -- $3 per Call");

        System.out.println("If you have $"+deposit+ ", then you can make International calls -> "+(deposit/5)+" times");
        System.out.println("If you have $"+deposit+", then you can make Local calls -> "+deposit/3+" times");





    }


}
