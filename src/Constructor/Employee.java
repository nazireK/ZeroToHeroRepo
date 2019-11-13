package Constructor;

public class Employee {
    private String name;
    private int employmentYear;
    private int age;
    private int workHour;
    private String location;
    int workingDays;


    public Employee() {

    }

    public Employee(String name, int employmentYear) {
        this.name = name;
        this.employmentYear = employmentYear;
    }

    public Employee(String name, int employmentYear,int age, int workHour,String location){
        this.name=name;
        this.employmentYear=employmentYear;
        this.age=age;
        this.workHour=workHour;
        this.location=location;
    }

    public int calculateSalary(){
        int salary2W=workHour*55*10;
        return salary2W;
    }

    public double yearlySalary(){
        double yearlySalary=workHour*55*workingDays;
        return yearlySalary;
    }

    public int totalEmploymentYear(){
        return employmentYear;
    }

    public double bonusAmount(int employmentYear,int workingDays){
        double bonusAmount=1;
        if(employmentYear>5 && workingDays>240){
            return bonusAmount*(yearlySalary()*15/100);
        }else if(employmentYear<5 && workingDays>240) {
        }
            return bonusAmount*(yearlySalary()*10/100);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getEmploymentYear(){
        return employmentYear;
    }

    public void setEmploymentYear(int employmentYear){
        this.employmentYear=employmentYear;
    }

    public int getAge(){
        return  age;
    }

    public void setAge(){
        this.age=age;
    }

    public int getWorkHour(){
        return workHour;
    }
    public void setWorkHour(int i){
        this.workHour=workHour;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(){
        this.location=location;
    }

}


