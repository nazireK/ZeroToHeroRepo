package Variables;

public class HomworkSalaryTax {

    public static void main(String[] args) {

        //price for one hour-- 60$
        //working days per week --5 days
        //working days in one year--261days
        //calculate annual salary of the person
        //state tax is --8%
        //federal tax is --11%
        //calculate total tax amount

        int salaryHourly=60;
        int workingHourDaily=8;
        int salaryDaily=salaryHourly*workingHourDaily;
        int salaryAnnual=salaryDaily*261;

        System.out.println("Muammer's annual salary is $"+salaryAnnual);

        double stateTax=salaryAnnual*8/100d;
        double federalTax=salaryAnnual*11/100d;

        System.out.println("Muammer's payment for State Tax to is $ "+stateTax);
        System.out.println("Muammer's payment for Federal Tax is $"+federalTax);

        double totalTax=stateTax+federalTax;
        System.out.println("Total taxes to be paid to IRS is $"+totalTax);

    }

}

