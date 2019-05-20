package com.example.pattern_flyweight.example_1;

public abstract class FlyWeight {

    /**
     * 内部状态
     */
    private String intrinsic;

    /**
     * 外部状态
     */
    protected final String exTrinsic;

    public FlyWeight(String exTrinsic) {
        this.exTrinsic = exTrinsic;
    }

    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
