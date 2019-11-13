package Methods;

public class CalculatorClass {

    public static void main(String[] args) {
        System.out.println("Java");
        myMethods("Techtorial");

    }
    //public-> access modifier
    //void -> return type
    //myMethods -> method name
    //String name -> parameter
    //myMethods(String name) - > signature
    //static -> static and non Static

    public static void myMethods(String name){
        System.out.println("My name is: "+name);

    }
}
