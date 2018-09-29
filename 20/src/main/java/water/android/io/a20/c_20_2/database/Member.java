package water.android.io.a20.c_20_2.database;

/**
 * 简单bean，用于了自定义到注解进行
 */
@DBTable(name = "member")
public class Member {
    @SQLString(30)
    String firstName;

    @SQLString(50)
    String lastName;

    @SQLInteger
    Integer age;

    @SQLString(value = 30, constrains = @Constrains(primaryKey = true))
    String handle;

    static int memberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getHandle() {
        return handle;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}
