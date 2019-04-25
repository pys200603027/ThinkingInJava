package com.example.pattern_memento.example_1;

public final class GameBackup {
    public String name;
    public int hp;
    public int mp;
    public int level;

    public GameBackup(String name, int hp, int mp, int level) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }
}
