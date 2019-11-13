package Constructor;

import java.util.concurrent.Callable;

public class Company {
    String name;
    String location;
    String area;
    int employeeNumber;
    int budget;

    //this is constractor
    //you can not create same constructor again.

    public Company(){

    }
    public Company(String name1, String location1,String area1){
        this.name=name1;
        this.location=location1;
        this.area=area1;

    }
    public Company(String name2, String location2,String area2,int employeeNumber2, int budget2){
        this(name2,location2,area2);
        this.employeeNumber=employeeNumber2;
        this.budget=budget2;
    }

    public void displayCompany(){
        System.out.println("Company name is - "+name);
        System.out.println("Company location - "+location);
        System.out.println("Company area - "+area);
        System.out.println("Employee numbers - "+employeeNumber);
        System.out.println("Budget is - "+budget);
    }

    public static void main(String[] args) {
        Company company=new Company();

        Company company1=new Company("Zara","Schaumburg","Retail");
        System.out.println(company1.name);
        System.out.println(company1.location);
        company1.employeeNumber=50;
        System.out.println(company1.employeeNumber);

        Company company2=new Company("Chase", "Chicago","Finance",400, 20000);

        company2.displayCompany();
        }


    }

