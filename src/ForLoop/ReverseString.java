package ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        String name="Gulaiym";
        String reverse="";
        String polindrom="mom";
        String reverseP="";

//        for(int i=name.length()-1;i>=0;i--){
//            reverse=reverse+name.charAt(i);
//
//        }
//        System.out.println(name);
//        System.out.print(reverse);
//
//        ////Palindrom words

        for(int i=polindrom.length()-1;i>=0;i--){
         reverseP=reverseP+polindrom.charAt(i);
        }
        System.out.println(reverseP);
        if(reverseP.equals(polindrom)){
            System.out.println(reverseP+"- It is palindrome word");
        }else{
            System.out.println(reverseP+"- It is not palindrome");
        }

    }

}
