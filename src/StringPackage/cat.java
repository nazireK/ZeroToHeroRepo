package StringPackage;

public class cat {

    String name;
    int age;
    String color;
    boolean isRunning;
    String kind;
    int speed;
    String direction;


    public boolean start(){
        isRunning=true;
        return isRunning;
    }

    public boolean stop(){
        isRunning=false;
        return isRunning;
    }

    public void run(String direction){
        start();
        System.out.println("The cat direction is "+direction);
    }

    public void run(String direction, int distance){
        System.out.println("The cat direction is "+direction);
    } //this is method overloading


    public void display(){
        System.out.println("Cat's name is "+name);
        System.out.println("Cat's Age is "+age);
        System.out.println("Cat's color is "+color);
        System.out.println("Cat's kind is "+kind);
        System.out.println("Cat's speed is "+speed);
        System.out.println(name+" is running "+isRunning);
    }


    public void accelerateSpeed(int targetSpeed ){
        int currentSpeed=speed;
        while(currentSpeed<targetSpeed){
            System.out.print(currentSpeed+"...");
            speed=currentSpeed;
            currentSpeed++;
        }
    }


    public void lowerSpeed(int targetSpeed){
        int currentSpeed=speed;
        while (currentSpeed>=targetSpeed){
            System.out.print(currentSpeed+"...");
            speed=currentSpeed;
            currentSpeed--;
        }
    }


    public static void main(String[] args) {
        cat catMain= new cat();

        catMain.name="Tom";
        catMain.age=10;
        catMain.color="Grey";
        catMain.kind="Persian";

        catMain.start();
        catMain.display();
        catMain.accelerateSpeed(10);
        System.out.println();
        catMain.lowerSpeed(2);
    }

}
//command a, command l--> at the same time