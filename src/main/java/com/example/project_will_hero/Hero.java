package com.example.project_will_hero;

public class Hero{
    private VectorPos coordinates; //association relationship with VectorPos class
    private Helmet heroHelmet;
    private int coins;
    private boolean isAlive;

    public Hero(VectorPos start, Helmet cover){
        this.coordinates=start;
        this.heroHelmet=cover;
        this.coins=0;
        this.isAlive=true;

    }

    public VectorPos getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(VectorPos coordinates) {
        this.coordinates = coordinates;
    }

    public Helmet getHeroHelmet() {
        return heroHelmet;
    }

    public void setHeroHelmet(Helmet heroHelmet) {
        this.heroHelmet = heroHelmet;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
