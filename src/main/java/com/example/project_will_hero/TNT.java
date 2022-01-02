package com.example.project_will_hero;

public class TNT {
    private VectorPos coordinates;
    private double burstDelay;

    public TNT(VectorPos position, double interval){
        this.coordinates=position;
        this.burstDelay=interval;
    }

    public VectorPos getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(VectorPos coordinates) {
        this.coordinates = coordinates;
    }

    public double getBurstDelay() {
        return burstDelay;
    }

    public void setBurstDelay(double burstDelay) {
        this.burstDelay = burstDelay;
    }
}
