package water.android.io.pattern_builder.example_1;

/**
 * 使用重叠构造器模式
 */
public class Person {

    //必要参数
    private final int id;
    private final String name;
    //可选参数
    private final int age;
    private final String sex;
    private final String phone;
    private final String address;
    private final String desc;


    public Person(int id, String name) {
        this(id, name, 0);
    }

    public Person(int id, String name, int age) {
        this(id, name, age, "");
    }

    public Person(int id, String name, int age, String sex) {
        this(id, name, age, sex, "");
    }

    public Person(int id, String name, int age, String sex, String phone) {
        this(id, name, age, sex, phone, "");
    }

    public Person(int id, String name, int age, String sex, String phone, String address) {
        this(id, name, age, sex, phone, address, "");
    }

    public Person(int id, String name, int age, String sex, String phone, String address, String desc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.desc = desc;
    }

}
