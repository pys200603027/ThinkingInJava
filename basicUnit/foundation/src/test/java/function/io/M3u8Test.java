package function.io;


import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class M3u8Test {

    @Test
    public void m3u8Parser() throws IOException {

        File localFile = new File("/Users/uncleye/Downloads/00b0dc3d-14ef-4a51-a831-a4afd1dfaa11.m3u8");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(localFile)));

//        BufferedWriter bufferedWriter = new BufferedWriter(new StringWriter());
        StringBuilder sb = new StringBuilder();


        String line = null;
        while ((line = bufferedReader.readLine()) != null) {

            if (line.contains("yiqivod://")) {

                int first = line.indexOf("\"") + 1;
                int last = line.lastIndexOf("\"");

                String[] split = line.substring(first, last).split("//");


                System.out.println(split[1]);


                String requestKeyUrl = "https://upload.yiqishuoapp.com/v1/video/key?video_id=5f9284aa0aa84fe1b5fc9de3&play_key=PGwy9bhowGLUPABy9ohpj+1oPRTZwDLG0DBr9DbqjkbXPRMIvD5zwKwy9tvojtg01xLthx9vByJ4xTqthVP91IcB";

                URL url = new URL(requestKeyUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream inputStream = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                StringWriter stringWriter = new StringWriter();

                char[] buffer = new char[1024];
                int len = 0;

                while ((len = inputStreamReader.read(buffer)) != -1) {
                    stringWriter.write(buffer, 0, len);
                }

                String keyJson = stringWriter.toString();


                String data = "wGbrPybGjkso9DBGPAByPowTwo8l9zMywGaZ0DgowowqPD9pvRMT9t8UvD1KPD8UPtg0Bxv3OaLk15hxgMbt1Iqw55h6VgMsk1IWgbck6ZLtxgIhkbpSkhTvtTIW+x1hBx2NBMswLb975hW3hppPV1vDLIIRLLW3DL585B8P5yvP55pVhTXxDLhR31XY1Lq+RBJY5V25OIw65TwkL1T5VZ8+6ZP85gd1hZqODZVthbwW5T815M21V5V0";
                //解析key数据

                //获取到key
//                String keyJson2 = "{\"url\":\"https://cvod.yiqishuoapp.com/online/lessons/00b0dc3d-14ef-4a51-a831-a4afd1dfaa11.m3u8\",\"key\":\"d2a5a9dda38d1f25ec2cd5d012aa6f00\"}";
                String keyJson2 = "{\"url\":\"https://cvod.yiqishuoapp.com/online/lessons/00b0dc3d-14ef-4a51-a831-a4afd1dfaa11.m3u8\",\"key\":\"d2a5a9dda38d1f25ec2cd5d012aa6f00\"}";

                //写入文件中
                File keyFile = new File("/Users/uncleye/Downloads/test.key");
                if (!keyFile.exists()) {
                    keyFile.delete();
                }

                String keyContent = "d2a5a9dda38d1f25ec2cd5d012aa6f00";

                FileOutputStream fileOutputStream = new FileOutputStream(keyFile);
                fileOutputStream.write(decodeHexString(keyContent));
                fileOutputStream.flush();
                fileOutputStream.close();


                System.out.println(keyJson);


                String newLine = line.replace(line.substring(first, last), keyFile.getAbsoluteFile().toString());
                System.out.println(newLine);

//                bufferedWriter.write(newLine);

                sb.append(newLine).append("\n");


            } else if (line.endsWith(".ts")) {

                String newLine = "https://cvod.yiqishuoapp.com/online/lessons/" + line;

//                bufferedWriter.write(newLine);

                sb.append(newLine).append("\n");

            } else {

//                bufferedWriter.write(line);
                sb.append(line).append("\n");
            }
        }
        bufferedReader.close();

        System.out.println("=======================================================");

//        bufferedWriter.flush();

        System.out.println(sb.toString());
    }


    public byte[] decodeHexString(String hexString) {
        if (hexString.length() % 2 == 1) {
            throw new IllegalArgumentException(
                    "Invalid hexadecimal String supplied.");
        }

        byte[] bytes = new byte[hexString.length() / 2];
        for (int i = 0; i < hexString.length(); i += 2) {
            bytes[i / 2] = hexToByte(hexString.substring(i, i + 2));
        }
        return bytes;
    }

    public byte hexToByte(String hexString) {
        int firstDigit = toDigit(hexString.charAt(0));
        int secondDigit = toDigit(hexString.charAt(1));
        return (byte) ((firstDigit << 4) + secondDigit);
    }

    private int toDigit(char hexChar) {
        int digit = Character.digit(hexChar, 16);
        if (digit == -1) {
            throw new IllegalArgumentException(
                    "Invalid Hexadecimal Character: " + hexChar);
        }
        return digit;
    }


    @Test
    public void testGenerKey() throws IOException {

        String keyContent = "d2a5a9dda38d1f25ec2cd5d012aa6f00";

        File keyFile = new File("/Users/uncleye/Downloads/test.key.m3u8");
        if (keyFile.exists()) {
            keyFile.delete();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(keyFile);
        fileOutputStream.write(decodeHexString(keyContent));
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    @Test
    public void testGenerkey2() throws IOException {
        String keyContent = "d2a5a9dda38d1f25ec2cd5d012aa6f00";

        File keyFile = new File("/Users/uncleye/Downloads/test.key.m3u8");
        if (keyFile.exists()) {
            keyFile.delete();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(keyFile);
        fileOutputStream.write(hexStringToByteArray(keyContent));
        fileOutputStream.flush();
        fileOutputStream.close();
    }


    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] b = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            // 两位一组，表示一个字节,把这样表示的16进制字符串，还原成一个字节
            b[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character
                    .digit(s.charAt(i + 1), 16));
        }
        return b;
    }


    @Test
    public void testUrlParse() {
        String url = "https://cvod.yiqishuoapp.com/online/lessons/00b0dc3d-14ef-4a51-a831-a4afd1dfaa11.m3u8";

        System.out.println(url.substring(0, url.lastIndexOf("/") + 1));

    }

}