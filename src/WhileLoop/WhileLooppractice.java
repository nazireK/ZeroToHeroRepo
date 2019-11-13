package WhileLoop;

public class WhileLooppractice {

    public static void main(String[] args) {

        int age=20;
        while(age<26){
            System.out.println("Complete cercle");
            age++;
        }
        //I wanna repeat my name five times

        int repeatNumber=5;
        int currentNumber=1;
        while(currentNumber<=repeatNumber){
            System.out.println("Gulaiym");
            currentNumber++;
        }
        //40$ in my phone account. every call is 5 $. How many times i can call

        int balance=40;
        int callPrice=5;

        while(balance>0){
            System.out.println("I can call");
            balance-=5;
        }

        //u have one plate of meal;
        //if u take 10 spoon, you finished ur meal
        //print every spoon of meal you take

        int spoonN=1;
        while(spoonN<=10){
            System.out.println(spoonN+ " spoon");
            spoonN++;
        }

       int phonePrice=800;
        int currentMoney=900;
        int count=0;

        while(currentMoney<=phonePrice){
            System.out.println(count+ " You can buy the phone");
            count++;
            //if boolean condition is returning false, there will no any iteration
        }

        //infinite loop- if your boolean condition is returning true, you will be executing your code infinitely.
        int phonePrice1=500;
        int currentMoney1=2000;
        int   count1=1;

        while(currentMoney1>=phonePrice1){
            System.out.println(count1+ " You can buy the phone");
            currentMoney1=currentMoney1-phonePrice1;
            count1++;
            //if boolean condition is returning false, there will no any iteration
        }
    }
}
