package CarInventoryProject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarInventory {

    private String dealerName;

    public CarInventory(String dealerName) {

    }

    public void getCarName(ArrayList<Car> carList) {
        for (Car c : carList) {
            System.out.println(c.getName());
        }
    }

    public void getCarVinNumber(ArrayList<Car> carList) {

        for (Car c : carList) {
            System.out.println(c.getVinNumber());
        }

    }

    public void getCarPrice(ArrayList<Car> carList) {

        for (Car c : carList) {
            System.out.println(c.getPrice());
        }

    }

    public void getCarYear(ArrayList<Car> carList) {

        for (Car c : carList) {
            System.out.println(c.getYear());
        }

    }

    public void setModelYear(ArrayList<Car> carList,String vinNumber,int year){
        for(int i=0; i<carList.size();i++){
            if(carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)){
                carList.get(i).setYear(year);
            }
        }
    }

    public void setModelPrice(ArrayList<Car> carList,String vinNumber,int price){
        for(int i=0; i<carList.size();i++){
            if(carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)){
                carList.get(i).setPrice(price);
            }
        }
    }

    public void addNewCar(ArrayList <Car> carList, Car newCar){
        boolean hasCar=false;
        for(Car c:carList){
            if(c.getVinNumber().equalsIgnoreCase(newCar.getVinNumber())){
                System.out.println("The car is already in the inventory");
                hasCar=true;
            }
        }
        if(!hasCar){
            carList.add(newCar);
            System.out.println("The new car added to your inventory");
            System.out.println(newCar.getName());
        }
    }

    public void removeCar(ArrayList <Car> carList,String vinNumber){
        for(int i=0; i<carList.size();i++) {
            if (carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)) {
                carList.remove(i);
            }
        }
    }



    public static void main(String[] args) {

        Car car1 = new Car("Lexus", "Gx570", 2019, 90000, "341DG52F89");
        Car car2 = new Car("Lexus", "Gx460", 2011, 30000, "1JK532O26L");
        Car car3 = new Car("Honda", "Civic", 2012, 20000, "95EQ97KK01");
        Car car4 = new Car("Toyota", "Camry", 2017, 25000, "01K2LP558L");
        Car car5 = new Car("BMW", "X5", 2009, 18000, "83LP507P66");
        Car car6 = new Car("Ford", "Mustang", 2003, 10000, "2GT948V839");
        Car car7 = new Car("Mercedes", "S Class", 2005, 15000, "9M77PP1401");
        Car car8 = new Car("Toyota", "Avalon", 2015, 9000, "36NN3PP840");
        Car car9 = new Car("Mercedes", "Gwagon", 2007, 50000, "7C67BA995L");
        Car car10 = new Car("Audi", "A6", 2016, 17000, "8A9K88L932");
        Car car11= new Car("Audi", "A6", 2016, 17000, "8A9K88L932");


        CarInventory dealer=new CarInventory("AutoNation");
        ArrayList <Car> carList=new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car5);


        dealer.getCarName(carList);
        dealer.getCarVinNumber(carList);
        dealer.getCarPrice(carList);
        dealer.setModelYear(carList,"341DG52F89",2015);
        dealer.getCarYear(carList);
        dealer.setModelPrice(carList,"83LP507P66",10000);
        dealer.getCarPrice(carList);
        dealer.addNewCar(carList,car1);
        dealer.addNewCar(carList,car3);
        dealer.removeCar(carList,"341DG52F89");
        dealer.getCarName(carList);
    }
}
