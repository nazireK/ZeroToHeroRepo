package StringPackage;

import java.util.Scanner;

public class StringContains {

    public static void main(String[] args) {

        String name="Techtorial";
        boolean condition=name.startsWith("Tech"); //we can give all the chracters too, not only one letter or half of the letters of the word.
        System.out.println(condition);

        String name1="236-Muammer";
        System.out.println(name1.startsWith("235"));

        boolean condition1=name1.endsWith("mer");
        System.out.println(condition1);

        boolean condition3=name1.contains("-");
        System.out.println(condition3);
        /////////////////////////////////////////////////
        System.out.println("--------------New Task-----------");
        //input your name using scanner and check your name contains giving value
        //F
        //M
        //check starts with F
        //vheck if you are

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender - name - DOB: ");
        String myName=input.nextLine();

        boolean myNameStarts=myName.startsWith("F");
        System.out.println("You are Female --> "+myNameStarts);

        boolean myNameCont=myName.contains("Gulaiym");
        System.out.println("My name is Gulaiym --> "+myNameCont);

        boolean myDob=myName.endsWith("1992");
        System.out.println("My date of birth is 1992 --> "+myDob);




    }
}
