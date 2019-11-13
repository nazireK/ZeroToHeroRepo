package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentional {

    public static void main(String[] args) {

        String[][] groupedNames={{"Adilet","Aimira","Arslan","Aitu","Akilay","Ayka"},{"Nazire","Yasemin","Vitaliy","Nargiza","Sasha"}};

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name : ");
        String name=input.next();

        for(int i=0;i<groupedNames.length; i++){
            for (int a=0; a<groupedNames[i].length; a++){
                Arrays.sort(groupedNames[i]);
                if (groupedNames[i][a].equalsIgnoreCase(name)){
                    System.out.println(Arrays.deepToString(groupedNames));
                    System.out.println("In array "+i+" In order "+a);
                }
            }
        }
    }
}
