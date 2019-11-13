package Arrays;

public class MultiDimensionalArrays2 {

    public static void main(String[] args) {

        int [][][] nums={{{5,6},{8}},{{1},{3,4,0}},{{22}}};

        System.out.println(nums[2][0][0]);
        System.out.println(nums[1][1][1]);
        System.out.println(nums[0][1][0]);

        System.out.println("============================");

        for (int [][] outer1: nums){
            for(int [] outer2: outer1){
                for(int inner:outer2){
                    System.out.println(inner);
                }
            }
        }

    }
}
