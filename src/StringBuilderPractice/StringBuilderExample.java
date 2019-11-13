package StringBuilderPractice;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder table=new StringBuilder();
        StringBuilder table1=new StringBuilder("Rockwell");
        System.out.println(table);

        table.append("Ikea");
        System.out.println(table);
        table.append(10);
        System.out.println(table); //ikea10

        table1.append(10.4);
        System.out.println(table1);

        StringBuilder success=new StringBuilder().append("Techtorial").append(2019);
        success.append("Best Year Ever ").append(true);

        System.out.println(success);

        System.out.println("Tech".charAt(0));

        StringBuilder computer=new StringBuilder();
        for(char i='a';i<'z';i++){
            computer.append(i);
        }
        System.out.println(computer);

        StringBuilder success1=new StringBuilder("Working Hard");
        success1.append(" does not make you successful. ");
        System.out.println(success1);

        StringBuilder truth=success1.append("Thinking hard makes you successful");

        System.out.println(truth);

        System.out.println(success1);

        StringBuilder tree=new StringBuilder("Oak");
        StringBuilder tree1=new StringBuilder("Oak").append(" 14");
        System.out.println(tree);
        System.out.println(tree1);
        char nm=tree.charAt(0);// --> char
        System.out.println(nm);// O
        System.out.println(tree);// Oakab
        // If you call the method and return type is StringBuilder, in this your original StringBuilder value will change.
        // .append(); --> StringBuilder
        int index=tree.indexOf("ak");
        System.out.println(index);
        int length=tree.length();
        System.out.println(length);
        String subs=tree.substring(1);
        System.out.println(subs);//ak
        System.out.println(tree);//Oak
        // tree1=Oak 14
        String tr=tree1.append("10").append(true).substring(5).substring(1);// 410true
        tree1.append("KKK").append(6.4);
        System.out.println(tree1);//Oak 1410trueK6.4
        System.out.println(tr);
        StringBuilder apple=new StringBuilder("Aple");
        apple.insert(2,"p");
        System.out.println(apple);// Apple
        apple.insert(5,"s number is 10");
        System.out.println(apple);

        StringBuilder [] builders={tree,tree1,apple, computer};
        for(StringBuilder bld: builders){
            bld.insert(2,"-");
            System.out.println(bld);
        }

        StringBuilder mouse=new StringBuilder("Microsoft");
        mouse.delete(0,3);
        System.out.println(mouse);

        mouse.deleteCharAt(2);
        System.out.println(mouse);

        mouse.reverse();
        System.out.println(mouse);

        String mouse1=mouse.toString();


    }
}
