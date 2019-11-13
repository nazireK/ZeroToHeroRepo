package IfStatements;

import java.util.Scanner;

public class HWSortingNum {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter six different numbers: ");
       int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextInt();
        int j=input.nextInt();

        //a>b;a>c;a>d; a>e;a>j
        //b>c; b>d; b>e; b>j
        //c>d; c>e; c>j
        //d>e; d>j
        //e>j

        if (a>b) {
            int temp = a;
            a = b;
            b = temp;
        }
            if (a>c) {
                int temp = a;
                a = c;
                c = temp;
            }
                if (a>d) {
                    int temp = a;
                    a = d;
                    d = temp;
                }
                    if (a>e) {
                        int temp = a;
                        a = e;
                        e = temp;
                    }
                    if (a>j) {
                        int temp = a;
                        a = j;
                        j = temp;
                    }
                    if (b>c) {
                        int temp = b;
                        b = c;
                        c = temp;
                    }
                    if (b>d){
                        int temp=b;
                        b=d;
                        d=temp;
                    }
                    if (b>e){
                        int temp=b;
                        b=e;
                        e=temp;
                    }
                    if (b>j){
                       int temp=b;
                        b=j;
                        j=temp;
                    }
                    if (c>d) {
                        int temp=c;
                        c=d;
                        d=temp;
                    }
                    if(c>e){
                        int temp=c;
                        c=e;
                        e=temp;
                    }
                     if(c>j){
                         int temp=c;
                         c=j;
                         j=temp;
                     }
                     if (d>e){
                         int temp=d;
                         d=e;
                         e=temp;
                     }
                     if(d>j){
                         int temp=d;
                         d=j;
                         j=temp;
                     }
                     if(e>j){
                        int temp=e;
                         e=j;
                         j=temp;
                     }
                       System.out.println("Ascending Numbers: ");
                         System.out.println(a+ "\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+j);

                         System.out.println("Descending Numbers: ");
                         System.out.println(j+"\n"+e+"\n"+d+ "\n"+c+"\n"+b+"\n"+a);
                }
            }





