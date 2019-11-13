package StringPackage;


public class MethodChaining {

    public static void main(String[] args) {

        String city="Des Plains";

        System.out.println(city.substring(4).toUpperCase().replace('P','T').trim().toLowerCase().length());
         ///after following method we can do method chaining:
        //substring, touppercase, tolowercase, trim; -->this method is returnuing String tajts why we can use chaining

        //After following method we can Not do method chaining:
        //lenght,CharAt,indexOf,contains,equals,equalsIgnoreCase,startWith,endWith;--> this method doesnt return String so we can chaining with it








    }


}

