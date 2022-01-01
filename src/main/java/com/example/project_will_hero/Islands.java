package com.example.project_will_hero;

public class Islands extends VectorPos {
    private double length;
    private double width;
    public Islands(double x, double y, double horLength, double verWidth){
        super(x,y);
        this.length= horLength;
        this.width = verWidth;

    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}
