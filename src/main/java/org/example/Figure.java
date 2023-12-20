
package org.example;

public abstract class Figure {

    private String color;

    public Figure (String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double area();

    @Override
    public String toString() {
        return super.toString();
    }
}
