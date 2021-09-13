package com.collection.class23;

public interface Shape {
    void calculateArea(double a);
    void calculatePerimeter(double a);

}
 class Circle implements Shape{

    @Override
    public void calculateArea(double a){
        System.out.println("Area ="+Math.PI+Math.pow(a,2));
    }

    @Override
    public void calculatePerimeter(double a){
        System.out.println("Perimeter +"+2*Math.PI*a);

    }

}

class Square implements Shape{
    @Override
    public void calculateArea(double a){
        System.out.println("Area ="+Math.pow(a,2));
    }

    @Override
    public void calculatePerimeter(double a){
        System.out.println("Perimeter ="+4*a);
    }
}

