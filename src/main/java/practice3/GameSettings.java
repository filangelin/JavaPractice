package practice3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    static void setMaxPlayers(int count) {
        maxPlayers = count;
    }

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            this.currentPlayers++;
        }
    }

    void printGameStatus() {
        System.out.println("Игра - " + gameName + " Max кол-во игроков = " + maxPlayers + " Текущее кол-во игроков - " + currentPlayers);
    }

    @Override
    public String toString() {
        return "GameSettings{" +
                "gameName='" + gameName + '\'' +
                ", currentPlayers=" + currentPlayers +
                '}';
    }
}
