package com.example.circle;

/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle {
    private double radius;
    private double perimeter;

    public Circle(double radius, double perimeter){
            if (radius <= 0) throw new Error("Радиус должен быть положительным");
            this.radius = radius;
        this.perimeter = perimeter;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = 2 * Math.PI * radius;
    }

    public double computePerimeter(){
        return Math.PI * radius * 2;
    }

}
