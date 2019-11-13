package StringPackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeQ {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter any two Strings: ");
        String value1=input.nextLine();
        String value2=input.nextLine();

        System.out.println("First String and second Strings are equal to each other - "+value1.equalsIgnoreCase(value2));

        int length1=value1.length();
        int length2=value2.length();
        //we can also use boolean length=value1.length()==value2.length();
        //In string to compare values we can not use the logical operators, we use Methods in String
        //(""+value1.charAt(0)); we also can use with StartsWith;

        System.out.println("The length of first String is - " +length1+", and the Length of the second String is - " +length2);
        System.out.println("The length of these Two Strings are equal - "+(length1==length2));

         char firstLetter=value1.charAt(0);
         char secondLetter=value2.charAt(0);
        System.out.println("The First char of first String is- "+firstLetter+", and the first char of Second String is - "+secondLetter);
        System.out.println("The first letter of two Strings are equal - "+(firstLetter==secondLetter));

        value1=value1+" 2019";
        value2=value2+" 2019";

        System.out.println(value1);
        System.out.println(value2);

        System.out.println(value1.replace(" ","-"));
        System.out.println(value2.replace(" ","-"));

        System.out.println(value1.substring(4,8).trim().toUpperCase());
        System.out.println(value2.substring(4,8).trim().toUpperCase());







































































































































    }
}
