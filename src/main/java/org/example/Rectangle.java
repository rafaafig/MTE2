package org.example;

public class Rectangle extends Figure {
    private Point upperLeft;
    private Point bottomRight;
    public Rectangle(Point p1,Point p2,String color){
        super(color);
        upperLeft=p1;
        bottomRight=p2;
    }
    public double area(){
        return bottomRight.getX()- bottomRight.getY();
    }
}
