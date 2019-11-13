package DoWhileLoop;

public class EvenOddNumbers {

    public static void main(String[] args) {


        int num = 14;
        int even = 14 % 2;

        if (even == 0) {
            System.out.println(num + " - it is an even number");

        } else {

            System.out.println(num + " - it is an odd number");
        }

        int num1=10;
        int num2=15;

        while(num1<=num2){
            if(num1%2==1){
                System.out.println(num1);
            }
            num1++;

            System.out.println("=========================================");

            int number1=10;
            int number2=100;

            while(number1<=number2){
                if(number1%15==0){
                System.out.println(number1);

            }
            number1++;
        }
    }
}}