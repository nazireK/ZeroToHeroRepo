package StringPackage;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        String succsess="dotentimesmore";

        succsess=succsess.replace('d','D');
        System.out.println(succsess);

        succsess=succsess.replace("ten","eleven");
        System.out.println(succsess);

        succsess=succsess.replace('m','M');
        System.out.println(succsess);

        //success.replace ('X), 'M");
        //it will search for the string to find old char or old string
        //if its not able to find , it will not change

        String achievement=" do ten times more";
        achievement=achievement.trim();
        System.out.println(achievement);

        System.out.println("-----------------New task-----------------");

        Scanner input=new Scanner(System.in);
        System.out.println("Print enter some value: ");
        String value=input.nextLine();

        value=value.trim();
        System.out.println(value.trim());

        System.out.println(value.substring(value.indexOf("H")));

        System.out.println(value.replace("Zero","One"));

        System.out.println(value.toUpperCase());

        boolean result=value.equalsIgnoreCase("Zero to hero");
        System.out.println(result);


    }



}
