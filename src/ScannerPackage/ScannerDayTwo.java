package ScannerPackage;

import java.util.Scanner;

public class ScannerDayTwo {

    public static void main(String[] args) {

//        //Provide two number and find the reminder of this two numbers
      Scanner input=new Scanner(System.in);
//
//        System.out.println("Please provide two number: ");
//
//        int num1=input.nextInt();
//        int num2=input.nextInt();
//
//        int reminder=num1%num2;
//        System.out.println("What is the reminer of two numbers: "+reminder);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         //String name=input.Next();
        // Next(); -->it will see only one word
        // and nextLine(); --> it will see al your word

        System.out.println("Please provide two full Names : ");
        String name1=input.nextLine();
        String name2=input.nextLine();
        System.out.println("List of the Names:---> "+name1+ " and "+name2);




    }
}
