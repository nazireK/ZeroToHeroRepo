package ArrayListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskStoreFruits {

    public static void main(String[] args) {

        ArrayList <String> fruitList=new ArrayList<>();
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter any 5 fruits: ");
        int count=5;
        for(int i=0;i<5;i++) {
            fruitList.add(input.nextLine());
            count--;
            if (count==0){
                break;
            }
            System.out.println("Add "+count+" times more fruits");
        }
        System.out.println(fruitList);

        for(int i=0;i<5;i++){
            fruitList.set(i, fruitList.get(i).toUpperCase());
        }
        System.out.println(fruitList);

        for(String startsWith:fruitList){
            if(startsWith.startsWith("B"));

            }
        }










}
