package InheritanceOOP;

public class WildAnimal extends Animal {

   @Override // Annotation.
    public void eat() { //it is overriding the method
        System.out.println("Wild animal is eating meat.");
    }

    @Override
    public void sleeping() {
        System.out.println("Wild animal is sleeping");
    }

    public void fight(){
        System.out.println("Animal is fighting");
    }
}
