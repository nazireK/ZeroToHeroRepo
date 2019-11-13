package Methods;

public class Investment {

    double year;
    double amount;
    double rate;

    public  double rateAmount(){
        return amount*rate*year/100;
    }

    public  double totalAmount(){
        return rateAmount()+amount;

    }

}
