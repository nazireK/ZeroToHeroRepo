package Arrays;

import java.util.Scanner;

public class ScoreBoard {

    public static void main(String[] args) {

        char[] teams = {'A', 'B', 'C'};

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter score for team A:");
        int scoreA = input.nextInt();
        System.out.println("Please enter score for team B:");
        int scoreB = input.nextInt();
        System.out.println("Please enter score for team C:");
        int scoreC = input.nextInt();

        for(char t:teams){
            if(t=='A'){
                String stars="";
                for(int i=0;i<scoreA;i++){
                    stars=stars+"*";
                }
                System.out.println(t+" "+stars);

            }else if(t=='B'){
                String stars="";
                for(int i=0; i<scoreB; i++){
                    stars=stars+"*";
                }
                System.out.println(t+" "+stars);
            }else if(t=='C'){
                String stars="";
                for(int i=0; i<scoreC; i++){
                    stars=stars+"*";
            }
                System.out.println(t+ " "+stars);

//home work : Print **** A if given score is negative number
    }}}}
