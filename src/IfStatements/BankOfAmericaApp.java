package IfStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankOfAmericaApp {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your user name: ");
        String username=input.next();

        if(username.equals("mturan")){
            System.out.println("Please enter your password: ");
            String password=input.next();

            if(password.equals("DesPlains21")){
                System.out.println("Please enter Captcha  'beam' ");
                String captcha=input.next();

                if(captcha.equals("beam")) {
                    System.out.println("Welcome to Bank of America");
                }else{
                    System.out.println("Captcha is wrong");
                }
            }
        }else{
            System.out.println("Password is wrong.Try again");
        }
    }
}
