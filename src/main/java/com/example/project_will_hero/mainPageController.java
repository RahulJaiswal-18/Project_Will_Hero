package com.example.project_will_hero;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class mainPageController implements Initializable {
    @FXML
    private ImageView hero;
    @FXML
    private ImageView orc;
    @FXML
    private ImageView TNT;
    @FXML
    private ImageView rocket;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition rocketBurst = new TranslateTransition();
        rocketBurst.setNode(rocket);
        rocketBurst.setCycleCount(TranslateTransition.INDEFINITE);
        rocketBurst.setAutoReverse(false);
        rocketBurst.setDuration(Duration.millis(3000));
        rocketBurst.setByX(500);
        FadeTransition tntburst = new FadeTransition();
        tntburst.setNode(TNT);
        tntburst.setCycleCount(FadeTransition.INDEFINITE);
        tntburst.setAutoReverse(false);
        tntburst.setDuration(Duration.millis(2000));
        tntburst.setFromValue(10);
        tntburst.setToValue(0.1);
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
        tntburst.play();
        rocketBurst.play();
    }
}