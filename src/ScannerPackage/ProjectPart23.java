package ScannerPackage;

public class ProjectPart23 {

    public static void main(String[] args) {
        int a=25;
        int b=32;

        int total=a++ + ++a + --b + ++b + b++ +a + ++b - --b+a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(total);
    }
}
