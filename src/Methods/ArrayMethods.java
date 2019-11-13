package Methods;

public class ArrayMethods {

    String studentName;
    String[] students=new String[10];
    int count;

    public void addStudent(){
        students[count]=studentName;
        count++;
    }
    public void printNames(){
        for (String name: students){
            System.out.println(name);
        }
    }

}
