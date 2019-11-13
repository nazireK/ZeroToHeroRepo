package Constructor;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp=new Employee();

        Employee emp1=new Employee("Gulaiym",6);

        Employee emp2=new Employee("Gulaiym",6,26,8,"Chicago");
        System.out.println("Employee name is "+emp2.getName());
        System.out.println("Employment year is - "+emp2.getEmploymentYear());
        System.out.println("Employee's Age is "+emp2.getAge());
        System.out.println("Employee's working hours per day is  "+emp2.getWorkHour());
        System.out.println("Employment location is in "+emp2.getLocation());

        emp2.workingDays=280;
        System.out.println(emp2.getName()+"'s salary for two week is $"+emp2.calculateSalary());

        System.out.println(emp2.getName()+"'s yearly salary is $"+emp2.yearlySalary());

        System.out.println(emp2.getName()+"'s employment year is "+emp2.totalEmploymentYear());

        System.out.println(emp2.getName()+"'s yearly bonus amount is $"+emp2.bonusAmount(6,280));
    }
}
