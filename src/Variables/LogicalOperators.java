package Variables;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean hasTicket=false;
        boolean hasVisa=true;

        boolean canCome=hasVisa&&hasTicket;
        System.out.println(" Can I come to the USA? --> "+canCome);


        boolean finishedEsl=false;
        int toeflScore=80;

        //boolean passToefl=toeflsScore>=79; //78 is not bigger than 79. the result is false

        boolean canGotoCollage=finishedEsl || toeflScore>=79;
        System.out.println("can go to collage? --> "+canGotoCollage);

        //to be able to buy the home I should have enough money or
        //I should have a mortgage
        //I have 200.000$
        //the homePrice is 300.000$

        int currentMoney=200000;
        int homePrice=300000;

        boolean hasMortgage=true; //false--> it willbe false

         boolean hasEnoughMoney=currentMoney>=homePrice; //false

        boolean canBuyHouse=hasMortgage || hasEnoughMoney;

        System.out.println("Can I buy Home? --> " +canBuyHouse);

       //I shoiuld have drivers license
        //age =16
        //should pass the exam

        int myAge=20;
        int expectedAge=16;

        boolean ageRequirements=myAge>=expectedAge;

        int myScore=80;
        int expectedScore=75;

        boolean canPassExam=myScore>=expectedScore;
        boolean hasVisa1=true;
        //age
        //score
        //visa

        boolean canIgetDLicence=canPassExam && ageRequirements && hasVisa1;
        System.out.println("Can I get the drivers License "+canIgetDLicence);





    }
}
