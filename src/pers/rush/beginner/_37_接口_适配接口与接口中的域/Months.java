package pers.rush.beginner._37_接口_适配接口与接口中的域;

public interface Months {
    /*
     * 放到接口当中的变量,自动都是static final的
     * 有时候把接口当做便捷创建常量组的方式
     */
    int JANUARY = 1, FEBRUARY = 2, MATCH = 3, APRIL = 4, MAY = 5, 
            JUNE = 6, JULY = 7, AUGUST = 8, SEPTMBER = 9, OCTOBER = 10,
            NOVEMBER = 11, DECEMBER = 12;
    /*
     * 用接口定义常量组,往往是在java5之前出现的
     * 后面可以使用枚举来实现
     */
//    int i; // 变量不能为空
}
