package DoWhileLoop;

import java.util.Scanner;

public class HWPrimaryNumberss {

    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        //Task 1
//        System.out.println("please enter two numbers: ");
//        int firstNum=input.nextInt();
//        int secondNum=input.nextInt();
//
//        while(firstNum<=secondNum) {
//            if (firstNum % 2 != 0 && firstNum % 5 != 0) {
//                System.out.println(firstNum);
//            }
//
//            firstNum++;

   // }
        System.out.println("2");
        int count=0;
        for(int i=3;i<100;i++){//2%1==0; 2%2==0
            for(int k=2;k<i;k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if(count>0){
                    System.out.println(i+ "- is not prime number");
                }else{
                    System.out.println(i+" is prime number");
                }
            count=0;

        }
}}
