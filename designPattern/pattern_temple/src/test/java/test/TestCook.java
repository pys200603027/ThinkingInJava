package test;

import org.junit.Test;

import water.android.io.pattern_temple.Cook;
import water.android.io.pattern_temple.CookBeat;
import water.android.io.pattern_temple.CookFish;

public class TestCook {

    @Test
    public void test1() {
        Cook cook = new CookFish();
        cook.cookProcess();
    }

    @Test
    public void test2() {
        Cook cook = new CookBeat();
        cook.cookProcess();
    }
}
