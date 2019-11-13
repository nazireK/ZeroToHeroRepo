package Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        String[][] multiDi={{"aa","ab"},{"bb","ba"},{"ca","cc","cb"}};
        System.out.println(multiDi[0][0]);
        System.out.println(multiDi[0][1]);
        System.out.println(multiDi[1][0]);
        System.out.println(multiDi[1][1]);
        System.out.println(multiDi[2][0]);
        System.out.println(multiDi[2][1]);
        System.out.println(multiDi[2][2]);
        System.out.println("===========================================");

        for(String [] innerArray: multiDi){
            for(String letter: innerArray){
                System.out.println(letter);
            }
        }
    }
}
