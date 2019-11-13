package StringPackage;

public class StringSub {

    public static void main(String[] args) {

        String patientInfo="45 - Walnut - Jessica";
        System.out.println(patientInfo.substring(5));
        System.out.println(patientInfo.substring(5,11));
        //if we will use (5,5) it will print out empty
        // if we will use (5,4) it will be run time error, throw an exception
        //if we use (5,24) it will trow an excpetion.
        //if we do (5,21)it will print Walnut - Jessica

        System.out.println(patientInfo.length());
        //length is 21
        //last index number ias 20



    }


}
