package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

public class Shapes {
    public static void main(String[] args) throws Exception{
        // 向上转型
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for (Shape shape : shapeList) {
            /*
             * 当从Shape往外拿的时候,将所有的事物都当做Object持有,
             * 会自动的把结果转为泛型,这是RTTI最基本的使用形式
             */
            shape.draw();
        }

        Class c = Class.forName("Circle");

    }

}
