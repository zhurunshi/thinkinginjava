# 正则表达式(二)

java.util.regex.*;

Pattern 表示编译后的正则表达式  
```
Pattern p = Pattern.compile("正则表达式"); // 会给我们生成一个Pattern对象,编译时就要指定正则表达式
Matcher m = p.matcher(String); // 生成匹配器

m.find(); // 进行查找匹配
m.group(); // 匹配操作得到的完整匹配
m.start();  //拿到匹配开始的位置
m.end(); // 拿到匹配结束的位置
```
