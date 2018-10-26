package water.android.io.a20.c_20_2.database;

/**
 * 注解嵌套，如果嵌套中到注解可以这是value，则是下面到格式
 */
public @interface Uniqueness {
    Constrains constrain() default @Constrains(unique = true);
}
