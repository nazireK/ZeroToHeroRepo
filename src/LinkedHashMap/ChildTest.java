package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ChildTest {

    public static void main(String[] args) {
        Child child1=new Child("civic",10,'M',"Chicago");
        Child child2=new Child("aziza",101,'M',"Shambyr");
        Child child3=new Child("John",3,'M',"Norrifge");
        Child child4=new Child("Silvia",2,'M',"Chicffo");
        Child child5=new Child("Natasha",14,'M',"Chicago");



        Map<Integer, Child> children=new LinkedHashMap<>();
        children.put(1,child1);
        children.put(2,child2);
        children.put(3,child3);
        children.put(4,child4);
        children.put(5,child5);

        Set<Integer> keyList=children.keySet();
        for(Integer c:keyList){
            System.out.println(children.get(c).getName());
            System.out.println(children.get(c).canGoSchool());
            System.out.println(children.get(c).nameIsPalindrome(children.get(c).getName()));
        }


    }
}
