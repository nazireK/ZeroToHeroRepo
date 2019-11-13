package ArrayListPractice;

import Methods.Task;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        TaskAnimal animal1=new TaskAnimal("Cat",1,"Chicago",5);
        TaskAnimal animal2=new TaskAnimal("Dog",2,"New York",7);
        TaskAnimal animal3=new TaskAnimal("Lion",3,"San Diego",8);
        TaskAnimal animal4=new TaskAnimal("Monkey",4,"Arizona",10);
        TaskAnimal animal5=new TaskAnimal("Tiger",5,"Florida",18);

        //System.out.println(animal5.dailyMeal);

//        System.out.println(animal1.dailyMeal);
//        animal1.increaseMeal();
//        System.out.println(animal1.dailyMeal);

        ArrayList<TaskAnimal> animalList=new ArrayList();

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);

        for(int i=0;i<animalList.size();i++){
            animalList.get(i).increaseMeal();
            System.out.println(animalList.get(i).name);
        }




    }
}
