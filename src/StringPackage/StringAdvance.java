package StringPackage;

import java.sql.PseudoColumnUsage;
import java.sql.SQLOutput;

public class StringAdvance {

    public static void main(String[] args) {
        //initialize the name
        String name="Muammer";
        //re-assign the name
        name="Arslan";

        String sName=name+" Ali";

        String tName="Arslan";

        System.out.println(name);
        System.out.println(sName);

        String computerName="Mac Pro";

        System.out.println(computerName+" 2019");
        computerName=computerName+" 2019";
        System.out.println(computerName);

        String schoolName= "Techtorial";
        //lenght()  will return number of the char in String.
        //result will be int
        System.out.println("String length will be "+schoolName.length());
        String fullName=schoolName+" Academy";
        System.out.println("Full name length is "+fullName.length());

        String userName="techtorial";

        int userNameLength=userName.length();

        System.out.println(userNameLength);

        System.out.println(userName.charAt(0));
        System.out.println(userName.charAt(3));
        System.out.println(userName.charAt(7));
        System.out.println(userName.charAt(9));
        System.out.println(userName.charAt(userName.length()-1));
     //if inn  the index there is not char, java will throw an exception
        //StringIndexOutOfBoundException
        //in java indexing starts from 0
        //if you want to find out last char from thje string, you have to find out the length of the string
        String user="fkdngknfdjgnfdkgnkfngnfgfdngndfgkfdkgfdgndfggnknd";
        System.out.println(user.charAt((user.length()-1)/2));


        String success="hustlings"; //there is two "s" and indexof will return only index of first matching letter
        System.out.println(success.indexOf("s",3));
        System.out.println(success.indexOf("s"));
        System.out.println(success.indexOf("in")); //it will only print the index of the firdt charachter
        System.out.println(success.indexOf("z")); //if in index there is no this z letter it will output -1


        String animal="Dragon Animal";
        //find the last char from the dragon
        //print the middle character
        //print the first character from the string
        //find the second matching index of n from the string
        //print the length of the string

        System.out.println("New Task");
        int animalLength=animal.length();
        System.out.println(animalLength);

        System.out.println(animal.charAt(animalLength-1));

        System.out.println(animal.charAt((animalLength-1)/2));

        System.out.println(animal.charAt(0));

        System.out.println(animal.indexOf("n",7));
        System.out.println(animal.indexOf("k"));
        System.out.println(animal.charAt(20));

    }
}
