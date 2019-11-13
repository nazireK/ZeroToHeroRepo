package InheritanceOOP;

public class Zoo  {

    public static void main(String[] args) {

        WildAnimal wildAnimal=new WildAnimal();
        wildAnimal.eat();
        wildAnimal.sleeping();

        Animal animal=new Animal();
        animal.eat();
        animal.sleeping();


        DomesticAnimals domesticAnimals=new DomesticAnimals();

        Lion lion=new Lion();
        lion.eat();
        lion.roar();
        lion.fight();

        Dog dog = new Dog();
        dog.run();
        dog.bark();

    }
}
