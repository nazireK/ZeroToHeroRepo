package Arrays;

import java.util.Arrays;

public class ArrayReCap {

    public static void main(String[] args) {
        //binary search
        //if we don't find the the number or letter inside array it will output -1,
        // if the searching number is smaller than whatever we have in the array --> output -1
        //if the searching number is bigger than the array it will sort and add to
        // possible location depending pn its size

        int num []={1,15,13,12,55,66,89,100,44,77};

        for(int i=num.length-1;i>=0;i--) {
            Arrays.sort(num);
            System.out.print(num[i] + " ");
        }

        System.out.println("      ");


        int z=num.length-1;
        while (z>=0){
            System.out.print(num[z] + " ");
            z--;
        }

        System.out.println();
        int sum=0;
        for(int s:num){
            sum+=s;
        }
        System.out.println(sum);

        System.out.println();

        int a[]={3,0,0,6,7,0,0,6,5};
        int size=a.length;
        int b[]=new int [size];
        int j=0;


        for(int i=0; i<a.length;i++){
            if (a[i]!=0) {
                b[j]=a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
