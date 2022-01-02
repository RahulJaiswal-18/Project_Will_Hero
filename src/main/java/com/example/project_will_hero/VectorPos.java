package com.example.project_will_hero;

public class VectorPos {
    protected double x_coord;
    protected double y_coord;

    public VectorPos(){
        setCoord(0,0);
    }
    public VectorPos(double x, double y){
        setCoord(x,y);
    }
    public void setCoord(double x, double y){
        this.x_coord = x;
        this.y_coord = y;
    }
    public double getXPos(){
        return this.x_coord;
    }
    public double getYPos(){
        return this.y_coord;
    }
    public void setXPos(double x){
        this.x_coord=x;
    }
    public void setYPos(double y){
        this.y_coord=y;
    }
    public void addX(double dx){
        this.x_coord+=dx;

    }
    public void addY(double dy){
        this.y_coord+=dy;
    }
    //consider method for scalar multiplication of vector
    //also consider methods for:
    //1)Getting and setting length of vector
    //2) Getting and setting angles of vectors
}
