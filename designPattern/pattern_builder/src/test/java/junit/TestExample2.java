package junit;

import org.junit.Test;

import water.android.io.pattern_builder.example_2.Hero;

import static junit.framework.TestCase.*;

public class TestExample2 {

    @Test
    public void testHero() {
        Hero hero = new Hero.Builder("warrior", "Amberjill")
                .setArmor("chain_mail")
                .setHairColor("blond")
                .setHairType("long_curly")
                .setWeapon("sword")
                .build();
        System.out.println(hero.toString());
        assertNotNull(hero);
        assertNotNull(hero.toString());
    }
}
