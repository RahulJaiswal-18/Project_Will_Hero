package com.example.project_will_hero;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

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
    @FXML
    private AnchorPane Pane;
    @FXML
    private Label position;
    @FXML
    private ImageView orcImage2;
    @FXML
    private ImageView boss;
    @FXML
    private ImageView heroImage1;
    @FXML
    private ImageView Island1,Island2,Island3,Island4,Island5,Island6,Island7,Island8,Island9,Island10;

    @FXML
    private Rectangle Rectangle1;

    static TranslateTransition translate;
    static int count=0;

    public void pauseGame(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("pauseMenu.fxml"));

        Scene gameScene = new Scene(fxmlLoader.load());
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

        window.setScene(gameScene);
        window.show();
    }



    public void move(){

//        final Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1), Event->{changeY();check();checkY();}));
//        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.setAutoReverse(false);
//        //final KeyValue kv = new KeyValue(heroImage.xProperty(), 300);
////        final KeyFrame kf ;
////        timeline.getKeyFrames();
//        timeline.play();

        heroImage.setLayoutX(heroImage.getLayoutX()+20);
        Pane.setLayoutX(Pane.getLayoutX()-20);
        count++;
        position.setText(String.valueOf(count));
//        if(heroImage.getBoundsInParent().intersects(orcImage.getBoundsInParent())){
//          //  System.exit(0);
//            orcImage.setLayoutX(orcImage.getLayoutX()+30);
//            heroImage.setLayoutX(heroImage.getLayoutX()-30);
//            Pane.setLayoutX(Pane.getLayoutX()+30);
//
//        }
//                  System.out.println("Hello");
//                if (heroImage.getBoundsInParent().intersects(Rectangle1.getBoundsInParent())&& Rectangle1.getLayoutY()<=286) {
//                    System.exit(0);
//                }

       // timeline.play();
        position.setLayoutX(position.getLayoutX()+20);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            translate = new TranslateTransition();
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
        horTrans(orcImage);
        horTrans(orcImage2);
        horTrans(boss);





    }
    public void horTrans(ImageView view){
        TranslateTransition translate2 = new TranslateTransition();
        translate2.setNode(view);
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
