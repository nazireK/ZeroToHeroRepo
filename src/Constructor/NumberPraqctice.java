package Constructor;

public class NumberPraqctice {

    public int multiply(int num){
        return num*10;
    }

    public double reminder(int value){
        return value%4;
    }

    public static void main(String[] args) {
        int appleNumber=10;
        NumberPraqctice apple=new NumberPraqctice();
        apple.multiply(appleNumber);
        System.out.println(appleNumber);//since method took the copy of the apple Number
        //Apple number value is not chnaging
        appleNumber=apple.multiply(appleNumber);
        System.out.println(appleNumber);

        System.out.println(apple.reminder(appleNumber));

    }
}
