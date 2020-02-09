package function.io;

import java.io.File;

public class FilesUtils {

    /**
     * 删除文件夹
     *
     * @param file
     * @return
     */
    public static boolean deleteFiles(File file) {
        if (file == null || !file.exists()) {
            return false;
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                deleteFiles(f);
            }
        }
        return file.delete();
    }
}
