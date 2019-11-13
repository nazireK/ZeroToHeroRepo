package ForLoop;

import java.util.Scanner;

public class FindLargestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int number = input.nextInt();

        System.out.println("Please enter " + number + " times number: ");
        int firstNum = input.nextInt();

        for (int i = 0; i < number - 1; i++) {
            int secondNum = input.nextInt();
            if (secondNum > firstNum) {
                firstNum = secondNum;
            }
        }
        System.out.println(firstNum);

    }

}