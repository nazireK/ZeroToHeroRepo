package CollectionPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {

        Map mapList=new HashMap();
        Map <Integer, String>employeeList=new HashMap<>();//we only store objects
        employeeList.put(1234,"Muammer");
        employeeList.put(1456,"David");
        employeeList.put(3456, "Kushal");
        employeeList.put(7776, "Priyanka");
        employeeList.put(7776,"Sameer");
        //i can store same values but key should be unique values
        //if you provide same key with different value for the key

        HashMap<Integer, String> ticketMasteremp=new HashMap<>();
        ticketMasteremp.putAll(employeeList);
        //get Method will get the jey as a paramether vaklue, and it will
        //return the value. ex at the bottom will store
        String empName=ticketMasteremp.get(1234);
        System.out.println(empName);
        System.out.println(ticketMasteremp);
        ticketMasteremp.remove(1234);
        System.out.println(ticketMasteremp);

        //Method called keySet();, oit will return set of all keys from Map
        ticketMasteremp.keySet();


        Set<Integer> empIds=ticketMasteremp.keySet();
        for(Integer id:empIds){
            System.out.println("ID's of the employee is "+id);
        }




    }
}
