package pers.rush.beginner;

public class _12_流程控制基本语句 {

	public static void main(String[] args) {
		/*
		 * break分为有标签格式和无标签格式 continue也是
		 */
		// 先定义标签
		label: for (int i = 0; i < 5; ++i) {
			while (true) {
				System.out.println("hello");
				break label; // 可以break标签里面的东西
			}
			// System.out.println("while end");
		}
		System.out.println("for end");

		labelContinue: for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				System.out.println("hello" + j);
				continue labelContinue;
			}
		}
	}

}
