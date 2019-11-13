package HWScrumTeam;

public class Developer extends ScrumTeam {

    public Developer(String projectName){
        super("DevOps","ScrumTeam");
    }

    public Developer(String teamName, String projectName){
        this("We can do it");
    }

    @Override
    public void progress() {
        System.out.println("Developers Project in progress");
    }

    @Override
    public void work() {
        System.out.println("Developers are working");
    }

    @Override
    public void sprint() {
        System.out.println("Developer are discussing on what sprint they will be working on");
    }
}
