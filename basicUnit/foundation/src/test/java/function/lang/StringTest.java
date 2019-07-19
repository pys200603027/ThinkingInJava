package function.lang;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

    @Test
    public void test1() {
        String[] text = new String[]{"1", "2"};

        List<String> lText = new ArrayList<>();
        lText.add("1");
        lText.add("2");

        StringBuilder sb = new StringBuilder();
        sb.append(lText.get(0));
        sb.append(lText.get(1));


        System.out.println(text.toString());
        System.out.println(lText);
        System.out.println(sb.toString());

    }

    /**
     * 过滤数字
     */
    @Test
    public void test2() {
        String pattern = "[^(0-9)]";

        String input = "img_001.png";
        String s = input.replaceAll(pattern, "");

        System.out.println(s);
    }
}
