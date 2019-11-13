package ForLoop;

import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int accountBalance=2000;
        System.out.println("Your balance is: $"+accountBalance);

       while(accountBalance>0){
           System.out.println("Plese enter more transaction:");
           int transaction=input.nextInt();
           if (accountBalance < transaction) {
               System.out.println("Hey, you dont have enough balance. Your balance is: "+accountBalance);

           }else{
               accountBalance=accountBalance-transaction;
               System.out.println("Your balance is: "+accountBalance);

           }
       }


    }
}
