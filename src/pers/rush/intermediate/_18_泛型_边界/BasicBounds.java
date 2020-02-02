package pers.rush.intermediate._18_泛型_边界;

import java.awt.Color;

interface HasColor {
     Color getColor();
}

class Colored<T extends HasColor> {
    T item;
    Colored(T item) {
        this.item = item;
    }
    Color color() {
        return item.getColor();
    }
}

class Dimension {
    public int x;
    public int y;
    public int z;
}

class ColoredDimension<T extends Dimension & HasColor>{
    T item;
    ColoredDimension(T item) {
        this.item = item;
    }
    T getItem() {
        return item;
    }
    Color color() {
        return item.getColor();
    }
    int getX() {
        return item.x;
    }
    int getY() {
        return item.y;
    }
    int getZ() {
        return item.z;
    }
}

interface Weight{
    int weight();
}

class Solid<T extends Dimension & HasColor & Weight> {
    T item;
    Solid(T item) {
        this.item = item;
    }
    T getItem() {
        return item;
    }
    Color color() {
        return item.getColor();
    }
    int getX() {
        return item.x;
    }
    int getY() {
        return item.y;
    }
    int getZ() {
        return item.z;
    }
    int weight() {
        return item.weight();
    }
}

class Bounded extends Dimension implements HasColor,Weight {
    public Color getColor() {
        return null;
    }
    public int weight() {
        return 0;
    }
}

public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
        System.out.println(solid.color());
        System.out.println(solid.getY());
        System.out.println(solid.weight());
    }
}
