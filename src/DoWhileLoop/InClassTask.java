package DoWhileLoop;

import java.util.Scanner;

public class InClassTask {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter two numbers: ");
        int firstNum=input.nextInt();
        int secondNum=input.nextInt();

        do{
            System.out.println(firstNum);
            firstNum--;
        }while(firstNum>secondNum);
    }
}
