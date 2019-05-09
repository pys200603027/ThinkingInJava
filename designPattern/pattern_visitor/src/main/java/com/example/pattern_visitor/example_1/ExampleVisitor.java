package com.example.pattern_visitor.example_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.什么是访问者模式？
 * 比如我有一个账单，账单有收入，支出两个固定方法。但是访问账单的人不确定，有可能是一个或者多个。
 * 2.访问者模式有两个特点
 * <p>
 * 一般被访问的东西所持有的方法是固定的，就像账单只有收入和支出两个功能。而访问者是不固定的。
 * 数据操作与数据结构相分离：频繁的更改数据，但不结构不变。比如：虽然每一天账单的数据都会变化（数据变化），但是只有两类数据，就是支出和收入（结构不变）。
 * <p>
 * 作者：风吹稻子
 * 链接：https://www.jianshu.com/p/80b9cd7c0da5
 * 来源：简书
 * 简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。
 */
public class ExampleVisitor {

    /**
     * 访问者接口
     */
    public interface AccountBookView {
        void view(ConsumerBill consumerBill);

        void view(IncomeBill incomeBill);
    }

    /**
     * 创建一个账单接口，有接收访问者的功能
     */
    public interface Bill {
        void accept(AccountBookView viewer);
    }

    /**
     * 消费单子
     */
    public static class ConsumerBill implements Bill {
        private String item;
        private double amount;

        public ConsumerBill(String item, double amount) {
            this.item = item;
            this.amount = amount;
        }

        @Override
        public void accept(AccountBookView viewer) {
            if (viewer != null) {
                viewer.view(this);
            }
        }

        public String getItem() {
            return item;
        }

        public double getAmount() {
            return amount;
        }
    }

    /**
     * 收入单子
     */
    public static class IncomeBill implements Bill {

        private String item;
        private double amount;

        public IncomeBill(String item, double amount) {
            this.item = item;
            this.amount = amount;
        }

        @Override
        public void accept(AccountBookView viewer) {
            if (viewer != null) {
                viewer.view(this);
            }
        }

        public String getItem() {
            return item;
        }

        public double getAmount() {
            return amount;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    public static class Boss implements AccountBookView {
        private double totalConsumer;
        private double totalIncome;

        @Override
        public void view(ConsumerBill consumerBill) {
            totalConsumer = totalConsumer + consumerBill.getAmount();
        }

        @Override
        public void view(IncomeBill incomeBill) {
            totalIncome = totalIncome + incomeBill.getAmount();
        }

        public void getTotalConsumer() {
            System.out.println("老板一共消费了" + totalConsumer);
        }

        public void getTotalIncome() {
            System.out.println("老板一共收入了" + totalIncome);
        }
    }

    /**
     * 会计类：访问者是会计，主要记录每笔单子
     */
    public static class CPA implements AccountBookView {

        private int count = 0;

        @Override
        public void view(ConsumerBill consumerBill) {
            count++;
            if (consumerBill.getItem().equals("消费")) {
                System.out.println("第" + count + "个单子消费了：" + consumerBill.getAmount());
            }
        }

        @Override
        public void view(IncomeBill incomeBill) {
            if (incomeBill.getItem().equals("收入")) {
                System.out.println("第" + count + "个单子收入了：" + incomeBill.getAmount());
            }
        }
    }

    /**
     * 账本
     */
    public static class AccountBook {
        private List<Bill> listBill = new ArrayList<Bill>();

        // 添加单子
        public void add(Bill bill) {
            listBill.add(bill);
        }

        // 为每个账单添加访问者
        public void show(AccountBookView viewer) {
            for (Bill b : listBill) {
                b.accept(viewer);
            }
        }
    }
}
