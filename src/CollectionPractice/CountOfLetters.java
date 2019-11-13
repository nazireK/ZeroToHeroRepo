package CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class CountOfLetters {

    public static void countLetters(String name){
        Map<Character,Integer> letters=new HashMap<>();
        name=name.toLowerCase();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(letters.containsKey(ch)){
               int count= letters.get(ch);
               letters.replace(ch,++count);
            }else{
                letters.put(ch,1);
            }
        }
        System.out.println(letters);
    }

    public static void main(String[] args) {
        CountOfLetters.countLetters("Muammer");

    }
}
