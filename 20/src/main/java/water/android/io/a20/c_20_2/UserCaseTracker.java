package water.android.io.a20.c_20_2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import water.android.io.a20.c_20_1.PasswordUtils;
import water.android.io.a20.c_20_1.UseCase;

/**
 * 通过反射获取方法的注解，并且读取出数值
 */
public class UserCaseTracker {

    public static void trackUserCase(List<Integer> userCase, Class cl) {

        for (Method m : cl.getDeclaredMethods()) {
            UseCase uc = m.getDeclaredAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found Use Case:" + uc.id() + "," + uc.description());
                userCase.remove(new Integer(uc.id()));
            }
        }

        for (int i : userCase) {
            System.out.println("Warning Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> userCases = new ArrayList<>();
        Collections.addAll(userCases, 47, 48, 49, 50);

        trackUserCase(userCases, PasswordUtils.class);
    }
}
