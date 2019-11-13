package ForLoop;

import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        //.out.println("Please enter any number: ");
        //number=input.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (100 % i == 0) {
                System.out.println(i);
            }

        }

        System.out.println("Please enter any number: ");
        int num=input.nextInt();

        int fuc=1;
        for (int i=num; i>=1; i--){
            System.out.println(i);
            fuc=fuc*i;
        }
        System.out.println(fuc);


    }
}