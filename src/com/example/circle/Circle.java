package com.example.circle;

/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle {
    private double radius;
    private double perimeter;
    public Circle(double radius, double perimeter){
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
        return Math.PI * 2 * radius;
    }


    public double getPerimeter(){
        return perimeter;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    public double computePerimeter(){
        return Math.PI * radius * 2;
    }

}
