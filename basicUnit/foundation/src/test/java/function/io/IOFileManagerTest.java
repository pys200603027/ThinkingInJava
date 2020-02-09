package function.io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * 尽量利用Java.io包中的类管理文件
 */
public class IOFileManagerTest {
    static final String BUILD = System.getProperty("user.dir") + File.separator + "BUILD";
    static final String PATH = BUILD + File.separator + "newFile.txt";
    static final String DIR = BUILD + File.separator + "cache";

    /**
     * 创建一个新文件
     *
     * @throws IOException
     */
    @Test
    public void newFileTest() throws IOException {

        System.out.println(PATH);
        File newFile = new File(PATH);
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
    }

    /**
     * 创建一个文件目录
     */
    @Test
    public void newFileDirTest() throws IOException {
        File dir = new File(DIR);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String path = "cacheFile.txt";
        File newFile = new File(dir, path);
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
    }

    /**
     * 删除一个文件
     */
    @Test
    public void deleteFileTest() {
        File file = new File(PATH);
        if (file.exists()) {
            file.delete();
        }
    }

    /**
     * 删除一个文件夹 （先删除里面的文件）
     */
    @Test
    public void deleteFileDirTest() {
        File dir = new File(DIR);
        assertTrue(FilesUtils.deleteFiles(dir));
    }


    /**
     * 复制一个文件
     */
    @Test
    public void copyFileTest() throws IOException {
        File old = new File(PATH);
        File newFile = new File(DIR, "copyFile.txt");

        FileInputStream fis = new FileInputStream(old);
        FileOutputStream fos = new FileOutputStream(newFile);

        byte[] buffer = new byte[1024];
        int len = 0;

        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        fos.flush();
        fos.close();
        fis.close();
    }

    /**
     * 移动文件
     */
    @Test
    public void moveFileTest() {
        File old = new File(PATH);
        if (old.exists()) {
            old.renameTo(new File(DIR, "newMoveFile.txt"));
        }
    }

    /**
     * 复制文件夹
     */
    @Test
    public void copyFileDirTest() {

    }


    /**
     * 删除文件夹
     */
    @Test
    public void moveFileDirTest() {

    }
}
