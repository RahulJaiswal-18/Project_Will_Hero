package com.example.project_will_hero;

public class Helmet {
    private String helmColor;
    private String helmShape;
    public Helmet(String color, String shape){
        this.helmColor=color;
        this.helmShape=shape;
    }

    public String getHelmColor() {
        return helmColor;
    }

    public void setHelmColor(String helmColor) {
        this.helmColor = helmColor;
    }

    public String getHelmShape() {
        return helmShape;
    }

    public void setHelmShape(String helmShape) {
        this.helmShape = helmShape;
    }
}
