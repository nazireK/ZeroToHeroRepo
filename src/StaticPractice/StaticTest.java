package StaticPractice;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static StaticPractice.StaticReview.*;
public class StaticTest {

    public static void main(String[] args) {
        StaticReview rev = new StaticReview();
        System.out.println(add(4,5));
        System.out.println(subtract(6,3));
        System.out.println(divide(8,2));
        System.out.println(multiple(10, 2));

        List<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(4);
        num.add(2);

        System.out.println(num);

        Collections.sort(num);
        System.out.println(num);

        StringBuilder name=new StringBuilder("Gulaiym");
        System.out.println(name.reverse());






    }
}
