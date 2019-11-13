package Variables;

public class Coins {

    public static void main(String [] args){

        int cent=99;
        int quaters=99/25;

        int centRemainder=99%25; //24
        int dimes=centRemainder/10;
        int dimesRemainder=centRemainder%10;
        int nickels=dimesRemainder/5 ;
        int nickelsRemainder=dimesRemainder%5;
        int pennies=nickelsRemainder/1;


        System.out.println("Quarter is "+quaters);
        System.out.println("Dimes is "+dimes);
        System.out.println("Nickels is "+nickels );
        System.out.println("Pennies is "+pennies);

        System.out.println(quaters);

         }

    }


