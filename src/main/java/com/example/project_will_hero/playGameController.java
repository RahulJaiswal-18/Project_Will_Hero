package com.example.project_will_hero;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import com.example.project_will_hero.AnimationsSet;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class playGameController implements Initializable {
    @FXML
    private Button playButton;
    @FXML
    private ImageView heroImage;
    @FXML
    private ImageView orcImage;



    public void move(){
//        final Timeline timeline = new Timeline();
//        timeline.setCycleCount(1);
//        timeline.setAutoReverse(false);
//        final KeyValue kv = new KeyValue(heroImage.xProperty(), 300);
//        final KeyFrame kf = new KeyFrame(Duration.millis(500), kv);
//        timeline.getKeyFrames().add(kf);
        heroImage.setLayoutX(heroImage.getLayoutX()+15);
        if(heroImage.getBoundsInParent().intersects(orcImage.getBoundsInParent())){
          //  System.exit(0);
            orcImage.setLayoutX(orcImage.getLayoutX()+10);
            heroImage.setLayoutX(heroImage.getLayoutX()-30);

        }
       // timeline.play();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AnimationsSet.applyTranslateTransitionVertical(heroImage);
        AnimationsSet.applyTranslateTransitionVertical((orcImage));
    }
}
