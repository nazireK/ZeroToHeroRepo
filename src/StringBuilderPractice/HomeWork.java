package StringBuilderPractice;

public class HomeWork {
    //Homework: Create one method, it will take the string as a
    // parameter and it will return the  Wrapper integer value from the string

       public void wrapperInt(String str){

           String numbersOnly="";
           for (int i = 0; i < str.length(); i++) {
               char chrs = str.charAt(i);
               if (Character.isDigit(chrs))
                   numbersOnly = numbersOnly+chrs;
           }
           int valueInt=Integer.parseInt(numbersOnly);
           System.out.println(numbersOnly);
       }

       public Integer getIntValue(String str){
// This method will take the String as a parameter.if the string has int value,
// it take that the int values and will store as a Integer object and the
// method will return the Integer object.
           String numbersOnly="";
           for(int i=0;i<str.length();i++){
               char ch = str.charAt(i);
               if (Character.isDigit(str.charAt(i))){
                   numbersOnly = numbersOnly+ch;
           }}
           Integer valueInt=Integer.valueOf(numbersOnly);
           return valueInt;
       }

    public static void main(String[] args) {
           HomeWork hw=new HomeWork();

       // hw.wrapperInt("sdfvsdf68fsdfsf8999fsdf09");

        System.out.println(hw.getIntValue("09/05/2019-Tech13a"));
        System.out.println(hw.getIntValue("74b-DevTeam205s"));

    }
}
