package SwitchStatement;

public class PracticeFinal {

    public static void main(String[] args) {

        char ch='a';
        final char chr='h'; //it makes value as a constant

        switch (ch){

            case 'a':
                System.out.println("The value is apple");
                break;

            case 'b':
                System.out.println("The value is blackberry");
                break;

            case chr:
                System.out.println("The value is HR");
                break;
                //in case statement values should be constant(not changing)
                //in java if you want to make one value as a  constant
                //we use final word
                //default is not required ,we can use default in the begining or at the end or in the middle
            //break statement is optional, However it will not effect the execution of code

        }
    }
}
