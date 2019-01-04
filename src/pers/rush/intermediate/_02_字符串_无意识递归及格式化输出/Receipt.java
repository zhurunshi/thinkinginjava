package pers.rush.intermediate._02_字符串_无意识递归及格式化输出;

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        /**
         * 15表示长度是15字符的长度
         * Item表示数据要15字符的长度来显示
         * 如果给长度的话,默认是左边用空格补齐
         * 如果给减号的话,表示右边用空格补齐
         * 有减号是左对齐,没有减号是右对齐
         */
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        // .2f代表保留两位小数
        // 15.15超过15位就截取
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15s %5s %10.2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        // 如果真要用到百分号,那么要写两个百分号表示单独%的意思
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
