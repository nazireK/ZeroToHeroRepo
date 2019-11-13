package Constructor;

public class SoccerPlayer {
      String name;
      int age;
      String nationality;
      String team;
      double height;
      double weight;

    public SoccerPlayer(){

    }

    public void runSoccerPlayer(){
        System.out.println("Soccer Player is running...");
    }

    public void runSoccerPlayer(String name){
        runSoccerPlayer();
        System.out.println(name+" is running");
    }

    public void shootSoccerPlayer(){
        System.out.println("Soccer Player is kicking the ball");
    }

    public void shootSoccerPlayer(int speed){
        shootSoccerPlayer();
        System.out.println("The speed of the shoot is "+speed);
    }

    public void shootSoccerPlayer(int speed, int distance){
        shootSoccerPlayer(speed);
        if(speed>50 && distance<25){
            System.out.println("It is goal!!!");
        }else{
            System.out.println("it is not goal... :(");
        }
    }



    public SoccerPlayer(String sname,int sage, String snationality,String steam, double sheight, double sweight){
        name=sname;
        age=sage;
        nationality=snationality;
        team=steam;
        height=sheight;
        weight=sweight;
    }



    public static void main(String[] args) {
     SoccerPlayer sc=new SoccerPlayer();
     sc.name="Ronaldo";
     sc.age=34;
     sc.nationality="Portugal";
     sc.team="Juventus";
     sc.height=6.1;
     sc.weight=93.1;

     sc.runSoccerPlayer(sc.name);

     sc.shootSoccerPlayer(55,20);

     SoccerPlayer player1=new SoccerPlayer("Messi", 32, "albanian", "barcelona", 5.9,61.3);

     System.out.println(player1.name);

     SoccerPlayer [] soccerPlayers={new SoccerPlayer(), new SoccerPlayer(), player1,};



    }
}











