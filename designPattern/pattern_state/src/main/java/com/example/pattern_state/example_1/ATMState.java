package com.example.pattern_state.example_1;

public interface ATMState {
    void insertCard();

    void sumbimtPwd();

    void getCash();

    void queryBalance();

    void ejectCard();
}
