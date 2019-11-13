package ForLoop;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ForLoopExample {

    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            System.out.println(i);
        }

        for(int i=1;i<=5; i++){
            System.out.println("Muammer");
        }

        for(int i=9; i>0; i--){
            System.out.println(i);

        }
        Scanner input=new Scanner(System.in);
        int number;
        int sum=0;

        for(int i=0; i<5; i++){
            System.out.println("Please enter the numbers: ");
            number= input.nextInt();
            sum=sum+number;
        }
        System.out.println(sum);
        //cube of the numbers 5-9

        int cube=0;
        for(int i=5; i<=9; i++){
            cube=i*i*i;
            System.out.println(cube);
        }




    }
}
