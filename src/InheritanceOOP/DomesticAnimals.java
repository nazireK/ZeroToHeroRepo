package InheritanceOOP;

public class DomesticAnimals extends Animal {

  @Override
    public void eat(){
      System.out.println("Domestic Animal is eating");
  }

    @Override
    public void sleeping() {
        System.out.println("Domestic Animal is slepping");
    }

    @Override
    public void run() {
        System.out.println("Domestic Animal is running");
    }
}
