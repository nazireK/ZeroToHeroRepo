package WhileLoop;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
       System.out.println("Please enter the number: ");
       int num=input.nextInt();
      int count=1;

        while(num<=10 && count<=10){
           System.out.println(num+"*"+count+"="+num*count);
            count++;


        }
    }
}
