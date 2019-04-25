package com.example.pattern_memento.example_1;

public final class GamePlayer {
    public String name;
    public int hp;
    public int mp;
    public int level;

    public GamePlayer(String name, int hp, int mp, int level) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    public GameBackup saveGameBackup() {
        System.out.println("start saveGameBackup");
        return new GameBackup(name, hp, mp, level);
    }

    public void resumeGame(GameBackup gameBackup) {
        System.out.println("start resumeGame");
        this.name = gameBackup.name;
        this.hp = gameBackup.hp;
        this.mp = gameBackup.mp;
        this.level = gameBackup.level;
    }

    public void killBoss() {
        System.out.println("start challenge boss.");
        double hpBoss = 100;
        while (hp > 0) {
            System.out.println(name + "使用技能攻击Boss");
            hpBoss = hpBoss - Math.random() * 80;
            if (hpBoss <= 0) {
                break;
            }
            mp = mp - 30;
            System.out.println("剩余血量：" + hp + "\t剩余精气量" + mp);

            System.out.println("Boss攻击" + name);
            hp = hp - 50;
        }

        if (hp <= 0) {
            System.out.println("Player：" + name + "被Boss杀死，Boss还有+" + (int) hpBoss + "+血。");
        } else if (hpBoss <= 0) {
            System.out.println("Player：" + name + "杀死Boss开始下一关。");
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name:").append(name).append(",");
        sb.append("Hp:").append(hp).append(",");
        sb.append("Mp:").append(mp).append(",");
        sb.append("Level:").append(level);
        return sb.toString();
    }
}
