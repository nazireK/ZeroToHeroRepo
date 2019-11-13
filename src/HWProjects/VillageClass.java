package HWProjects;

import java.util.HashSet;

public class VillageClass {

    private String names;
    private int population;
    private int villageID;
    private double totalArea;
    HashSet<VillageClass> villages;


    public VillageClass(String name, int population,int villageID, double totalArea){
        this.names=name;
        this.population=population;
        this.totalArea=totalArea;
        this.villageID=villageID;
        villages=new HashSet<>();
    }

    public String getName() {
        return names;
    }

    public int getPopulation() {
        return population;
    }

    public int getVillageID() {
        return villageID;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setName(String name) {
        this.names = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setVillageID(int villageID) {
        this.villageID = villageID;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }


}
