package ForLoop;

public class OilChange {

    public static void main(String[] args) {

        //im changing my oil after 2000 miles.
        //if i change one time
        //every 500 miles i need fuel my car
        int count=1;
        int count1=1;

        for(int oil=0;oil<4;oil++){
            System.out.println(count++ +"-- Please change the oil");
            for(int gas=0;gas<4;gas++){
                System.out.println(count1++ +" Please fuel your tank");
            }
        }
    }
}
