package SwitchStatement;

import java.util.Scanner;

public class WeekDay {

    public static void main(String[] args) {

        int number=6;
        //1-5 weekdasys
        //6,7 weekends

        switch (number){
            case 1: case 2: case 3: case 4: case 5: //we also can use in this way
                System.out.println("Weekdays");
                break;

            case 6: case 7:
                System.out.println("Weekends");
                break;
        }
    }
}
