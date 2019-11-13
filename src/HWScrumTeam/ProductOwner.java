package HWScrumTeam;

public class ProductOwner extends ScrumTeam {

    public ProductOwner(String projectName){
        super("We can do it","ScrumTeam");
    }

    public ProductOwner(String teamName, String projectName){
        this("Scrum Team");
    }

    @Override
    public void progress() {
        System.out.println("Product owner's Project in progress");
    }

    @Override
    public void work() {
        System.out.println("Product Owner is  working");
    }

    @Override
    public void sprint() {
        System.out.println("Product Owner and team are  discussing on what sprint they will be working on");
    }
}
