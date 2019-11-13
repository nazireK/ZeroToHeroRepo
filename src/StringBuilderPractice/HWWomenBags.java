package StringBuilderPractice;

import java.util.Arrays;

public class HWWomenBags {

    public static void main(String[] args) {

        StringBuilder bag1 = new StringBuilder("PRADA");
        StringBuilder bag2 = new StringBuilder("GUCCI");
        StringBuilder bag3 = new StringBuilder("VALENTINO");
        StringBuilder bag4 = new StringBuilder("CHANEL");
        StringBuilder bag5 = new StringBuilder("LOUIS VITTON");

         StringBuilder[] designerBags = {bag1, bag2, bag3, bag4, bag5};

        StringBuilder establishment1 = new StringBuilder("1913");
        StringBuilder establishment2 = new StringBuilder("1908");
        StringBuilder establishment3 = new StringBuilder("1945");
        StringBuilder establishment4 = new StringBuilder("1899");
        StringBuilder establishment5 = new StringBuilder("1901");

        StringBuilder[] establishment = {establishment1, establishment2, establishment3, establishment4, establishment5};

        for (int i = 0; i < designerBags.length; i++) {
                System.out.println(designerBags[i] + " - since " + establishment[i]);

        }
    }
}