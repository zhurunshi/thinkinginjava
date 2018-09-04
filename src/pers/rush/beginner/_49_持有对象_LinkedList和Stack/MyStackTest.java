package pers.rush.beginner._49_持有对象_LinkedList和Stack;
public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while(!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        // 利用这种功能,反转
    }
}
