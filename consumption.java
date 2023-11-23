package com.JavaEE.SmallMoney;

public class consumption extends income{
    private double expand[];

    public consumption(double money[], int i, String[] data, double[] income, double[] expand) {
        super(money, i, data, income);
        this.expand = expand;
    }

    public double[] getExpand() {
        return expand;
    }

    public void setExpand(double[] expand) {
        this.expand = expand;
    }

    public void shopping(details obj,double share){
        obj.getExpand()[obj.getI()] = share;
        if(obj.getI() != 0) {
            obj.getMoney()[obj.getI()] = obj.getMoney()[obj.getI() - 1] + share;
        }else{
            obj.getMoney()[obj.getI()] = share;
        }
        obj.setI(obj.getI()+1);
    }
}
