package vues;

import controleur.Controleur;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Calculatrice {
    private Controleur monControleur;
    private Stage stage;

    public void setMonControleur(Controleur monControleur) {
        this.monControleur = monControleur;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private Pane monPane;

    public static Calculatrice creerInstance(Controleur controleur, Stage primaryStage) {
        URL location = Calculatrice.class.getResource("/vues/calculatrice.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        try {
            fxmlLoader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        Calculatrice vue = fxmlLoader.getController();
        vue.setStage(primaryStage);
        vue.setMonControleur(controleur);
        return vue;
    }

    public void show() {
        stage.setTitle("une calculatrice");
        stage.setScene(new Scene(monPane ,monPane.getWidth(),monPane.getHeight()));
        stage.show();
    }
}
