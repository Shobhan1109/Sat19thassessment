package com.harman.assessment;

public class assessment {
    public static void main(String[] args) {
        Area ar = new Area();
        ar.RectangleArea(5.5f, 7f);
        ar.SquareArea(5f);
        ar.CircleArea(4);
    }
}
abstract class Shape{
    abstract void RectangleArea(float length , float breadth);
    abstract void SquareArea(float side);
    abstract void CircleArea(float radius);
}
class Area extends Shape {
    double Area = 0;

    void RectangleArea(float length, float breadth){
        Area = length * breadth;
        System.out.println("Area of rectangle is: " + Area);
    }

    void SquareArea(float Side) {
        Area = Side * Side;
        System.out.println("Area of Square is: " + Area);
    }

    void CircleArea(float radius) {
        Area = (radius * radius) * 3.14;
        System.out.println("Area of Circle is: " + Area);
    }
}