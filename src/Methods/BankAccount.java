package Methods;

public class BankAccount {
    String name;
    int accountNumber;
    String bankName;
    double balance;
    String expDate;

    public void display(){
        System.out.println(name);
        System.out.println(accountNumber);
        System.out.println(bankName);
        System.out.println(balance);
        System.out.println(expDate);

    }
    public double deposit(int deposit){
        balance+=deposit;
        return balance;

    }
    public double withdraw(int withdraw){
        balance-=withdraw;
        if(balance<withdraw){
            System.out.println("Your balance has dropped below 0! Current balance is ");

        }
        return  balance;
    }

    public static void main(String[] args) {

        BankAccount display=new BankAccount();
        display.name="Gulaiym";
        display.accountNumber=123456789;
        display.bankName="Bank of America";
        display.expDate="11/01/2022";
        display.balance=200;
        display.display();
        System.out.println("=====================================");
        System.out.println(display.deposit(2000));
        System.out.println(display.withdraw(500));


    }
}
