package ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFirstClass {

    public static void main(String[] args) {

        ArrayList list=new ArrayList(); //we can store every object here
        ArrayList list1=new ArrayList(10);
        ArrayList list2=new ArrayList(list1);
        ArrayList <Integer> list3=new ArrayList<>(); // we can store only specific object
        ArrayList <String> list4=new ArrayList<String>();

        List list5=new ArrayList(); //Instantiating the object
        //List is an interface. You can not instantiate the interface.



    }
}
