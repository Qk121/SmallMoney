package com.JavaEE.SmallMoney;

public class details extends consumption{
    public details(double money[], int i, String[] data, double[] income, double[] expand) {
        super(money, i, data, income, expand);
    }

    public void printDetail(details obj){
        for(int symbol =0;symbol <= obj.getI();symbol ++){
            if(obj.getExpand()[symbol] != 0){
                if(obj.getExpand()[symbol] > 0){
                    System.out.println("花销\t" + "+" + obj.getExpand()[symbol] + "\t" + getData()[symbol] + "\t余额:" + getMoney()[symbol]);
                }else {
                    System.out.println("花销\t" + "-" + obj.getExpand()[symbol] + "\t" + getData()[symbol] + "\t余额:" + getMoney()[symbol]);
                }
            }
            if (obj.getIncome()[symbol] != 0){
                if(obj.getIncome()[symbol] > 0){
                    System.out.println("收益入账\t" + "+" + obj.getIncome()[symbol] + "\t" + getData()[symbol] + "\t余额:" + getMoney()[symbol]);
                }else {
                    System.out.println("收益入账\t" + "-" + obj.getIncome()[symbol] + "\t" + getData()[symbol] + "\t余额:" + getMoney()[symbol]);
                }
            }
        }
    }
}
