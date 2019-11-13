package ForLoop;

public class StringLetterEquals {

    public static void main(String[] args) {

        String name = "Techtorial Academy";
        for (int i = 0; i <= name.length() - 1; i++) {

            //System.out.print(name.charAt(i)+",");

            if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
                System.out.print(name.charAt(i) + ", ");
            }

            //  }
        }

    }}


