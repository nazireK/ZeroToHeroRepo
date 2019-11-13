package Methods;

public class GetGreatest {

    public int greatestNumber(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            return num1;

        }else if(num2>num1 && num2>num3){
            return num2;

        }else if(num3>num1 && num3>num1) {
            return num3;
            //I added this part to get one of the same greatest input
        }else if(num1==num2 || num2==num3 || num3==num1){
            return num1;
        }else{
            return num3;
        }

    }
}
