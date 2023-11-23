package com.JavaEE.SmallMoney;

public class income extends Moneysum{
    private double income[];

    public double[] getIncome() {
        return income;
    }

    public void setIncome(double[] income) {
        this.income = income;
    }

    public income(double money[], int i, String[] data, double[] income) {
        super(money, i, data);
        this.income = income;
    }

    public void EveryIncome(details obj){
        if(obj.getI() != 1){
            obj.getIncome()[obj.getI()] = obj.getMoney()[obj.getI()-1]*0.02;
            obj.getMoney()[obj.getI()] = obj.getMoney()[obj.getI()-1] + obj.getIncome()[obj.getI()];
        }
        obj.setI(obj.getI()+1);
    }
}
