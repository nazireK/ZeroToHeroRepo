package HWProjects;

import java.util.ArrayList;

public class MianCity {

    public static void main(String[] args) {
        CityClass cities=new CityClass();
        VillageClass villages=new VillageClass("Niles",11111,50566,34567.22);
        cities.addVillage("Niles",11111,50566,34567.22);
        cities.addVillage("Schamburg",34567,30567,685504.39);
        cities.addVillage("Miami",355567,30567,611244.59);
        cities.addVillage("Norridge",5631117,60656,77704.09);
        cities.addVillage("Arlington",445680,600066,685504.19);
        cities.addVillage("Prostpect",300033,55066,100444.79);
        cities.addVillage("Lillia",3542123,305671,565504.88);

        cities.findVillage("Norridge");
        cities.removeVillage("Norridge");

        System.out.println(villages);

    }
}
