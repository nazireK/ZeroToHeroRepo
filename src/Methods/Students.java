package Methods;

public class Students {

   int age;
   //we can have many many same methods in one class, as long as parameters are different.
    //it calls overloading methods in java
    //
   public void study(){
       System.out.println("Student is studying!");
   }
    public void study(int hours){
        System.out.println("Student is studying "+hours+"  hours");
    }
    public void study(String name){
        System.out.println(name+" is studying ");
    }
}
