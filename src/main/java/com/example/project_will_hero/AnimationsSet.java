package com.example.project_will_hero;

import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class AnimationsSet {

    public static void applyTranslateTransitionVertical(ImageView view){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(view);
        translate.setDuration(Duration.millis(500));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByY(-40);
        translate.setAutoReverse(true);
        translate.play();
    }
}
