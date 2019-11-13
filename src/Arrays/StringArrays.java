package Arrays;

public class StringArrays {

    public static void main(String[] args) {
        String []word=new String[5];
        word[0]="java";
        word[1]="programming";
        word[2]="language";
        word[3]="I";
        word[4]="love";

        for(int i=0; i<word.length;i++){
            System.out.println(word[i]);
        }
        System.out.println("--------------------------");

        // for each loop
        for(String words:word){
            System.out.println(words);
        }



    }
}
