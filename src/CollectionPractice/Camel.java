package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Camel {

    public static void printCamelName(Map <String, String >camel ) {

        Set<String> camelList = camel.keySet();

        for (String names : camelList) {
            if (names.startsWith("1")) {
                System.out.println(camel.get(names));
            }
        }
    }
    public static void main(String[] args) {

        Map<String,String> camel1=new HashMap<>();
        camel1. put("1234","aaa");
        camel1.put("22345","bbb");
        camel1.put("1236","ccc");
        camel1.put("2237","ddd");
        camel1.put("1237","eee");

      printCamelName(camel1);
        System.out.println(camel1.entrySet());
        //camel1.clear();--> this method will clear all the values and keys from the Map

        System.out.println(camel1.containsValue("aaa"));
        //it wil return true if the value is available inside the map

        System.out.println(camel1.containsKey("1234"));

        HashMap<String,String> camelList=new HashMap<>(camel1);
        System.out.println(camel1);

        System.out.println(camel1.equals(camelList));
        //this method compares object
         camelList.replace("342rfs","Camel5");
        System.out.println(camelList);
        camel1.put("gfu46477","Camel4");
        System.out.println(camel1);


    }
}
