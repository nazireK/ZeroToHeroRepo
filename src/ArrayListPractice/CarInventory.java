package ArrayListPractice;

import Arrays.ArrayToString;

import java.util.ArrayList;
import java.util.Scanner;

public class CarInventory {

    public static void main(String[] args) {

        Car car1 = new Car("Lexus", "Gx570", 2019, 90000, 3341528976822598L);
        Car car2 = new Car("Lexus", "Gx460", 2011, 30000, 6195655940532126L);
        Car car3 = new Car("Honda", "Civic", 2012, 20000, 9597290126273601L);
        Car car4 = new Car("Toyota", "Camry", 2017, 25000, 6171840131267558L);
        Car car5 = new Car("BMW", "X5", 2009, 18000, 8373912409350876L);
        Car car6 = new Car("Ford", "Mustang", 2003, 10000, 2177636909694883L);
        Car car7 = new Car("Mercedes", "S Class", 2005, 15000, 9877384200755140L);
        Car car8 = new Car("Toyota", "Avalon", 2015, 9000, 3063788747124984L);
        Car car9 = new Car("Mercedes", "Gwagon", 2007, 50000, 7867844963095995L);
        Car car10 = new Car("Audi", "A6", 2016, 17000, 8993288703173338L);


        ArrayList<Car> carList = new ArrayList();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);

        for (int i = 0; i < carList.size(); i++) {
            carList.get(i);
            System.out.println(carList.get(i).name);
            System.out.println(carList.get(i).price);
            System.out.println(carList.get(i).vinNumber);


        }




            }




}