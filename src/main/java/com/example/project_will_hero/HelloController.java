package com.example.project_will_hero;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ImageView hero;
    @FXML
    private ImageView orc;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translateHero = new TranslateTransition();
        TranslateTransition translateOrc = new TranslateTransition();
        translateHero.setNode(hero);
        translateOrc.setNode(orc);
        translateHero.setCycleCount(TranslateTransition.INDEFINITE);
        translateOrc.setCycleCount(TranslateTransition.INDEFINITE);
        translateHero.setByY(-70);
        translateOrc.setByY(-70);
        translateHero.setAutoReverse(true);
        translateOrc.setAutoReverse(true);
        translateHero.setDuration(Duration.millis(500));
        translateOrc.setDuration(Duration.millis(500));
        translateHero.play();
        translateOrc.play();

    }
}