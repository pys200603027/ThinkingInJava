package com.example.pattern_state.example_1;

public class ATM {
    private ATMState noCashState;
    private ATMState noServiceState;
    private ATMState readyState;

    private ATMState currState;//当前状态

    private String pwd;//密码
    private int totalAmount;//机内现钞总数
    private int balance;//余额
    private int amount;//取款金额

    public ATM(int totalAmount, int balance, int amount, String pwd) throws Exception {

        readyState = new ReadyState(this);
        noCashState = new NoCashState(this);
        noServiceState = new NoServiceState(this);


        if (totalAmount > 0) {
            currState = readyState;
        } else if (totalAmount == 0) {
            currState = noCashState;
        } else {
            throw new Exception();
        }

        this.totalAmount = totalAmount;
        this.balance = balance;
        this.amount = amount;
        this.pwd = pwd;
    }

    /**
     * 插卡
     */
    public void insertCard() {
        currState.insertCard();
    }

    /**
     * 提交密码
     */
    public void submitPwd() {
        currState.sumbimtPwd();
    }

    /**
     * 取款
     */
    public void getCash() {
        currState.getCash();
    }

    /**
     * 查询余额
     */
    public void queryBalance() {
        currState.queryBalance();
    }

    /**
     * 取卡
     */
    public void ejectCard() {
        currState.ejectCard();
    }

    @Override
    public String toString() {
        return "现钞总数￥" + totalAmount;
    }

    public String getPwd() {
        return pwd;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getBalance() {
        return balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ATMState getCurrState() {
        return currState;
    }

    public void setCurrState(ATMState currState) {
        this.currState = currState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }


    public ATMState getNoServiceState() {
        return noServiceState;
    }


    public ATMState getReadyState() {
        return readyState;
    }

}
