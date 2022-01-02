package com.example.project_will_hero;

public class Orcs {
    private VectorPos coordinates;
    private String color;

    public VectorPos getCoordinates() {
        return coordinates;
    }

    public String getColor() {
        return color;
    }

    public void setCoordinates(VectorPos coordinates) {
        this.coordinates = coordinates;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Orcs(double x, double y, String Ocolor){
        coordinates.setXPos(x);
        coordinates.setYPos(y);
        this.color = Ocolor;
    }
    public Orcs(String color){
        coordinates.setXPos(0);
        coordinates.setYPos(0);
        this.color = color;
    }
}
