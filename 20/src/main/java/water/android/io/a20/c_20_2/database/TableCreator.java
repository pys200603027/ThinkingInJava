package water.android.io.a20.c_20_2.database;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 模拟处理注解过程
 */
public class TableCreator {

    public static void main(String[] args) throws ClassNotFoundException {


        Class<?> aClass = Member.class;
        DBTable dbTable = aClass.getAnnotation(DBTable.class);

        String tableName = dbTable.name();

        List<String> columDefs = new ArrayList<>();
        for (Field field : aClass.getDeclaredFields()) {
            String columName = null;
            Annotation[] annotations = field.getDeclaredAnnotations();
            if (annotations.length < 1) {
                continue;
            }

            if (annotations[0] instanceof SQLInteger) {
                SQLInteger sInt = (SQLInteger) annotations[0];
            }
            if (annotations[0] instanceof SQLString) {
                SQLString sString = (SQLString) annotations[0];
            }
        }
    }
}
