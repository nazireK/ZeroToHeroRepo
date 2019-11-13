package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        List<String> birdsList=new ArrayList<>();
        birdsList.add("Owl");
        birdsList.add("Parrot");
        birdsList.add("Penguin");

        birdsList.toArray();//toArray converts arraylidt to array
        Object [] listOfBirds=birdsList.toArray();
        //return type of this array is object. so thats why we are using object

        List<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(11);
        number.add(55);

        number.toArray();
        Object [] numList=number.toArray();
        //if you are converting from ArrayList toArray method
        //you can only store as a object of the array
        //toArray method will return the object


        //==========================================================================//

        String [] city = {"Chicago","New York","San Francisco"};
        System.out.println(city.length);

        List<String> cityNames= Arrays.asList(city);
        System.out.println(cityNames.size());
        //cityNames.add("Los Angeles");
        //System.out.println(cityNames.size());
        //ArrayList is not fixed size.However, if you convert from Array to arrayList
        //size will be fixed.

        List<String>cityNames1=new ArrayList<>(cityNames);
        System.out.println(cityNames1.get(0));
        cityNames1.add("Los Angeles");
        System.out.println(cityNames1);
        //just assigning to new name to array list youy can add new names

       //1
        System.out.println(cityNames1.toString().toUpperCase());
//1
        for(String c:cityNames1){
            System.out.println(c.toUpperCase());
        }
//3
        for(int i=0;i<cityNames1.size();i++){
            cityNames1.set(i,cityNames1.get(i).toUpperCase());
        }
        System.out.println(cityNames1);


    }
}
