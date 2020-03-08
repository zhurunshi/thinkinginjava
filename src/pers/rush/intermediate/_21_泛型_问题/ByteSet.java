package pers.rush.intermediate._21_泛型_问题;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ByteSet {
    Byte[] possibles = {1,2,3,4,5,6,7,8,9};
    Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possibles));
    // 自动包装机制不能应用于数组
    static void main(String[] args) {
        
    }
}
