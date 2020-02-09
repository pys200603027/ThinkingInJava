package function.io;

import org.junit.Test;

import java.io.File;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class IOEnvTest {

    /**
     * Java IO 上下文获取
     * 测试当前目录是哪里
     * System.getenv()可以获取一组<K,V> 数据 <br/>
     */
    @Test
    public void testCurrentEnv() {
        Map<String, String> getenv = System.getenv();

        Set<Map.Entry<String, String>> entries = getenv.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + " = " + next.getValue());
        }
    }

    /**
     * System.getProperties() 同样可以获取一组<K,V>数值
     */
    @Test
    public void testProperties() {
        Properties properties = System.getProperties();
        Enumeration<String> enumNames = (Enumeration<String>) properties.propertyNames();
        while (enumNames.hasMoreElements()) {
            String s = enumNames.nextElement();
            System.out.println(s + " = " + properties.getProperty(s));
        }
    }

    /**
     * System.getProperty 通过user.dir属性获取工程所在目录
     */
    @Test
    public void testUserDir() {
        System.out.println(System.getProperty("user.dir"));

        /**
         * 判断工程目录下，BUILD.gradle是否存在
         */
        String path = System.getProperty("user.dir") + File.separator + "BUILD.gradle";
        File file = new File(path);

        System.out.println(file.getAbsolutePath());
        assertTrue(file.exists());
    }

}
