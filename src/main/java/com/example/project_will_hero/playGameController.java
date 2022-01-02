package com.example.project_will_hero;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class playGameController implements Initializable {
    @FXML
    private Button playButton;
    @FXML
    private ImageView heroImage;
    @FXML
    private ImageView orcImage;
    @FXML
    private AnchorPane Pane;


    @FXML
    private ImageView Island1,Island2,Island3,Island4,Island5,Island6,Island7,Island8,Island9,Island10;

    @FXML
    private Rectangle Rectangle1;

    public void move(){
//        final Timeline timeline = new Timeline();
//        timeline.setCycleCount(1);
//        timeline.setAutoReverse(false);
//        final KeyValue kv = new KeyValue(heroImage.xProperty(), 300);
//        final KeyFrame kf = new KeyFrame(Duration.millis(500), kv);
//        timeline.getKeyFrames().add(kf);
        heroImage.setLayoutX(heroImage.getLayoutX()+45);
        Pane.setLayoutX(Pane.getLayoutX()-45);
        if(heroImage.getBoundsInParent().intersects(orcImage.getBoundsInParent())){
          //  System.exit(0);
            orcImage.setLayoutX(orcImage.getLayoutX()+30);
            heroImage.setLayoutX(heroImage.getLayoutX()-30);
            Pane.setLayoutX(Pane.getLayoutX()+30);

        }
       // timeline.play();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            TranslateTransition translate = new TranslateTransition();
            translate.setNode(heroImage);
            // System.out.println("hi");
            translate.setDuration(Duration.millis(500));
            translate.setCycleCount(TranslateTransition.INDEFINITE);
            translate.setByY(-40);
            translate.setAutoReverse(true);
            translate.play();
//            System.out.println("Hello");
//            System.out.println(heroImage.getLayoutX());
//            System.out.println(Rectangle1.getLayoutX());
//            if(heroImage.getBoundsInParent().intersects(Rectangle1.getBoundsInParent())){
//                System.exit(0);
//            }
//            if(!heroImage.getBoundsInParent().intersects(Island2.getBoundsInParent())){
//                System.exit(0);
//            }
//            if(!heroImage.getBoundsInParent().intersects(Island3.getBoundsInParent())){
//                System.exit(0);
//            }
//            if(!heroImage.getBoundsInParent().intersects(Island4.getBoundsInParent())){
//                System.exit(0);
//            }
//            if(!heroImage.getBoundsInParent().intersects(Island5.getBoundsInParent())){
//                System.exit(0);
//            }
//            if(!heroImage.getBoundsInParent().intersects(Island6.getBoundsInParent())){
//                System.exit(0);
//            }
//            if(!heroImage.getBoundsInParent().intersects(Island7.getBoundsInParent())){
//                System.exit(0);
//            }
//            if(!heroImage.getBoundsInParent().intersects(Island8.getBoundsInParent())){
//                System.exit(0);
//            }
//            if(!heroImage.getBoundsInParent().intersects(Island9.getBoundsInParent())){
//                System.exit(0);
//            }
//            if(!heroImage.getBoundsInParent().intersects(Island10.getBoundsInParent())){
//                System.exit(0);
//            }
        TranslateTransition translate2 = new TranslateTransition();
        translate2.setNode(orcImage);
        translate2.setDuration(Duration.millis(500));
        translate2.setCycleCount(TranslateTransition.INDEFINITE);
        translate2.setByY(-40);
        translate2.setAutoReverse(true);
        translate2.play();




    }
    public ImageView getHeroImage(){
        return heroImage;
    }
}
