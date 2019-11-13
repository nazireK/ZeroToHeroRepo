package Variables;

public class booleanPractice {

    public static void main(String[] args) {

        boolean isLightOn=true;
        isLightOn=false;

        isLightOn=!false;

        System.out.println(isLightOn);

        int currentSpeed=60;
        int speedLimit=50;

        boolean increaseSpeed=currentSpeed<speedLimit; //true

        boolean decreeseSpeed=currentSpeed>speedLimit; //false
        System.out.println(increaseSpeed);
       // System.out.println("Increase speed limit is" + +increaseSpeed);
        //System.out.println("Decrease speed "+decreeseSpeed);
                //int perasonAge=21;
        // boolean invitePerson=personAge>=18;
        //boolean donotInvite=personAge<18;

        //avarage temp in the room is 72F
        //if currentTemp is less than 72F increase
        //if the temp is more than 72F decrease

        int currentTemp=60;
        int avarageTem=72;

        boolean increaseTamp=currentTemp<avarageTem;
        boolean decreaseTemp=currentTemp>avarageTem;

        System.out.println("Increase temp is "+increaseTamp);
        System.out.println("Decrease temp is "+decreaseTemp);

        //sell the alcohol  if the person age is more than equals to 21,  dont sell alcohol, if person is less than 21


        int personAge=18;
        int legalAge=21;

        boolean sellAlcohol=personAge>=legalAge;
        boolean dontSellAlcohol=personAge<legalAge;

        int houseCost=500000;
        int whatIHave=200000;

        boolean youCanBuy=whatIHave>=houseCost;
        boolean youCantBuy=whatIHave<houseCost;

        System.out.println("I can buy house with my savings --> " +youCanBuy);
        System.out.println("I can not buy house if my savings are less than 500000 --> "+youCantBuy);

        int age=18;
        boolean hasParent=false;
        //age>=18; or hasParent==true -->person can attand the event

    }


}
