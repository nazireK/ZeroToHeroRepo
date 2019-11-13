package ForLoop;

public class FibonacciNumber {

    public static void main(String[] args) {

        int num1=0,num2=1,sum=0;

        System.out.print(num1+" "+num2);
        for(int i=1; i<8; i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;

            System.out.print(" "+sum);

        }

    }
}
