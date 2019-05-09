package test;

import com.example.pattern_visitor.example_1.ExampleVisitor;

import org.junit.Test;

public class ExampleTest1 {

    @Test
    public void test1() {
        // 创建消费和收入单子
        ExampleVisitor.Bill consumerBill = new ExampleVisitor.ConsumerBill("消费", 3000);
        ExampleVisitor.Bill incomeBill = new ExampleVisitor.IncomeBill("收入", 5000);
        ExampleVisitor.Bill consumerBill2 = new ExampleVisitor.ConsumerBill("消费", 4000);
        ExampleVisitor.Bill incomeBill2 = new ExampleVisitor.IncomeBill("收入", 8000);

        // 添加单子
        ExampleVisitor.AccountBook accountBook = new ExampleVisitor.AccountBook();
        accountBook.add(consumerBill);
        accountBook.add(incomeBill);
        accountBook.add(consumerBill2);
        accountBook.add(incomeBill2);


        // 创建访问者
        ExampleVisitor.Boss boss = new ExampleVisitor.Boss();
        ExampleVisitor.CPA cpa = new ExampleVisitor.CPA();

        // 账本接受访问者
        accountBook.show(boss);
        accountBook.show(cpa);


        // boss查看总收入和总消费
        boss.getTotalConsumer();
        boss.getTotalIncome();
    }

}
