package Arrays;

public class WordLength {

    public static void main(String[] args) {

        String [] names={"Eric","john","Patel", "Harsh", "Sarah","Lilly","Nina"};
        for(int i=0; i<names.length;i++){
            if (names[i].length()==4){
            System.out.println(names[i]);
        }



    }
        System.out.println("---------");
        for(String n:names){
            System.out.println(n);
        }
}}
