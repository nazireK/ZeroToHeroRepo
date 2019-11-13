package StaticPractice;

public class Book {

    String name;//business books
    String kind; // always the same author(Jihm Rohn)
    String author;
    int pages;
    int count;

    //instance initialization block;
    //we are yousinf this block to initializing our instance variables
    {
        kind="Business Book";
        author="Jihm Rohn";
        count++;
        System.out.println("This is instance initialization block");
    }

    static{
        System.out.println("This is static block. I will be executed only one time");
    }

    public Book(String name,int pages){
        this.name=name;
        this.pages=pages;
    }


}
