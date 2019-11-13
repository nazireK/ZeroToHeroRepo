package DoWhileLoop;

import java.util.Scanner;

public class HWOilChange {

    public static void main(String[] args) {
        //TASK 3
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number of years: ");
        int year=input.nextInt();
        int months=year*12;
        int oilChange=months/3;
        int number=1;

        do{
            System.out.println(number+" - time Oil Change");
            number++;
            oilChange--;
        }while(oilChange>0);

        System.out.println("=========================================================");

        //TASK 4
        System.out.println("Please enter two numbers");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int sum=0;

        do {
            sum=sum+firstNum; //sum=0+10, sum=10; sum=10+11, sum=21; //sum=21+12, sum=33....sum=75
            firstNum++;
        } while (firstNum<=secondNum);

        System.out.println(sum);

        //Debuggimg--> It is very very important.

    }
}
