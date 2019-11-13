package ForLoop;

public class ProductNumber {

    public static void main(String[] args) {

        int n = 123456;
        int product=1;
        int sum=0;
        while(n>0){
            System.out.println(n%10);
            product*=n%10;
            sum+=n%10;
            n=n/10;
        }
        System.out.println(product-sum);

    }
}