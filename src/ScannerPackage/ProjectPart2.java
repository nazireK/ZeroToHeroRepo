package ScannerPackage;

import java.util.Scanner;

public class ProjectPart2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName=input.next();

        System.out.println("Please enter your City:  ");
        String city=input.next();

        System.out.println("Please enter your gender (F) or (M): ");
        String gender=input.next();

        System.out.println("Please enter your age: ");
        int age=input.nextInt();

        System.out.println("Please enter your state code: ");
        String stateCode=input.next();

        int ageToVote=18;
        boolean ageComp=age>=ageToVote;
        System.out.println("Age is -> "+ageComp);

        boolean firstLetter='A'==fullName.charAt(0);
        System.out.println("Full Name starts with 'A' -> "+firstLetter);

        boolean lastLetter='V'==fullName.charAt((fullName.length()-1));
        System.out.println("The last letter ends with 'V'-> "+lastLetter);

        boolean codeStarts='I'==stateCode.charAt(0);
        System.out.println("State code starts with 'I'-> "+codeStarts);

        boolean codeEnds='L'==stateCode.charAt(1);
        System.out.println("State code ends with'L' -> "+codeEnds);

        boolean cityLength=city.length()<10;
        System.out.println("The city length is not more then 10 -> "+cityLength);

        boolean genderM=gender!="M";
        System.out.println("Gender is not equals to 'M' ->"+genderM);

        boolean canVote=ageComp&&firstLetter&&genderM;
        System.out.println("I'm able to Vote? -> "+canVote);



    }
}
