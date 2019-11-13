package Methods;

import java.util.Scanner;

public class TechtorialClass {

    public static void main(String[] args) {

        ArrayMethods arrayM=new ArrayMethods();

        for(int i=0; i<arrayM.students.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Whast is your name?: ");
            arrayM.studentName = input.next();
            arrayM.addStudent();
        }
        arrayM.printNames();
    }
}
