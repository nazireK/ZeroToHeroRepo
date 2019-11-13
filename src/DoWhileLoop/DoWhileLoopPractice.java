package DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoopPractice {

    public static void main(String[] args) {

        int totalNum = 4;
        int totalNum1 = 5;

        do {
            System.out.println("Gulaiym");
            totalNum--;
        } while (totalNum < 0); //it will print one time.


        System.out.println("--------------------------------");
        do {
            System.out.println("Gulaiym");
            totalNum1--;
        } while (totalNum1 > 0);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        do {
            System.out.println(firstNum);
            firstNum=firstNum+1;
        } while (firstNum <=secondNum);
    }
}