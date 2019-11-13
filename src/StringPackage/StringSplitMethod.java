package StringPackage;

import java.util.Arrays;

public class StringSplitMethod{

    public static void main(String[] args) {

        String schoolName="Techtorial Academy 2019 September April";
        String [] words= schoolName.split( " ");
        System.out.println(Arrays.toString(words));

        //first word is string, second name is your array
        for(String word: words){
            if(word.startsWith("A")){
                System.out.println(word);
            }
        }

        String date="09/16/2019";
        String [] dates=date.split( "/");
        System.out.println(dates[0]);
        System.out.println(dates[1]);
        System.out.println(dates[2]);

        for(String dd: dates){
            if(dd.startsWith("2")){
                System.out.println(dd);
            }
        }
        String datedate="09.16.2019";
        String [] datesdates=date.split( "\\.");
        System.out.println(Arrays.toString(datesdates));
        System.out.println(dates[0]);
        System.out.println(dates[1]);
        System.out.println(dates[2]);
        //to split with dot . we have to write "\\."
        System.out.println(datedate.replace("1","")); //it will remove number 1`
    }
}
