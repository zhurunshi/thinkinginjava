package pers.rush.beginner;

public class _13_选择语句 {

	public static void main(String[] args) {
		/*
		 * 程序由类构成 类由数据成员和方法成员 一个数据成员就是一个语句 方法成员的内容全部都是语句 语句:简单语句,末尾以分号结束
		 * 复合语句,用大括号括起来的语句块 Java流程控制结构包括分支(条件)语句\循环语句\跳转语句\异常处理语句
		 * 选择语句分为三种:单选语句if\双选语句if-else\多选语句if-else if\switch-case
		 */
		int date = (int) (Math.random() * 31) + 1;
		switch (date % 7) { // int char String(java7) enum(java6)
		case 0:
			System.out.println("本月" + date + "是星期天");
			break;
		case 1:
			System.out.println("本月" + date + "是星期一");
			break;
		case 2:
			System.out.println("本月" + date + "是星期二");
			break;
		case 3:
			System.out.println("本月" + date + "是星期三");
			break;
		case 4:
			System.out.println("本月" + date + "是星期四");
			break;
		case 5:
			System.out.println("本月" + date + "是星期五");
			break;
		case 6:
			System.out.println("本月" + date + "是星期六");
			break;
		}
	}

}
