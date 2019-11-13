package StringPackage;

import java.sql.SQLOutput;

public class StringMothods {

    public static void main(String[] args) {

        String sName="techtorial";
        int num=1;
        num++;
        System.out.println(num);

        //Differences between primitive data types and String :
        //1. String si immutable
        //2. Primitive data typoes are mutable
        //3. String should be reassihned to able tio change.

        System.out.println(sName.toUpperCase());
        //String is immutable. if you want to be Upper case you have to assign.
        sName=sName.toUpperCase();
        System.out.println(sName);

        String student="ARSLAN";
        System.out.println(student.toLowerCase());
        System.out.println(student);
        student=student.toLowerCase();
        student+="Kabul";
        //= it means assignment in java
        // == it means is equals to(comparison operators)

        System.out.println(student);



    }
}
