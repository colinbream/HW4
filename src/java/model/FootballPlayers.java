
package model;


public class FootballPlayers {
    
    private int playerID;
    private String playerName;
    private int age;
    private String position;
    private String team;
    private String college;
    
     public FootballPlayers() {
        this.playerID = 0;
        this.playerName = "";
        this.age = 0;
        this.position = "";
        this.team = "";
        this.college = "";
    }
    
     public FootballPlayers(int playerID, String playerName, int age, String position, String team, String college) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.age = age;
        this.position = position;
        this.team = team;
        this.college = college;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "FootballPlayers{" + "playerID=" + playerID + ", playerName=" + playerName + ", age=" + age + ", position=" + position + ", team=" + team + ", college=" + college + '}';
    }
    
    
    
    
    
}
