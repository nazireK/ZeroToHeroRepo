package Arrays;

public class ArrayToString {

    public String arraysString(String [] str){

        String name="";
        for(String n:str) {
            name += n;

        }
        return name;
    }

    public static void main(String[] args) {
        ArrayToString st=new ArrayToString();
        String [] arr={"Tech ", "2019", " coding"};
        st.arraysString(arr);
        System.out.println(st.arraysString(arr));

        }


}
