package StaticPractice;

import java.util.concurrent.Callable;

public class CatTest {

    public static void main(String[] args) {

        Cat dodo=new Cat();
        Cat princess=new Cat();

        System.out.println(dodo.kitKab);
        System.out.println(princess.kitKab);
        System.out.println(Cat.meowMix);

        Cat.eatMix(2);
        Cat.eatMix(8);

        dodo.eatKit(6);
        princess.eatKit(5);

  }
}
