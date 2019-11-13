package Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int [] numbers=new int[5];
        numbers[0]=1;
        numbers[1]=5;
        numbers[2]=10;
        numbers[3]=15;
        numbers[4]=20;

        System.out.println(Arrays.toString(numbers));
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        System.out.println("==============================");

        int [] nums={100,300,44,9,3,31};

        for (int n:nums ){
            System.out.println(n);
        }
    }
}
