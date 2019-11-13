package ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

    public static void main(String[] args) {

        ArrayList <String> nameList=new ArrayList<>();
        nameList.add("Adam");
        System.out.println(nameList);
        nameList.add("John");
        nameList.add("Steve");
        System.out.println(nameList);
        nameList.add(1,"David");
        //if you try to add the value to your arrayList when your
        // ArrayList size is less than index number it will through an exeption.
        System.out.println(nameList);

        nameList.remove("John");
        //if the given value is not matching with ArrayList element
        //it will not remove anything.Also it will not through an exception
        nameList.remove(1);
        //nameList.remove(6); it will thrigh an exception. given index is OutofBound
        System.out.println(nameList);
        //if given Value is not in the ArrayList it will not through an exception, and will not remove anything
        //if given index is more than the length of the ArrayList, it will trow an exception.

        List items=new ArrayList();
        items.add("Banana");
        items.add(1,"Orange");
        System.out.println(items);
        System.out.println(items.get(0)); //it will get an index from ArrayList

        ArrayList <Integer> prices=new ArrayList<>();
        prices.add(1);
        prices.add(2);
        prices.add(3);
         //int values is automaticlly converted to the Integer Object. It is called autoboxing
        prices.remove(1);
        //since it is index number . it will remove the 2 from our ArrayList
        System.out.println(prices);

        prices.set(1,5); //set method will replace the value
        System.out.println(prices);

        System.out.println(prices.isEmpty());
        //since prices in ArrayList is not empty. isEmpty method will return false.

        System.out.println(prices.size()); //it is the same as name.length






    }
}
