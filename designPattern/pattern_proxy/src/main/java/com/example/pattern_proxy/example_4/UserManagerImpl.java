package com.example.pattern_proxy.example_4;

public class UserManagerImpl implements UserManager {

    @Override
    public void addUser(String userId, String userName) {
        System.out.println("add..");
    }

    @Override
    public void delUser(String userId) {
        System.out.println("del..");
    }
}
