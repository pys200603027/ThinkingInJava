package com.example.pattern_memento.example_1;

public class CaretakePlayer {
    private GameBackup gameBackup;

    public GameBackup getGameBackup() {
        return gameBackup;
    }

    public void setGameBackup(GameBackup gameBackup) {
        this.gameBackup = gameBackup;
    }
}
