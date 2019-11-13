package CollectionPractice;

public class FlowerTest {

    public static void main(String[] args) {
        Flowers rose=new Flowers("Rose",1111111);
        rose.addFlower("Red Rose", 123456787);
        rose.addFlower("Yellow Rose", 1277777);

        int redFlowerbarcode=rose.findFlower("Red Rose");
        System.out.println(redFlowerbarcode);

        String flowerName=rose.findFlower(123456787);
        System.out.println(flowerName);

        rose.printFlowers();
        rose.removeFlower("Yellow Rose");
        System.out.println("========================================");
        rose.printFlowers();


    }
}
