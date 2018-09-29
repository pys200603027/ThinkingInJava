package water.android.io.a20.c_20_1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    /**
     * 编译器会对id进行类型检查
     * @return
     */
    public int id();

    public String description() default "no description";
}
