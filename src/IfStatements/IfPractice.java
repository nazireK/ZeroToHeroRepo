package IfStatements;

public class IfPractice {

    public static void main(String[] args) {

        int averageScore=75;

        if(averageScore>=70) {

            System.out.println("Student pass the classe. Average score is - " + averageScore);
        }else{
            System.out.println("Student could not pass the class. Avarage score is -"+averageScore);
        }

        //avarage score >=70 passed
        //average score <70  failed
        int savings=2000;
        boolean passport=true;
        boolean ticket=true;

        if(savings>=2000 && passport==true && ticket==true){

            System.out.println("I can go to the Mexico");
        }



    }
}
