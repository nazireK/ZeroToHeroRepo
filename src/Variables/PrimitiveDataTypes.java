package Variables;

public class PrimitiveDataTypes {

    public static void main(String [] args) {
// Byte takes less space in the memory of computer.
        //
        byte maxByteNumber = Byte.MAX_VALUE;

        System.out.println(maxByteNumber);

        byte minByteNumber=Byte.MIN_VALUE;

        System.out.println(minByteNumber);

        byte apple=100;
        byte number=-128;

        byte appleFresh=100;

        int totalApple=apple+appleFresh;
//32 bit equals to 4 byte

        int millionDollar=1_000_000;
                //you cants start with underscore , you cants end with undrscore
        // underscore can not come before or after decimal point
        short chair=32000;
        long computer=2_000_000_000;

        double pi=3.14;

        float tax=7.123455f;

        //Differences between float snd dubble
        // if the float dosnt have decimal point you dont have write f at the end.
        // you cant start with underscore before numbers when you are giving value to variable
        // you can use underscore everywhere between variable name
    }
}
