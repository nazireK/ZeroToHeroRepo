package DoWhileLoop;

public class PrintTree {

    public static void main(String[] args) {

       for (int i=0;i<=5;i++){
           i=i+1;
           for( int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
       }

       for(int i=1; i<=5;i++){
           i=i+1;
           for(int j=4; j>=i;j--){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
