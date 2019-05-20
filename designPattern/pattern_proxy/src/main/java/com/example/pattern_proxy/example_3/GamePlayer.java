package com.example.pattern_proxy.example_3;

public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String name, String password) {
        System.out.println("登录名为 " + name + " 进入游戏，" + name + " 登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " 击杀了Boss！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "升级了！");
    }
}
