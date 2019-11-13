package Arrays;

import java.util.Arrays;

public class TwoArrays {

    public static void main(String[] args) {

        int [] num1={2,3,5,10};
        int [] num2={5,1,-9};

        int [] result=new int[num1.length+num2.length];
        for(int i=0;i<num1.length;i++){
            result[i]=num1[i];
        }
        for(int i=0; i<num2.length;i++){
            result[i+num1.length]=num2[i];
        }
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        System.out.println(result[result.length-1]);
        System.out.println(result[0]);
    }
}
