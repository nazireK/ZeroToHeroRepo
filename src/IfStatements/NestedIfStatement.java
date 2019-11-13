package IfStatements;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Do you have a Passport?");

        boolean passport=input.nextBoolean();

        if(passport){
            System.out.println("Do you have a Ticket?");
            boolean ticket=input.nextBoolean();

            if (ticket) {

                System.out.println("You can come to US");

            }else {
                System.out.println("1You can not come to USA");
            }
            } else {
                System.out.println("2You can not come to USA");
            }
        }
    }

