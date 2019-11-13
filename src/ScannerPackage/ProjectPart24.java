package ScannerPackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProjectPart24 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter three Words: ");
        String words=input.nextLine();
        String words2=input.nextLine();
        String words3=input.nextLine();

        System.out.println("The innitials of this three letters is: "+words.charAt(0)+","+words2.charAt(0)+","+words3.charAt(0));
        System.out.println("Index of letter 'e' for each string is : "+words.indexOf("e") +","+ words2.indexOf("e")+"," + words3.indexOf("e"));
        System.out.println("Please print the last Character of each String : "+words.charAt((words.length()-1))+","+words2.charAt((words2.length()-1))+","+words3.charAt((words3.length()-1)));
        System.out.println("Please Print all Letters Upper Case "+words.toUpperCase()+" , "+words2.toUpperCase()+" , "+words3.toUpperCase());


        char lastWord1=words.charAt((words.length()-1));
        char lastWord2=words2.charAt((words.length()-1));
        char lastWord3=words3.charAt((words.length()-1));

        int length1=words.length();
        int length2=words2.length();
        int length3=words3.length();

        boolean lastCharEq=lastWord1==lastWord3;
        boolean lengthEq= words.length()==words3.length();
        System.out.println("The last Char of these three words are the same: "+lastCharEq);
        System.out.println("The lengths of these two word are the same: "+lengthEq);
    }
}
