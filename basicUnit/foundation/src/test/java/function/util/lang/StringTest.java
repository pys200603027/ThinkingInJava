package function.util.lang;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.annotation.Target;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;

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

    @Test
    public void testM3u8() {
        String m3u8Url = "http://videong.gxlzff.cn/20200424/ZH0LaNfM/hls/index.m3u8?wsSecret=3e3ec593db35f75b717c333a90fe7a13&wsTime=1588047598645";
        String ts = "a2BdrbdH.ts";

        m3u8Url = m3u8Url.substring(0, m3u8Url.indexOf("index.m3u8"));

        System.out.println(m3u8Url);

        String finalUrl = m3u8Url + ts;

        System.out.println(finalUrl);
    }

    @Test
    public void testM3u82() {
        String m3u8Url = "http://videong.gxlzff.cn/20200424/ZH0LaNfM/hls/index.m3u8?wsSecret=3e3ec593db35f75b717c333a90fe7a13&wsTime=1588047598645";

        System.out.println(m3u8Url.substring(0, m3u8Url.indexOf("?")));

        char word = '你';
        System.out.println(word);
    }

    @Test
    public void testString1() {
        String str1 = "Hello World";
        String str2 = "Hello" + " World";
        System.out.println(str1 == str2);
    }

    @Test
    public void testString2() {
        String str1 = "Hello World";
        String str2 = "Hello";
        str2 += " World";
        System.out.println(str1 == str2);
    }

    @Test
    public void testString3() {
        String str1 = "Hello World";
        String str2 = new String("Hello World");

        //这个相等
        System.out.println(str2.intern() == str1);

        //这个不相等
        System.out.println(str2.intern() == str2);

        System.out.println(str1 == ("Hello" + " World"));
    }

    @Test
    public void testString4() {
        String str1 = "Hello World";
        String str2 = "Hello";
        String str3 = " World";

        System.out.println(str1 == (str2 + str3));
    }

    @Test
    public void testSong() {
        int i = 0;
        // 歌词文件位置
        File paramFile = new File("/Users/uncleye/Downloads/2ddd22359d669147310734bf674f800e.zrce");
        try {
            InputStream inputStream = new FileInputStream(paramFile);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] arrayOfByte = new byte[1024];
            for (; ; ) {
                int j = bufferedInputStream.read(arrayOfByte);
                if (j <= 0) {
                    break;
                }
                byteArrayOutputStream.write(arrayOfByte, 0, j);
            }
            arrayOfByte = byteArrayOutputStream.toByteArray();
            while (i < arrayOfByte.length) {
                arrayOfByte[i] = ((byte) (arrayOfByte[i] ^ new byte[]{-50, -45, 110, 105, 64, 90, 97, 119, 94, 50, 116, 71, 81, 54, -91, -68}[(i % 16)]));
                i += 1;
            }
            String paramFile11 = new String(arrayOfByte, "UTF-8");
            System.out.println(paramFile11);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static final char key[] = {'@', 'G', 'a', 'w', '^', '2', 't', 'G', 'Q', '6', '1', '-', '\316', '\322', 'n', 'i'};


    @Test
    public void testkrc() {
        try {
            convert("/Users/uncleye/Downloads/90338501-0.ksc");
        } catch (Exception e) {
            System.err.println("failure!");
            e.printStackTrace();
            return;
        }
        System.out.println("success");
    }

    /*
     * 参数：文件名 函数作用：解密转换
     */
    public static void convert(String fileName) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(fileName, "r");
        byte[] content = new byte[(int) (raf.length() - 4)];
        raf.skipBytes(4);
        raf.read(content);
        raf.close();

        for (int i = 0, length = content.length; i < length; i++) {
            int j = i % 16; // 循环异或解密
            content[i] ^= key[j];
        }

        String lrc = null;

        lrc = new String(decompress(content), "utf-8"); // 解压为 utf8

        String final_lrc = lrc.replaceAll("<([^>]*)>", "").replaceAll(",([^]]*)]", "] ");
        /* 处理时间标签 */
        Pattern p = Pattern.compile("\\[\\d+?\\]");
        Matcher m = p.matcher(final_lrc);
        while (m.find()) {
            final_lrc = m.replaceFirst(toTime(m.group()));
            m = p.matcher(final_lrc);
        }
        String lrcFileName = fileName.replaceAll(".krc", ".lrc").replaceAll("\\s-\\s\\w+.lrc", ".lrc");
        FileOutputStream fos = new FileOutputStream(lrcFileName);
        byte[] lrcbyte = final_lrc.getBytes();
        fos.write(lrcbyte);
        fos.close();
        System.out.println("文件保存为：" + lrcFileName);
    }

    private static String toTime(String num) {
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
        long time = Long.parseLong(num.substring(1, num.length() - 1));
        return "[" + sdf.format(time) + "." + ((time % 1000) / 10) + "]";
    }

    /*
     * 解压
     */
    private static byte[] decompress(byte[] data) throws Exception {

        byte[] output = new byte[0];
        Inflater decompresser = new Inflater();
        decompresser.reset();
        decompresser.setInput(data);
        ByteArrayOutputStream o = new ByteArrayOutputStream(data.length);
        byte[] buf = new byte[1024];
        while (!decompresser.finished()) {
            int i = decompresser.inflate(buf);
            o.write(buf, 0, i);
        }
        output = o.toByteArray();
        o.close();
        decompresser.end();
        return output;
    }

    @Test
    public void test3() {
        final char value[] = {'1', '2', '3'};

        value[0] = '0';

    }

    @Test
    public void test4() {
        String name1 = "10000789";
        String name2 = "12220889";

        System.out.println(name1.charAt(name1.length() - 1));

        if (name1.charAt(name1.length() - 1) == name2.charAt(name2.length() - 1)) {
            System.out.println("match");
        } else {
            System.out.println("no");
        }

    }
}

