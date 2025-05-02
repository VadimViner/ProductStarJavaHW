package com.example;

import com.example.circle.Circle;

public class TestCircle {

    private final double EPSILON = 0.01;

    private boolean compareDouble(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

    private void testCreateCircle() {
        Circle circle = new Circle(10, 62.8 );
        double radius = circle.getRadius();
        double perimeter = circle.getPerimeter();
        if (compareDouble(radius, 10.0)) {
            System.out.println("testCreateCircle: OK");
        } else {
            System.out.println("testCreateCircle: FAILURE");
        }
    }

    private void testSetRadius() {
        Circle circle = new Circle(1, 6.28);
        if (!compareDouble(circle.getRadius(), 1)) {
            System.out.println("testSetRadius: FAILURE: expected getRadius() = 1, got " + circle.getRadius());
            return;
        }
        circle.setRadius(2.0);
        if (!compareDouble(circle.getRadius(), 2)) {
            System.out.println("testSetRadius: FAILURE: expected r = 2, got " + circle.getRadius());
            return;
        } else {
            System.out.println("testSetRadius: OK");
        }
    }

    private void testGetArea() {
        Circle circle = new Circle(2, 12.56);
        if (compareDouble(circle.getArea(), Math.PI * 4)) {
            System.out.println("testGetArea: OK");
        } else {
            System.out.println("testGetArea: FAILURE");
        }
    }

    private void testRadiusIsPositive(){
        Circle circle = new Circle(2,12.56);
        if(circle.getRadius() < 0){
            System.out.println("testRadiusIsPositive: FAILURE: expected r > 0, got " + circle.getRadius());
        } else {
            System.out.println("testRadiusIsPositive: OK");
        }
    }

    private void testComputePerimeter(){
        Circle circle = new Circle(1, 6.28);
        double expected = circle.computePerimeter();
        double actual = 6.28;
        if(!compareDouble(expected, actual)){
            System.out.println("testComputePerimeter: FAILURE: expected computePerimeter() = 6.28, got " + circle.computePerimeter());
        } else {
            System.out.println("testComputePerimeter: OK");
        }
    }

    private void testSetPerimeter(){
        Circle circle = new Circle(1, 6.28);
        if (!compareDouble(circle.getPerimeter(), 6.28)){
            System.out.println("testSetPerimeter: FAILURE: expected getPerimeter() = 6.28, got " + circle.getPerimeter());
        } else {
            System.out.println("testSetPerimeter: OK");
        }
    }

    public void test() {
        testCreateCircle();
        testSetRadius();
        testGetArea();
        testRadiusIsPositive();
        testComputePerimeter();
        testSetPerimeter();
    }
}
