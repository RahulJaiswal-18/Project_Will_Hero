package com.example.project_will_hero;

public class NoPreviousGame extends Exception{
    public NoPreviousGame(String errorMessage){
        super(errorMessage);
    }
}
