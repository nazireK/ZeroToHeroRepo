package ForLoop;

public class HWCatsMeal {

    public static void main(String[] args) {

        int numbers=0;
        double totalMeal=50;

        for(double i=1.5; i<50 ; i++){
            numbers++;
            totalMeal-=1.5;
            System.out.println(numbers+" - "+totalMeal);
        }}}