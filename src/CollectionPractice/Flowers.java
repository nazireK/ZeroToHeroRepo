package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Flowers {
    String names;
    int barcodeNum;
    HashSet<Flowers> flowerList;

    public Flowers(String names, int barcodeNum) {
        this.names = names;
        this.barcodeNum = barcodeNum;
        flowerList = new HashSet<>(); //--> initialization of hashset.
    }

    public void addFlower(String name, int barcodeNum) {
        flowerList.add(new Flowers(name, barcodeNum));
    }

    public int findFlower(String name) {
        for (Flowers n : flowerList) {
            if (n.names.equalsIgnoreCase(name)) {
            }
            return n.barcodeNum;
        }
        System.out.println("Flowers is not available.");
        return 0;
    }



    public String findFlower(int barcodeNum) {
        for (Flowers n : flowerList) {
            if (n.barcodeNum==barcodeNum) {
                return n.names;
            }
        }
        System.out.println("This flower is not available. ");
        return null;
    }



    public void removeFlower(String name){
        ArrayList<Flowers> flowersList=new ArrayList<>(flowerList);
        for(int i=0;i<flowersList.size();i++){
            if(flowersList.get(i).names.equalsIgnoreCase(name)){
                flowersList.remove(flowersList.get(i));
            }
        }
        flowerList=new HashSet<>(flowersList);
    }

    public void printFlowers() {
        for (Flowers fl: flowerList) {
            System.out.println(fl.names);
        }

    }
}
