package Methods;

public class TestStudent {

    public static void main(String[] args) {

        Students s=new Students();

        System.out.println(s.age);

        s.age=25;
        System.out.println(s.age);

        s.study();

        s.study(5);

        s.study("Erkin");

    }
}
