package pers.rush.intermediate._05_字符串_扫描输入和StringTokenizer;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class ThreatAnalyzer {
    static String threatData = "28.27.82.161@02/10/2019\n204.27.81.40@02/11/2019\n58.27.82.60@02/11/2019\n"
            + "[Next log section with different data format]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})";
        while(scanner.hasNext(pattern)) {
            System.out.println(scanner.next(pattern));
            MatchResult match = scanner.match();
            // 拿到的是一个组,完整的下标是0  小括号的第一个是1  第二个小括号是下标为2的
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s from %s \n", date, ip);
        }
    }
}
