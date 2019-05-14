package test.example;

import com.example.pattern_state.example_1.ATM;

import org.junit.Test;

public class ExampleTest1 {

    private static void test(int totalAmount, int balance, int amount, String pwd) throws Exception {
        //创建ATM
        ATM atm;
        atm = new ATM(totalAmount, balance, amount, pwd);
        //输出初始状态
        System.out.println(atm.toString());
        atm.insertCard();
        atm.submitPwd();
        atm.getCash();
        //输出结束状态
        System.out.println(atm.toString());
    }

    @Test
    public void test1() throws Exception {
        test(1000, 500, 200, "123");
    }

    @Test
    public void test2() throws Exception {
        test(1000, 300, 500, "123");
    }

    @Test
    public void test3() throws Exception {
        test(0, 500, 200, "123");
    }
}
