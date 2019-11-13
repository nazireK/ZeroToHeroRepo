package Variables;

public class OperatorPractice {

    public static void main(String[] args) {

        //Re-assigning the variables
        /*
        Variables can be assigned and re-assigned many times after declaring
         */
        int apple=10, banana,oranges=13;
        /*if you want to print out one af the variables you have to initialise
        all of them apple banana oranges

       */
         banana=10;
         banana=1; //this one is still works, it will print out the latest initialisation
        //this means re-assignment of the variables
        banana=4;
        System.out.println("Bananan number is "+banana);
        banana=8;
        System.out.println("Banana number is "+banana);
        //banana=8
        //apple=10
        banana=apple;
        //banana=10
        //apples=10
        apple=banana;
        //banana=10
        //apple=10
        banana=banana+1;
        //banana=11
        banana=oranges+1;
        //banana=14


        System.out.println("banana Number is "+banana);
        System.out.println("Banana number is "+apple);
        System.out.println("Orange number is "+oranges);

        banana+=1;
        //banana=banana+1

        System.out.println("banana number is "+banana);

        banana-=2;
        //banana=banana-2
        //banana=15-2
        //banana=13

        System.out.println("Banana number is "+banana);

        banana*=2;
        //banana=banana*2
        //banana=13*2
        //banana=26

        System.out.println("banana number is "+banana);

        oranges%=5;
        //oranges reminder is 3
        System.out.println("Orange number is "+oranges);

        double taxAmount=10.5;
        float salary=40.7f;
        int number=100;
        //total amount=taxAmount+number
        double totalTaxAmount=taxAmount+number+salary;

        byte k=10;
        short n=8;

        int totalNumber=k+n;

        int berry=14;
        System.out.println(berry);
        berry=++berry;
        System.out.println(berry);
        berry=++berry;
        System.out.println(berry);

        int berry1=14;

        System.out.println(berry1);
        System.out.println(berry1++);
        System.out.println(berry1);
        berry1=berry1++;
        System.out.println(berry1++);
        System.out.println(berry1);
    }

}
