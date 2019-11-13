package Variables;

public class ApplePriceCalculater {

    public static void main(String [] argas) {

        //appleprive in GFresh market is 1$
        int appleFreshMarket=12;
        //apple price in whole foods is 3$
        int appleWholeFood=7;

        //int totalAppleNumber=12+7;
        int totalAppleNumber=appleFreshMarket+appleWholeFood;

        System.out.println("My total apple number is "+totalAppleNumber);

        int freshMarketPayment=appleFreshMarket*1;

        int wholeFoodPayment=appleWholeFood*3;

        System.out.println("Total payment for fresh Market is "+freshMarketPayment);
        System.out.println("Total payment for whole foods is "+wholeFoodPayment);

        int totalPayment=freshMarketPayment+wholeFoodPayment;

        System.out.println("Total payment is "+totalPayment);
        System.out.println(freshMarketPayment+wholeFoodPayment);
        System.out.println("20 "+"39");
        System.out.println("20 "+wholeFoodPayment);

        //decimal number for|
        int A='A';

        System.out.println(A);
        //20 39

        //max and min number

        //declaring the variables where we are giving data type(int)
        //and giving the name for variables
        int studentNumber;

        //initialize the variables is giving value for variables
        studentNumber=25;

        //you can start the variables with underscore and $ signor letter
        //you can not start with numbers but, you can end with numbers
        //youi can end with $ and start
        int dataYear1=1998;


        //you can not use reserved value, everything that you see in blue is a reserved value data
          int _public=2001;

          int maxNumber=Integer.MAX_VALUE;

          System.out.println(maxNumber);




    }
}
