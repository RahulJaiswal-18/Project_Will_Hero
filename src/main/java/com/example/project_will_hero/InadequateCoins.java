package com.example.project_will_hero;

public class InadequateCoins extends Exception{
    public InadequateCoins(String errorMessage){
        super(errorMessage);
    }
}
