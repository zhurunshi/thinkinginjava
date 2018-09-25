```
try {
    // 监视区...
} catch (ObjectStreamException e) {
    /* 第一个异常匹配到了,后面就都不进行匹配了
     * 所以要注意顺序
     */
} catch (FileNotFoundException e) { // 是IO异常的子类
    // 同级别的异常,顺序没关系
} catch (EOFException e) {
    // 有继承关系的,子类放前面,父类放后面
} catch (IOException e) {

} catch (Throwable e) {
    
}
```