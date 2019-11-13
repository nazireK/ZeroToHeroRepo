package Arrays;

import java.util.Arrays;

public class HWArrays {

    public static void main(String[] args) {
//Task 1
//        int nums[]={1,2,3,5,11,9,7,0,0};
//        for(int i=nums.length-1;i>=0;i--){
//            System.out.print(nums[i]+", ");
//        }

//        //Task 2
//        int numbers[]={1,2,3,5,11,9,0};
//        int sum=0;
//        for(int i=0;i<numbers.length;i++){
//            sum=sum+numbers[i];
//        }
//        System.out.println("The sum of numbers in Array is: "+sum);

        //TASK 3
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {7, 1, 5, 3, 4, 9};
        int[] nums3 = {1, 2};
        int count = 0;
//1
        boolean result=false;
        label: for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 1) {
                for(int j=0; j<nums1.length;j++){
                    if(nums1[j]==2){
                        result=true;
                        break label;
                    }
                }

            }

        }
        System.out.println(result);


//        //2
        boolean result2=false;
        stop:for (int i=0; i<nums2.length ;i++) {
            if (nums2[i] == 1) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums2[i] == 2) {
                        result2 = true;
                        break stop;
                    }
                }
            }
        }
        System.out.println(result2);
//
//
////        //3
        boolean result3=false;
        star:for (int i=0;i<nums3.length;i++){
            if(nums3[i]==1){
                for(int j=0;j<nums3.length;j++){
                    if(nums3[j]==2){
                        result3=true;
                        break star;
                    }
                }
            }
        }
        System.out.println(result3);

        System.out.println("===============================");

        int[][] numbers = {
                            {1, 2, 3, 4, 8, 0},
                            {7, 1, 5, 3, 4, 9}
                          };
        int [][] sNumbers={
                {3, 5, 6, 8, 0, 1},
                {7, 8, 1, 0, 2, 6}
        };

        System.out.println("first arrays:");
        for (int i=0;i<numbers.length;i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "  ");
            }

        }
        System.out.println();
        System.out.println("second arrays:");
        for (int j=0;j<sNumbers.length;j++) {
            for (int i = 0; i < sNumbers[j].length; i++) {
                System.out.print(sNumbers[j][i] + "  ");
            }
        }
        System.out.println();

        int [][] sumOfNums=new int[2][6];
        System.out.println("sum of numbers in the array: ");
        for (int i=0;i<sumOfNums.length;i++){
            for(int j=0;j<sumOfNums[i].length;j++){
                sumOfNums[i][j]=numbers[i][j]+sNumbers[i][j];
                System.out.print(sumOfNums[i][j]+"  ");
            }

        }




    }}

