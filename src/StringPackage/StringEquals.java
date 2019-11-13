package StringPackage;

public class StringEquals {

    public static void main(String[] args) {

        String company="TransUnion";
        System.out.println(company.equals("Trans"));
        //for primitive data types we are using logical operators:
        //==, >=, <=,!=
        //in String to be able to compare values we are using
        //startWith,endWith, equals, contains

        System.out.println(company.equalsIgnoreCase("tRansUnion"));
    }
}
