package WhileLoop;

import java.util.Scanner;

public class DividentTwo {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        int count=0;
        while(num>0){
            num=num/2;
            count=count+num;

        }
        System.out.println(count);
    }
}
