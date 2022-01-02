package com.example.project_will_hero;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class mainPageController implements Initializable {
    @FXML
    private Button newGame;

    public void startNewGame(ActionEvent event) throws IOException{

            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("animationsTest.fxml"));

            Scene gameScene = new Scene(fxmlLoader.load());
            Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

            window.setScene(gameScene);
            window.setWidth(2265);
            window.setHeight(479);
            window.show();


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}