package unit;


import com.example.pattern_memento.example_1.CaretakePlayer;
import com.example.pattern_memento.example_1.GamePlayer;

import org.junit.Test;

public class TestExample1 {

    @Test
    public void test1() {
        GamePlayer player = new GamePlayer("Hero", 100, 100, 1);
        CaretakePlayer caretakePlayer = new CaretakePlayer();
        caretakePlayer.setGameBackup(player.saveGameBackup());

        player.killBoss();
        player.resumeGame(caretakePlayer.getGameBackup());

        System.out.println("load save ok.");

        System.out.println("-------------");
        System.out.println("next");
        player.killBoss();
    }
}
