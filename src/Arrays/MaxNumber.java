package Arrays;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        int [] numbers={3,6,101,2,56,0};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length/2]);

    }
}
