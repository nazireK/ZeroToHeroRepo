package ScannerPackage;

import java.util.Scanner;

public class ExamResult {

    public static void main(String[] args) {

        //you need to enter three different exam result 70,45,90
        //If avarage is equals to 70 or more than 70
        //student should attend all the classes
        //student should complete at least 6 assignment
        //if all three parametrs are correct the student will pass the exam
        //Student is able to go to next semester or not

        Scanner input=new Scanner(System.in);

        System.out.println("Input first exam result: ");
        int firstResult = input.nextInt();

        System.out.println("Input second exam result: ");
        int secondResult = input.nextInt();

        System.out.println("Input third exam result: ");
        int thirdResult= input.nextInt();

        int  averageResult =(firstResult+secondResult+thirdResult)/3 ;
        boolean examResult = averageResult>=70;
        System.out.println("The average Result of Exam is: "+examResult);

        System.out.println("Did student attanded all classes? ");
        boolean trueOrFalse=input.nextBoolean();

        System.out.println("How many classes did student attend? ");
        int complitedAssignment=input.nextInt();

        boolean passExam=averageResult>=70 && trueOrFalse==true && complitedAssignment>=6 ;
        System.out.println("is student will pass the exam and attend to the next semester? "+passExam);





    }
}
