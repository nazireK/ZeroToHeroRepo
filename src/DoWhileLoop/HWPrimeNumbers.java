package DoWhileLoop;

import java.util.Scanner;

public class HWPrimeNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        //Task 2
        System.out.println("please enter two numbers: ");
        int firstNum=input.nextInt();
        int secondNum=input.nextInt();

        while(firstNum<=secondNum) {
            if (firstNum % 7 == 0 && firstNum % 2 == 0) {
                System.out.println(firstNum);
            }

            firstNum++;

        }
            System.out.println("===================================");

            //TASK 4
            System.out.println("Please enter any 2 numbers: ");
            int tenNum1 = input.nextInt();
            int tenNum2 = input.nextInt();
            int sum = 0;

            do{
                sum=sum+tenNum1;
                tenNum1++;
            } while (tenNum1<=tenNum2);

            System.out.println(sum);




    }
}
