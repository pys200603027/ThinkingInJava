package function.util.lang;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

    /**
     * 考察 String[]数组、Array<String>、StringBuilder的 toString输出结果
     */
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

    /**
     * 根据文件名字 获取图片宽高 （_w600_h628）
     */
    @Test
    public void testString() {
        String resourceId = "chat/5a2cea1fddb4f2d0d70378a5d5cb03e6_w600_h628.jpeg";
        String pattern = "\\s*_w(\\d+)_h(\\d+)\\s*";

        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(resourceId);

        String matcherStr = "";
        while (matcher.find()) {
            matcherStr = matcher.group();
        }
        System.out.println(matcherStr);

        String[] split = matcherStr.split("_");

        split[1] = split[1].replace("w", "");
        split[2] = split[2].replace("h", "");

        int[] size = new int[2];
        size[0] = Integer.parseInt(split[1]);
        size[1] = Integer.parseInt(split[2]);

        System.out.println(size[0] + "," + size[1]);
    }

    /**
     * 将文件名字变成.9.png 的9patch图
     */
    @Test
    public void testFileLastof() {
        String fileName = "test.png";
        System.out.println(fileName.lastIndexOf("."));

        String suffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        System.out.println(suffix);


        fileName = fileName.replace(suffix, ".9" + suffix);
        System.out.println(fileName);
    }

    public int[] getImageSize(String url) {
        int[] size = new int[2];
        try {
            String pattern = "\\s*_w(\\d+)_h(\\d+)\\s*";

            Pattern compile = Pattern.compile(pattern);
            Matcher matcher = compile.matcher(url);

            String matcherStr = "";
            while (matcher.find()) {
                matcherStr = matcher.group();
            }
            System.out.println(matcherStr);

            String[] split = matcherStr.split("_");

            split[1] = split[1].replace("w", "");
            split[2] = split[2].replace("h", "");

            size[0] = Integer.parseInt(split[1]);
            size[1] = Integer.parseInt(split[2]);
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
