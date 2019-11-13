package SwitchStatement;

import java.util.Scanner;

public class SwitchPractice {

    public static void main(String[] args) {

        //write the code to print out the name of the days
        //0- sunday
        //1- monday
        //2- tiesday ect

        Scanner input=new Scanner(System.in);

//        int dayNumber=input.nextInt();
//
//        switch (dayNumber) {
//
//            case 0:
//                System.out.println("Sunday");
//                break;
//
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            case 4:
//                System.out.println("Thursday");
//                break;
//
//
//            case 5:
//                System.out.println("Friday");
//                break;
//
//            case 6:
//                System.out.println("Saturday");
//                break;
//
//            default:
//                System.out.println("The value is not matching with any case statements");
//                break;
//        }
        System.out.println("Please choose Fruit: Strawberry, Cranberry, Chocolate, Banana");
        String name=input.nextLine();
        switch (name){
            case "Strawberry":
                System.out.println("Matching value is "+name);
                break;

            case "Chocolate":
                System.out.println("Matching value is "+name);
                break;

            case "Cranberry":
                System.out.println("Matching Value is "+ name);
                break;

            case "Banana":
                System.out.println("Matching value is "+ name);
                break;

            default:
                System.out.println("The value is not matching with any case statements");
                break;
                //you can not give same constant value for more than one case statements












        }



    }
}
