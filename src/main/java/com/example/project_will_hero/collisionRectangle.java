package com.example.project_will_hero;

public class collisionRectangle {
    private double xBase;
    private double yBase;
    private double rectLength;
    private double rectWidth;

    public collisionRectangle(){
        this.setPosition(0,0);
        this.setSize(1,1);
    }
    public collisionRectangle(double x, double y, double length, double width){
        this.setPosition(x,y);
        this.setSize(length, width);
    }


    public void setPosition(double x, double y){
        this.xBase=x;
        this.yBase=y;
    }
    public void setSize(double length, double width){
        this.rectLength=length;
        this.rectWidth=width;
    }

    public boolean collision(collisionRectangle second){

        boolean leftCollide = (this.xBase+this.rectLength < second.xBase);
        boolean rightCollide = (this.xBase > second.xBase+second.rectLength);
        boolean topCollide = (this.yBase > second.yBase+second.rectWidth);
        boolean bottomCollide = (this.yBase+this.rectWidth < second.yBase);

        boolean noCollision = leftCollide || rightCollide || topCollide || bottomCollide;

        return !noCollision;
    }
}
