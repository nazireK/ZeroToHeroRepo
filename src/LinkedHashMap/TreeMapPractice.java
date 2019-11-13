package LinkedHashMap;

import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {

        TreeMap<String,String> phoneList=new TreeMap<>();
        phoneList.put("Muammer","1234567890");
        phoneList.put("Gulaiym","987654321");
        phoneList.put("Sameer","12344728103764");

        System.out.println(phoneList);
        //it will look at the key and according values of key it will go ascending order.
    }
}
