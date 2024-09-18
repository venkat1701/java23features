package io.github.venkat1701.constructors;

import java.awt.*;

public class FlexibleConstructors extends Constructor{

    private final double width, height;

    public FlexibleConstructors(Color color,double width, double height) {
        if(width<0)
            throw new IllegalArgumentException("Width cannot be negative");
        this.width = width;
        this.height = height;
        super(color);
    }

    public static void main(String[] args) {
        FlexibleConstructors fc = new FlexibleConstructors(Color.BLUE, 10, 20);
        fc.getColor();
    }
}
