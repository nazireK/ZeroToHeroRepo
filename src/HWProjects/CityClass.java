package HWProjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CityClass {

    private String name;
    private String capital;


    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    HashSet<VillageClass> villages=new HashSet<VillageClass>();

    public void addVillage(String nameV,int population, int villageID,double totalArea){

        villages.add(new VillageClass(nameV,population,villageID,totalArea));
    }

    public void findVillage( String name) {
        for (VillageClass vlg : villages) {
            if (vlg.getName().equalsIgnoreCase(name))

                System.out.println(vlg.getPopulation() + " " + vlg.getVillageID() + " " + vlg.getTotalArea());
            }
        System.out.println("The village is not available " + null);
    }

    public void findVillage( int villageID) {
        HashSet<VillageClass> villages=new HashSet<VillageClass>();
        for (VillageClass id : villages) {
            if (id.getVillageID()==villageID) {
                System.out.println(id.getName()+" "+id.getPopulation()+" "+id.getTotalArea());
            }
            System.out.println("This village is not available. "+null);
        }

    }

    public boolean removeVillage( int villageID){
        ArrayList<VillageClass> villageList=new ArrayList<>(villages);
        for(int i=0;i<villageList.size();i++){
            if(villageList.get(i).getVillageID()==(villageID)){
                villageList.remove(villageList.get(i));
            }
            return true;
        }
        villages=new HashSet<>(villageList);
        return false;
    }

    public boolean removeVillage( String nameV){
        ArrayList<VillageClass> villageList=new ArrayList<>(villages);
        for(int i=0;i<villageList.size();i++){
            if(villageList.get(i).getName().equalsIgnoreCase(nameV)){
                villageList.remove(villageList.get(i));
            }
            return true;
        }
        villages=new HashSet<>(villageList);
        return false;
    }

    public void printFlowers( HashSet<VillageClass> villages) {
        for (VillageClass vc: villages) {
            System.out.println(vc.getName());
        }
    }

    public long cityPopulation(){
return 0;
    }
}
