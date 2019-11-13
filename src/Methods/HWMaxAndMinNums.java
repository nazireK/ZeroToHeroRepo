package Methods;

import java.util.Arrays;

public class HWMaxAndMinNums {
   // Write a public and non-static method that will
    // accept arrays of Integer as a parameter and will return array
    // of integers size of 3 which will have max Number, min Number, and average number.

    public int [] maxAndMin(int [] sorted) {
        int [] result=new int [3];
        Arrays.sort(sorted);
        result[0]=sorted[0];
        result[1]=sorted[sorted.length-1];
        int sum=0;
        for(int i=0;i<sorted.length;i++) {
            sum = sum + sorted[i];
        }
        int average=sum/sorted.length;
        result[2]=average;
        System.out.println();
 return result;
    }
}
