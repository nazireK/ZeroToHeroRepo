package Constructor;

public class Computer {

   private String name;
   private String operatingSystem;
   private String brand;
   private String model;
   private int year;
   int memory;
   private int inch;

    public Computer(){

    }
    public Computer(String name, String operatingSystem, String brand, String model){
        this.name=name;
        this.operatingSystem=operatingSystem;
        this.brand=brand;
        this.model=model;
    }
    public Computer(int year, int memory,int inch){
        this.year=year;
        this.memory=memory;
        this.inch=inch;
    }
    public Computer(String name,String operatingSystem, String brand, String model, int year, int memory, int inch){
        //to be able to call the constructor inside another constructor, we are using this keyboard,
        //it must be in first line.
        this(name,operatingSystem,brand,model);
        this.year=year;
        this.memory=memory;
        this.inch=inch;
    }

    public String getName(){
        return name;
    }
    public String getOperatingSystem(){

        return operatingSystem;
    }
    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public  void setYear(){
        this.year=year;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem=operatingSystem;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setModel(String model){
        this.model=model;
    }
}
