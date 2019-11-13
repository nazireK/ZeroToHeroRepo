package ForLoop;

import java.util.Scanner;

public class HWSPrintYears {

    public static void main(String[] args) {

        //TASK 1
       Scanner input=new Scanner(System.in);
        System.out.println("Please enter number of years: ");
        int years=input.nextInt();
        int weeks;
        int sprintN;

        for(int i=years; i<=years; i++){
            weeks=i*365/7;
            sprintN=weeks/2;
            System.out.println("Total numbers of sprint in "+years+" - years is --> "+sprintN);
        }

        //TASK 2






    }
}
