package IfStatements;

import java.util.Scanner;

public class AscDescendingOrder {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);

        System.out.println("Please enter four numbers: ");
          int one=input.nextInt();
          int two=input.nextInt();
          int three=input.nextInt();
          int four=input.nextInt();

          if (one>=two){
              int temp=one; //12
              one=two; //4
              two=temp; //12
          }

          if( one>=three){
              int temp=one; //4
              one=three; //
              three=temp; //
          }
          if (one>=four){
              int temp=one; //4
              one=four; //3
              four=temp; //4
          }

          if (two>=three) { //12>7
              int temp = two; //12
              two = three; //7
              three = temp; //12

          }
           if(two>=four)  {
               int temp=two;
               two=four;
               four=temp;

           }
           if (three>=four) {
               int temp=three;
               three=four;
               four=temp;
           }
        System.out.println(one+ "\n"+two+"\n"+three+"\n"+four);
        System.out.println(four+ "\n"+three+"\n"+two+"\n"+one);


        }
}

