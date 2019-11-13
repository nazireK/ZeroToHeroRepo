package Methods;

public class Polindrom {

    public boolean palindromNum(int num) {
        int temporary=num;
        int reversed=0;
        while(temporary>0){
            int reminderOfNum=temporary%10;
            reversed=reversed*10+reminderOfNum;
            temporary=temporary/10;
        }
        if(reversed==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Polindrom pm=new Polindrom();

        boolean result= pm.palindromNum(1221);
        System.out.println(result);
    }
}
