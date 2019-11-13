package HWScrumTeam;

public class SDET extends ScrumTeam{

    public SDET(String projectName){
        super("We can do it","ScrumTeam");
    }

    public SDET(String teamName, String projectName){
        this("Scrum Team");
    }

    @Override
    public void progress() {
        System.out.println("SDET Project in progress");
    }

    @Override
    public void work() {
        System.out.println("SDET are working");
    }

    @Override
    public void sprint() {
        System.out.println("SDET are discussing on what sprint they will be working on");
    }
}
