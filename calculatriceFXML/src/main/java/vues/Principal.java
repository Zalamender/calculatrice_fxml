package vues;

import application.Main;
import controleur.Controleur;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Principal {

    private Controleur monControleur;
    private Stage stage;

    public void setMonControleur(Controleur monControleur) {
        this.monControleur = monControleur;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private Pane root;

    public void clickCalculatrice(ActionEvent actionEvent) {
        monControleur.goToCalculatrice();
    }

    public static Principal creerInstance(Controleur controleur, Stage primaryStage) {
        URL location = Principal.class.getResource("/vues/principal.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        try {
            fxmlLoader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        Principal vue = fxmlLoader.getController();
        vue.setStage(primaryStage);
        vue.setMonControleur(controleur);
        return vue;
    }

    public void show() {
        stage.setTitle("Menu Calculatrice");
        stage.setScene(new Scene(root ,root.getWidth(),root.getHeight()));
        stage.show();
    }
}
