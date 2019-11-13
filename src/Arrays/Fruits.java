package Arrays;

public class Fruits {

    public static void main(String[] args) {

        String[] fruits = {"banana", "apple", "orange"};
        String[] fruits2 = {"carrot", "tomato", "apple", "potato"};

        for (int i = 0; i < fruits.length; i++) {
            boolean found=false;
            for (int j = 0; j < fruits2.length; j++) {
                if (fruits[i] == fruits2[j]) {
                    System.out.println(fruits[i]+ " is in the array!");
                    found=true;
                }
            }
            if(found==false){
                System.out.println(fruits[i]+" is NOT in the Array!");
            }
        }
    }}