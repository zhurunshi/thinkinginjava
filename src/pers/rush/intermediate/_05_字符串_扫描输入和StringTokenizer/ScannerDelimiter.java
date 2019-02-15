package pers.rush.intermediate._05_字符串_扫描输入和StringTokenizer;

import java.util.Scanner;

public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*"); // "\s"是空白符
        while(scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
}
