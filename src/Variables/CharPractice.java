package Variables;

public class CharPractice {

    public static void main(String[] args) {

        char letters;
        letters='A';
        //java first converts letters to decimal number
        //then decimal numbers to binary system
        char number='7';
        int decimalNumber=letters; //java first converts to decimal number

        System.out.println(decimalNumber);

        int letterB=80;
        char ch=(char)letterB;    //java converts decimal numbers to char
        System.out.println(ch);
    }
}
