package ArrayListPractice;

import java.util.ArrayList;

public class ManipulateStringTast {

    public static void main(String[] args) {
         ManipulateString str=new ManipulateString("M456TH098");
        int sumNumber=str.sumNumber();
        System.out.println(sumNumber);
        ArrayList<Character>letterList=str.getLetterList();
        System.out.println(letterList);
        //isDigit and isAlphabetic
    }
}
