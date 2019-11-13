package HWScrumTeam;

public class ScrumMaster extends ScrumTeam {

    public ScrumMaster(String projectName){
        super("We can do it","ScrumTeam");
    }

    public ScrumMaster(String teamName, String projectName){
        this("Scrum Team");
    }

    @Override
    public void progress() {
        System.out.println("Scrum Master's Project in progress");
    }

    @Override
    public void work() {
        System.out.println("Scrum Master is working");
    }

    @Override
    public void sprint() {
        System.out.println("Scrum Master and team are discussing on what sprint they will be working on");
    }
}
