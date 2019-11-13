package ArrayListPractice;

import StaticPractice.Cat;

import java.util.ArrayList;

public class ManipulateString {

    String mainString;

    public ManipulateString(){

    }

    public ManipulateString(String mainString){
        this.mainString=mainString;
    }


    public int sumNumber() {
        int sum = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (Character.isDigit(mainString.charAt(i))) {
                String ch=String.valueOf(mainString.charAt(i));
                int num=Integer.parseInt(ch);
                sum+=num;
            }
        }
        return sum;
    }


    public ArrayList getLetterList(){
        ArrayList<Character>letterList=new ArrayList<>();

        for(int i=0;i<mainString.length();i++){
            if(Character.isAlphabetic(mainString.charAt(i))){
                letterList.add(mainString.charAt(i));
            }
        }
        return letterList;
    }
}
