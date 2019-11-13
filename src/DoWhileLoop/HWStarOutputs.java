package DoWhileLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HWStarOutputs {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        //TASK 1.
        System.out.println("Please enter the number:");
        int numLines=input.nextInt();
        do {
            System.out.println("***************");
            numLines--;
        }while (numLines>0);

        System.out.println("====================================================================");
        //TASK 2.
        System.out.println("Please enter the number of days: ");
        int days=input.nextInt();
        int number=1;
        days=days/15;

        do {
            System.out.println(number+" - Updates are available");
            number++;
            days--;
        }while(days>0);


    }
}
