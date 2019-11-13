package ForLoop;

public class IntNumber {

    public static void main(String[] args) {

        int number = 12345;
        //happy Numbers
        //armstrong numbers
        //number%10=5
        // 6%10=6
        // 15%10= 5
        for (int i = 0; i < 5; i++) {
            System.out.println(number % 10);// 5 2 1
            number = number / 10; //12 / 10 = 1/10 = 0

        }
    }
}
