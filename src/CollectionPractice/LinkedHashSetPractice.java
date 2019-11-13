package CollectionPractice;

import Constructor.NumberPraqctice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetPractice {

    public static void main(String[] args) {

        LinkedHashSet numbers=new LinkedHashSet();
        //linked hashSet will follow insertion order.
        //HashSet doe not follow the insertion order
        //in LinkedHashset method everything is same with the hashset  exceptiom order
        //all the method which set has, we can use in the linkedHashSet

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers);

        TreeSet<String> eventAttendanceList=new TreeSet<>();
        eventAttendanceList.add("Mike");
        eventAttendanceList.add("Jennifer");
        eventAttendanceList.add("John");
        eventAttendanceList.add("David");
       // eventAttendanceList.add(null);
        System.out.println(eventAttendanceList);
        Iterator<String>i=eventAttendanceList.descendingIterator();

        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();

        eventAttendanceList.pollFirst();
        System.out.println(eventAttendanceList);

        eventAttendanceList.pollLast();
        System.out.println(eventAttendanceList);
    }
}
