package com.example.project_will_hero;

import java.util.ArrayList;
import java.lang.Thread;

public class Game implements Runnable{
    private Hero gameChar;
    private boolean isRunning = false;
    private Thread gameThread;

    public synchronized void start(){
        if(isRunning==true){
            return;
        }
        else{
            isRunning=true;
            gameThread = new Thread(this);
            gameThread.start();
        }

    }
    public synchronized void stop(){
        if(isRunning==false){
            return;
        }
        else{
            isRunning = false;
            try{
                gameThread.join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.exit(1);
        }

    }

    @Override
    public void run(){
        while(isRunning==true){
            //Game Loop
        }
        stop();

    }

    public void startNewGame(){
        //start new game.
    }
    public void startSavedGame(){
        //previously saved game
    }
}
