package ArrayListPractice;

import java.util.Random;
import java.util.Scanner;

public class Car {
    String name;
    String model;
    int year;
    int price;
    long vinNumber;

    public Car() {
    }

    public Car(String name){
        this.name=name;
        }

        public Car(String name,String model, int year, int price, long vinNumber){
        this(name);
        this.model=model;
        this.year=year;
        this.price=price;
        this.vinNumber=vinNumber;
        }


}
