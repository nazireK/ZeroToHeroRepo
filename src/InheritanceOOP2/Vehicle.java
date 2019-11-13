package InheritanceOOP2;

public class Vehicle {
    String make;
    int year;



    public Vehicle(String make) {

      this.make = make;
    }

    public Vehicle(String make,int year){
        this(make);
        this.year=year;
    }

    public static void main(String[] args) {

        Vehicle v1=new Vehicle("Toyota");
        Vehicle v3=new Vehicle("Toyota", 2018);
    }
}
