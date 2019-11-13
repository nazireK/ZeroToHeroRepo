package LinkedHashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTablePractice {

    public static void main(String[] args) {

        Hashtable<Integer, Boolean>truthList=new Hashtable<>();

        truthList.put(123,true);
        truthList.put(345,false);
        truthList.put(678,true);
        truthList.put(678,false);//if we have same key it will replace to the new one, last one, it will update

        //HashTable is synchronized,--> can not store null key value, --> it is slowert than HashMap
        //truthList.put(null,null);--> we can not do this


        System.out.println(truthList);
    }
}
