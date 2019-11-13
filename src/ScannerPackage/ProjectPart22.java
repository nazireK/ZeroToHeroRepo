package ScannerPackage;

import java.util.Scanner;

public class ProjectPart22 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter random word: ");
        String word=input.next();

        System.out.println("Please enter length of word: ");
        int length=input.nextInt();
        boolean trueOrFalse=length==length;
        System.out.println("You entered right number of letters -> "+trueOrFalse);

        System.out.println("Please enter a letter you want index of:  ");
        String index=input.next();
        System.out.println("Index of entered letter is: "+word.indexOf(index));

    }
}
