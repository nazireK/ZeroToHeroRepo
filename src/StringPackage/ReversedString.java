package StringPackage;

public class ReversedString {

    public String reversed(String name){

        String reversed="";
        for(int i=name.length()-1; i>=0; i--){
            reversed+=name.charAt(i);
        }
        return reversed;

    }

    public static void main(String[] args) {
        ReversedString rvsd=new ReversedString();
        System.out.println(rvsd.reversed("Techtorial"));
    }
}
