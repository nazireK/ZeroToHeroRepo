package Arrays;

import java.util.Scanner;

public class FindElements {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the color that you like: ");
        String like=input.nextLine();

        String [] colors={"red","green", "blue", "black","orange"};
        int count=0;
        for(int i=0; i<colors.length;i++){
            if(colors[i].equals(like)){
                System.out.println(like+" color is in the array");
                break;
            }
            count++;
            if(count==colors.length){
                System.out.println("-1");

            }


            }
        }
    }

