package Variables;

import javax.management.MBeanAttributeInfo;

public class CastingPractice{

    public static void main(String[] args){

        short samsung=1000;

        short apple=900;
        //Casting primitive data types

        short totalPrice=(short)(samsung+apple);

        //byte, short, int and long is called integral values
        //float and double is called floating point numbers

        long studentNumber=1200l;
        //we need to cast the longer values to smaller values

        int studentNumber1=(int)studentNumber;  //int studentNumber1=(int)1200l;

        long num=studentNumber1;

        double st=num;

        double K=800.7d;

        int L=(int)K;

        System.out.println("The L is "+ L);

        int x=10;
        int y=5;

        x/=y;  //compond assignment x=x*y; 50 x=x+y; 15
        // x=x/y; 2,, x=x%y

        System.out.println(x);

        long l=5;
        int h=8;
        h=(int)l*h; //40

        //differrences between "l*h" and h*=l
        //1-if you are using l*h you need to explicitly cast the value
        //2- if you are using h*=l you dont need to cast explicitly

        h*=l;



        byte bookNumber=15;

        int bookPrice=5;

        //bookNumber*=bookPrice;
        //
        bookNumber=(byte)(bookNumber*bookPrice);

        System.out.println(bookNumber);









    }






}

