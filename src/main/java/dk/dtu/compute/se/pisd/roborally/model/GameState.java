package dk.dtu.compute.se.pisd.roborally.model;

import java.util.List;

public class GameState {
    private boolean gameStarted;
    private List<Player> players;

    // Getters and setters
    public boolean isGameStarted() {
        return gameStarted;
    }

    public void setGameStarted(boolean gameStarted) {
        this.gameStarted = gameStarted;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
