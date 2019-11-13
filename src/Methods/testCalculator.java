package Methods;

public class testCalculator {

    public static void main(String[] args) {
        /*
        creating an object
        calculator-> class name
        c -> object name
        new calculator()-> creating an object
         */
        calculator c=new calculator();
        System.out.println(c.sum(5,11));
        System.out.println(c.subtract(12,5));
        System.out.println(c.multiply(18,5));
        System.out.println(c.division(16,2));
        System.out.println(c.reminder(-1,4));

        System.out.println(c.calculator(10,4,"%"));
    }

}
