package Variables;

import javax.print.DocFlavor;

public class UneryOperators {

    public static void main(String[] args) {
        int studentAge=25;
        studentAge++;
        //26
        System.out.println(studentAge);

        //if you do :
        //studentAge=studentAge++;
        //System.out.println(studentAge);
        //then, the student age stays the same 25

        studentAge--;
        //25
        --studentAge;
        //24
        studentAge++;
        //25
        ++studentAge;
        //26

        studentAge=studentAge++;
        //26
        studentAge=++studentAge;
        //27

        studentAge=2*studentAge++;
        //2*27=54
        studentAge=2*++studentAge;

        System.out.println(studentAge);

        int x=3;
        int k=++x*5;

        System.out.println(x); //4
        System.out.println(k); //20

       // int k=++x*5/x--; //4*5/4=5   ,  x=3

       // System.out.println(x);
       // System.out.println(k);

       // int k=++x*5/x--+--x; //k=4*5/4+2=7, x=2

       // System.out.println(k);
        //System.out.println(x);

        int n=4;
        n=n++-1;  //answer will be 3

        //n++;
        //n=n-1; answer will be 4
        //n will increase after finishing the execution
        //execution will finish with semicolon

        int r=++n+n++-3;

        //r=5+5-3=7
        //n=6





    }
}
