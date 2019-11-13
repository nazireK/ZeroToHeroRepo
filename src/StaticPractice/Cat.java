package StaticPractice;

public class Cat {

    static int meowMix=10;
    int kitKab=8;
    //create ome mothod will take int number. This method is called eatMix
    //once i call the method it will reduce the number of mewMix
    //return type is boolean
    public static boolean eatMix(int amount){
        if(amount<=meowMix){
            meowMix-=amount;
            System.out.println("MeoMix's amount is "+meowMix);
            return true;
        }
        return false;
    }

    //create one mwthod it will take one int number as a paramether this method
    //is called iyKab
    //onece i call the method it will reduce the number of kitKab
    //return type is boolean
     public boolean eatKit(int amount){
        if (amount<=kitKab){
            kitKab-=amount;
            System.out.println(kitKab);
            return true;
        }
        return false;
     }


}
