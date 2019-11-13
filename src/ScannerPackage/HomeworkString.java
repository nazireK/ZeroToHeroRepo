package ScannerPackage;

import java.util.Scanner;

public class HomeworkString {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       System.out.println("Please enter 2 bank names and 1 website name: ");//Chase,BankofAmerca,Cghase
        String names=input.nextLine();

        System.out.println("1. The first Character of these tree String is --> "+names.charAt(0));
        System.out.println("2. The last Character of these three String is --> "+names.charAt((names.length()-1)));
        System.out.println("3. The middle Character of these three String is --> "+names.charAt((names.length()-1)/2 ));
        System.out.println("4. The Length of these three String is --> "+names.length());
        System.out.println("5. The 4th Character of these String is --> "+names.charAt(3));
        System.out.println("6. The index of K from this String is --> "+names.indexOf("k"));
        System.out.println("7. The above String in Upper Case --> "+names.toUpperCase());


        System.out.println("Please enter three bank names: ");//Chase, Chase, Chase
        String name2=input.nextLine();

        System.out.println("1. The first Character of these tree String is --> "+name2.charAt(0));
        System.out.println("2. The last Character of these three String is --> "+name2.charAt((name2.length()-1)));
        System.out.println("3. The middle Character of these three String is --> "+name2.charAt((name2.length()-1)/2 ));
        System.out.println("4. The Length of these three String is --> "+name2.length());
        System.out.println("5. The 4th Character of these String is --> "+name2.charAt(3));
        System.out.println("6. The index of K from this String is --> "+name2.indexOf("k"));
        System.out.println("7. The above String in Upper Case --> "+name2.toUpperCase());
    }
}
