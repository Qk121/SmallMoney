package com.JavaEE.SmallMoney;

public class Moneysum {
    private double money[];
    private int i;
    private String data[];

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public Moneysum(double money[], int i, String[] data) {
        this.money = money;
        this.i = i;
        this.data = data;
    }

    public double[] getMoney() {
        return money;
    }

    public void setMoney(double[] money) {
        this.money = money;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
