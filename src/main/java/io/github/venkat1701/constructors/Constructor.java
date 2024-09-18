package io.github.venkat1701.constructors;

import java.awt.*;

public class Constructor {

    private final Color color;

    public Constructor(Color color) {
        this.color = color;
    }

    void getColor() {
        System.out.println("Color: "+color);
    }
}
