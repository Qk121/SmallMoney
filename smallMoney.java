package com.JavaEE.SmallMoney;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallMoney {
    public static void main(String[] args) {
        System.out.println("-------------------零钱通菜单----------------------");
        System.out.println("                   1.零钱通明细                    ");
        System.out.println("                   2.收益入账                      ");
        System.out.println("                   3.消费                         ");
        System.out.println("                   4.退出                         ");
        System.out.println("请选择1-4");
        Scanner sc = new Scanner(System.in);
        double[] money = new double[10];
        int i = 0;
        String[] data = new String[10];
        double[] expand = new double[10];
        double[] income = new double[10];
        details details = new details(money,i,data,income,expand);
        SimpleDateFormat format = new SimpleDateFormat();
        while(true) {
            int switch1 = sc.nextInt();
            Date date = new Date(System.currentTimeMillis());
            switch (switch1) {
                case 1:
                    details.printDetail(details);
                    break;
                case 2:
                    details.EveryIncome(details);
                    details.getData()[details.getI()-1] = format.format(date);
                    break;
                case 3:
                    System.out.println("请输入消费/充值的金额:");
                    double share = sc.nextDouble();
                    details.shopping(details,share);
                    details.getData()[details.getI()-1] = format.format(date);
                    break;
                case 4:
                    System.out.println("您正在退出该程序");
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
            }
            System.out.println("上述操作已完成，请继续选择1-4");
            if(switch1 == 4)break;
        }
    }
}
