package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {


    public static void main(String[] args) {

        LinkedHashMap<Integer, String> studentList = new LinkedHashMap<>();
        studentList.put(1,"Muammer");
        studentList.put(2,"David");
        studentList.put(3, "John");

        System.out.println(studentList);// it will follow insertion order

    }
}