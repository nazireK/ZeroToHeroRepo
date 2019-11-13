package TernaryOperators;

public class TernaryPractice {

    public static void main(String[] args) {

        int x=10;
        int y=5;
        int z=0;
        int k=2;

        //ternary operators
        //booleanExpression? value1 vlaue2;
        System.out.println(x>y?8:9);
        System.out.println(y>x?8:9);
        System.out.println(x>y?(z=7):(z=3));
        System.out.println(z);
        System.out.println(x>y ? k++ : ++k);

        //the values doesnt have to be same data type
        System.out.println(x<y ? 40 : "Hello world");

        System.out.println(x<y && y==x ? 40 : "Hello world");
         z=3;
        System.out.println(x<y ? ++z+z++ : z++ + ++z);
        System.out.println(z);

        // int s=x>y ? 40 : "hello" --> it will not work. we can not assign int to string
        // int s=x>y ? 40 : 10 --> it will work. because all of it is int

        //we can do it  with Systemoutprintln and it will work

        //if you are assigning the value from the ternanry operatorsboth sides should be same data types
        //however if you not assigning the value from ternanry operators just printing it is not required to be same data tyypes

        byte bt=10;
        short st=30;
        long ln=1000L;
        int number=bt>st ? bt : st; //byte and short always automatically  casting to int;

        double db=10.5;
        float fl=5.5f;
        // int number1=db>fl ? db : fl --> it will not work
        //if we do :
        double number1=db>fl ? db : fl;



    }
}
