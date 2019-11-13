package HWScrumTeam;

public class ScrumTeam {
    String teamName;
    String projectName;

    public ScrumTeam(String teamName, String projectName){

    }

    public void progress(){
        System.out.println("Scrum team's project is in Progress");
    }

    public void work(){
        System.out.println("Scrum team is working");
    }

    public void sprint(){
        System.out.println("Scrum team is deciding on what sprint they will be working");
    }
}
