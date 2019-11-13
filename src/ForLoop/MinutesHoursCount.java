package ForLoop;

public class MinutesHoursCount {

    public static void main(String[] args) {

        for(int i=2; i<=4;i++){
            System.out.println(i+" HOURS");
            for(int j=1; j<60;j++){
                System.out.print(i+":"+j+ "- minutes-->");
            }
            System.out.println();
        }

    }
}
