package InheritanceOOP;

public class Dog extends DomesticAnimals {

    @Override
    public void run() {
        System.out.println("Dog is running ");
    }

    public void bark(){
        System.out.println("Dog is Barking...");
    }
}
