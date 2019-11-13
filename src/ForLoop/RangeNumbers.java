package ForLoop;

import java.util.Scanner;

public class RangeNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number between 10-40: ");
        int number=input.nextInt();

        if(number<=40 && number>=18){

            System.out.println(number+ "- Number is in the range");
            for(int i=number; i>=18 && i<=40;i++){
                System.out.println(i);
            }
        }else{
            System.out.println(number+ "- is not in the range ");
        }
    }
}
