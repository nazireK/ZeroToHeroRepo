package Variables;

public class ProjectQuestion {

    public static void main(String[] args) {

        double year, day;
        year = 365.0 * 24 * 60;
        day = 24.0 * 60;

        System.out.println("1 year         is " + year + " Minutes");
        System.out.println("1 day         is " + day + " Minutes");

        System.out.println("1 min           is " + 1 / year + " year and 1  min is  " + (1 / day) + "    day");
        System.out.println("100  min        is " + 1 / year + " year and 1  min is  " + (100 / day) + "    day");
        System.out.println("1000 min        is " + 1 / year + " year and 1  min is  " + (1000 / day) + "    day");
        System.out.println("11111 min        is " + 1 / year + " year and  1  min is  " + (11111 / day) + "    day");
        System.out.println("999999000000.0  min        is " + 1 / year + " year and    1   min is  " + (999999000000.0 / day) + "    day");
        System.out.println("1 min  is " + 1 / year + " year and  1 min is  " + (1 / day) + "    day");


    }

}

