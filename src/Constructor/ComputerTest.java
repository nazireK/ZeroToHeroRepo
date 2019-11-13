package Constructor;

public class ComputerTest {

    public static void main(String[] args) {

        Computer c=new Computer();//no artgument constructor.

        Computer c1=new Computer("Apple","OC", "MacBook","Pro");
        //Immutable class. My instance variables should be private. I need to create only getters
        //wee need to set the value using the constaractor.
        //There is no settter for immutable class.

        Computer c2=new Computer(2015,8,13);
        //we can not give a new value and call our private variables. Private variables are only accsessible inside
        //the same class.
        System.out.println(c.getName());
        System.out.println(c.getYear());
        c.setName("HP");
        System.out.println(c.getName());
        c.setName("Asus");

        System.out.println(c.getName());
        System.out.println(c1.getName());
        c1.setName("Acer");
        System.out.println(c1.getName());

        System.out.println(c2.getYear());
        System.out.println(c2.memory);
        c.memory=12;
        System.out.println(c.memory);
        System.out.println("=======================");

        //Array objects:

        Computer [] comp={c,c1,c2};
        System.out.println(comp[0].memory);
        for(Computer comps:comp ){
            System.out.println(comps.memory);
        }


    }
}
