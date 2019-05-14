package com.example.pattern_state.example_1;

public class NoCashState implements ATMState {

    private ATM atm;

    public NoCashState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("插卡完成");
    }

    @Override
    public void sumbimtPwd() {
        System.out.println("密码提交完成");
        //验证密码并做相应处理
        if("123".equals(atm.getPwd())){
            System.out.println("密码验证通过");
        }
        else{
            System.out.println("密码验证失败");
            //弹出卡片
            ejectCard();
        }
    }

    @Override
    public void getCash() {
        System.out.println("取款失败，机内无钞");
    }

    @Override
    public void queryBalance() {
        System.out.println("余额￥" + atm.getBalance());
        System.out.println("余额查询完成");
    }

    @Override
    public void ejectCard() {
        System.out.println("取卡完成");
    }
}
