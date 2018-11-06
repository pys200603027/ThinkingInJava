package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import water.android.io.pattern_builder.example_1.NewPerson;
import water.android.io.pattern_builder.example_1.Person;
import water.android.io.pattern_builder.example_1.PersonBean;

public class TestExample1 {
    /**
     * 对比使用构造器、Bean、Builder模式创建对象
     */
    @Test
    public void testPerson() {
        Person person = new Person(1, "李四", 20, "男", "18800000000", "China", "测试使用重叠构造器模式");
        assertNotNull(person);
    }

    @Test
    public void testPersonBean() {
        PersonBean person = new PersonBean();
        person.setId(1);
        person.setName("李四");
        person.setAge(20);
        person.setSex("男");
        person.setPhone("18800000000");
        person.setAddress("China");
        person.setDesc("测试使用JavaBeans模式");

        assertNotNull(person);
    }

    /**
     * 使用构造器
     */
    @Test
    public void testPersonBuilder() {
        NewPerson person = new NewPerson.Builder(1, "张三")
                .age(18)
                .sex("男")
                .desc("测试使用builder模式")
                .build();
        assertNotNull(person);
    }
}
