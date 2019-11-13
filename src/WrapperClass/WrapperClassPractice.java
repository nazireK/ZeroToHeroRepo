package WrapperClass;

import Methods.BankAccount;
import Methods.CalculatorClass;

import java.io.CharConversionException;

public class WrapperClassPractice {

    public static void main(String[] args) {
//first way
        Byte by=new Byte((byte)12);
        //Once you create object from byte and short you need to cats them
        Short sh=new Short((short)20);

        Integer in=new Integer(50);
        Long ln=new Long(456229);

        Double db=new Double(262728.2);
        Float fl=new Float(2342.99f); //it will work even if you don't use f at the end

        Boolean bl=new Boolean(true);
        Character ch=new Character('P');
//.second way
        Byte by1=new Byte("12");
        //Even though i have the valueas a String, Java will convert them into Objects
        Short sh1=new Short("44");

        System.out.println(by1);
        System.out.println(sh1);
//third way
        Integer num=189;
        Short num1=77;
        //if you provide the value directly without new keyword, we do not need to cast.

        int number=55;
        //Integer computers=null;
       // number=computers;//it will not give the compile time error, However it will give run time error.
        //System.out.println(number);//it it wll give NullPointerException
        //int number=null --> compile time error.
        //int number=num --> run time error.

//Converting from String to Primitive data types
        String values="455";
        int valueInt=Integer.parseInt(values);
        System.out.println(valueInt);

        String convertBl="TRUE";
        boolean convert=Boolean.parseBoolean(convertBl);
        System.out.println(convert);
        //if you are converting string value of boolean to the primitive,
        //all values other than true or false, it will assign as a false.

        String table= "true";
        Boolean tb=Boolean.valueOf(table); //--> this is an object
        System.out.println(tb);

        String chair="C"; //
        Character ch1='C';//or new Character('C) //-->

        //Integer phone=Integer.valueOf("12.56");
       // System.out.println(phone);
        //since the value is double it will give NumberFormatException

        int mouse=6;
        Integer mouse1=mouse;
        //mouse primitive is assign to the wrapper class object.
        //it calls autoboxing. Automatic conversion from primitive to wrapper class object.

        char c='K';
        Character cr=c; // it is autoboxing
        boolean b=true;
        Boolean bn=b; //it is autoxing

        Double money1=10000.99;
        double money2=money1;// itr is unboxing
        //unboxing can be apply for all the primitive dta types

        Character paper = 'C';
        boolean bln=paper.isDigit(paper);
        System.out.println(bln);

        String stn="9un6bo45xin3g";
        //Homework: Create one method, it will take the string as a
        // parameter and it will return the  Wrapper integer value from the string
        paper.isAlphabetic(paper);


    }
}
