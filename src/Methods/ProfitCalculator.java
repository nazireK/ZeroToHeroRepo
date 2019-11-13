package Methods;

public class ProfitCalculator {

    int price;
    int quanity;
    int rate1;
    int rate2;

    public double sell(int price, int quantity){
        return price*quantity;
    }

    public double sell10disc(int price, int quantity){
        return price*quantity*0.9;
    }

    public double sell20Disc(int price,int quanity){
        return price*quanity*0.8;
    }
}
