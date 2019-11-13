package StringBuilderPractice;

public class Practice {

    public void  checkBuilder(StringBuilder builder) {

        StringBuilder bl=new StringBuilder();

        for(int i=0;i<builder.length();i++){
            char letter=builder.charAt(i);
            if(letter>='D' && letter <='G'){
            bl.append(letter);
        }}
        bl.replace(2,4,"SS");
        System.out.println(bl);
    }

    public static void main(String[] args) {
        Practice pp=new Practice();
        pp.checkBuilder(new StringBuilder("GFDHJFHFDFJJ233GFGFGFGFGIIKM9"));

    }

}
