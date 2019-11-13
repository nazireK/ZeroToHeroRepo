package Constructor;

public class StringEqualsPractise {

    public static void main(String[] args) {

        String student="David";
        String student1="David";
        String student3="David";

        System.out.println(student==student);

        String student2=new String ("David");
        System.out.println(student==student2);
        student=student2;
        System.out.println(student==student2);

        student1=student3+"";
        //--> it is creating new object and it is inside the string pool but it is different value.
        System.out.println(student==student3);

        System.out.println(student3=="Da"+"vid");
    }
}
