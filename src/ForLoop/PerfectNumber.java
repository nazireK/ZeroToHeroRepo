package ForLoop;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner  input=new Scanner(System.in);
        System.out.println("p[lease enter number: ");
        int num=input.nextInt();

        int sum=0;

        for (int i=1; i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
            System.out.println(sum);
        }

        if(sum==num){
            System.out.println(num+" is perfect number");
        }else{
            System.out.println(num+" is not perfect number");
        }
    }
}
