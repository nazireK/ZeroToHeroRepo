package Variables;

import java.util.Scanner;

public class HOMEWORK21 {

    public static void main(String[] args) {

        //PART II

        //1.

        Scanner input=new Scanner(System.in);

        System.out.println("Input the first number: ");
        int  number1=input.nextInt();

        System.out.println("Input the second number: ");
        int  number2=input.nextInt();

        int sum=number1+number2;
        System.out.println("The sum of two number is:  "+sum);
    }
}
