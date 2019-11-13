package ForLoop;

public class NestedLoop {

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            for(int k=0;k<4;k++){
                System.out.print(i+"-"+k+",");
            }
        }
        //first loop will run one time
        //second loop will finish all the condition
        //then first loop will run;
        //second loop will finish all the condition
    }
}
