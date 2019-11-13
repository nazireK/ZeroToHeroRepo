package Variables;

import java.util.Scanner;

public class HOMEWORK {

    public static void main(String[] args) {

     /* PART I

    1. (!0)--> it will output false, It means not not zero.
        Answer is False

    2. (5 + 4 < 3 && 7 + 3 <= 20 )?
        9 < 3 && 10 <=20
         false && true
          Answer is False;

    3. ( 'a' != 'b' - 1) ?  
       Answer is False, not equals.

    4. ( ! (7 == 7 )) ?  
        (!(true))
        Answer is False

    5. ( 3 % 2 ) ?  
        Answer is 1

    6. ( !1 || !0 ) ?  
       false || true
       Answer is False

    7.  ( 'a' == 97 ) ?
        EX:
        char letter ='a';
        int number = 97;
        boolean result=(letter==number);
        System.out.println(result);
        Answer is TRUE

    8.   int x=4;
         int y=3;

        a) !(x<5&&y==3); ?
           !(4<5&&3==3);
           !(true && true);
           Answer is False

        b) !(x>=1||y!7); ?
           !(4>=1 || 3!=7);
            Answer is : false

         */

        //PART II

        //1.

        /*Scanner input=new Scanner(System.in);    //system.in --> if you are taking outside you use file name

        System.out.println("Input the first number: ");
        int  number1=input.nextInt();

        System.out.println("Input the second number: ");
        int  number2=input.nextInt();

        int sum=number1+number2;
        System.out.println("The sum of two number is:  "+sum);
*/

      /* Scanner input=new Scanner(System.in);

       //2.
        System.out.println("What is the length of a rectangle: ");
        double  length=input.nextDouble();

        System.out.println("What is breadth of a rectangle: ");
        double breadth=input.nextDouble();

        double area=length*breadth;
        System.out.println("The area of a rectangle is: "+(int)area);
        */

        //3.
        Scanner input = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNum = input.nextInt();

        System.out.println("Input second number: ");
        int secondNum = input.nextInt();

        System.out.println("Input third number: ");
        int thirdNum = input.nextInt();
            //only compare first num to second num, second num to third.
        // if you compare with three inputs  it will slow down your application
        boolean equal = (firstNum==secondNum && secondNum==thirdNum);
        boolean notEqual = (firstNum<secondNum || secondNum<thirdNum );

        System.out.println("If all entered numbers are equal  --> " +equal);
        System.out.println("If all entered numbers are not equal --> " +notEqual);

        System.out.println("If any two entered numbers are equal --> " +(firstNum==secondNum || secondNum==thirdNum) );

        //unit testing do developers, testers dont use this
        //1. 4--4--5
        //2. 5--4--4
        //3. 4--5--4
        //4. 4--4--4
        //5. 3--4--5
    }

}
