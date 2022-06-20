package com.clover;

public class ShapeUtility {
    public static void main(String[] args) {
        Shape circle  = new Circle();
        float areaOfCircle = circle.area();
        circle.display(areaOfCircle);
    }
}
